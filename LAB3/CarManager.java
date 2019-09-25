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
		int status=0;
		if(count<cars.length)
		{
			//cars[count]=car;
			//count++;
			
			cars[count++]=car;
			status=count;
		}

		return status;
	}
}