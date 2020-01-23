package comm.example.hinernatemapping_one_to_one_bi.album;

import java.io.IOException;
import java.util.List;

public interface AlbumDao 
{
	public MyAlbum createAlbum(MyAlbum album);
	public List<MyAlbum> getAllAlbums();
	public MyAlbum getAlbumByid(int id);
	public MyAlbum updateAlbum(int id) throws IOException;
	public void deleteAlbum(int id);
}
