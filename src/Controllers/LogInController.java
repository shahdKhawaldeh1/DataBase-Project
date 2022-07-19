package Controllers;

import LayoutsNavigation.Navigator;
import LoggedUser.LoggedUser;
import Models.instructor;
import Models.student;
import ModelsCRUD.StudentDaoImplementation;
import ModelsCRUD.instructorDaoImplementation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.sql.SQLException;

public class LogInController {
    @FXML
    Button login;
    @FXML
    Button cancel;
    @FXML
    TextField username;
    @FXML
    PasswordField password;
    @FXML
    CheckBox check1;
    @FXML
    CheckBox check2;


    public void LogIn() throws IOException, SQLException {
        student stu = new student();
        StudentDaoImplementation student = new StudentDaoImplementation();
        instructor ins = new instructor();
        instructorDaoImplementation instructor = new instructorDaoImplementation();
        if(ValidateLogIn() == true)
        {

            if (check1.isSelected()) {
                stu = student.login(username.getText(), password.getText());
                if (stu != null) {
                    Navigator navigator = Navigator.getInstance();
                    navigator.navigateScreen("src/Layouts/menustu.fxml", "menu", 220, 358);
                    LoggedUser.setLoggedUser(stu);
                }
            }
            if (check2.isSelected()) {
                ins = instructor.login(username.getText(), password.getText());
                if (ins != null) {
                    Navigator navigator = Navigator.getInstance();
                    navigator.navigateScreen("src/Layouts/menu.fxml", "menu", 220, 200);
                    LoggedUser.setLoggedUser(ins);
                }
            }

        }
    }

    public boolean ValidateLogIn()
    {
        boolean validate = true;
        if(username.getText().contains(" ") || username.getText() == "" || username.getText() == null)
        {
            username.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
            validate = false;
        }
        if(password.getText() == "" || password.getText() == null || password.getText().length() < 8)
        {
            password.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
            validate = false;
        }

        return validate;
    }

    public void Cancel() throws IOException {
        username.clear();
        password.clear();
        username.setStyle("");
        password.setStyle("");
        Navigator navigator = Navigator.getInstance();
        navigator.navigateScreen("src/Layouts/1.fxml", "Driving School", 882, 552);

    }

}
