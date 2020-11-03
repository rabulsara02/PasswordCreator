// Algorithm:
// 1. Ask the user to input their name
// 2. Ask the user to input a six digit date
// 3. Correctly generate a random number
// 4. Generate a password based on the user's inputs 

// Author: Rahul Bulsara
// Date of Last Modification: 09/28/2020
// Course: CS111B
// Instructor: Constance Conner 
// Assignment #3
// File Name: PassWordPane.java
// This program will generate a password based on the user inputs



import javafx.event.ActionEvent;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import java.util.*;

//************************************************************************
//  PasswordPane.java
//  Demonstrates the use of a TextField and a GridPane.
//************************************************************************

public class PassWordPane extends GridPane
{
    private Label result;
    private TextField name, date;

    //--------------------------------------------------------------------
    //  Sets up a GUI containing a labeled text field for converting
    //  temperatures in Fahrenheit to Celsius.
    //--------------------------------------------------------------------
    public PassWordPane()
    {
        Font font = new Font(18);
        
        // Create Labels for author and User input
        Label creatorName = new Label("Rahul's Password Creator");
        creatorName.setFont(font);
        
        Label inputNameLabel = new Label("Your Name:");
        inputNameLabel.setFont(font);
        GridPane.setHalignment(inputNameLabel, HPos.RIGHT);
        
        Label inputDateLabel = new Label("6-digit Date:");
        inputDateLabel.setFont(font);
        GridPane.setHalignment(inputDateLabel, HPos.RIGHT);
        
        result = new Label("---");
        result.setFont(font);
        GridPane.setHalignment(result, HPos.CENTER);
        
        // Create user input text fields
        
          // User inputs their name
        name = new TextField();
        name.setFont(font);
        name.setPrefColumnCount(7);
        name.setAlignment(Pos.CENTER);
        name.setOnAction(this::processName);
        
          // User inputs a six digit date
        date = new TextField();
        date.setFont(font);
        date.setPrefColumnCount(7);
        date.setAlignment(Pos.CENTER);
        date.setOnAction(this::processDate);
        
        setAlignment(Pos.CENTER);
        setHgap(20);
        setVgap(10);
        setStyle("-fx-background-color: cyan");
        
        // Add all labels and user-input text fields onto the scene (using a "grid")
        add(creatorName, 0, 0);
        add(inputNameLabel, 1, 1);
        add(name, 2, 1);
        add(inputDateLabel, 1, 2);
        add(date, 2, 2);
        add(result, 0, 3);
    }
    
    //--------------------------------------------------------------------
    //  Computes and displays the converted temperature when the user
    //  presses the return key while in the text field.
    //--------------------------------------------------------------------
    
    // Correctly outputs user's name + a random number
    public void processName(ActionEvent event)
    {
        String firstTwoLetters = new String(name.getText(0,2));
        Random randNum = new Random();
        int randomNum = randNum.nextInt(99);
        result.setText(firstTwoLetters + "." + randomNum );
      //  System.out.println("Name Entered: " + name.getText());
    }
    
    //Correctly outputs user's name + random number + the last four digits of the date 
    public void processDate(ActionEvent event)
    {
        String firstTwoLetters = new String(name.getText(0,2));
        Random randNum = new Random();
        int randomNum = randNum.nextInt(99);
        String lastFourDigits = new String(date.getText(2,6));
        result.setText(firstTwoLetters + "." + randomNum + lastFourDigits );
      //  System.out.println("Date Entered: " + date.getText());
    }

}
