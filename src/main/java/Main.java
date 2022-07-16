import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;
import javafx.stage.Window;

public class Main extends Application {
    Stage window;
    Scene scene;
    Button button;
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        window = primaryStage;
        window.setTitle("Roman's Sandwhiches");

        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Lettuce");
        CheckBox box3 = new CheckBox("Tomato");
        box2.setSelected(true);

        button = new Button("Order Now!");
        button.setOnAction(event -> handleOptions(box1, box2, box3));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20, 20, 20, 20));
        layout.getChildren().addAll(box1, box2, box3, button);

        scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }

    private void handleOptions(CheckBox box1, CheckBox box2, CheckBox box3) {
        String message = "Users order:\n";

        if (box1.isSelected()) {
            message += "Bacon\n";
        }
        if (box2.isSelected()) {
            message += "Lettuce\n";
        }
        if (box3.isSelected()) {
            message += "Tomato\n";
        }
        System.out.println(message);
    }
}
