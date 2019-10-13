package MainWindow.Controller;

import Lab2.Human.Human;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

import java.io.IOException;

public class Lab2Controller {

    @FXML
    private TextArea TextArea;

    @FXML
    private ComboBox<String> Variant2;

    @FXML
    private Button ActionButton;

    @FXML
    private Button BackButton1;

    @FXML
    private TextField ValueField;

    @FXML
    private Circle Circle;

    @FXML
    private Line LineX;

    @FXML
    private Line LineY;

    @FXML
    void initialize(){
        VariantSet();
        ActionButton.setOnAction(actionEvent -> {
            if(Variant2.getSelectionModel().isSelected(0)){
                TextArea.setText("");
                Circle.setVisible(true);
                LineX.setVisible(true);
                LineY.setVisible(true);
                Lab2.Circle temp = new Lab2.Circle(ValueField.getText());

                Circle.setCenterX(temp.getX());
                Circle.setCenterY(-temp.getY());
                if (temp.getRadius() <= 150) {
                    Circle.setRadius(temp.getRadius());
                } else {
                    Circle.setVisible(false);
                    LineX.setVisible(false);
                    LineY.setVisible(false);
                    TextArea.setText("Too big radius for Circle (try from 0 to 150)");
                }
            } else if (Variant2.getSelectionModel().isSelected(1)){
                TextArea.setText("");
                Circle.setVisible(false);
                LineX.setVisible(false);
                LineY.setVisible(false);
                Lab2.Human.Human temp = new Lab2.Human.Human(ValueField.getText());
                TextArea.setText(temp.output());
            } else if (Variant2.getSelectionModel().isSelected(2)){
                TextArea.setText("");
                Circle.setVisible(false);
                LineX.setVisible(false);
                LineY.setVisible(false);
                Lab2.Book temp = new Lab2.Book(ValueField.getText());
                TextArea.setText(temp.output());
            }
        });
        BackButton1.setOnAction(actionEvent -> {
            BackButton1.getScene().getWindow().hide();
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../Visual/MainMenu.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root,696, 430));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    public void VariantSet(){
        ObservableList<String> list = FXCollections.observableArrayList("Вариант 1","Вариант 2","Вариант 3");
        Variant2.setItems(list);
    }

}
