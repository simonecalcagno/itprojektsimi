package clientPackage;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import commonPackage.Player;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class LoginController implements Initializable{


	@FXML
	TextField tf_username;

	@FXML
	PasswordField pf_password;

	@FXML
	Label text_LoginAtlantis;

	@FXML
	Label text_Benutzername;

	@FXML
	Label text_Passwort;

	@FXML
	Label text_Fehlermeldung;

	@FXML
	Button b_login;

	@FXML
	Button b_registration;


	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}


	public void login(){
		String eingabeName = tf_username.getText();
		String eingabePW = pf_password.getText();

		if(Player.checkUser(eingabeName)){ //Benutzer existiert
			if(Player.getPassword(eingabeName).equals(eingabePW)){ // Benutzer existier&Passwort korrekt
				//go to lobby
				text_Fehlermeldung.setText("Eingaben korrekt");
			}else{ //Benutzer existiert aber Passwort falsch
				text_Fehlermeldung.setText("Das Passwort ist falsch.");
			}
		}else{
			text_Fehlermeldung.setText("Diesen Benutzer gibt es noch nicht.");
			//zu Registration weiterleiten
		}
	}





	public void switchToRegistration(){

	}


}
