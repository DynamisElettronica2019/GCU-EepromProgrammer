package front_end.gui;

import java.net.URL;
import java.util.ResourceBundle;

import com.fazecast.jSerialComm.SerialPort;

import back_end.Debug;
import back_end.Gearshift;
import back_end.parsed.ParsedPage0;
import back_end.parsed.ParsedPage1;
import back_end.parsed.ParsedPage2;
import back_end.parsed.ParsedPage3;
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
	@FXML
	private TextField NT_PUSH_1_NField, NT_CLUTCH_1_NField, NT_REBOUND_1_NField, NT_BRAKE_1_NField, NT_PUSH_2_NField, NT_CLUTCH_2_NField, NT_REBOUND_2_NField, NT_BRAKE_2_NField;
	@FXML
	private TextField DN_PUSHField, CLUTCHField, DN_REBOUNDField, DN_BRAKEField, UP_PUSH_1_2Field, UP_PUSH_2_3Field, UP_PUSH_3_4Field, UP_PUSH_4_5Field;
	@FXML
	private TextField DELAYField, UP_REBOUNDField, UP_BRAKEField, NT_CLUTCH_DELAYField, DOWN_TIME_CHECKField, UP_TIME_CHECKField, MAX_TRIESField;
	
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
	
	@FXML
	private void readGear() {
		view.getCommandSender().sendReadRequest(Channels.PAGE_1_ID);
		view.getCommandSender().sendReadRequest(Channels.PAGE_2_ID);
		view.getCommandSender().sendReadRequest(Channels.PAGE_3_ID);
		view.getCommandSender().sendReadRequest(Channels.PAGE_4_ID);
	}
	
	@FXML
	private void writeGear() {
		/*
		 * Build page 1 and update
		 */
		StringBuilder sb1 = new StringBuilder();
		sb1.append(getUpperChar(Short.parseShort(NT_PUSH_1_NField.getText())));
		sb1.append(getLowerChar(Short.parseShort(NT_PUSH_1_NField.getText())));
		sb1.append(getUpperChar(Short.parseShort(NT_CLUTCH_1_NField.getText())));
		sb1.append(getLowerChar(Short.parseShort(NT_CLUTCH_1_NField.getText())));
		sb1.append(getUpperChar(Short.parseShort(NT_REBOUND_1_NField.getText())));
		sb1.append(getLowerChar(Short.parseShort(NT_REBOUND_1_NField.getText())));
		sb1.append(getUpperChar(Short.parseShort(NT_BRAKE_1_NField.getText())));
		sb1.append(getLowerChar(Short.parseShort(NT_BRAKE_1_NField.getText())));
		sb1.append(getUpperChar(Short.parseShort(NT_PUSH_2_NField.getText())));
		sb1.append(getLowerChar(Short.parseShort(NT_PUSH_2_NField.getText())));
		sb1.append(getUpperChar(Short.parseShort(NT_CLUTCH_2_NField.getText())));
		sb1.append(getLowerChar(Short.parseShort(NT_CLUTCH_2_NField.getText())));
		sb1.append(getUpperChar(Short.parseShort(NT_REBOUND_2_NField.getText())));
		sb1.append(getLowerChar(Short.parseShort(NT_REBOUND_2_NField.getText())));
		sb1.append(getUpperChar(Short.parseShort(NT_BRAKE_2_NField.getText())));
		sb1.append(getLowerChar(Short.parseShort(NT_BRAKE_2_NField.getText())));
		ParsedPage1 parsed1 = new ParsedPage1('1');
		parsed1.splitString(sb1.toString());
		view.getCommandSender().setNewDataPage1(parsed1);
		view.getCommandSender().sendNewDataPage1();
		
		/*
		 * Build page 2 and update
		 */
		StringBuilder sb2 = new StringBuilder();
		sb2.append(getUpperChar(Short.parseShort(DN_PUSHField.getText())));
		sb2.append(getLowerChar(Short.parseShort(DN_PUSHField.getText())));
		sb2.append(getUpperChar(Short.parseShort(CLUTCHField.getText())));
		sb2.append(getLowerChar(Short.parseShort(CLUTCHField.getText())));
		sb2.append(getUpperChar(Short.parseShort(DN_REBOUNDField.getText())));
		sb2.append(getLowerChar(Short.parseShort(DN_REBOUNDField.getText())));
		sb2.append(getUpperChar(Short.parseShort(DN_BRAKEField.getText())));
		sb2.append(getLowerChar(Short.parseShort(DN_BRAKEField.getText())));
		sb2.append(getUpperChar(Short.parseShort(UP_PUSH_1_2Field.getText())));
		sb2.append(getLowerChar(Short.parseShort(UP_PUSH_1_2Field.getText())));
		sb2.append(getUpperChar(Short.parseShort(UP_PUSH_2_3Field.getText())));
		sb2.append(getLowerChar(Short.parseShort(UP_PUSH_2_3Field.getText())));
		sb2.append(getUpperChar(Short.parseShort(UP_PUSH_3_4Field.getText())));
		sb2.append(getLowerChar(Short.parseShort(UP_PUSH_3_4Field.getText())));
		sb2.append(getUpperChar(Short.parseShort(UP_PUSH_4_5Field.getText())));
		sb2.append(getLowerChar(Short.parseShort(UP_PUSH_4_5Field.getText())));
		ParsedPage2 parsed2 = new ParsedPage2('2');
		parsed2.splitString(sb2.toString());
		view.getCommandSender().setNewDataPage2(parsed2);
		view.getCommandSender().sendNewDataPage2();
		
		/*
		 * Build page 3 and update
		 */
		StringBuilder sb3 = new StringBuilder();
		sb3.append(getUpperChar(Short.parseShort(DELAYField.getText())));
		sb3.append(getLowerChar(Short.parseShort(DELAYField.getText())));
		sb3.append(getUpperChar(Short.parseShort(UP_REBOUNDField.getText())));
		sb3.append(getLowerChar(Short.parseShort(UP_REBOUNDField.getText())));
		sb3.append(getUpperChar(Short.parseShort(UP_BRAKEField.getText())));
		sb3.append(getLowerChar(Short.parseShort(UP_BRAKEField.getText())));
		sb3.append(getUpperChar(Short.parseShort(NT_CLUTCH_DELAYField.getText())));
		sb3.append(getLowerChar(Short.parseShort(NT_CLUTCH_DELAYField.getText())));
		sb3.append(getUpperChar(Short.parseShort(DOWN_TIME_CHECKField.getText())));
		sb3.append(getLowerChar(Short.parseShort(DOWN_TIME_CHECKField.getText())));
		sb3.append(getUpperChar(Short.parseShort(UP_TIME_CHECKField.getText())));
		sb3.append(getLowerChar(Short.parseShort(UP_TIME_CHECKField.getText())));
		sb3.append(getUpperChar(Short.parseShort(MAX_TRIESField.getText())));
		sb3.append(getLowerChar(Short.parseShort(MAX_TRIESField.getText())));
		ParsedPage3 parsed3 = new ParsedPage3('3');
		parsed3.splitString(sb3.toString());
		view.getCommandSender().setNewDataPage3(parsed3);
		view.getCommandSender().sendNewDataPage3();
		
		/*
		 * Build page 4 and update
		 */
	}
	
	public void updateDebug(Debug debug) {
		eepromStateField.setText(String.valueOf(getNumericValue(debug.GetValue(0))));
		eepromLastComField.setText(String.valueOf(getNumericValue(debug.GetValue(1))));
		eepromReadCounterField.setText(String.valueOf(getNumericValue(debug.GetValue(2))));
		eepromWriteCounterField.setText(String.valueOf(getNumericValue(debug.GetValue(3))));
	}
	
	public void updateGear(Gearshift gear) {
		NT_PUSH_1_NField.setText(String.valueOf(getNumericValue(gear.GetValue(0))));
		NT_CLUTCH_1_NField.setText(String.valueOf(getNumericValue(gear.GetValue(1))));
		NT_REBOUND_1_NField.setText(String.valueOf(getNumericValue(gear.GetValue(2))));
		NT_BRAKE_1_NField.setText(String.valueOf(getNumericValue(gear.GetValue(3))));
		NT_PUSH_2_NField.setText(String.valueOf(getNumericValue(gear.GetValue(4))));
		NT_CLUTCH_2_NField.setText(String.valueOf(getNumericValue(gear.GetValue(5))));
		NT_REBOUND_2_NField.setText(String.valueOf(getNumericValue(gear.GetValue(6))));
		NT_BRAKE_2_NField.setText(String.valueOf(getNumericValue(gear.GetValue(7))));
		
		DN_PUSHField.setText(String.valueOf(getNumericValue(gear.GetValue(8))));
		CLUTCHField.setText(String.valueOf(getNumericValue(gear.GetValue(9))));
		DN_REBOUNDField.setText(String.valueOf(getNumericValue(gear.GetValue(10))));
		DN_BRAKEField.setText(String.valueOf(getNumericValue(gear.GetValue(11))));
		UP_PUSH_1_2Field.setText(String.valueOf(getNumericValue(gear.GetValue(12))));
		UP_PUSH_2_3Field.setText(String.valueOf(getNumericValue(gear.GetValue(13))));
		UP_PUSH_3_4Field.setText(String.valueOf(getNumericValue(gear.GetValue(14))));
		UP_PUSH_4_5Field.setText(String.valueOf(getNumericValue(gear.GetValue(15))));
		
		DELAYField.setText(String.valueOf(getNumericValue(gear.GetValue(16))));
		UP_REBOUNDField.setText(String.valueOf(getNumericValue(gear.GetValue(17))));
		UP_BRAKEField.setText(String.valueOf(getNumericValue(gear.GetValue(18))));
		NT_CLUTCH_DELAYField.setText(String.valueOf(getNumericValue(gear.GetValue(19))));
		DOWN_TIME_CHECKField.setText(String.valueOf(getNumericValue(gear.GetValue(20))));
		UP_TIME_CHECKField.setText(String.valueOf(getNumericValue(gear.GetValue(21))));
		MAX_TRIESField.setText(String.valueOf(getNumericValue(gear.GetValue(22))));
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
