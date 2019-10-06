package MainWindow.Controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;


public class MainMenuController {

    @FXML
    private Button ButtonLab1;

    @FXML
    void initialize() {
        ButtonLab1.setOnAction(actionEvent -> {
            ButtonLab1.getScene().getWindow().hide();
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(getClass().getResource("Visual/Lab1.fxml"));
            try {
                loader.load();
            } catch (IOException e) {
                e.printStackTrace();
            }
            Parent root = loader.getRoot();
            Stage stage = new Stage();
            stage.setScene(new Scene(root,696, 430));
            stage.showAndWait();
        });
    }

}
