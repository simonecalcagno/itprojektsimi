package client;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GameController implements Initializable {
	
	@FXML
	Button b1;
	
	@FXML
	TextField tf1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	
	public void sendToServer(){
	
		tf1.setText(ClientObject.sendGameObject());
				
	}	

}
