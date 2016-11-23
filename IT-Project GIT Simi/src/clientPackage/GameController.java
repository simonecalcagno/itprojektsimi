package clientPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

import commonPackage.Tile;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;

public class GameController implements Initializable {
	

	@FXML
	HBox startBox;
	@FXML
	HBox endBox;
	@FXML
	Button finishButton;	
	@FXML
	ListView scoreTable;
	@FXML
	StackPane movementCards;	
	@FXML
	HBox moveCardsBox;
	@FXML
	Button leaveGameButton;	
	@FXML
	Button lobbyButton;
	@FXML
	ImageView tile1;
	@FXML
	ImageView tile2;
	@FXML
	ImageView tile3;
	@FXML
	ImageView tile4;
	@FXML
	ImageView tile5;
	@FXML
	ImageView tile6;
	@FXML
	ImageView tile7;
	@FXML
	ImageView tile8;
	@FXML
	ImageView tile9;
	@FXML
	ImageView tile10;
	@FXML
	ImageView tile11;
	@FXML
	ImageView tile12;
	@FXML
	ImageView tile13;
	@FXML
	ImageView tile14;
	@FXML
	ImageView tile15;
	@FXML
	ImageView tile16;
	@FXML
	ImageView tile17;
	@FXML
	ImageView tile18;
	@FXML
	ImageView tile19;
	@FXML
	ImageView tile20;
	@FXML
	ImageView tile21;
	@FXML
	ImageView tile22;
	@FXML
	ImageView tile23;
	@FXML
	ImageView tile24;
	@FXML
	ImageView tile25;
	@FXML
	ImageView tile26;
	@FXML
	ImageView tile27;
	@FXML
	ImageView tile28;
	@FXML
	ImageView tile29;
	@FXML
	ImageView tile30;
	@FXML
	ImageView tile31;
	@FXML
	ImageView tile32;
	@FXML
	ImageView tile33;
	@FXML
	ImageView tile34;
	@FXML
	ImageView tile35;
	@FXML
	ImageView tile36;
	@FXML
	ImageView tile37;
	@FXML
	ImageView tile38;
	@FXML
	ImageView tile39;
	@FXML
	ImageView tile40;
	@FXML
	ImageView tile41;
	@FXML
	ImageView tile42;
	@FXML
	ImageView tile43;
	@FXML
	ImageView tile44;
	@FXML
	ImageView tile45;
	@FXML
	ImageView tile46;
	@FXML
	ImageView tile47;
	@FXML
	ImageView tile48;
	@FXML
	ImageView tile49;
	@FXML
	ImageView tile50;
	@FXML
	ImageView moveCard1;
	@FXML
	ImageView moveCard2;
	@FXML
	ImageView moveCard3;
	@FXML
	ImageView moveCard4;
	@FXML
	ImageView moveCard5;
	
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
	private Image water = new Image(getClass().getResourceAsStream("/resource/bg_popup.png"));
	
	private ArrayList<Image> startTiles = new ArrayList<Image>();
	private ImageView[] tileImages;
	
	
	
	private void initTileArray(){	
	
	tileImages = new ImageView[52];
		
	tileImages[0] = tile1;
	tileImages[1] = tile2;
	tileImages[2] = tile3;
	tileImages[3] = tile4;
	tileImages[4] = tile5;
	tileImages[5] = tile6;
	tileImages[6] = tile7;
	tileImages[7] = tile8;
	tileImages[8] = tile9;
	tileImages[9] = tile10;
	tileImages[10] = tile11;
	tileImages[11] = tile12;
	tileImages[12] = tile13;
	tileImages[13] = tile14;
	tileImages[14] = tile15;
	tileImages[15] = tile16;
	tileImages[16] = tile17;
	tileImages[17] = tile18;
	tileImages[18] = tile19;
	tileImages[19] = tile20;
	tileImages[20] = tile21;
	tileImages[21] = tile22;
	tileImages[22] = tile23;
	tileImages[23] = tile24;
	tileImages[24] = tile25;
	tileImages[25] = tile26;
	tileImages[26] = tile27;
	tileImages[27] = tile28;
	tileImages[28] = tile29;
	tileImages[29] = tile30;
	tileImages[30] = tile31;
	tileImages[31] = tile32;
	tileImages[32] = tile33;
	tileImages[33] = tile34;
	tileImages[34] = tile35;
	tileImages[35] = tile36;
	tileImages[36] = tile37;
	tileImages[37] = tile38;
	tileImages[38] = tile39;
	tileImages[39] = tile40;
	tileImages[40] = tile41;
	tileImages[41] = tile42;
	tileImages[42] = tile43;
	tileImages[43] = tile44;
	tileImages[44] = tile45;
	tileImages[45] = tile46;
	tileImages[46] = tile47;
	tileImages[47] = tile48;
	tileImages[48] = tile49;
	tileImages[49] = tile50;
	
	
	}
	
	
	
