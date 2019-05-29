package front_end.gui;

import java.net.URL;
import java.util.ResourceBundle;

import com.fazecast.jSerialComm.SerialPort;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

public class GuiController implements Initializable {
	private GuiView view;
	@FXML
	private ComboBox<String> comComboBox;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		SerialPort[] ports= SerialPort.getCommPorts();
		for(SerialPort port : ports) {
			comComboBox.getItems().add(port.getSystemPortName());
		}	
	}

	public void SetView(GuiView guiView) {
		this.view = guiView;
	}

	@FXML
	private void connectClick() {
		
	}
	
	@FXML
	private void disconnectClick() {
		
	}
}
