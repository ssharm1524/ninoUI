package com.sharma.ninoUI;


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;

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
	    URL resource = getClass().getResource("/com/sharma/ninoUI/Main.fxml");
	    Parent root = FXMLLoader.load(resource);
    	
        Scene scene = new Scene(root);
        
        stage.setTitle("WelcomeScreen");
        stage.setScene(scene);
        stage.show();
    }

}