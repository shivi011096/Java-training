package comm.example.hinernatemapping_one_to_one_bi.image1;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import comm.example.hibernatemapping_one_to_one_bi.util.SessionCreator;
import comm.example.hinernatemapping_one_to_one_bi.album.MyAlbum;

public class ImageDaoImpl implements ImageDao 
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
	public MyImage createImage(MyImage image) {
		try {
			transaction.begin();
			session.save(image);
			transaction.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return image;
	}
	
	@Override
	public List<MyImage> getAllImages() {
		Query query=session.createQuery("from Album");
		return query.list();
	}

	@Override
	public MyImage getImageByid(int id) {
		
		MyImage image=session.get(MyImage.class, id);
		if(image==null)
		{
			System.out.println("not found");
		}
		return image;
	}

	@Override
	public MyImage updateImage(int id) throws IOException {
		MyImage m=session.get(MyImage.class, id);
		if(m!=null)
		{
			System.out.println("Image Url: ");
			String url=br.readLine();
			m.setImageUrl(url);
			transaction.begin();
			session.update(m);
			transaction.commit();
		}
		else {
			System.out.println("not found");
		}
		return m;
	}

	@Override
	public void deleteImage(int id) {
		MyImage m=session.get(MyImage.class, id);
		if(m!=null)
		{
			transaction.begin();
			session.delete(m);
			transaction.commit();
			System.out.println("deleted.");
		}
		else
		{
			System.out.println("not found");
		}

	}

}
