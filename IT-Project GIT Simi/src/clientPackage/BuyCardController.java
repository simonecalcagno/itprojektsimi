package clientPackage;

import java.net.URL;
import java.util.ResourceBundle;

import commonPackage.Player;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;


//Klasse um zus�tzliche Karten zu kaufen
public class BuyCardController implements Initializable {

	@FXML
	Label message;
	@FXML
	ChoiceBox<Integer> cb_BuyCard;
	@FXML
	Button b_Buy;
	ObservableList<Integer> cb_BuyCardList = (ObservableList<Integer>) FXCollections.observableArrayList(1,2,3,4,5);

	private Player currentPlayer;

	@Override
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
		cb_BuyCard.setItems(cb_BuyCardList);
		currentPlayer = GameController.getCurrentPlayer();

	}
	//gew�nschte Anzahl Karten werden dem Player hinzugef�gt
	public void buyCard() throws InterruptedException{
		int numOfCards = cb_BuyCard.getValue();
		int costs;
		costs = numOfCards*2;
		int count = 5;

		if(currentPlayer.getScore() < costs){
			message.setVisible(true);
			message.setText("Du hast zu wenig Punkte um "+cb_BuyCard.getValue()+" zu kaufen!");
			message.setTextFill(Color.RED);
			message.setFont(Font.font(15));
		}else{
			currentPlayer.subFromScore(costs);
			//count startet bei 5 weil die zus�tzliche Karte 
			//ab moveCard6 hinzugef�gt werden sollen
			for(int i = 0; i < numOfCards; i++){
				GameController.addMoveImage(count);
				count++;
			}


			//Fenster sobald die Karten gekauft wurden schliessen
			Stage stage = (Stage)b_Buy.getScene().getWindow();
			stage.close();

		}
	}

}
