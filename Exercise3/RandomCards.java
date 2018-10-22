/*
 * Program: Programming Exercise 8 Part1
 * File: RandomCards.java
 * Summary: Every turn should display 3 Random cards
 * Author: Lyric Payton
 * Date: October 21, 2018
 */

package application;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;	
import javafx.application.Application;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;


public class RandomCards extends Application {
	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Random Cards"); //name of the window
		//render images in a box
	    Pane pane = new HBox(20);
		
		primaryStage.setWidth(500);
		primaryStage.setHeight(500);
		
		
		
		
		//should create the random ability 
		int randomCard1 =  (int)(Math.random() * 53);
		int randomCard2 =  (int)(Math.random() * 53);
		int randomCard3 =  (int)(Math.random() * 53);
		//imports and shows images
	    Image play1 = new Image("file:card/"+randomCard1+".png");
	    Image play2 = new Image("file:card/"+randomCard2+".png");
	    Image play3 = new Image("file:card/"+randomCard3+".png");
		
	    // random card 1
		ImageView card1 = new ImageView(play1);
		//random card 2
		ImageView card2 = new ImageView(play2);
		
		//random card 3
		ImageView card3 = new ImageView(play3);
		pane.getChildren().addAll(card1, card2, card3);
		
	
		Scene scene = new Scene(pane);
		primaryStage.setScene(scene);
		primaryStage.show();	
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
