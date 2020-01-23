package comm.example.hibernatemapping_one_to_one_bi.util;

import java.util.logging.Level;
import java.util.logging.Logger;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import comm.example.hinernatemapping_one_to_one_bi.album.MyAlbum;
import comm.example.hinernatemapping_one_to_one_bi.image1.MyImage;

public class SessionCreator 
{
	private static SessionFactory factory;
	
	static 
	{
		//Logger logger = Logger.getLogger("org.hibernate");
		//logger.setLevel(Level.OFF);
		factory=new Configuration().configure().
				addAnnotatedClass(MyAlbum.class).addAnnotatedClass(MyImage.class).
				buildSessionFactory();
	}
		private SessionCreator() 
		{
			
		}
		public static Session getSession()
		{
			return factory.openSession();
		}

}
