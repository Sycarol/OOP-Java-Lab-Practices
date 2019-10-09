public class CarRentalManagementSystem
{
	public static void main(String[] args)
	{
		CarManager carManager= new CarManager(10);
		
		Car car1=new Car(1001);
		car1.setPlateNo("ABC 1234");
		car1.setModel("Perodua Kancil");
		car1.setPrice(5);
		car1.setCapacity(4);
		car1.setAuto(false);
		car1.setUsable(true);

		Car car2=new Car(1003);
		car2.setPlateNo("JST 2345");
		car2.setModel("Proton Saga");
		car2.setPrice(10);
		car2.setCapacity(5);
		car2.setAuto(true);
		car2.setUsable(true);

		Car car3=new Car(1005);
		car3.setPlateNo("GHI 9012");
		car3.setModel("Proton Waja");
		car3.setPrice(8);
		car3.setCapacity(4);
		car3.setAuto(true);
		car3.setUsable(false);

		if(carManager.addCar(car1)!=0)
			System.out.println("Car added.");
		else
			System.out.println("Cannot add car.");

		if(carManager.addCar(car2)!=0)
			System.out.println("Car added.");
		else
			System.out.println("Cannot add car.");

		if(carManager.addCar(car3)!=0)
			System.out.println("Car added.");
		else
			System.out.println("Cannot add car.");
		
		carManager.displayCars();
		
		System.out.println();
		System.out.println("-------Filer by price------");
		carManager.displayCars(8.0);
		
		System.out.println();
		System.out.println("------Filter by capacity-------");
		carManager.displayCars(4);
		
		System.out.println();
		System.out.println("------Filter by transmission-------");
		carManager.displayCars(true);
		
		System.out.println();
		System.out.println("------Filter by model-------");
		carManager.displayCars("Proton");

	}
}