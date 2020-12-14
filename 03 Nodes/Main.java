package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage s) {
		s.setTitle("Junior Stage");
		s.setHeight(300);
		s.setWidth(600);		
		
		HBox root = new HBox();
		Scene sc = new Scene(root);
		
		// Adding nodes to the SCENE
		Label l = new Label("this is a label");
		Button btn = new Button("Click Me Senpai");
		
		Image image = new Image("https://cuisine.nessma.tv/uploads/1/2019-07/4afa862f03cce740af8256066c60f177.jpg");
		ImageView img = new ImageView(image);
		img.setFitHeight(200);
		img.setFitWidth(400);
		
		
		root.getChildren().addAll(l, btn, img);
		s.setScene(sc);
		s.show();		
	}	
	public static void main(String[] args) { launch(args); }
}
