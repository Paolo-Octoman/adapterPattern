public class Power {

	public static void main(String[] args) {
		
		Laptop laptop = new Laptop();
		Refrigerator fridge = new Refrigerator();
		SmartphoneCharger charger = new SmartphoneCharger();
		
		PowerOutlet laptopAdapter = new LaptopAdapter(laptop);
		PowerOutlet refrigeratorAdapter = new RefrigeratorAdapter(fridge);
		PowerOutlet smartphoneAdapter = new SmartphoneAdapter(charger);
		
		laptopAdapter.plugIn();
		refrigeratorAdapter.plugIn();
		smartphoneAdapter.plugIn();
		
	}

}
