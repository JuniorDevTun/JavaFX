package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage s) {
		VBox root = new VBox();		
		
		Button btn = new Button("Click Me Senpai");
		Label l = new Label("Label");
		
		Label l2 = new Label("Label 02");
		l2.getStyleClass().add("blueLabel");

		root.getChildren().addAll(btn, l, l2);

		Scene sc = new Scene(root, 300, 200);
		s.setScene(sc);
		sc.getStylesheets().add(getClass().getResource("styles.css").toExternalForm());
		s.show();
	}	
	public static void main(String[] args) { launch(args); }
}
