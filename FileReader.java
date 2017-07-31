import java.io.*;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.*;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
public class FileReader {
	public void FRPlay(String soundFile){
		try {
	Media media = new Media(new File(soundFile).toURI().toString());
	MediaPlayer med = new MediaPlayer(media);
	med.play();
		}
		catch (Exception e){
			Alert alert = new Alert(AlertType.INFORMATION);
			alert.setTitle("Error!");
			alert.setHeaderText("You've imported the wrong file!");
			alert.setContentText("Please make this an MP3 File!");
		}
	}
}
