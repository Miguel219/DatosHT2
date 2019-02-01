package application;

import java.io.File;
import java.nio.file.Files;
import java.util.Scanner;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.control.Alert.AlertType;

public class MainController {
	
	@FXML
	private TextField pathTextField;
	@FXML
	private Label result;
	
	private StackImp stack;
	private ImpCalculadora calculator;
	private Scanner s;
	
	public void read() {
		//Si ya se verifico y no hay error se lee el archivo
		if(verifyPath()) {
			//Se recorre todo el archivo
			String line = "";
			while (s.hasNext()) {
				line = line + s.next()+ " ";
			}
				//Se hace un arreglo de strings
				String[] text = line.split(" ");
				//Se recorre la linea del archivo txt
				for (int i = 0; i < text.length; i++) {
					String value = text[i];
					//Se guarda el valor en el stack
					stack.push(value);
					try {
						//Se intenta convertir a int
						Integer.parseInt(value);
					} catch (Exception e) {
						// TODO: handle exception
						//Si no es int es un operando entonces ya se puede efectuar la operacion
						//Se sacan la operacion y los dos operandos
						String operacion = stack.pop();
						int operando1 = Integer.parseInt(stack.pop());
						int operando2 = Integer.parseInt(stack.pop());
						//Se hace la operacion
						int resultado = calculator.Calculate(operando1, operando2, operacion);
						//Se guarda el resultado en la primera posicion del stack
						stack.push(String.valueOf(resultado));
					}
				}
				result.setText("Resultado: "+stack.pop());
		}
	}
	
	public boolean verifyPath() {
		try {
			//Se lee el archivo
			s = new Scanner(new File(pathTextField.getText()));
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			Alert alert = new Alert(AlertType.ERROR);
			alert.setTitle("Error");
			alert.setHeaderText("Error en datos ingresado");
			alert.setContentText("Verifica la dirección del archivo ingresado sea correcta");
			alert.showAndWait();
			return false;
		}
	}
	
	@FXML
    public void initialize() {
		stack = new StackImp();
		calculator = new ImpCalculadora();
    }
	
}
