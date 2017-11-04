package valuation;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileInputStream;
import static javafx.application.Application.launch;

public class Valuation extends Application {

    @Override
    public void start(Stage stage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("sample.fxml"));
        stage.setTitle("RealEstatePROJECT");
        stage.setScene(new Scene(root, 1920, 1080));

        stage.show();

    }


    public static void main(String[] args) {
        launch(args);
    }
}
