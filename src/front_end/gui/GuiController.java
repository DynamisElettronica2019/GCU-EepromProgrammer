package front_end.gui;

import java.net.URL;
import java.util.ResourceBundle;

import com.fazecast.jSerialComm.SerialPort;

import back_end.Debug;
import back_end.parsed.ParsedPage0;
import configuration.Channels;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class GuiController implements Initializable {
	private GuiView view;
	@FXML
	private Circle connectionStatus;
	@FXML
	private ComboBox<String> comComboBox;
	@FXML
	private TextField eepromStateField, eepromLastComField, eepromReadCounterField, eepromWriteCounterField;

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
		view.getCommandSender().openPort(comComboBox.getValue());
		connectionStatus.setFill(Color.GREEN);
	}
	
	@FXML
	private void disconnectClick() {
		view.getCommandSender().closePort();
		connectionStatus.setFill(Color.RED);
	}
	
	@FXML
	private void readDebug() {
		view.getCommandSender().sendReadRequest(Channels.PAGE_0_ID);
	}
	
	@FXML
	private void writeDebug() {
		ParsedPage0 parsed = new ParsedPage0('0');
		parsed.splitString(eepromStateField.getText() + "0" + eepromLastComField.getText() + "0" + eepromReadCounterField.getText() + "0" + eepromWriteCounterField.getText());
		view.getCommandSender().setNewDataPage0(parsed);
		view.getCommandSender().sendNewDataPage0();
	}
	
	public void updateDebug(Debug debug) {
		eepromStateField.setText(debug.GetValue(0));
		eepromLastComField.setText(debug.GetValue(1));
		eepromReadCounterField.setText(debug.GetValue(2));
		eepromWriteCounterField.setText(debug.GetValue(3));
	}
}
