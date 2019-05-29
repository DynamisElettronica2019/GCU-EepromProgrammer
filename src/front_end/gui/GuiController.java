package front_end.gui;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

public class GuiController implements Initializable {
	private GuiView view;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		// TODO Auto-generated method stub
		
	}

	public void SetView(GuiView guiView) {
		this.view = guiView;
	}

}
