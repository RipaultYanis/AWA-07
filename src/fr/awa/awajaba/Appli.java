/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fr.awa.awajaba;

import fr.awa.entities.EvaluationHote;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.HPos;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Spinner;
import javafx.scene.control.SpinnerValueFactory;
import javafx.scene.control.TextArea;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author root
 */
public class Appli extends Application {
    public TextArea TACom= new TextArea();
    
    public void start(Stage primaryStage) throws Exception {
        GridPane root = new GridPane();
        root.setPadding(new Insets(20));
        root.setHgap(25);
        root.setVgap(15);

        Label Evaluer = new Label("Evaluer votre Repas :");
        Label Commentaire = new Label("Commentaire :");
        Label Note= new Label("Note :");
        

        
        RadioButton note0 = new RadioButton("0\t");
       
        note0.setUserData(0);
        
        RadioButton note1 = new RadioButton("1\t");
        
        note1.setUserData(1);
        
        RadioButton note2 = new RadioButton("2\t");
        note2.setUserData(2);
       
        
        RadioButton note3 = new RadioButton("3\t");
        note3.setUserData(3);
        
        RadioButton note4 = new RadioButton("4\t");
        note4.setUserData(4);
       
        RadioButton note5 = new RadioButton("5\t");
        note5.setUserData(5);
       
        if(note1.isSelected()==true){
            note0.setSelected(true);
            note2.setSelected(false);
            note3.setSelected(false);
            note4.setSelected(false);
            note5.setSelected(false);
            
        }
       
        note1.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                note0.setSelected(true);
                note2.setSelected(false);
                note3.setSelected(false);
                note4.setSelected(false);
                note5.setSelected(false);
            }
        });
        note2.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                note0.setSelected(true);
                note1.setSelected(true);
                note3.setSelected(false);
                note4.setSelected(false);
                note5.setSelected(false);
            }
        });
        note3.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                note0.setSelected(true);
                note1.setSelected(true);
                note2.setSelected(true);
                note4.setSelected(false);
                note5.setSelected(false);
            }
        });
        note4.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                note0.setSelected(true);
                note1.setSelected(true);
                note2.setSelected(true);
                note3.setSelected(true);
                note5.setSelected(false);
            }
        });
        note5.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                note0.setSelected(true);
                note1.setSelected(true);
                note2.setSelected(true);
                note3.setSelected(true);
                note4.setSelected(true);
                
            }
        });

        Button Valider = new Button("Valider");
        Button Annuler = new Button("Annuler");
        Annuler.setOnAction(new EventHandler<ActionEvent>(){
            @Override
            public void handle(ActionEvent event) {
                TACom.setText("");
                note0.setSelected(true);
                note1.setSelected(false);
                note2.setSelected(false);
                note3.setSelected(false);
                note4.setSelected(false);
                note5.setSelected(false);
            }
        });
        Valider.setOnAction(new EventHandler<ActionEvent>() {
            
            
            @Override
            public void handle(ActionEvent event) {
                if (note0.isSelected()==true && note1.isSelected()==false){
                    EvaluationHote unHote= new EvaluationHote(0,TACom.getText());
                    Alert dlgNok = new Alert (Alert.AlertType.INFORMATION);
                    dlgNok.setTitle("Comfirmation");
                    dlgNok.setHeaderText("Vous avez bien evalué votre repas");
                    dlgNok.setContentText("Note:"+unHote.getNote()+" Commentaire:"+unHote.getCommentaire());
                    dlgNok.showAndWait();
                    
                }
                else if(note1.isSelected()==true && note2.isSelected()==false){
                    EvaluationHote unHote= new EvaluationHote(1,TACom.getText());
                    Alert dlgNok = new Alert (Alert.AlertType.INFORMATION);
                    dlgNok.setTitle("Comfirmation");
                    dlgNok.setHeaderText("Vous avez bien evalué votre repas");
                    dlgNok.setContentText("Note:"+unHote.getNote()+" Commentaire:"+unHote.getCommentaire());
                    dlgNok.showAndWait();
                }
                else if(note2.isSelected()==true && note3.isSelected()==false){
                    EvaluationHote unHote= new EvaluationHote(2,TACom.getText());
                    Alert dlgNok = new Alert (Alert.AlertType.INFORMATION);
                    dlgNok.setTitle("Comfirmation");
                    dlgNok.setHeaderText("Vous avez bien evalué votre repas");
                    dlgNok.setContentText("Note:"+unHote.getNote()+" Commentaire:"+unHote.getCommentaire());
                    dlgNok.showAndWait();
                }
                else if(note3.isSelected()==true && note4.isSelected()==false){
                    EvaluationHote unHote= new EvaluationHote(3,TACom.getText());
                    Alert dlgNok = new Alert (Alert.AlertType.INFORMATION);
                    dlgNok.setTitle("Comfirmation");
                    dlgNok.setHeaderText("Vous avez bien evalué votre repas");
                    dlgNok.setContentText("Note:"+unHote.getNote()+" Commentaire:"+unHote.getCommentaire());
                    dlgNok.showAndWait();
                }
                else if(note4.isSelected()==true && note5.isSelected()==false){
                    EvaluationHote unHote= new EvaluationHote(4,TACom.getText());
                    Alert dlgNok = new Alert (Alert.AlertType.INFORMATION);
                    dlgNok.setTitle("Comfirmation");
                    dlgNok.setHeaderText("Vous avez bien evalué votre repas");
                    dlgNok.setContentText("Note:"+unHote.getNote()+" Commentaire:"+unHote.getCommentaire());
                    dlgNok.showAndWait();
                }
                else {
                    EvaluationHote unHote= new EvaluationHote(5,TACom.getText());
                    Alert dlgNok = new Alert (Alert.AlertType.INFORMATION);
                    dlgNok.setTitle("Comfirmation");
                    dlgNok.setHeaderText("Vous avez bien evalué votre repas");
                    dlgNok.setContentText("Note:"+unHote.getNote()+" Commentaire:"+unHote.getCommentaire());
                    dlgNok.showAndWait();
                }
                
                
            }
                
               
        });
       
 
        root.add(Evaluer, 0, 0,2,1);
        GridPane.setHalignment(Commentaire, HPos.LEFT);
        root.add(Commentaire, 0, 1);
        root.add(TACom, 0,2,6,1);

        root.add(Note, 0,3);
        root.add(note0, 0, 4);
        root.add(note1, 1, 4);
        root.add(note2, 2, 4);
        root.add(note3, 3, 4);
        root.add(note4, 4, 4);
        root.add(note5, 5, 4);

        root.add(Valider, 1, 5);
        root.add(Annuler, 0, 5);
        Scene scene = new Scene(root, 650, 300);
        primaryStage.setTitle("AWA_07");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
