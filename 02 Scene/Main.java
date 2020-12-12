package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage s) {
		s.setTitle("Junior Stage");
		s.setHeight(300);
		s.setWidth(600);		
		
        // Layout manager used by the Scene
		VBox root = new VBox();
        // Creating a new Scene
		Scene sc = new Scene(root);

        // Assigning the scene to the Stage
		s.setScene(sc);
		s.show();		
	}	
	public static void main(String[] args) { launch(args); }
}
