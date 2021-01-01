package application;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

public class controller {

	@FXML
	Label textToEdit;
	
	public void myMethod() {
		textToEdit.setText("Marhbe");
	}
}