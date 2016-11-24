package clientPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
import java.util.ArrayList;
import java.util.Random;
import java.util.ResourceBundle;

import commonPackage.Tile;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.*;

public class GameController implements Initializable {


	// Elemente vom GUI definieren
	
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
	ImageView moveCard1;
	@FXML
	ImageView moveCard2;
	@FXML
	ImageView moveCard3;
	@FXML
	ImageView moveCard4;
	@FXML
	ImageView moveCard5;
	
	//Bilder welche im Ordner resource abgelget sind instanziert als Image
	
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

	
	//Instanzvariablen ArrayListe welche alle Tile Objekte beinhaltet
	//und ImageView Array welche alle ImageView mit ID beinhaltet
	
	private ArrayList<Tile> startBoard;
	private ImageView[] tileImages;
	Tile Water = new Tile(water, 0);

	
	//initialize Methode instanziert eine startBoard Liste mit Tile Objekte welche zufällig
	//in der Liste gesetzt wurden.
	// mit initTileArray wird die Instanzvariable tileImages initialisiert um ein Array mit allen 
	//ImageViews zu haben
	// danach wird jedes ImageView mit einem Bild aus der startBoard Liste gesetzt.
	//somit haben wir ein visuelles GameBoard
	@Override
	public void initialize(URL location, ResourceBundle resources) {

		startBoard = new ArrayList<Tile>(setStartTiles());

		initTileArray();

		int count = 0;

		for(int i = 0; i < startBoard.size(); i++){
			tileImages[count].setImage(startBoard.get(i).getImage());
			count++;
		}

	}
	
	//initialisiert die Instanzvariable tileImages um ein Array mit allen ImageViews zu haben
	//damit wir darauf zugreiffen können um ein Bild zu setzen
	private void initTileArray(){	

		tileImages = new ImageView[49];

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


	}	

	//setStartTiles wird gebraucht um eine ArrayList zu haben welche zufällig mit Tile Images
	//gefüllt wurde
	public ArrayList<Tile> setStartTiles(){

		ArrayList<Tile> tileBoard = new ArrayList<Tile>(setTiles());
		ArrayList<Tile> proformaList = new ArrayList<Tile>(setTiles());

		Random rand = new Random();
		int count = 49;


		for (int i=0; i < tileBoard.size(); i++){
			int x = rand.nextInt(count);
			tileBoard.set(i, proformaList.get(x));
			proformaList.remove(x);
			count--;
		}



		return tileBoard;

	}



