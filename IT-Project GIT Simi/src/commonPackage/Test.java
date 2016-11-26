package commonPackage;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import javafx.scene.image.Image;

public class Test {
	
	private Image moveCardBlue = new Image(getClass().getResourceAsStream("/resource/card_Blue.jpg"));
	private Image moveCardBrown = new Image(getClass().getResourceAsStream("/resource/card_Brown.jpg"));
	private Image moveCardGreen = new Image(getClass().getResourceAsStream("/resource/card_Green.jpg"));
	private Image moveCardGrey = new Image(getClass().getResourceAsStream("/resource/card_Grey.jpg"));
	private Image moveCardPink = new Image(getClass().getResourceAsStream("/resource/card_Pink.jpg"));
	private Image moveCardWhite = new Image(getClass().getResourceAsStream("/resource/card_White.jpg"));
	private Image moveCardYellow = new Image(getClass().getResourceAsStream("/resource/card_Yellow.jpg"));

	public static void main(String[] args){
		
		Card[] cards = Card.initCardArray();
	}
}



