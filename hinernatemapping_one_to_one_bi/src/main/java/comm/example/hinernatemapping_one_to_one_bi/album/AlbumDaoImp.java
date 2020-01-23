package comm.example.hinernatemapping_one_to_one_bi.album;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import comm.example.hibernatemapping_one_to_one_bi.util.SessionCreator;


public class AlbumDaoImp implements AlbumDao
{
	private Session session;
	private Transaction transaction;
	private BufferedReader br;
	{
		session=SessionCreator.getSession();
		transaction=session.getTransaction();
		br=new BufferedReader(new InputStreamReader(System.in));
	}

	@Override
	public MyAlbum createAlbum(MyAlbum album) {
		try {
			transaction.begin();
			session.save(album);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return album;
	}
	
	
	@Override
	public List<MyAlbum> getAllAlbums() {
		Query query=session.createQuery("from Album");
		return query.list();
	}

	@Override
	public MyAlbum getAlbumByid(int id) {
		
		MyAlbum album=session.get(MyAlbum.class, id);
		if(album ==null)
		{
			System.out.println("not found");
		}
		return album;
	}

	@Override
	public MyAlbum updateAlbum(int id) throws IOException {
		MyAlbum a=session.get(MyAlbum.class, id);
		if(a!=null)
		{
			System.out.println("Name: ");
			String name=br.readLine();
			a.setAName(name);
			a.setCreationDate(LocalDate.now());
			transaction.begin();
			session.update(a);
			transaction.commit();
		}
		else {
			System.out.println("not found");
		}
		return a;
	}

	@Override
	public void deleteAlbum(int id) {
		MyAlbum a=session.get(MyAlbum.class, id);
		if(a!=null)
		{
			transaction.begin();
			session.delete(a);
			transaction.commit();
			System.out.println("deleted.");
		}
		else
		{
			System.out.println("not found");
		}

	}


}
