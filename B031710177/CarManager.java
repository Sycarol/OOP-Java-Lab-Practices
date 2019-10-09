public class CarManager
{
	private Car[] cars;
	private int count;

	//constructor
	public CarManager(int length) //must be identical with class
	{
		cars=new Car[length];
	}
	
	int addCar(Car car)
	{
		int index=-1;
		for(int i=0;i<cars.length;i++)
		{
			Car temp=cars[i];
			
			if (temp==null)
			{
				cars[i]=car;
				index=i;
				
				break;
			}
		}
		return index;
	}
	
	void displayCars()
	{
		for(int i=0;i<cars.length;i++)
		{
			Car car=cars[i];
			
			if (car!=null)
				displayCar(car);
		}
	}
	
	int updateCar(Car car)
	{
		int index=-1;
		for(int i=0;i<cars.length;i++)
		{
			Car temp=cars[i];
			
			if (temp!=null && temp.getUniqueID==car.getUniqueID())
			{
				cars[i]=car;
				index=i;
				
				break;
			}
		}
		return index;
	}
	
	int deleteCar(int carID)
	{
		int index=-1;
		for(int i=0;i<cars.length;i++)
		{
			Car temp=cars[i];
			
			if (temp!=null && temp.getUniqueID==carID)
			{
				cars[i]=null;
				index=i;
				
				break;
			}
		}
		return index;
	}
	
	void displayCars(double maxPrice)
	{
		//enhanced for loop
		for(Car car: cars)//for every car variable of data type Car in cars array
			if (car!=null && car.getPrice() <= maxPrice)
				displayCar(car);
	}
	
	void displayCars(int minCapacity)
	{
		for(Car car: cars)
			if (car!=null && car.getCapacity() >= minCapacity)
				displayCar(car);
	}
	
	void displayCars(boolean auto)
	{
		for(Car car: cars)
			if (car!=null && car.isAuto() == auto)
				displayCar(car);
	}
	
	void displayCars(String model)
	{
		for(Car car: cars)
			if (car!=null && car.getModel().toLowerCase().contains(model.toLowerCase()))
				displayCar(car);
	}
	
	private void displayCar(Car car)
	{
		System.out.println();
		System.out.println("Car ID: " + car.getUniqueID());
		System.out.println("Plate No: " + car.getPlateNo());
		System.out.println("Model: " + car.getModel());
		System.out.println("Price: RM" + car.getPrice());
		System.out.println("CapacityL " + car.getCapacity());
		System.out.println("Is auto: " + car.isAuto());
		System.out.println("Is usable: " + car.isUsable());
	}
}