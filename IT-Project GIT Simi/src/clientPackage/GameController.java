package clientPackage;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.URL;
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
	ImageView tile51;
	@FXML
	ImageView tile52;
	@FXML
	ImageView tile53;
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
	
	public Image blue1 = new Image(getClass().getResourceAsStream("/resource/blue_1.jpg"));

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		tile1.setImage(blue1);
		

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
