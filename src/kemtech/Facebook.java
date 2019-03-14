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

        emailLabel = new Text();
//        emailLabel.setText("Email or Phone");

//        emailLabel.setX(300);
//        emailLabel.setY(40);
        loginEmailTextField = new TextField();
        loginEmailTextField.setPromptText("Email or Phone");

        passwordLabel = new Text("Password");

        passwordTextField = new TextField();
        passwordTextField.setPromptText("Password");

        stayLogged = new CheckBox("Keep me logged in");
        forgetPassword = new Label("Forget account?");

        loginButton = new Button("Login");


        //Create spacer
        Region spacer = new Region();

        HBox firstPane = new HBox(10, facebookLogin,spacer, emailLabel,loginEmailTextField, passwordTextField);
        firstPane.setHgrow(spacer, Priority.ALWAYS);
        firstPane.setPadding(new Insets(50,10,10,30));
        firstPane.setStyle(
                "-fx-background-color:blue;" +
                        "-fx-margin-bottom:50;"
        );


        //SIGN UP SECTION
        header = new Text("Sign UP");
        header.setFont(Font.font("Verdana",FontWeight.BOLD,40));
        header.setFill(Color.BLACK);
        subHeader = new Label("It's free, and always will be.");
        subHeader.setTextFill(Color.BLACK);
        subHeader.setFont(Font.font("Verdana", FontWeight.THIN, 15));

        firstNameTextField = new TextField();
        firstNameTextField.setPromptText("First Name ");
        firstNameTextField.setMaxWidth(200);
        lastNameTextField = new TextField();
        lastNameTextField.setPromptText("Last Name ");
        lastNameTextField.setMaxWidth(200);
        HBox namePane = new HBox(15, firstNameTextField, lastNameTextField);

        reEnterEmailField = new TextField();
        reEnterEmailField.setPromptText("Mobile number or email");
        reEnterEmailField.setMaxWidth(350);
        passwordTextField = new PasswordField();
        passwordTextField.setPromptText("New Password: ");
        passwordTextField.setMaxWidth(350);

        birthdayLabel = new Label("Birthday: ");
        //Create ComboBox for Birthday
        ComboBox<String> birthdayComboBox = new ComboBox<String>();
        birthdayComboBox.getItems().addAll("January", "February", "March", "April", "May",
                "June", "July", "August", "October", "November", "December");
        birthdayComboBox.setValue("Month: ");

        //Create ComboBox for Birthday
        ComboBox<String> dateComboBox = new ComboBox<String>();
        dateComboBox.getItems().addAll("Day", "01", "02", "03", "04", "05", "06", "07", "08", "09",
                "10", "11","12","13","14","15","16","17","18",
                "19","20","21","22","23","24","25","26"
                , "27","28","29","30","31");
        dateComboBox.setValue("Day: ");

        //Create ComboBox for Birthday
        ComboBox<String> yearComboBox = new ComboBox<String>();
        yearComboBox.getItems().addAll("1905","1906","1907","1908","1909","1910","1911",
                "1912","1913","1914","1915","1916","1917","1918","1919","1920","1921","1922","1923",
                "1924", "1925","1926","1927","1928","1929","1930","1931","1932","1933","1934","1935",
                "1936","1937","1938","1939","1940","1941","1942","1943","1944","1945","1946","1947",
                "1948","1949","1950","1951","1952","1953","1954","1955","1956","1957","1958","1959",
                "1960","1961","1962","1963","1964","1965","1966","1967","1968","1969","1970","1971",
                "1972","1973","1974","1975","1976","1977","1978","1979","1980","1981","1982","1983",
                "1984","1985","1986","1987","1988","1989","1990","1991","1992","1993","1994","1995",
                "1996","1997","1998","1999","2000","2001","2002","2003","2004","2005","2006","2007",
                "2008","2009","2010","2011","2012","2013","2014","2015","2016","2017","2018","2019"
        )
        ;
        yearComboBox.setValue("Year: ");

        whyLabel = new Label("Why do I need to provide my birthday");
        whyLabel.setFont(Font.font("Arial", FontWeight.NORMAL,8));
        whyLabel.setTextFill(Color.BLUE);

        //Create RadioButtons for Sex
        RadioButton female = new RadioButton("Female");
        RadioButton male = new RadioButton("Male");
        ToggleGroup sexComboBox = new ToggleGroup();
        sexComboBox.selectToggle(female);
        sexComboBox.selectToggle(male);

        // Create a vbox spacer
        Region spacer2 = new Region();

        HBox secondpane = new HBox(5, birthdayComboBox,dateComboBox, yearComboBox, whyLabel);
        HBox thirdpane = new HBox(female, male);
        VBox vbox = new VBox(10, header, subHeader, namePane,
                reEnterEmailField, passwordTextField, secondpane, thirdpane);
        VBox.setVgrow(spacer2, Priority.ALWAYS);



        vbox.setPadding(new Insets(50,10,50,300));

        BorderPane pane = new BorderPane();
        pane.setTop(firstPane);
        pane.setRight(vbox);


        Scene scene = new Scene(pane);
        stage.setScene(scene);
        stage.setTitle("Facebook");
        stage.show();





    }
}
