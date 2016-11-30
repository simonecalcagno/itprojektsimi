package commonPackage;

import java.io.Serializable;
import java.util.ArrayList;

import javafx.scene.effect.InnerShadow;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Avatar extends Circle implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3865303457672912728L;
	private int avatarID;
	private static int count = 100;
	private static Circle avatar;
	
	public Avatar(){
		Circle avatar = new Circle();
		avatar.setRadius(10);
		avatar.setStroke(Color.BLACK);
		System.out.println("dinimuetter");
	}
	
	public static int createId(){
		int id = count;
		id++;
		return id;
	}
	
	public void moveAvatar(){
		
	}
	
	public static Circle createAvatar(){
		Circle avatar = new Circle();
		avatar.setRadius(10);
		avatar.setStroke(Color.BLACK);
		return avatar;
	}
	
	
	public static void selectetAvatar(MouseEvent event){
		
		
		Avatar selectetAvatar = (Avatar) event.getSource();
		
		InnerShadow avatarShadow = new InnerShadow();
		avatarShadow.setChoke(0.5);
		avatarShadow.setColor(Color.web("F7FF00"));
		avatarShadow.setRadius(11);
		selectetAvatar.setEffect(avatarShadow);
		
		
	}
	
	
	
	

}
