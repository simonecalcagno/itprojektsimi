package client;


import java.net.URL;
import java.util.ResourceBundle;

import server.Server;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class GameController implements Initializable {
	
	@FXML
	static Button b1;
	
	@FXML
	static TextField tf1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	//setting the String given from Server through method sendGAmeObject from Client to Server
	// in the TextField
	
	public void sendToServer(){
	
		try {
			CopyOfClient.clientServerCommunication();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				
	}

}
