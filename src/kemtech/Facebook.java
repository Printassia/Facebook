package kemtech;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.text.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.*;
import java.awt.*;

public class Facebook extends Application{
    //Launch Application
    public static void main(String[] args) {
        launch(args);
    }

    //BEGIN CODE
    Text facebookLogin;



    Text emailLabel;
    TextField loginEmailTextField;
    Text passwordLabel;
    TextField passwordTextField;
    Label forgetPassword;
    Button loginButton;

    CheckBox stayLogged;

    Text header;
    Label subHeader;

    Label firstName;
    Label lastName;
    Label yourEmail;
    Label reEnterEmail;
    Label newPassword;

    TextField firstNameTextField;
    TextField lastNameTextField;
    TextField emailTextField;
    TextField reEnterEmailField;
    TextField passwordField;
    Label iAm;
    Label birthdayLabel;
    Label whyLabel;
    Button signUp;
    Label createPage;



    Stage stage;
    @Override public void start(Stage stage){
        this.stage = stage;

//        ------TOP PANE --------
        //TEXT
        facebookLogin = new Text("facebook");
        facebookLogin.setFont(Font.font("Verdana",FontWeight.EXTRA_BOLD, 20));
        facebookLogin.setFill(Color.WHITE);

        loginEmailTextField = new TextField();
        loginEmailTextField.setPromptText("Email or Phone");

        passwordTextField = new TextField();
        passwordTextField.setPromptText("Password");

        stayLogged = new CheckBox("Keep me logged in");
        forgetPassword = new Label("Forget your password?");

        loginButton = new Button("Login");

        //Create group for label names
//        Group root = new Group();
//        root.getChildren().addAll(emailLabel,passwordLabel);

        //Create spacer
        Region spacer = new Region();

        HBox firstPane = new HBox(10, facebookLogin,spacer, loginEmailTextField, passwordTextField);
        firstPane.setHgrow(spacer, Priority.ALWAYS);
        firstPane.setPadding(new Insets(10,10,10,30));
        firstPane.setStyle(
                "-fx-background-color:blue;" +
                        "-fx-margin-bottom:50;"
        );


        //SIGN UP SECTION
        header = new Text("Sign UP");
        header.setFont(Font.font("Verdana",FontWeight.BOLD,20));
        header.setFill(Color.BLUE);
        subHeader = new Label("It's free, and always will be.");
        subHeader.setTextFill(Color.BLUE);
        subHeader.setFont(Font.font("Verdana", FontWeight.THIN, 19));

        firstName = new Label("First Name :");
        firstNameTextField = new TextField();
        lastName = new Label("Last Name: ");
        lastNameTextField = new TextField();
        reEnterEmail = new Label("Re-enter Email: ");
        reEnterEmailField = new TextField();
        newPassword = new Label("New Password: ");
        passwordTextField = new PasswordField();

        iAm = new Label("I am: ");
        //Create ComboBox for Sex
        ComboBox<String> sexComboBox = new ComboBox<String>();
        sexComboBox.getItems().addAll("Male", "Female");
        sexComboBox.setValue("Select Sex");

        birthdayLabel = new Label("Birthday: ");
        //Create ComboBox for Birthday
        ComboBox<String> birthdayComboBox = new ComboBox<String>();
        birthdayComboBox.getItems().addAll("January", "February");
        birthdayComboBox.setValue("Month: ");

        //Create ComboBox for Birthday
        ComboBox<String> dateComboBox = new ComboBox<String>();
        dateComboBox.getItems().addAll("01", "02");
        dateComboBox.setValue("Day: ");

        //Create ComboBox for Birthday
        ComboBox<String> yearComboBox = new ComboBox<String>();
        yearComboBox.getItems().addAll("1980", "1981");
        yearComboBox.setValue("Year: ");

        // Create a vbox spacer
        Region spacer2 = new Region();
        HBox secondpane = new HBox();
        VBox vbox = new VBox(10, header, subHeader, firstName, firstNameTextField, lastName, lastNameTextField, reEnterEmail,
                reEnterEmailField, newPassword, passwordTextField, sexComboBox,birthdayComboBox,dateComboBox, yearComboBox);
        VBox.setVgrow(spacer2, Priority.ALWAYS);

        vbox.setPadding(new Insets(100,10,50,300));

        BorderPane pane = new BorderPane();
        pane.setTop(firstPane);
        pane.setRight(vbox);
        pane.setBottom(whyLabel);

        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Facebook");
        stage.show();





    }
}
