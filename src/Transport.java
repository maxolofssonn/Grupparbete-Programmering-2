import javafx.scene.paint.Color;

public class Transport extends Car{
	
	Transporttrailer tt = new Transporttrailer();
	
	private int currentX, currentY;
	
	public Transport(double ep, Color c, String mn, double tf) {
		super(ep, c, mn, tf);
	}
	
	/**
	 * Lifts up the lift of the transporttrailer.
	 */
	public void liftUp() {
		
		if(this.getCurrentSpeed() == 0) {
			tt.liftUp();
		}
		else {
			return;
		}
		
	}
	
	/**
	 * Lifts down the lift of the transporttrailer
	 */
	public void liftDown() {
		
		if(this.getCurrentSpeed() == 0) {
			tt.liftDown();
		}
		else {
			return;
		}
		
	}
	
	/**
	 * Adds a car to the trailer. The x and y position has to be atleast 10 units of length from the transport vehicle.
	 * @param Car c
	 */
	public void addCar(Car c) {
	
		if(!tt.isLiftUp() && checkDistance(c,tt) < 10){
			
			c.setCurrentX(this.currentX);
			c.setCurrentY(this.currentY);
			tt.addCar(c);
			
		}
		
		else {
			
			return;
			
		}
		
	}
	
	/**
	 * Return the distance between a car and a transporttrailer.
	 * @param Car
	 * @param Transporttrailer
	 * @return int
	 */
	private int checkDistance(Car c, Transporttrailer tt2) {
		
		int diffX = (int) Math.sqrt((c.getCurrentX() - this.getCurrentX()));
		int diffY = (int) Math.sqrt((c.getCurrentY() - this.getCurrentY()));
		int hypotenuse =  (int) Math.sqrt(diffX + diffY);
		return hypotenuse;
		
	}

	/**
	 * Removes the car from the trailer.
	 * @param c
	 */
	public void removeCar(Car c) {
		
		tt.removeCar(c);
		
	}
	
	/**
	 * Returns true if the lift is up, and returns false if the lift is down.
	 * @return boolean
	 */
	public boolean isLiftUp() {
		
		return tt.isLiftUp();
		
	}
	
	/**
	 * Return the car in the index x
	 * @param int x
	 * @return Car
	 */
	public Car getCar(int x) {
		
		return tt.getCar(x);
		
	}
	
}










