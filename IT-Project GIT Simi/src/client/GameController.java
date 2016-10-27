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
	Button b1;
	
	@FXML
	TextField tf1;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub
		
	}
	
	
	
	//setting the String given from Server through method sendGAmeObject from Client to Server
	// in the TextField
	
	public void sendToServer(){
	
		tf1.setText(CopyOfClient.sendGameObject());
				
	}
	
	//run the server by click "start" button
	
	public void startServer(){
		try {
			new Server().runServer();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
