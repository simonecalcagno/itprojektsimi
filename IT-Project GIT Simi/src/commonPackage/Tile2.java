package commonPackage;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import clientPackage.GameController;
import javafx.scene.image.Image;

public class Tile2 implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3430502307470301817L;
	
	
	
	private Image img;
	private int points;
	
	
	
	
	
	public Tile2(Image img, int points){
		this.img = img;
		this.points = points;
	}
	
	public int getPoints(){
		return this.points;
	}
	
	public Image getImage(){
		return this.img;
	}
	
	
	
}
