package Controllers;

import Models.Car;
import ModelsCRUD.CarDaoImplementation;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import javafx.scene.control.TableView;
import java.net.URL;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.ResourceBundle;


public class CarController implements Initializable {

    @FXML
    ImageView delete;
    @FXML
    ImageView update;
    @FXML
    ImageView add;
    @FXML
    TableView table;
    @FXML
    TableColumn id_column;
    @FXML
    TableColumn model_column;
    @FXML
    TableColumn color_column;
    @FXML
    TableColumn year_column;
    @FXML
    TableColumn type_column;
    @FXML
    TableColumn number_column;

    public void Delete(){

    }
    public void Update()
    {

    }

    public void ADD()
    {

    }

    public void Search(){}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        id_column.setCellValueFactory(
                new PropertyValueFactory<Car, Integer>("car_id")
        );
        model_column.setCellValueFactory(
                new PropertyValueFactory<Car, String>("model")
        );
        color_column.setCellValueFactory(
                new PropertyValueFactory<Car, String>("color")
        );
        year_column.setCellValueFactory(
                new PropertyValueFactory<Car, Integer>("year_of_manufacture")
        );
        CarDaoImplementation carDaoImplementation = new CarDaoImplementation();
        try {
            List<Car> cars = carDaoImplementation.getCars();
            final ObservableList<Car> data = FXCollections.observableArrayList(cars);
            table.getItems().addAll(data);

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
