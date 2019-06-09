package front_end;


import java.io.IOException;

import back_end.Acceleration;
import back_end.Antistall;
import back_end.Autocross;
import back_end.CommandSender;
import back_end.Debug;
import back_end.Gearshift;
import back_end.ViewLoader;

public abstract class View {
	
	protected CommandSender commandSender; //Not available before setCommandSender call
	protected ViewLoader viewLoader; //Not available before setViewLoader call
	private DebugObserver debugObs;
	private GearshiftObserver gearObs;
	private AccelerationObserver accObs;
	private AutocrossObserver autoObs;
	private AntistallObserver antiObs;
	
	public View() {
		debugObs = new DebugObserver(this);
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
	
	public DebugObserver getDebugObs() {
		return debugObs;
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
	
	public AutocrossObserver getAutoObs() {
		return autoObs;
	}

	public AntistallObserver getAntiObs() {
		return antiObs;
	}

	/*
	 * Implement for update of gearshift pages
	 */
	public abstract void UpdateDebug(Debug debug);
	
	/*
	 * Implement for update of gearshift pages
	 */
	public abstract void UpdateGearshift(Gearshift gear);
	
	/*
	 * Implement for update of acceleration pages
	 */
	public abstract void UpdateAcceleration(Acceleration accel);
	
	/*
	 * Implement for update of autocross pages
	 */
	public abstract void UpdateAutocross(Autocross auto);
	
	/*
	 * Implement for update of antistall pages
	 */
	public abstract void UpdateAntistall(Antistall anti);
}
