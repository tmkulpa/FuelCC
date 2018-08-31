package application;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class FuelCCValidation {
	
	public static boolean EmptyInput(TextField InputTextField, Label InputLabel, String ValidationText) {
		
		boolean IsInputEmpty = true;
		String ValidationString = null;
		
		if (InputTextField.getText().isEmpty()) {
			IsInputEmpty = true;
			ValidationString = ValidationText;
		}
		
		InputLabel.setText(ValidationString);
		return IsInputEmpty;
		
	}
	
	public static boolean NumberInput(TextField InputTextField, Label InputLabel, String ValidationText) {
		
		boolean IsInputNumeric = true;
		String ValidationString = null;
		
		if (!InputTextField.getText().matches("[0.-9.]+")) {
			IsInputNumeric = true;
			ValidationString = ValidationText;	
		}
		
		InputLabel.setText(ValidationString);
		return IsInputNumeric;
		
	}

}