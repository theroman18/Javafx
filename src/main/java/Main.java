import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application implements EventHandler<ActionEvent> {
    Button button;
    Button button2;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Title of the Window");
        button = new Button("Click me");
        button.setOnAction(this);
        button2 = new Button("I'm #2");
        button2.setOnAction(this);

        StackPane layout = new StackPane();
        layout.getChildren().add(button);
        layout.getChildren().add(button2);

        Scene scene = new Scene(layout, 300, 150);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button) {
            System.out.println("oooo yaaaa keep click right here");
        }
        if (event.getSource() == button2) {
            System.out.println("you clicked button 2");
        }
    }
}
