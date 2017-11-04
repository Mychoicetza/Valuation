package valuation;

import enumerator.EnumeratorFXMLController;
import javafx.scene.layout.AnchorPane;
import superviser.SuperviserFXMLContoller;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.net.URL;
import java.io.IOException;
import java.util.ResourceBundle;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

public class Controller implements Initializable{

    LoginModel loginModel = new LoginModel();

    @FXML
    private Label dbstatus;
    @FXML
    private ComboBox<option> comboboxx;
    @FXML
    private TextField username;
    @FXML
    private PasswordField password;
    @FXML
    private Label wrong;
    @FXML
    private Button loginButton;

    @FXML
    private AnchorPane enumpane;
    @FXML
    private AnchorPane superPane;

    @Override
    public void initialize(URL url, ResourceBundle rb){
        if (this.loginModel.isDatabaseConnected()){
            this.dbstatus.setText("Database has Connected successfully");
        }else {
            this.dbstatus.setText("Database has not yet connected");
        }
        this.comboboxx.setItems(FXCollections.observableArrayList(option.values()));

    }

    @FXML
    public void Login(ActionEvent event) {
        try {
            if (this.loginModel.isLogin(this.username.getText(), this.password.getText(), ((option)this.comboboxx.getValue()).toString())){
                Stage stage = (Stage) this.loginButton.getScene().getWindow();
                stage.close();
                switch (((option)this.comboboxx.getValue()).toString()){
                    case "Superviser":
                        superviserLogin(event);
                        break;
                    case "Enumerator":
                        enumeratorLogin(event);
                        break;
                }

            }else {
                this.wrong.setText("Wrong  Credentials...\n" + "Please Try Again Carefully");
            }
        }catch (Exception localException){

        }


    }
    public void enumeratorLogin(ActionEvent event) {
        try
        {
            Stage userStage = new Stage();
            FXMLLoader loader = new FXMLLoader();
            Pane root = (Pane)loader.load(getClass().getResource("/enumerator/sampleEnumerator.fxml").openStream());
            EnumeratorFXMLController enumeratorFXMLController = (EnumeratorFXMLController) loader.getController();
            Scene scene = new Scene(root);
            userStage.setScene(scene);
            userStage.setTitle("enumerator's Dashboard");
            userStage.setResizable(false);
            userStage.show();
        }
        catch (IOException e)
        {
        }
    }

    public void superviserLogin(ActionEvent event)
    {
        try
        {
            Stage adminStage = new Stage();
            FXMLLoader adminLoader = new FXMLLoader();
            ScrollPane adminroot;
            adminroot = (ScrollPane) FXMLLoader.load(getClass().getResource("/superviser/sampleSuperviser.fxml"));
            SuperviserFXMLContoller superviserFXMLContoller = (SuperviserFXMLContoller) adminLoader.getController();

            Scene adminscene = new Scene(adminroot);

            adminStage.setScene(adminscene);
            adminStage.setTitle("Superviser's Dashboard                                                                                                                                                       (DEMO SOFTWARE)::email-mychoicetza@gmail.com ||instagram::mychoicetza   ");
            adminStage.setResizable(true);
            adminStage.show();
        }
        catch (IOException e)
        {
        }
    }

}
