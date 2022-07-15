import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class Main extends Application {
    Stage window;
    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Stage title here");

        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        Label usernameLabel = new Label("Username");
        GridPane.setConstraints(usernameLabel, 0, 0);
        TextField nameInput = new TextField("Roman");
        GridPane.setConstraints(nameInput, 1 , 0);

        Label passwordLabel = new Label("Password");
        GridPane.setConstraints(passwordLabel, 0, 1);
        TextField passwordInput = new TextField();
        passwordInput.setPromptText("123@");
        GridPane.setConstraints(passwordInput, 1, 1);

        grid.getChildren().addAll(usernameLabel, nameInput, passwordLabel, passwordInput);
        Scene scene = new Scene(grid, 300, 200);
        window.setScene(scene);
        window.show();
    }
}
