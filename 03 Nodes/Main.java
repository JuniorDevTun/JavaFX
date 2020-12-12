package application;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage s) {
		s.setTitle("Junior Stage");
		s.setHeight(300);
		s.setWidth(600);		
		
		VBox root = new VBox();
		Scene sc = new Scene(root);
		
		// New Node (Label)
		Label l = new Label("this is a label");
		
		// Adding the node (label) onto the scene(root, layout)
		root.getChildren().add(l);
        
		s.setScene(sc);
		s.show();		
	}	
	public static void main(String[] args) { launch(args); }
}
