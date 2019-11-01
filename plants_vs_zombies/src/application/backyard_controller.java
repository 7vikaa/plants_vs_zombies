package application;

import java.net.URL;
import java.util.Random;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.util.Duration;
import javafx.animation.TranslateTransition;

public class backyard_controller implements Initializable{
	
	@FXML
	private Pane peashooter1_peaPane;
	
	@FXML
	private ImageView test;
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		TranslateTransition transition = new TranslateTransition();
		transition.setDuration(Duration.seconds(1));
		transition.setNode(test);
		
		transition.setToY(-200);
		transition.setAutoReverse(true);
		transition.setCycleCount(TranslateTransition.INDEFINITE);
		transition.play();
	}
	
	
}
