package MainWindow.Controller;

import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class Lab1Controller {

    @FXML
    private ComboBox<String> Variant2;

    @FXML
    private Button ActionButton;

    @FXML
    private TextArea TextArea;

    @FXML
    private TextField ValueField;

    @FXML
    void initialize(){
        VariantSet();
        ActionButton.setOnAction(actionEvent -> {
            if(Variant2.getSelectionModel().isSelected(0)){
                Lab1.Var1 obj = new Lab1.Var1();
                TextArea.setText("");
                TextArea.setText(obj.output());
            } else if (Variant2.getSelectionModel().isSelected(1)){
                Lab1.Var2 obj = new Lab1.Var2(ValueField.getText());
                ValueField.setText("");
                TextArea.setText("");
                TextArea.setText(obj.output());
            }else if (Variant2.getSelectionModel().isSelected(2)) {
                Lab1.Var3 obj = new Lab1.Var3();
                TextArea.setText("");
                int temp;
                try {
                    temp = Integer.parseInt(ValueField.getText());
                } catch (NumberFormatException e){
                    temp = 0;
                }
                TextArea.setText(obj.output(temp));
                ValueField.setText("");
            }else if (Variant2.getSelectionModel().isSelected(3)){
                int temp;
                try {
                    temp = Integer.parseInt(ValueField.getText());
                }catch (NumberFormatException e) {
                    temp =  0;
                }
                Lab1.Var4 obj = new Lab1.Var4(temp);
                ValueField.setText("");
                TextArea.setText("");
                TextArea.setText(obj.output());
            }else if (Variant2.getSelectionModel().isSelected(4)){
                Lab1.Var5 obj = new Lab1.Var5();
                TextArea.setText("");
                TextArea.setText(obj.output());
            }
        });
    }

    public void VariantSet(){
        ObservableList<String> list = FXCollections.observableArrayList("Вариант 1","Вариант 2","Вариант 3","Вариант 4","Вариант 5");
        Variant2.setItems(list);
    }
}