	//instanziert neue Tile Objekte und addet die Objekte einer Liste zu.
	//diese Liste ist nicht zufällig verteilt 
	//haben wir erstellt damit wir eine Liste mit allen Tile Objekte haben
	public ArrayList<Tile> setTiles(){

		ArrayList<Tile> startGameBoard = new ArrayList<Tile>();

		Tile Blue1 = new Tile(blue1, 1);
		Tile Blue2 = new Tile(blue2, 2);
		Tile Blue3 = new Tile(blue3, 3);
		Tile Blue4 = new Tile(blue4, 4);
		Tile Blue5 = new Tile(blue5, 5);
		Tile Blue6 = new Tile(blue6, 6);
		Tile Blue7 = new Tile(blue7, 7);
		Tile Brown1 = new Tile(brown1, 1);
		Tile Brown2 = new Tile(brown2, 2);
		Tile Brown3 = new Tile(brown3, 3);
		Tile Brown4 = new Tile(brown4, 4);
		Tile Brown5 = new Tile(brown5, 5);
		Tile Brown6 = new Tile(brown6, 6);
		Tile Brown7 = new Tile(brown7, 7);
		Tile Grey1 = new Tile(grey1, 1);
		Tile Grey2 = new Tile(grey2, 2);
		Tile Grey3 = new Tile(grey3, 3);
		Tile Grey4 = new Tile(grey4, 4);
		Tile Grey5 = new Tile(grey5, 5);
		Tile Grey6 = new Tile(grey6, 6);
		Tile Grey7 = new Tile(grey7, 7);
		Tile Green1 = new Tile(green1, 1);
		Tile Green2 = new Tile(green2, 2);
		Tile Green3 = new Tile(green3, 3);
		Tile Green4 = new Tile(green4, 4);
		Tile Green5 = new Tile(green5, 5);
		Tile Green6 = new Tile(green6, 6);
		Tile Green7 = new Tile(green7, 7);
		Tile Pink1 = new Tile(pink1, 1);
		Tile Pink2 = new Tile(pink2, 2);
		Tile Pink3 = new Tile(pink3, 3);
		Tile Pink4 = new Tile(pink4, 4);
		Tile Pink5 = new Tile(pink5, 5);
		Tile Pink6 = new Tile(pink6, 6);
		Tile Pink7 = new Tile(pink7, 7);
		Tile White1 = new Tile(white1, 1);
		Tile White2 = new Tile(white2, 2);
		Tile White3 = new Tile(white3, 3);
		Tile White4 = new Tile(white4, 4);
		Tile White5 = new Tile(white5, 5);
		Tile White6 = new Tile(white6, 6);
		Tile White7 = new Tile(white7, 7);
		Tile Yellow1 = new Tile(yellow1, 1);
		Tile Yellow2 = new Tile(yellow2, 2);
		Tile Yellow3 = new Tile(yellow3, 3);
		Tile Yellow4 = new Tile(yellow4, 4);
		Tile Yellow5 = new Tile(yellow5, 5);
		Tile Yellow6 = new Tile(yellow6, 6);
		Tile Yellow7 = new Tile(yellow7, 7);
		


		startGameBoard.add(Blue1);
		startGameBoard.add(Blue2);
		startGameBoard.add(Blue3);
		startGameBoard.add(Blue4);
		startGameBoard.add(Blue5);
		startGameBoard.add(Blue6);
		startGameBoard.add(Blue7);
		startGameBoard.add(Brown1);
		startGameBoard.add(Brown2);
		startGameBoard.add(Brown3);
		startGameBoard.add(Brown4);
		startGameBoard.add(Brown5);
		startGameBoard.add(Brown6);
		startGameBoard.add(Brown7);
		startGameBoard.add(Grey1);
		startGameBoard.add(Grey2);
		startGameBoard.add(Grey3);
		startGameBoard.add(Grey4);
		startGameBoard.add(Grey5);
		startGameBoard.add(Grey6);
		startGameBoard.add(Grey7);
		startGameBoard.add(Green1);
		startGameBoard.add(Green2);
		startGameBoard.add(Green3);
		startGameBoard.add(Green4);
		startGameBoard.add(Green5);
		startGameBoard.add(Green6);
		startGameBoard.add(Green7);
		startGameBoard.add(Pink1);
		startGameBoard.add(Pink2);
		startGameBoard.add(Pink3);
		startGameBoard.add(Pink4);
		startGameBoard.add(Pink5);
		startGameBoard.add(Pink6);
		startGameBoard.add(Pink7);
		startGameBoard.add(White1);
		startGameBoard.add(White2);
		startGameBoard.add(White3);
		startGameBoard.add(White4);
		startGameBoard.add(White5);
		startGameBoard.add(White6);
		startGameBoard.add(White7);
		startGameBoard.add(Yellow1);
		startGameBoard.add(Yellow2);
		startGameBoard.add(Yellow3);
		startGameBoard.add(Yellow4);
		startGameBoard.add(Yellow5);
		startGameBoard.add(Yellow6);
		startGameBoard.add(Yellow7);


		return startGameBoard;
	}

	// Player beendet seinen spielzug und das Game Objekt wird an den Server gesendet
	// und vom Server zu den anderen Clients
	public void finishTurn(){


	}	



	// Button erst bei Spiel Ende enable um zurÃ¼ck zur Lobby zu gelangen
	public void backToLobby(){

	}
	
	
	//wird ausgelöst wenn der Spieler sein Avatar auf eine entsprechendes Tile setzen will
	//die Methode ersetzt das vorherige Tile mit "Wasser" und gibt die Punktzahlt des Tiles zurück
	//um die Punktzahl danach dem Score vom Spieler zu summieren
	public void collectTile(MouseEvent event){
		int points;
		String selectetTile = handle(event);
		
		String subString = selectetTile.substring(4);
		int tilePosition = Integer.parseInt(subString);
		
		Tile selectTile = startBoard.get(tilePosition-2);
		
		points = selectTile.getPoints();
		
		//addToScore Methode muss hier geschrieben werden um die Punktzahl aufs Konto vom Spieler zu übertragen
		
		startBoard.set(tilePosition-2, Water);
		tileImages[tilePosition-2].setImage(startBoard.get(tilePosition-2).getImage());
		
		
		System.out.println(points);
		System.out.println(selectetTile);
		
	}
	
	//gibt die ID des geklickten Tiles zurück
	//damit wir das Tile identifizieren können
	public String handle(MouseEvent event){
		
		ImageView tile = (ImageView) event.getSource(); ;
		String selectetTileId = tile.getId();
		
		return selectetTileId;
	}

}
