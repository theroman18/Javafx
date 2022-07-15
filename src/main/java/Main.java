import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
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

        HBox topMenu = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonA, buttonB, buttonC);

        VBox leftMenu = new VBox();
        Button buttonD = new Button("ELNOTS");
        Button buttonE = new Button("A123A");
        Button buttonF = new Button("A427C");
        leftMenu.getChildren().addAll(buttonD, buttonE, buttonF);

        BorderPane layout = new BorderPane();
        layout.setTop(topMenu);
        layout.setLeft(leftMenu);

        Scene scene = new Scene(layout, 300, 250);
        window.setScene(scene);
        window.show();
    }
}
