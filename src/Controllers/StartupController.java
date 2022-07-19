package Controllers;

import LayoutsNavigation.Navigator;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;


public class StartupController {

    @FXML
    Button signup;
    @FXML
    Button contact;
    @FXML
    Button login;
    @FXML
    Button aboutus;

    public void SignUp() throws IOException {
        Navigator navigator = Navigator.getInstance();
        navigator.navigateScreen("src/Layouts/3.fxml", "Sign Up", 815, 525);
    }

    public void LogIn() throws IOException {
        Navigator navigator = Navigator.getInstance();
        navigator.navigateScreen("src/Layouts/4.fxml", "Log In", 805, 533);
    }

    public void AboutUs() throws IOException {
        Stage primaryStage = new Stage();
        URL url = new File("src/Layouts/5.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root, 672, 475);
        primaryStage.setTitle("About Us");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public void Contact() throws IOException {
        Stage primaryStage = new Stage();
        URL url = new File("src/Layouts/2.fxml").toURI().toURL();
        Parent root = FXMLLoader.load(url);
        Scene scene = new Scene(root, 672, 475);
        primaryStage.setTitle("Contact");
        primaryStage.setScene(scene);
        primaryStage.show();
    }


}
