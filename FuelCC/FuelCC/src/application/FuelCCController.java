package application;

import com.jfoenix.controls.JFXButton;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import application.FuelCCValidation;

public class FuelCCController{
	
	@FXML
	private JFXButton btnMpgToLkm, btnLkmToMpg;
	
	@FXML
	private Label lbResultMpg, lbResultLkm, lbMpgWarning, lbLkmWarning;
	
	@FXML
	private TextField tfMilesPerGalon, tfLitersPer100Kilometers;

	@FXML
	void initialize() {
		
		btnMpgToLkm.setOnAction(e -> {
			convertMpgToLkm(tfMilesPerGalon.getText());
		});

		btnLkmToMpg.setOnAction(e -> {
			convertLkmToMpg(tfLitersPer100Kilometers.getText());
		});
		
	}	

	private void convertMpgToLkm(String mpgString) {
		
		try {
			FuelCCValidation.NumberInput(tfMilesPerGalon, lbMpgWarning, "Input a number!");
			double mpg = Double.parseDouble(mpgString);
			double lkm = (100 / mpg) * (3.78541178 / 1.609344);
			lbResultLkm.setText(String.format("%.2f", lkm));
		}
		catch(NumberFormatException e) {
			lbMpgWarning.setText("Input a number!");
		}
		
	}	
	
	private void convertLkmToMpg(String lkmString) {
		
		try {
			FuelCCValidation.NumberInput(tfLitersPer100Kilometers, lbLkmWarning, "Input a number!");
			double lkm = Double.parseDouble(lkmString);
			double mpg = (100 / lkm) * (3.78541178 / 1.609344);
		    lbResultMpg.setText(String.format("%.2f", mpg));
		}
		catch(NumberFormatException e) {
			lbLkmWarning.setText("Input a number!");
		}		
	    
	}
	

}
