package comm.example.hinernatemapping_one_to_one_bi.image1;

import java.io.IOException;
import java.util.List;

import comm.example.hinernatemapping_one_to_one_bi.album.MyAlbum;

public interface ImageDao 
{

	public MyImage createImage(MyImage image);
	public List<MyImage> getAllImages();
	public MyImage getImageByid(int id);
	public MyImage updateImage(int id) throws IOException;
	public void deleteImage(int id);
}
