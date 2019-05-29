package front_end.gui;

import java.io.IOException;

import back_end.Acceleration;
import back_end.Debug;
import back_end.Gearshift;
import back_end.ViewLoader;
import front_end.View;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Screen;
import javafx.stage.Stage;

public class GuiView extends View {
	protected Stage stage;
	private Scene scene;
	private Parent mainPane;
	private GuiController controller;
	private FXMLLoader MainLoader;
	
	public GuiView() throws IOException {
		super();
		System.out.println("Starting gui view..");
		
		//Set stage SX
		stage = new Stage();
		stage.setTitle("Telemetry2019_SX");
		//stage.getIcons().add(new Image("front_end/gui_ground/Dynamis.png"));
		Screen mainScreen = Screen.getPrimary();
        Rectangle2D bounds = mainScreen.getVisualBounds();
        stage.setX(bounds.getMinX());
        stage.setY(bounds.getMinY());
        stage.setMaximized(true);
        
        stage.setOnCloseRequest( event -> {
        	Platform.exit();
			System.exit(0);
        } );
        
        //Initialize stage
        scene = new Scene(mainPane);
        stage.setScene(scene);
        stage.show();
	}
	
	@Override
	public void setViewLoader(ViewLoader viewLoader) throws IOException {
		//Set first two FXML and pass viewloader
		MainLoader = new FXMLLoader();
		mainPane = MainLoader.load(getClass().getResource("GuiScreen.fxml").openStream());
		controller = MainLoader.getController();
	    
		controller.SetView(this);
	    
		super.setViewLoader(viewLoader);
	    viewLoader.load();
	}

	@Override
	public void UpdateGearshift(Gearshift gear) {
		// TODO Auto-generated method stub

	}

	@Override
	public void UpdateAcceleration(Acceleration accel) {
		// TODO Auto-generated method stub

	}

	@Override
	public void UpdateDebug(Debug debug) {
		// TODO Auto-generated method stub
		
	}

}
