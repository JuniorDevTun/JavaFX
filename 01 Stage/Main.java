package application;
	
import javafx.application.Application;
import javafx.stage.Stage;


public class Main extends Application {
	@Override
	public void start(Stage s) {
		// Setting the width & height
		s.setHeight(300);
		s.setWidth(600);
		
		// Setting the Stage's Title
		s.setTitle("Junior Stage");
		
		
		
		// Creating a new Stage
		Stage s2 = new Stage();
		s2.setTitle("Stage 02");
		
		
		// Displaying Stages
		s.show();
		s2.show();
		
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
