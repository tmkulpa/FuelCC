package application;
	
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;

public class FuelCCMain extends Application {
	@Override
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("FuelCCLayout.fxml"));
			Scene scene = new Scene(root);			
			scene.getStylesheets().add(getClass().getResource("FuelCCCSS.css").toExternalForm());
			primaryStage.setTitle("Fuel consumption converter");
			primaryStage.getIcons().add(new Image("application/fuel.jpg"));
			primaryStage.setScene(scene);
			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		launch(args);
	}
}
