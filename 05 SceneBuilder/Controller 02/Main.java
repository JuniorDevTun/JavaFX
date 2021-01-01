package application;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {
	@Override
	public void start(Stage s){
		
		try {
			
			VBox root = FXMLLoader.load(getClass().getResource("design.fxml"));
			Scene sc = new Scene(root);
			s.setScene(sc);		
			s.show();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
					
	}
	
	public static void main(String[] args) { launch(args); }
}
