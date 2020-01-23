package comm.example.hinernatemapping_one_to_one_bi.service;

import java.io.IOException;
import java.util.List;

import comm.example.hinernatemapping_one_to_one_bi.image1.ImageDao;
import comm.example.hinernatemapping_one_to_one_bi.image1.ImageDaoImpl;
import comm.example.hinernatemapping_one_to_one_bi.image1.MyImage;

public class ImageServiceImpl implements ImageService
{
	private ImageDao dao;
	{
		dao=new ImageDaoImpl();
	}
	@Override
	public MyImage createImage(MyImage image) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<MyImage> getAllImages() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MyImage getImageByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MyImage updateImage(int id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteImage(int id) {
		// TODO Auto-generated method stub
		
	}

}
