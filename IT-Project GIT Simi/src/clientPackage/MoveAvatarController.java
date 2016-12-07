package clientPackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.sun.prism.paint.Color;

import commonPackage.Card;
import commonPackage.Player;
import commonPackage.Tile;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.effect.InnerShadow;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;


//Diese Klasse wird ben�tigt um eine Spielfigur zu bewegen oder die Aktion
//abzubrechen damit der Spieler nochmals eine figur und eine Karte w�hlen kann

public class MoveAvatarController implements Initializable {

	@FXML
	Button b_SpielzugBest�tigen;
	@FXML
	Button b_SpielzugAbbruch;

	//alle Instanzvariablen welche ben�tigt werden definieren
	//so ziemlich alle aus der GameController Klasse welche hier aufgelistet sind
	private Circle selectetAvatar;
	private Card selectetCard;
	private ImageView selectetCardImageView;
	private ArrayList<Tile> startBoard;
	private ArrayList<HBox> tileBox;
	private InnerShadow tileShadow;
	private ArrayList<ImageView> possibleTilesArray;
	private InnerShadow tileShadowMove;
	private ArrayList<ImageView> possibleTilesArrayMove;
	private HBox currentAvatarPosition;
	private static HBox[] ebPlayer;
	private int currentPlayerPosition;
	private ArrayList<Circle> playersAvatar;
	private Player currentPlayer;
	



	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub

	}

	//Klasse um eine Spielfigur zu bewegen
	//alle Instanzvariablen werden aus der GameController Klasse "kopiert"
	public void moveAvatar(){
		selectetAvatar = GameController.getSelectetAvatar();
		selectetCard = GameController.getSelectetCard();
		startBoard = GameController.getStartBoard();
		tileBox = GameController.getTileBox();
		selectetCardImageView = GameController.getSelectetCardImageView();
		currentAvatarPosition = GameController.getCurrentAvatarPosition();
		ebPlayer = GameController.getEbPlayer();
		currentPlayerPosition = GameController.getCurrentPlayerPosition();
		currentPlayer = GameController.getCurrentPlayer();
		playersAvatar = currentPlayer.getAvatar();
		int count = 0;

		if(currentAvatarPosition.getId().contains("sb_player")){
			//die Figur wird auf das erste Tile aus der startBoard Liste gesetzt
			//welches mit der ausgew�hlten Bewegungskarte �bereinstimmt
			for(int i = 0; i < startBoard.size(); i++){
				if(startBoard.get(i).getColor().equals(selectetCard.getColor())){
					tileBox.get(i).getChildren().add(selectetAvatar);
					tileBox.get(i).setVisible(true);
					tileBox.get(i).toFront();
					if(!(i == 0)){
						GameController.collectTile(startBoard.get(i), i);
						break;
					}
					break;
				}
			}
		}else{
			for(int i = Integer.parseInt(currentAvatarPosition.getId().substring(7)); i < startBoard.size(); i++){
				if(startBoard.get(i).getColor().equals(selectetCard.getColor())){
					tileBox.get(i).getChildren().add(selectetAvatar);
					tileBox.get(i).setVisible(true);
					tileBox.get(i).toFront();
					GameController.collectTile(startBoard.get(i), i);
					break;
				}
				count = i;
			}
			if(count == 48){
				ebPlayer[currentPlayerPosition].getChildren().add(selectetAvatar);
				ebPlayer[currentPlayerPosition].setVisible(true);
				ebPlayer[currentPlayerPosition].toFront();
				GameController.collectLastTile();
				if(ebPlayer[currentPlayerPosition].getChildren().containsAll(playersAvatar)){
					switchToResult();
				}
			}
		}
		

		//sobald die Figur gesetzt wurde, werden s�mtliche Effekte zur�ckgesetzt
		tileShadowMove = GameController.getTileShadow();
		possibleTilesArrayMove = GameController.getPossibleTilesArray();
		tileShadowMove.setChoke(0);
		tileShadowMove.setColor(null);
		tileShadowMove.setHeight(0);
		tileShadowMove.setWidth(0);
		tileShadowMove.setRadius(0);
		for(int i = 0 ; i < possibleTilesArrayMove.size(); i++){
			possibleTilesArrayMove.get(i).setEffect(tileShadowMove);
		}
		selectetAvatar.setEffect(null);
		selectetCardImageView.setEffect(null);
		selectetCardImageView.setOnMouseExited(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				handleMouseExit(event);		
			}
		});
		
		
		//gespielte Bewegungskarte vom Player Array l�schen und eine neue Karte aus dem Deck ziehen
		//die neue Karte wird an der Position der gespielten Karte gesetzt
		GameController.playerCards.set(Integer.parseInt(selectetCardImageView.getId().substring(8))-1, GameController.cards.get(0));
		GameController.moveImages.get(Integer.parseInt(selectetCardImageView.getId().substring(8))-1).setImage(GameController.cards.get(0).getImage());
		GameController.cards.remove(0);
		
		GameController.numOfDeck.setText(String.valueOf(GameController.cards.size()));
		

		//damit wir weitere aktionen durchf�hren k�nnen, m�ssen die selectetAvatar
		//und selectetCard auf null gesetzt werden
		//somit haben wir eine Sicherheit bei der Abfrage ob wir einen Spielzug
		//t�tigen k�nnen
	
		
		GameController.setSelectetAvatar();
		GameController.setSelectetCard();
		//wird in der Methode finishTurn() ausgef�hrt hier nur zu testzwecken
		GameController.setCurrentPlayerPosition();
		GameController.setCurrentPlayer();
		
		
		Stage stage = (Stage)b_SpielzugBest�tigen.getScene().getWindow();
		stage.close();
	}

	//cancelAction ist daf�r da um alle Variablen und Effekten zur�ck zu setzen
	public void cancelAction(){
		tileShadow = GameController.getTileShadow();
		selectetAvatar = GameController.getSelectetAvatar();
		selectetCardImageView = GameController.getSelectetCardImageView();
		possibleTilesArray = GameController.getPossibleTilesArray();

		tileShadow.setChoke(0);
		tileShadow.setColor(null);
		tileShadow.setHeight(0);
		tileShadow.setWidth(0);
		tileShadow.setRadius(0);

		for(int i = 0 ; i < possibleTilesArray.size(); i++){
			possibleTilesArray.get(i).setEffect(tileShadow);
		}

		selectetAvatar.setEffect(null);
		selectetCardImageView.setEffect(null);
		selectetCardImageView.setOnMouseExited(new EventHandler<MouseEvent>(){
			@Override
			public void handle(MouseEvent event) {
				handleMouseExit(event);		
			}
		});
		GameController.setSelectetAvatar();
		GameController.setSelectetCard();
		

		Stage stage = (Stage)b_SpielzugAbbruch.getScene().getWindow();
		stage.close();
	}

	//der onMouseExit effekt wurde �bernommen aus der GameController Klasse
	//ist daf�r da, damit wir den gew�nschten effekt beim verlassen der Bewegungskarte
	//ausgef�hrt wird
	public void handleMouseExit(MouseEvent event){
		selectetCardImageView.setEffect(null);
		tileShadow = GameController.getTileShadow();
		tileShadow.setChoke(0);
		tileShadow.setColor(null);
		tileShadow.setHeight(0);
		tileShadow.setWidth(0);
		tileShadow.setRadius(0);

	}
	
	public void switchToResult(){
		try{
			FXMLLoader fxmlloader = new FXMLLoader(getClass().getResource("Result.fxml"));
			Pane rootPane = (Pane) fxmlloader.load();
			Stage stage = new Stage();
			stage.setResizable(false);
			stage.setScene(new Scene(rootPane));
			stage.show();
		}catch (Exception e){
			e.printStackTrace();
		}
	}
	
	public static HBox[] getEbPlayer(){
		return ebPlayer;
	}

}
