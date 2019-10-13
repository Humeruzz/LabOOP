package MainWindow.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.regex.Pattern;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


public class MainMenuController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ButtonLab1;

    @FXML
    private Button ButtonLab2;

    @FXML
    void initialize() {
        ButtonLab1.setOnAction(actionEvent -> {
            ButtonLab1.getScene().getWindow().hide();
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../Visual/Lab1.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root,696, 430));
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
        ButtonLab2.setOnAction(actionEvent -> {
            ButtonLab2.getScene().getWindow().hide();
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("../Visual/Lab2.fxml"));
                Parent root = loader.load();
                Stage stage = new Stage();
                stage.setScene(new Scene(root, 696, 430));
                stage.show();
            } catch (IOException e){
                e.printStackTrace();
            }
        });
    }

}
