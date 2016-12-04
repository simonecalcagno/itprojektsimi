package clientPackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import com.sun.prism.paint.Color;

import commonPackage.Card;
import commonPackage.Tile;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class MoveAvatarController implements Initializable {
	
	@FXML
	Button b_SpielzugBestätigen;
	@FXML
	Button b_SpielzugAbbruch;
	
	private static Circle selectetAvatar;
	private static Card selectetCard;
	private static ArrayList<Tile> startBoard;
	private static ArrayList<HBox> tileBox;
	
	

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}
	
	public void moveAvatar(){
		selectetAvatar = GameController.getSelectetAvatar();
		selectetCard = GameController.getSelectetCard();
		startBoard = GameController.getStartBoard();
		tileBox = GameController.getTileBox();
		
		for(int i = 0; i < startBoard.size(); i++){
			if(startBoard.get(i).getColor().equals(selectetCard.getColor())){
				tileBox.get(i).getChildren().add(selectetAvatar);
				tileBox.get(i).setVisible(true);
				tileBox.get(i).toFront();
				System.out.println("dini muetter");
				GameController.collectTile(startBoard.get(i), i);
				break;
			}
			
		}
		Stage stage = (Stage)b_SpielzugBestätigen.getScene().getWindow();
		stage.close();
	}
	
	public void cancelAction(){
		
		Stage stage = (Stage)b_SpielzugAbbruch.getScene().getWindow();
		stage.close();
	}
	
	

}
