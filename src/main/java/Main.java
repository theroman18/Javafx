import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
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

        // handles the close request if the user clicks on the window's exit button
        window.setOnCloseRequest(eh -> {
            // consume() eats the close event, and tells java that we can handle the rest of the event
            eh.consume();
            closeProgram();
        });

        button = new Button("Close program");
        button.setOnAction(eh -> closeProgram());
        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
    private void closeProgram() {
        boolean answer = ConfirmBox.display("Stage Title here", "Sure you want to close?");
        if (answer) {
            window.close();
        }
    }
}
