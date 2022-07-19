package Controllers;

import LayoutsNavigation.Navigator;
import Models.student;
import ModelsCRUD.StudentDaoImplementation;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;
import java.sql.Date;
import java.sql.SQLException;

public class SignUpController {
    @FXML
    TextField first_name;
    @FXML
    TextField last_name;
    @FXML
    TextField phone;
    @FXML
    TextField address;
    @FXML
    TextField DOB;
    @FXML
    TextField gender;
    @FXML
    TextField username;
    @FXML
    PasswordField password;
    @FXML
    PasswordField confirm_password;
    @FXML
    Button clear;
    @FXML
    Button submit;
    @FXML
    Button back;

    public void Submit()
    {
        if(ValidateInput() == true)
        {
            StudentDaoImplementation studentDaoImplementation = new StudentDaoImplementation();
            student student = new student();
            student.setFirst_name(first_name.getText());
            student.setLast_name(last_name.getText());
            student.setAddress(address.getText());
            student.setPhone(phone.getText());
            student.setGender(gender.getText());
            student.setDate_of_birth(Date.valueOf(DOB.getText()));
            student.setPassword1(password.getText());
            student.setUsername(username.getText());
            try {
                studentDaoImplementation.add(student);
                Navigator navigator = Navigator.getInstance();
                navigator.navigateScreen("src/Layouts/4.fxml", "Log In", 805, 533);
            } catch (SQLException | IOException throwables) {
                throwables.printStackTrace();
            }
        }
    }

    public boolean ValidateInput()
    {
        boolean validate = true;
        if(first_name.getText() == "" || first_name.getText() == null)
        {
            first_name.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
            validate = false;
        }
        if(last_name.getText() == "" || last_name.getText() == null)
        {
            last_name.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
            validate = false;
        }
        if(!phone.getText().matches("\\d{10}|\\d{11}"))
        {
            phone.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
            validate = false;
        }
        if(address.getText() == "" || address.getText() == null)
        {
            address.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
            validate = false;
        }
        if(gender.getText() == "" || gender.getText() == null)
        {
            address.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
            validate = false;
        }
        if(DOB.getText() == "" || DOB.getText() == null || DOB.getText().length() < 7)
        {
            address.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
            validate = false;
        }
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
        if(!confirm_password.getText().equals(password.getText()))
        {
            confirm_password.setStyle("-fx-text-box-border: #B22222; -fx-focus-color: #B22222;");
            validate = false;
        }
        return validate;
    }

    public void goBack() throws IOException {
        Navigator navigator = Navigator.getInstance();
        navigator.navigateScreen("src/Layouts/1.fxml", "Driving School", 882, 552);
    }

    public void Clear(){
        first_name.clear();
        last_name.clear();
        address.clear();
        username.clear();
        password.clear();
        confirm_password.clear();
        phone.clear();
        first_name.setStyle("");
        last_name.setStyle("");
        address.setStyle("");
        username.setStyle("");
        password.setStyle("");
        confirm_password.setStyle("");
        phone.setStyle("");
    }


}
