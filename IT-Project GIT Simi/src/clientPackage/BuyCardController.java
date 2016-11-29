package clientPackage;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.control.*;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;


//Klasse um zusätzliche Karten zu kaufen
public class BuyCardController implements Initializable {
	
	@FXML
	ChoiceBox<Integer> cb_BuyCard;
	@FXML
	Button b_Buy;
	
	ObservableList<Integer> cb_BuyCardList = (ObservableList<Integer>) FXCollections.observableArrayList(1,2,3,4,5);
	

	@Override
	public void initialize(URL fxmlFileLocation, ResourceBundle resources) {
		cb_BuyCard.setItems(cb_BuyCardList);
		
	}
	//gewünschte Anzahl Karten werden dem Player hinzugefügt
	public void buyCard(){
		int numOfCards = cb_BuyCard.getValue();
		int costs;
		costs = numOfCards*2;
		int count = 5;
		
		//hier kommt noch die methode welche die costs beim Score des Players abzieht
		
		//count startet bei 5 weil die zusätzliche Karte 
		//ab moveCard6 hinzugefügt werden sollen
		for(int i = 0; i < numOfCards; i++){
				GameController.addMoveImage(count);
				count++;
		}
		
		
		//Fenster sobald die Karten gekauft wurden schliessen
		Stage stage = (Stage)b_Buy.getScene().getWindow();
		stage.close();
		
	}

}
