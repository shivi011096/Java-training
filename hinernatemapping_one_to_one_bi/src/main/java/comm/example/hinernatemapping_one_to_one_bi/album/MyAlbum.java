package comm.example.hinernatemapping_one_to_one_bi.album;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import comm.example.hinernatemapping_one_to_one_bi.image1.MyImage;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
public class MyAlbum 
{
	@Id@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@Column(name = "Album_Name")
	private String aName;
	@Column(name = "Creation_Date")
	private LocalDate creationDate;
	private MyImage image;
	
	public MyAlbum(String aName, LocalDate creationDate, MyImage image) {
		super();
		this.aName = aName;
		this.creationDate = creationDate;
		this.image=image;
	}

}
