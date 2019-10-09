public class Rental extends Model
{
	private Car car;
	private Customer customer;
	private long start;
	private int duration;
	private double total;
	
	
	public Rental(int rentalID)
	{
		super(rentalID);
	}
	
	public Car getCar()
	{
		return car;
	}
	
	public void setCar(Car car)
	{
		this.car=car;
	}
	
	public Customer getCustomer()
	{
		return customer;
	}
	
	public void setCustomer(Customer customer)
	{
		this.customer=customer;
	}
	
	public long getstart()
	{
		return start;
	}
	
	public void setstart(long start)
	{
		this.start=start;
	}
	
	public int getduration()
	{
		return duration;
	}
	
	public void setduration(int duration)
	{
		if(duration>0)
		{
			this.duration=duration;
			this.total=duration*car.getPrice();
		}
		
	}
	
	public double gettotal()  //no setter for total because it is calculated.
	{ 
		return total;
	}
	
}