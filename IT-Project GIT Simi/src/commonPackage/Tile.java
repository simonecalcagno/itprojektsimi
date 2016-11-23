package commonPackage;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Random;

import clientPackage.GameController;
import javafx.scene.image.Image;

public class Tile implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3430502307470301817L;
	private String color;
	private int points;
	
	
	
	
	private ArrayList<Tile> tiles = new ArrayList<Tile>();
	private static ArrayList<Image> startTiles = new ArrayList<Image>();
	
	
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
