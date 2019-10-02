public class CarRentalManagementSystem
{
	public static void main(String[] args)
	{
		CarManager carManager= new CarManager(10);
		
		Car car1=new Car();
		car1.carID=1001;
		car1.plateNo="ABC 1234";
		car1.model="Perodua Kancil";
		car1.price=5;
		car1.capacity=4;
		car1.isAuto=false;
		car1.isUsable=true;

		Car car2=new Car();
		car2.carID=1003;
		car2.plateNo="JST 2345";
		car2.model="Proton Saga";
		car2.price=10;
		car2.capacity=5;
		car2.isAuto=true;
		car2.isUsable=true;

		Car car3=new Car();
		car3.carID=1005;
		car3.plateNo="GHI 9012";
		car3.model="Proton Waja";
		car3.price=8;
		car3.capacity=4;
		car3.isAuto=true;
		car3.isUsable=false;

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

	}
}