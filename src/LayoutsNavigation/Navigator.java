package LayoutsNavigation;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

public class Navigator {
    Stage primaryStage = null;
    Scene scene = null;
    Parent root = null;

    private static Navigator navigator = null;

    private Navigator()
    {

    }
    public static Navigator getInstance()
    {
        if(navigator == null)
            navigator = new Navigator();
        return navigator;
    }

    public void navigateScreen(String path, String title, int width, int height) throws IOException {
        if(primaryStage != null)
            primaryStage.hide();
        primaryStage = new Stage();
        URL url = new File(path).toURI().toURL();
        this.root = FXMLLoader.load(url);
        this.scene = new Scene(this.root, width, height);
        primaryStage.setTitle(title);
        primaryStage.setScene(this.scene);
        primaryStage.show();
    }

}
