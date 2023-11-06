package Zad1JavafxDemo;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.util.ArrayList;
import java.util.HashMap;

public class Main extends Application {
    private final double[] values = new double[2];
    private Label outputLabel = new Label();
    private final String OUTPUT_String = "Całkowita cena za semestr: \n";
    @Override
    public void start(Stage stage) throws Exception {
        DBInterface dbInterface = DataBase.getInstance();


        int[] dormKeysArray = dbInterface.getDormKeys();
        int[] boardingKeysArray = dbInterface.getBoardingKeys();



        ArrayList<String> dormStrings = new ArrayList<>();
        ArrayList<String> boardingStrings = new ArrayList<>();

        for (int i = 0; i < dormKeysArray.length; i++) {
            dormStrings.add(i,dbInterface.getDorm(dormKeysArray[i]).toString());
        }
        for (int i = 0; i < boardingKeysArray.length; i++) {
            boardingStrings.add(i,dbInterface.getBoarding(boardingKeysArray[i]).toString());
        }


        ObservableList<String> dormList = FXCollections.observableArrayList(dormStrings);
        ObservableList<String> boardingList = FXCollections.observableArrayList(boardingStrings);

        ComboBox<String> dormsComboBox = new ComboBox<>(dormList);
        ComboBox<String> boardingsComboBox = new ComboBox<>(boardingList);

        outputLabel.setText(OUTPUT_String+0.0);


        dormsComboBox.setOnAction(actionEvent -> {
            int key = dormsComboBox.getSelectionModel().getSelectedIndex();
            values[0] = dbInterface.getDorm(dormKeysArray[key]).getPrice();
            refreshPrice();
        });
        boardingsComboBox.setOnAction(actionEvent -> {
            int key = boardingsComboBox.getSelectionModel().getSelectedIndex();
            values[1] = dbInterface.getBoarding(boardingKeysArray[key]).getPrice();
            refreshPrice();
        });


        HBox hBox = new HBox(20);
        hBox.setAlignment(Pos.CENTER);
        hBox.setPadding(new Insets(30));

        hBox.getChildren().addAll(dormsComboBox,boardingsComboBox,outputLabel);

        Scene scene = new Scene(hBox);

        stage.setTitle("Bydgoska");

        stage.setScene(scene);
        stage.show();


//        HashMap<Integer,Dorm> dormsHashmap = dbInterface.getDorms();
//        HashMap<Integer,Boarding> boardingHashMap = dbInterface.getBoardings();
//
//        String[][] dormsStrings = new String[dormsHashmap.size()][];
//        String[][] boardingStrings = new String[boardingHashMap.size()][];
//
//        int i =0;
//        for(Integer key:dormsHashmap.keySet()){
//            dormsStrings[i][0]=Integer.toString(key);
//            dormsStrings[i][1]=key+". "+dormsHashmap.get(key).toString();
//            i++;
//        }
//        i=0;
//        for(Integer key:boardingHashMap.keySet()){
//            boardingStrings[i][0]=Integer.toString(key);
//            boardingStrings[i][1]=key+". "+boardingHashMap.get(key).toString();
//        }
//
//
//        ComboBox<String> dormsComboBox = new ComboBox<>();
//        ComboBox<String> boardingsComboBox = new ComboBox<>();
//
//        for (String[] dormsString : dormsStrings) {
//            dormsComboBox.getItems().add(dormsString[1]);
//        }
//        for (String[] boardingString : boardingStrings) {
//            boardingsComboBox.getItems().add(boardingString[1]);
//        }



    }
    private void refreshPrice(){
        double totalPrice = values[0]+values[1];

        outputLabel.setText(OUTPUT_String+totalPrice);


    }

    public static void main(String[] args) {
        launch(args);
    }
}
