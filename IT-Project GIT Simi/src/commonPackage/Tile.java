package commonPackage;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;

import javafx.scene.image.Image;

public class Tile implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3430502307470301817L;
	private String color;
	private int points;
	
	
	private Image blue1 = new Image(getClass().getResourceAsStream("/resource/blue_1.jpg"));
	private Image blue2 = new Image(getClass().getResourceAsStream("/resource/blue_2.jpg"));
	private Image blue3 = new Image(getClass().getResourceAsStream("/resource/blue_3.jpg"));
	private Image blue4 = new Image(getClass().getResourceAsStream("/resource/blue_4.jpg"));
	private Image blue5 = new Image(getClass().getResourceAsStream("/resource/blue_5.jpg"));
	private Image blue6 = new Image(getClass().getResourceAsStream("/resource/blue_6.jpg"));
	private Image blue7 = new Image(getClass().getResourceAsStream("/resource/blue_7.jpg"));
	private Image brown1 = new Image(getClass().getResourceAsStream("/resource/brown_1.jpg"));
	private Image brown2 = new Image(getClass().getResourceAsStream("/resource/brown_2.jpg"));
	private Image brown3 = new Image(getClass().getResourceAsStream("/resource/brown_3.jpg"));
	private Image brown4 = new Image(getClass().getResourceAsStream("/resource/brown_4.jpg"));
	private Image brown5 = new Image(getClass().getResourceAsStream("/resource/brown_5.jpg"));
	private Image brown6 = new Image(getClass().getResourceAsStream("/resource/brown_6.jpg"));
	private Image brown7 = new Image(getClass().getResourceAsStream("/resource/brown_7.jpg"));
	private Image green1 = new Image(getClass().getResourceAsStream("/resource/green_1.jpg"));
	private Image green2 = new Image(getClass().getResourceAsStream("/resource/green_2.jpg"));
	private Image green3 = new Image(getClass().getResourceAsStream("/resource/green_3.jpg"));
	private Image green4 = new Image(getClass().getResourceAsStream("/resource/green_4.jpg"));
	private Image green5 = new Image(getClass().getResourceAsStream("/resource/green_5.jpg"));
	private Image green6 = new Image(getClass().getResourceAsStream("/resource/green_6.jpg"));
	private Image green7 = new Image(getClass().getResourceAsStream("/resource/green_7.jpg"));
	private Image grey1 = new Image(getClass().getResourceAsStream("/resource/grey_1.jpg"));
	private Image grey2 = new Image(getClass().getResourceAsStream("/resource/grey_2.jpg"));
	private Image grey3 = new Image(getClass().getResourceAsStream("/resource/grey_3.jpg"));
	private Image grey4 = new Image(getClass().getResourceAsStream("/resource/grey_4.jpg"));
	private Image grey5 = new Image(getClass().getResourceAsStream("/resource/grey_5.jpg"));
	private Image grey6 = new Image(getClass().getResourceAsStream("/resource/grey_6.jpg"));
	private Image grey7 = new Image(getClass().getResourceAsStream("/resource/grey_7.jpg"));
	private Image pink1 = new Image(getClass().getResourceAsStream("/resource/pink_1.jpg"));
	private Image pink2 = new Image(getClass().getResourceAsStream("/resource/pink_2.jpg"));
	private Image pink3 = new Image(getClass().getResourceAsStream("/resource/pink_3.jpg"));
	private Image pink4 = new Image(getClass().getResourceAsStream("/resource/pink_4.jpg"));
	private Image pink5 = new Image(getClass().getResourceAsStream("/resource/pink_5.jpg"));
	private Image pink6 = new Image(getClass().getResourceAsStream("/resource/pink_6.jpg"));
	private Image pink7 = new Image(getClass().getResourceAsStream("/resource/pink_7.jpg"));
	private Image white1 = new Image(getClass().getResourceAsStream("/resource/white_1.jpg"));
	private Image white2 = new Image(getClass().getResourceAsStream("/resource/white_2.jpg"));
	private Image white3 = new Image(getClass().getResourceAsStream("/resource/white_3.jpg"));
	private Image white4 = new Image(getClass().getResourceAsStream("/resource/white_4.jpg"));
	private Image white5 = new Image(getClass().getResourceAsStream("/resource/white_5.jpg"));
	private Image white6 = new Image(getClass().getResourceAsStream("/resource/white_6.jpg"));
	private Image white7 = new Image(getClass().getResourceAsStream("/resource/white_7.jpg"));
	private Image yellow1 = new Image(getClass().getResourceAsStream("/resource/yellow_1.jpg"));
	private Image yellow2 = new Image(getClass().getResourceAsStream("/resource/yellow_2.jpg"));
	private Image yellow3 = new Image(getClass().getResourceAsStream("/resource/yellow_3.jpg"));
	private Image yellow4 = new Image(getClass().getResourceAsStream("/resource/yellow_4.jpg"));
	private Image yellow5 = new Image(getClass().getResourceAsStream("/resource/yellow_5.jpg"));
	private Image yellow6 = new Image(getClass().getResourceAsStream("/resource/yellow_6.jpg"));
	private Image yellow7 = new Image(getClass().getResourceAsStream("/resource/yellow_7.jpg"));
	
	private ArrayList<Tile> tiles = new ArrayList<Tile>();
	
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
	
	public Image getTile(){
		return yellow7;
	}
	
}
