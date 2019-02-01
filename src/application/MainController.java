package application;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class MainController {
	
	@FXML
	private TextField pathTextField;
	@FXML
	private Label result;
	
	private Scanner s;
	
	public void read() {
		if(verifyPath()) {
			
		}
	}
	
	public boolean verifyPath() {
		try {
			s = new Scanner(new File(pathTextField.getText()));
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
}
