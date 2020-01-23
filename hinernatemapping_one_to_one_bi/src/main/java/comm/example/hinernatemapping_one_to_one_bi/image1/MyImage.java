package comm.example.hinernatemapping_one_to_one_bi.image1;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import comm.example.hinernatemapping_one_to_one_bi.album.MyAlbum;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class MyImage 
{
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int mId;
	@Column(name = "Image_url")
	private String imageUrl;
	private MyAlbum album;
	
	public MyImage(String imageUrl, MyAlbum album) {
		super();
		this.imageUrl=imageUrl;
		this.album=album;
	}
	

}
