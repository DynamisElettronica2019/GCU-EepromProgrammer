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
		StringBuilder sb = new StringBuilder();
		sb.append(getUpperChar(Short.parseShort(eepromStateField.getText())));
		sb.append(getLowerChar(Short.parseShort(eepromStateField.getText())));
		sb.append(getUpperChar(Short.parseShort(eepromLastComField.getText())));
		sb.append(getLowerChar(Short.parseShort(eepromLastComField.getText())));
		sb.append(getUpperChar(Short.parseShort(eepromReadCounterField.getText())));
		sb.append(getLowerChar(Short.parseShort(eepromReadCounterField.getText())));
		sb.append('0');
		sb.append(getUpperChar(Short.parseShort(eepromWriteCounterField.getText())));
		sb.append(getLowerChar(Short.parseShort(eepromWriteCounterField.getText())));
		ParsedPage0 parsed = new ParsedPage0('0');
		parsed.splitString(sb.toString());
		view.getCommandSender().setNewDataPage0(parsed);
		view.getCommandSender().sendNewDataPage0();
	}
	
	public void updateDebug(Debug debug) {
		eepromStateField.setText(String.valueOf(getNumericValue(debug.GetValue(0))));
		eepromLastComField.setText(String.valueOf(getNumericValue(debug.GetValue(1))));
		eepromReadCounterField.setText(String.valueOf(getNumericValue(debug.GetValue(2))));
		eepromWriteCounterField.setText(String.valueOf(getNumericValue(debug.GetValue(3))));
	}
	
	public char getLowerChar(short num) {
		return ((char)(num & 0xFF));
	}
	
	public char getUpperChar(short num) {
		return ((char)((num >> 8) & 0xFF));
	}
	
	/*
	 * Get short from 2 byte string
	 */
	public short getNumericValue(String string) {
		if(string.length() != 2) {
			System.err.println("Field lenght conversion error");
			
			return 0;
		}
		else {
			short number = 0;
			byte upper = (byte) string.charAt(0);
			byte lower = (byte) string.charAt(1);

			number = (short) ((number & 0xff00) | lower);
			number = (short) ((number & 0x00ff) | (upper << 8));


			return number;
		}
	}
}
