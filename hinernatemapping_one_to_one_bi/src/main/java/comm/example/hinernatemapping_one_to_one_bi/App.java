package comm.example.hinernatemapping_one_to_one_bi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.hinernatemapping_one_to_one_bi.album.MyAlbum;
import comm.example.hinernatemapping_one_to_one_bi.entity.AlbumInstructor;
import comm.example.hinernatemapping_one_to_one_bi.entity.InstructorDetail;
import comm.example.hinernatemapping_one_to_one_bi.image1.MyImage;
import comm.example.hinernatemapping_one_to_one_bi.service.AlbumService;
import comm.example.hinernatemapping_one_to_one_bi.service.AlbumServiceImpl;

public class App 
{
	private static AlbumService service;
	static 
	{
		service = new AlbumServiceImpl();
	}

	public static void main(String[] args) throws NumberFormatException, IOException
	
	{
		try 
		{
			
			SessionFactory factory=new Configuration()
					.configure().addAnnotatedClass(AlbumInstructor.class)
					.addAnnotatedClass(InstructorDetail.class).buildSessionFactory();
			Session session=factory.openSession();
        }
		
		catch (Exception e)
		{
			e.printStackTrace();
		}

		int choice = 0,id;
		String aName,url;
		LocalDate creationDate;
		List<MyAlbum> list=null;
		MyAlbum album=null;
		MyImage image=null;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		do {
			System.out.println("======================\n1. create Album");
			System.out.println("2. display all albums");
			System.out.println("3. find album by id");
			System.out.println("4. update album");
			System.out.println("5. delete album");
			System.out.println("0. exit");
			System.out.print("choice: ");
			choice = Integer.parseInt(br.readLine().toString());
			switch (choice) {
			case 1:
				System.out.print("Album Name: ");
				aName=br.readLine().toString();
				System.out.print("Date of creation of album(yyyy-mm-dd): ");
				String str=br.readLine();
				creationDate = LocalDate.parse(str);
				System.out.print("Image Url: ");
				url=br.readLine().toString();
				//String arr[]=UUID.randomUUID().toString().split("-");
				MyImage theimage= new MyImage(url,album);
				MyAlbum theAlbum=new MyAlbum(aName, creationDate,theimage);
				album=service.createAlbum(theAlbum);
				System.out.println("Album created sucessfully... "+album);
				break;
				
			case 2:
				list=service.getAllAlbums();
				System.out.format("%-20s%-20s%-20s%-20s\n","ID",
						"ALBUM_NAME","CREATION_DATE");
				list.forEach(c->{
					System.out.format("%-20s%-20s%-20s%-20s\n",c.getId()
							,c.getAName(),c.getCreationDate());
				});
				break;
				
			case 3:
				System.out.print(" Album's ID: ");
				id=Integer.parseInt(br.readLine().toString());;
				album=service.getAlbumByid(id);
				if(list.isEmpty())
				{
					System.out.println("no such id found");
				}
				else {
					MyAlbum a=list.get(0);
					System.out.println("customer found: "+a);
				}
				break;
				
			case 4:	
				System.out.print(" ID : ");
				id=Integer.parseInt(br.readLine().toString());
				album=service.getAlbumByid(id);
				if(list.isEmpty())
				{
					System.out.println("no such id found");
				}
				else 
				{
					MyAlbum p=list.get(0);
					//MyImage m=list.get(0);
					System.out.print("Album Name: ");
					aName=br.readLine().toString();
					System.out.print("Date of creation of album: ");
					String str1=br.readLine();
					creationDate = LocalDate.parse(str1);
					//System.out.print("Image Url: ");
					//url=br.readLine().toString();
					p.setAName(aName);
					p.setCreationDate(creationDate);
					//m.setImageUrl(url);
					album=service.updateAlbum(p.getId());
					System.out.println("album updated: "+album);
				}
				break;
				
			case 5:
				System.out.print(" ID : ");
				id=Integer.parseInt(br.readLine().toString());;
				album=service.getAlbumByid(id);
				if(list.isEmpty())
				{
					System.out.println("No such UID found");
				}
				else 
				{
					service.deleteAlbum(id);
					System.out.println("Deletion sucessfull...");
					
				}
				break;
				
			case 0:
				System.exit(0);
				break;
				
			default:
				System.out.println("invalid choice");
				break;
			}

		} while (choice != 0);

		
   }
}
