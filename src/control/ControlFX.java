package control;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import com.jfoenix.controls.JFXButton;

import javafx.animation.FadeTransition;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;


public class ControlFX {
	@FXML
	JFXButton Boton;

    @FXML
    private ImageView drawerImage;

    
	public void sendStage() {
		try {

            // Load the fxml file and create a new stage for the popup.
            Parent root=FXMLLoader.load(getClass().getResource("GetMe.fxml"));
            Stage sendStage = new Stage();
            sendStage.setTitle("Send Profile");
            Scene scene = new Scene(root);
            sendStage.setScene(scene);
            
            sendStage.show();

			
			
			

		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	@FXML
	public void closeStage() {
			Stage thisStage = (Stage) Boton.getScene().getWindow();
			thisStage.close();
			sendStage();
		}

	
}