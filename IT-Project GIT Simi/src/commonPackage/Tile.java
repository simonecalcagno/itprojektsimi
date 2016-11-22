package commonPackage;

import java.io.File;
import java.io.Serializable;

import javafx.scene.image.Image;

public class Tile implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3430502307470301817L;
	private String color;
	private int points;
	
	static File file1 = new File("src/blue_2.jpg");
	
	public static Image blue1 = new Image(file1.toURI().toString());
	
	
	public Tile(String color, int points){
		this.color = color;
		this.points = points;
	}
	
	public int getPoints(){
		return this.points;
	}
	
	public String getColor(){
		return this.color;
	}
	
}
