package Controllers;

import LayoutsNavigation.Navigator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class mnuecontoller {

    @FXML
    Button main;
    @FXML
    Button car;
    @FXML
    Button payment;
    @FXML
    Button student;
    @FXML
    Button instructor;
    @FXML
    Button report;
    @FXML
    Button enroll;

    public void GoToM() throws IOException {
        Navigator navigator = Navigator.getInstance();
        navigator.navigateScreen("src/Layouts/1.fxml", "Main", 822, 553);
    }
    public void GoToR() throws IOException {
        Navigator navigator = Navigator.getInstance();
        navigator.navigateScreen("src/Layouts/report.fxml", "Report", 830, 570);
    }

    public void GoToP() throws IOException {
        Navigator navigator = Navigator.getInstance();
        navigator.navigateScreen("src/Layouts/payment.fxml", "Payment", 830, 570);
    }

    public void GoToE() throws IOException {
        Navigator navigator = Navigator.getInstance();
        navigator.navigateScreen("src/Layouts/enroll.fxml", "Enrollment", 847, 627);
    }

    public void GoToI() throws IOException {
        Navigator navigator = Navigator.getInstance();
        navigator.navigateScreen("src/Layouts/instructor.fxml", "Instructor", 846, 554);
    }
    public void GoToS() throws IOException {
        Navigator navigator = Navigator.getInstance();
        navigator.navigateScreen("src/Layouts/student.fxml", "Student", 850, 600);
    }
    public void GoToC() throws IOException {
        Navigator navigator = Navigator.getInstance();
        navigator.navigateScreen("src/Layouts/car.fxml", "Car", 830, 570);
    }
}
