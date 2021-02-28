package code.test;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Alien {  //POJO
@Id
	private int aid;
	private String aname;
	String color;
	public int getId() {
		return aid;
	}
	public void setId(int id) {
		this.aid = id;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}

}
