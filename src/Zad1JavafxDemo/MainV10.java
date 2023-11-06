package Zad1JavafxDemo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MainV10 extends Application {
    private final double[] values = new double[2];
    private Label outputLabel = new Label();
    private final String OUTPUT_STRING = "Całkowita cena za semestr: \n";
    @Override
    public void start(Stage stage) throws Exception {
        DBInterface dbInterface = DataBase.getInstance();


        int[] dormKeysArray = dbInterface.getDormKeys();
        int[] boardingKeysArray = dbInterface.getBoardingKeys();

        ComboBox<String> dormsComboBox = new ComboBox<>();
        ComboBox<String> boardingsComboBox = new ComboBox<>();


        for (int i = 0; i < dormKeysArray.length; i++) {

            dormsComboBox.getItems().add(i,dbInterface.getDorm(dormKeysArray[i]).toString());
        }
        for (int i = 0; i < boardingKeysArray.length; i++) {

            boardingsComboBox.getItems().add(i,dbInterface.getBoarding(boardingKeysArray[i]).toString());
        }

        //powinny być dwie dodatkowe klasy, jedna tworząca stringi, druga tworząca widoki db(np zwracająca gotowe
        // arraylisty np. arrayList<String> dormStrings)

        outputLabel.setText(OUTPUT_STRING +0.0);


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


    }
    private void refreshPrice(){
        double totalPrice = values[0]+values[1];

        outputLabel.setText(OUTPUT_STRING +totalPrice);


    }

    public static void main(String[] args) {
        launch(args);
    }
}
