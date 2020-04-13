package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller {

    @FXML
    private TableView<Drink> tableView;

    @FXML
    private TextField textFieldName;

    @FXML
    private TextField textFieldIngredients;

    @FXML
    void orderDrink(ActionEvent event) {
        Drink drink = new Drink(textFieldName.getText(), textFieldIngredients.getText());
        tableView.getItems().add(drink);
    }
}
