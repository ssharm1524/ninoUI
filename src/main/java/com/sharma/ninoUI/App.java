package com.sharma.ninoUI;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;


/**
 * JavaFX App
 */
public class App extends Application {

	public static Boolean isWelcomeLoaded = false;
	
	public static void main(String[] args) {
        Application.launch(App.class, args);
    }
	
    @Override
    public void start(Stage stage) throws Exception{
    	Parent root = FXMLLoader.load(getClass().getResource("Main.fxml"));
    	
        Scene scene = new Scene(root);
        
        stage.setTitle("WelcomeScreen");
        stage.setScene(scene);
        stage.show();
    }

}