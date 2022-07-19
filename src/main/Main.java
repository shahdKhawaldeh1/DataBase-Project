package main;
import DataBaseConnector.DataBaseConnection;
import LayoutsNavigation.Navigator;
import javafx.application.Application;
import javafx.stage.Stage;
import java.sql.Connection;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        Navigator navigator = Navigator.getInstance();
        navigator.navigateScreen("src/Layouts/1.fxml", "Driving School", 882, 552);
    }
    public static void main(String[] args) {
        launch(args);
    }
}
