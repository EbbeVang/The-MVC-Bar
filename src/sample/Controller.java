package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class Controller {

    ObservableList<Drink> drinks = FXCollections.observableArrayList();

    public void initialize() {
        // set drinks as table items
        tableView.setItems(drinks);
    }

    @FXML
    private TableView<Drink> tableView;

    @FXML
    private TextField textFieldName;

    @FXML
    private TextField textFieldIngredients;

    @FXML
    void orderDrink(ActionEvent event) {
        Drink drink = new Drink(textFieldName.getText(), textFieldIngredients.getText());
        //tableView.getItems().add(drink);
        drinks.add(drink);
    }

    @FXML
    void serveDrink(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        Drink drink = drinks.remove(0);
        alert.setTitle("Hey - Your drink is ready!");
        alert.setHeaderText(drink.getName());
        alert.setContentText(drink.getIngredients());
        alert.show();

    }
}
