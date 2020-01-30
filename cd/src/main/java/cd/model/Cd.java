package cd.model;

import java.io.Serializable;
/*import java.time.LocalDate;*/

public class Cd implements Serializable{

	private static final long serialVersionUID = -3888837604921999640L;
	
	private String title;
	private String cdType;
	private String date;
	
	public Cd() {
		super();
	}

	public Cd(String title, String cdType,String date) {
		super();
		this.title = title;
		this.cdType = cdType;
		this.date = date;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCdType() {
		return cdType;
	}

	public void setCdType(String cdType) {
		this.cdType = cdType;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}	

}
