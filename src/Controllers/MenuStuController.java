package Controllers;

import LayoutsNavigation.Navigator;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

import java.io.IOException;

public class MenuStuController {


    @FXML
    Button main1;
    @FXML
    Button pay1;
    @FXML
    Button report1;
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

}
