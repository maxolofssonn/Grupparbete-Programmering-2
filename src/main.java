import javafx.scene.paint.Color;

public class main {

	public static void main(String[] args) {
		
		Volvo740 volvo = new Volvo740(100, Color.BLACK, "Volvo", 1.25);
		Saab95 saab = new Saab95(100, Color.WHITE, "Volvo", 1.12);
		VolvoS60 volvos60 = new VolvoS60(175, Color.ORANGE, "Volvo S60", 1.05);
		ToyotaYaris toyota = new ToyotaYaris(75, Color.GREY, "Toyota Yaris", 1.4);
		Scania s = new Scania(250, Color.BLUE, "Scania", 1.1);
		Transport t = new Transport(250, Color.BLACK, "Transport vehicle", 1.1);
		
		t.liftDown();
		t.liftUp();
		t.addCar(volvo);
		System.out.println(t.getCar(0));
		
	}
	
}
