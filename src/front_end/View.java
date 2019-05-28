package front_end;

import java.io.IOException;

import back_end.Acceleration;
import back_end.CommandSender;
import back_end.Gearshift;
import back_end.ViewLoader;

public abstract class View {
	
	protected CommandSender commandSender; //Not available before setCommandSender call
	protected ViewLoader viewLoader; //Not available before setViewLoader call
	private GearshiftObserver gearObs;
	private AccelerationObserver accObs;
	
	public View() {
		gearObs = new GearshiftObserver(this);
		accObs = new AccelerationObserver(this);
	}
	
	/*
	 * Useful getters/setters
	 */
	public void setCommandSender(CommandSender commandSender) {
		this.commandSender = commandSender;
	}
	
	public void setViewLoader(ViewLoader viewLoader) throws IOException {
		this.viewLoader = viewLoader;
	}
	
	public GearshiftObserver getGearObs() {
		return gearObs;
	}
	
	public AccelerationObserver getAccObs() {
		return accObs;
	}
	
	public CommandSender getCommandSender() {
		return commandSender;
	}
	
	public ViewLoader getViewLoader() {
		return viewLoader;
	}
	
	/*
	 * Implement for update of gearshift pages
	 */
	public abstract void UpdateGearshift(Gearshift gear);
	
	/*
	 * Implement for update of acceleration pages
	 */
	public abstract void UpdateAcceleration(Acceleration accel);
}
