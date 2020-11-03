// Author: Rahul Bulsara
// Date of Last Modification: 09/28/2020
// Course: CS111B
// Instructor: Constance Conner 
// Assignment #3
// File Name: PassWordCreator.java
// This program will generate a password based on the user inputs


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

//************************************************************************
//  PassWordCreator.java
//  Demonstrates the use of a TextField and a GridPane.
//************************************************************************

public class PassWordCreator extends Application
{
    //--------------------------------------------------------------------
    //  Launches the temperature converter application.
    //--------------------------------------------------------------------
    public void start(Stage primaryStage)
    {
        Scene scene = new Scene(new PassWordPane(), 500, 250);
        
        primaryStage.setTitle("Password Creator");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    public static void main(String[] args)
    {
        launch(args);
    }
}