	@Override
	public void initialize(URL location, ResourceBundle resources) {
		
		ArrayList<Image> startBoard = setStartTiles();
		
		int count = 0;
		
		for(int i = 0; i < startBoard.size(); i++){
		
			tileImages[count].setImage(startBoard.get(i));
			count++;
		}
		

	}
	
	public ArrayList<Image> setTiles(){
		
		
		startTiles.add(blue1);
		startTiles.add(blue2);
		startTiles.add(blue3);
		startTiles.add(blue4);
		startTiles.add(blue5);
		startTiles.add(blue6);
		startTiles.add(blue7);
		startTiles.add(brown1);
		startTiles.add(brown2);
		startTiles.add(brown3);
		startTiles.add(brown4);
		startTiles.add(brown5);
		startTiles.add(brown6);
		startTiles.add(brown7);
		startTiles.add(green1);
		startTiles.add(green2);
		startTiles.add(green3);
		startTiles.add(green4);
		startTiles.add(green5);
		startTiles.add(green6);
		startTiles.add(green7);
		startTiles.add(grey1);
		startTiles.add(grey2);
		startTiles.add(grey3);
		startTiles.add(water);
		startTiles.add(grey4);
		startTiles.add(grey5);
		startTiles.add(grey6);
		startTiles.add(grey7);
		startTiles.add(pink1);
		startTiles.add(pink2);
		startTiles.add(pink3);
		startTiles.add(pink4);
		startTiles.add(pink5);
		startTiles.add(pink6);
		startTiles.add(pink7);
		startTiles.add(white1);
		startTiles.add(white2);
		startTiles.add(white3);
		startTiles.add(white4);
		startTiles.add(white5);
		startTiles.add(white6);
		startTiles.add(white7);
		startTiles.add(yellow1);
		startTiles.add(yellow2);
		startTiles.add(yellow3);
		startTiles.add(yellow4);
		startTiles.add(yellow5);
		startTiles.add(yellow6);
		startTiles.add(yellow7);
		
		
		return startTiles;
	}
	
	public ArrayList<Image> setStartTiles(){
	ArrayList<Image> tileBoard = setTiles();
	initTileArray();
	
/*	Random rand = new Random();
	int casualValue = rand.nextInt(51);
	int casualValue1 = rand.nextInt(51);
*/	
	tileBoard.set(0, blue1);
	tileBoard.set(1, yellow2);
	tileBoard.set(2, pink7);
	tileBoard.set(3, white7);
	tileBoard.set(4, grey5);
	tileBoard.set(5, grey1);
	tileBoard.set(6, blue3);
	tileBoard.set(7, green2);
	tileBoard.set(8, brown6);
	tileBoard.set(9, pink3);
	tileBoard.set(10, yellow4);
	tileBoard.set(11, white5);
	tileBoard.set(12, grey3);
	tileBoard.set(13, brown5);
	tileBoard.set(14, white2);
	tileBoard.set(15, green1);
	tileBoard.set(16, yellow7);
	tileBoard.set(17, grey2);
	tileBoard.set(18, blue5);
	tileBoard.set(19, green3);
	tileBoard.set(20, green7);
	tileBoard.set(21, brown2);
	tileBoard.set(22, pink4);
	tileBoard.set(23, yellow6);
	tileBoard.set(24, pink5);
	tileBoard.set(26, green4);
	tileBoard.set(27, blue6);
	tileBoard.set(28, brown4);
	tileBoard.set(29, green5);
	tileBoard.set(30, grey7);
	tileBoard.set(31, white4);
	tileBoard.set(32, white1);
	tileBoard.set(33, pink1);
	tileBoard.set(34, yellow3);
	tileBoard.set(35, white3);
	tileBoard.set(36, blue2);
	tileBoard.set(37, green6);
	tileBoard.set(38, blue7);
	tileBoard.set(39, grey4);
	tileBoard.set(40, pink6);
	tileBoard.set(41, yellow1);
	tileBoard.set(42, brown7);
	tileBoard.set(43, brown3);
	tileBoard.set(44, blue4);
	tileBoard.set(45, grey6);
	tileBoard.set(46, pink2);
	tileBoard.set(47, white6);
	tileBoard.set(48, yellow5);
	tileBoard.set(49, brown1);
	
	
	return tileBoard;
	}


	// Player beendet seinen spielzug und das Game Objekt wird an den Server gesendet
	// und vom Server zu den anderen Clients
	public void finishTurn(){
		

	}	
	
	// Player gibt das Spiel auf und verlässt die Sitzung
	public void leaveGame(){
		
	}
	
	// Button erst bei Spiel Ende enable um zurück zur Lobby zu gelangen
	public void backToLobby(){
		
	}
	


}
