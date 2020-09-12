package com.sharma.ninoUI;

import java.io.File;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;

/**
 * 'Main.fxml' Controller Class
 */

import java.net.URL;
import javafx.util.Duration;
import java.util.ResourceBundle;

import javafx.animation.FadeTransition;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.StackPane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;


public class FXMLMainController implements Initializable {

	
	ObservableList<String> list = FXCollections.observableArrayList();
	

	
    @FXML // ResourceBundle that was given to the FXMLLoader
    public ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    public URL location;

    @FXML // fx:id="close"
    public MenuItem close; // Value injected by FXMLLoader

    @FXML // fx:id="propList"
    public ListView<String> propList = new ListView<String>(); // Value injected by FXMLLoader
    
    @FXML // fx:id="root"
    public AnchorPane root; // Value injected by FXMLLoader
    
    @FXML 
    private Button inputCommsBtn;
    
    @FXML 
    private Button outputCommsBtn;

    @FXML 
    private Button processingCodeBtn;

    @FXML 
    private Button iaConversionTypeBtn;
    
    @FXML 
    private Button iaMappingCodeBtn;
    
    
    public void inputCommsBtnAction(ActionEvent event) {
    	FileChooser fc = new FileChooser();
    	File selectedFile = fc.showOpenDialog(null);
    	
    	if (selectedFile != null) {
    		
    	}else {
    		System.out.println("file is not valid");
    	}
    }
    
    public void outputCommsBtnAction(ActionEvent event) {
    	FileChooser fc = new FileChooser();
    	File selectedFile = fc.showOpenDialog(null);
    	
    	if (selectedFile != null) {
    		
    	}else {
    		System.out.println("file is not valid");
    	}
    }
    
    public void processingCodeBtnAction(ActionEvent event) {
    	FileChooser fc = new FileChooser();
    	File selectedFile = fc.showOpenDialog(null);
    	
    	if (selectedFile != null) {
    		
    	}else {
    		System.out.println("file is not valid");
    	}
    }

    public void iaConversionTypeBtnAction(ActionEvent event) {
    	FileChooser fc = new FileChooser();
    	File selectedFile = fc.showOpenDialog(null);
    	
    	if (selectedFile != null) {
    		
    	}else {
    		System.out.println("file is not valid");
    	}
    }

    public void iaMappingCodeBtnAction(ActionEvent event) {
    	FileChooser fc = new FileChooser();
    	File selectedFile = fc.showOpenDialog(null);
    	
    	if (selectedFile != null) {
    		
    	}else {
    		System.out.println("file is not valid");
    	}
    }


    public static AnchorPane rootP;
    
    public void initialize(URL url, ResourceBundle rb) {
    	if (!App.isWelcomeLoaded) {
    		loadWelcomeScreen();
    	}
    	//rootP=root;
    	loadData();
    }
    
    public void loadWelcomeScreen() {
		try {
			App.isWelcomeLoaded = true;
			root = FXMLLoader.load(getClass().getResource(("Welcome.fxml")));
			//root.getChildren().setAll(root);
	    	
	    	FadeTransition fadeIn = new FadeTransition(Duration.seconds(3), root);
	    	fadeIn.setFromValue(0);
	    	fadeIn.setToValue(1);
	    	fadeIn.setCycleCount(1);
	    	
	    	FadeTransition fadeOut = new FadeTransition(Duration.seconds(3), root);
	    	fadeOut.setFromValue(1);
	    	fadeOut.setToValue(0);
	    	fadeOut.setCycleCount(1);
	    	
	    	fadeIn.play();
	    	
	    	fadeIn.setOnFinished((e)->{
	    		fadeOut.play();
	    	});
	    	
	    	fadeOut.setOnFinished((e)->{
	    		try {
	    			root = FXMLLoader.load(getClass().getResource(("Main.fxml")));
	            	//root.getChildren().setAll(parentContent);
	    		} catch(IOException ex) {
	    			//Logger.getLogger(FXMLMainController.class.getName()).log(Level.ALL, null, ex);
	    		}
	    		
	    	});
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
    
    }
    

    
    public void loadData() {
    	
    	String a = "Home";
    	String b = "Functions";
    	String c = "Ingress Networking";
    	String d = "Egress Networking";
    	String e = "Required Services for Installation";
    	String f = "External File Refrences";
    	String g = "Environment Variables";
    	String h = "Template Variables";
    	String i = "Credentials";
    	list = FXCollections.observableArrayList (a,b,c,d,e,f,g,h,i);
    	propList.setItems(list);
    	
    }

    @FXML
    public void exitProgram(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    public void initialize() {
        assert close != null : "fx:id=\"close\" was not injected: check your FXML file 'Main.fxml'.";
        assert propList != null : "fx:id=\"propList\" was not injected: check your FXML file 'Main.fxml'.";

    }

	    
}

