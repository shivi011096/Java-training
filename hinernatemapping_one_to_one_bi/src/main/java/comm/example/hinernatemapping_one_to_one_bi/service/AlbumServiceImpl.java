package comm.example.hinernatemapping_one_to_one_bi.service;

import java.io.IOException;
import java.util.List;

import comm.example.hinernatemapping_one_to_one_bi.album.AlbumDao;
import comm.example.hinernatemapping_one_to_one_bi.album.AlbumDaoImp;
import comm.example.hinernatemapping_one_to_one_bi.album.MyAlbum;

public class AlbumServiceImpl implements AlbumService
{
	private AlbumDao dao;
	{
		dao=new AlbumDaoImp();
	}
	@Override
	public MyAlbum createAlbum(MyAlbum album) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public List<MyAlbum> getAllAlbums() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MyAlbum getAlbumByid(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public MyAlbum updateAlbum(int id) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void deleteAlbum(int id) {
		// TODO Auto-generated method stub
		
	}

}
