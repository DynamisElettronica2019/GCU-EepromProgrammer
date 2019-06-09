package front_end.gui;

import java.net.URL;
import java.util.ResourceBundle;

import com.fazecast.jSerialComm.SerialPort;

import back_end.Acceleration;
import back_end.Debug;
import back_end.Gearshift;
import back_end.parsed.ParsedPage0;
import back_end.parsed.ParsedPage1;
import back_end.parsed.ParsedPage2;
import back_end.parsed.ParsedPage3;
import back_end.parsed.ParsedPage5;
import back_end.parsed.ParsedPage6;
import configuration.Channels;
import javafx.application.Platform;
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
	@FXML
	private TextField RAMP_STARTField, RAMP_ENDField, RAMP_TIMEField, RPM_LIMIT_1_2Field, RPM_LIMIT_2_3Field, RPM_LIMIT_3_4Field, RPM_LIMIT_4_5Field, SPEED_LIMIT_1_2Field;
	@FXML
	private TextField SPEED_LIMIT_2_3Field, SPEED_LIMIT_3_4Field, SPEED_LIMIT_4_5Field, TPS_START_LIMITField, END_GEAR_ACField; 
	
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
		Thread sender = new Thread(new Runnable() {
			@Override
			public void run() {
				StringBuilder sb = new StringBuilder();
				sb.append(sendEepromState(Short.parseShort(eepromStateField.getText())));
				ParsedPage0 parsed = new ParsedPage0('0');
				parsed.splitString(sb.toString());
				view.getCommandSender().setNewDataPage0(parsed);
				view.getCommandSender().sendNewDataPage0();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				readDebug();
			}
		});
		sender.start();
	}
	
	@FXML
	private void readGear() {
		Thread sender = new Thread(new Runnable() {
			@Override
			public void run() {
				view.getCommandSender().sendReadRequest(Channels.PAGE_1_ID);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				view.getCommandSender().sendReadRequest(Channels.PAGE_2_ID);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				view.getCommandSender().sendReadRequest(Channels.PAGE_3_ID);
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				view.getCommandSender().sendReadRequest(Channels.PAGE_4_ID);
			}
		});
		sender.start();
	}
	
	@FXML
	private void writeGear() {
		Thread sender = new Thread(new Runnable() {
			@Override
			public void run() {
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
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
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
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
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
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				/*
				 * Build page 4 and update
				 */
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				readGear();
			}
		});
		sender.start();
	}
	
	@FXML
	private void readAccel() {
		view.getCommandSender().sendReadRequest(Channels.PAGE_5_ID);
		view.getCommandSender().sendReadRequest(Channels.PAGE_6_ID);
		view.getCommandSender().sendReadRequest(Channels.PAGE_7_ID);
	}
	
	@FXML
	private void writeAccel() {
		Thread sender = new Thread(new Runnable() {
			@Override
			public void run() {
				/*
				 * Build page 5 and update
				 */
				StringBuilder sb5 = new StringBuilder();
				sb5.append(getUpperChar(Short.parseShort(RAMP_STARTField.getText())));
				sb5.append(getLowerChar(Short.parseShort(RAMP_STARTField.getText())));
				sb5.append(getUpperChar(Short.parseShort(RAMP_ENDField.getText())));
				sb5.append(getLowerChar(Short.parseShort(RAMP_ENDField.getText())));
				sb5.append(getUpperChar(Short.parseShort(RAMP_TIMEField.getText())));
				sb5.append(getLowerChar(Short.parseShort(RAMP_TIMEField.getText())));
				sb5.append(getUpperChar(Short.parseShort(RPM_LIMIT_1_2Field.getText())));
				sb5.append(getLowerChar(Short.parseShort(RPM_LIMIT_1_2Field.getText())));
				sb5.append(getUpperChar(Short.parseShort(RPM_LIMIT_2_3Field.getText())));
				sb5.append(getLowerChar(Short.parseShort(RPM_LIMIT_2_3Field.getText())));
				sb5.append(getUpperChar(Short.parseShort(RPM_LIMIT_3_4Field.getText())));
				sb5.append(getLowerChar(Short.parseShort(RPM_LIMIT_3_4Field.getText())));
				sb5.append(getUpperChar(Short.parseShort(RPM_LIMIT_4_5Field.getText())));
				sb5.append(getLowerChar(Short.parseShort(RPM_LIMIT_4_5Field.getText())));
				sb5.append(getUpperChar(Short.parseShort(SPEED_LIMIT_1_2Field.getText())));
				sb5.append(getLowerChar(Short.parseShort(SPEED_LIMIT_1_2Field.getText())));
				ParsedPage5 parsed5 = new ParsedPage5('5');
				parsed5.splitString(sb5.toString());
				view.getCommandSender().setNewDataPage5(parsed5);
				view.getCommandSender().sendNewDataPage5();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				/*
				 * Build page 6 and update
				 */
				StringBuilder sb6 = new StringBuilder();
				sb6.append(getUpperChar(Short.parseShort(SPEED_LIMIT_2_3Field.getText())));
				sb6.append(getLowerChar(Short.parseShort(SPEED_LIMIT_2_3Field.getText())));
				sb6.append(getUpperChar(Short.parseShort(SPEED_LIMIT_3_4Field.getText())));
				sb6.append(getLowerChar(Short.parseShort(SPEED_LIMIT_3_4Field.getText())));
				sb6.append(getUpperChar(Short.parseShort(SPEED_LIMIT_4_5Field.getText())));
				sb6.append(getLowerChar(Short.parseShort(SPEED_LIMIT_4_5Field.getText())));
				sb6.append(getUpperChar(Short.parseShort(TPS_START_LIMITField.getText())));
				sb6.append(getLowerChar(Short.parseShort(TPS_START_LIMITField.getText())));
				sb6.append(getUpperChar(Short.parseShort(END_GEAR_ACField.getText())));
				sb6.append(getLowerChar(Short.parseShort(END_GEAR_ACField.getText())));
				ParsedPage6 parsed6 = new ParsedPage6('6');
				parsed6.splitString(sb6.toString());
				view.getCommandSender().setNewDataPage6(parsed6);
				view.getCommandSender().sendNewDataPage6();
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				
				/*
				 * Build page 7 and update
				 */
				
				try {
					Thread.sleep(100);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
				readAccel();
			}
		});
		sender.start();
	}
	
	public void updateDebug(Debug debug) {
		Platform.runLater(new Runnable() {
            @Override
            public void run() {
        		eepromStateField.setText(String.valueOf(getEepromState(debug.GetValue(0))));
        		eepromLastComField.setText(String.valueOf(getNumericValue(debug.GetValue(1))));
        		eepromReadCounterField.setText(String.valueOf(getNumericValue(debug.GetValue(2))));
        		eepromWriteCounterField.setText(String.valueOf(getNumericValue(debug.GetValue(3))));
            }
        });
	}
	
	public void updateGear(Gearshift gear) {
		Platform.runLater(new Runnable() {
            @Override
            public void run() {
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
        });
	}
	
	public void updateAccel(Acceleration accel) {
		Platform.runLater(new Runnable() {
            @Override
            public void run() {
            	RAMP_STARTField.setText(String.valueOf(getNumericValue(accel.GetValue(0))));
            	RAMP_ENDField.setText(String.valueOf(getNumericValue(accel.GetValue(1))));
            	RAMP_TIMEField.setText(String.valueOf(getNumericValue(accel.GetValue(2))));
            	RPM_LIMIT_1_2Field.setText(String.valueOf(getNumericValue(accel.GetValue(3))));
            	RPM_LIMIT_2_3Field.setText(String.valueOf(getNumericValue(accel.GetValue(4))));
            	RPM_LIMIT_3_4Field.setText(String.valueOf(getNumericValue(accel.GetValue(5))));
            	RPM_LIMIT_4_5Field.setText(String.valueOf(getNumericValue(accel.GetValue(6))));
            	SPEED_LIMIT_1_2Field.setText(String.valueOf(getNumericValue(accel.GetValue(7))));
            	
            	SPEED_LIMIT_2_3Field.setText(String.valueOf(getNumericValue(accel.GetValue(8))));
            	SPEED_LIMIT_3_4Field.setText(String.valueOf(getNumericValue(accel.GetValue(9))));
            	SPEED_LIMIT_4_5Field.setText(String.valueOf(getNumericValue(accel.GetValue(10))));
            	TPS_START_LIMITField.setText(String.valueOf(getNumericValue(accel.GetValue(11))));
            	END_GEAR_ACField.setText(String.valueOf(getNumericValue(accel.GetValue(12))));
            }
        });
	}
	
	public char getLowerChar(short num) {
		return ((char)(num & 0xFF));
	}
	
	public char getUpperChar(short num) {
		return ((char)((num >> 8) & 0xFF));
	}
	
	public char sendEepromState(short num) {
		return ((char)num);
	}
	
	/*
	 * Get short from 2 byte string
	 */
	public int getNumericValue(String string) {
		if(string.length() != 2) {
			//System.err.println("Field lenght conversion error");
			
			return 0;
		}
		else {
			int number = 0;
			byte upper = (byte) string.charAt(0);
			byte lower = (byte) string.charAt(1);

			number = (short) ((number & 0xff00) | lower);
			number = (short) ((number & 0x00ff) | (upper << 8));


			return number;
		}
	}
	
	private int getEepromState (String string) {
		if(string.length() != 2) {
			System.err.println("Field lenght conversion error");
			return 0;
		}
		else {
			return ((int)string.charAt(0));
		}
	}
}
