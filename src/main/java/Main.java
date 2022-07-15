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
import javafx.stage.Window;

public class Main extends Application {
    Stage window;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Stage title here");

        Label firstNameLabel = new Label("First Name");
        Label lastNameLabel = new Label("Last Name");

        TextField firstNameInput = new TextField();
        firstNameInput.setPromptText("Roman");
        TextField lastNameInput = new TextField();
        lastNameInput.setPromptText("Sanchez");

        Button button = new Button("Submit name");
        button.setOnAction(eh -> isInt(firstNameInput, firstNameInput.getText()));
        VBox layout = new VBox();
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(firstNameLabel, firstNameInput, lastNameLabel, lastNameInput, button);

        Scene scene = new Scene(layout, 300, 300);
        window.setScene(scene);
        window.show();
    }

    private boolean isInt(TextField input, String message) {
        try {
            int age = Integer.parseInt(input.getText());
            System.out.println("User is: " + age);
            return true;
        } catch (NumberFormatException e) {
            System.out.println("Error: " + message + " is not a number");
            return false;
        }
    }
}
