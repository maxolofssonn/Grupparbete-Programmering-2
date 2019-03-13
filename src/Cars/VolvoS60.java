package Cars;
import Vehicles.Car;
import javafx.scene.paint.Color;

public class VolvoS60 extends Car{

	private static final double trimFactor = 1.4;
	
	public VolvoS60(double ep, Color c, String mn) {
		super(ep, c, mn);
	}

	@Override
	public double speedFactor() {
		return enginePower * .01 * trimFactor;
	}

}
