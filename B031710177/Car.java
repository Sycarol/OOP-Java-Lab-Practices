public class Car extends Model
{
	private String plateNo;
	private String model;
	private double price;
	private int capacity;
	private boolean auto;
	private boolean usable;
	
	
	public Car(int carID)
	{
		super(carID); //passed to model.java as  uniqueID
	}
	
	public String getPlateNo()
	{
		return plateNo;
	}
	
	public void setPlateNo(String plateNo)
	{
		this.plateNo=plateNo;
	}
	
	public String getModel()
	{
		return model;
	}
	
	public void setModel(String model)
	{
		this.model=model;
	}
	
	public double getPrice()
	{
		return price;
	}
	
	public void setPrice(double price)
	{
		this.price=price;
	}
	
	public int getCapacity()
	{
		return capacity;
	}
	
	public void setCapacity(int capacity)
	{
		this.capacity=capacity;
	}
	
	public boolean isAuto()
	{
		return auto;
	}
	
	public void setAuto(boolean auto)
	{
		this.auto=auto;
	}
	
	public boolean isUsable()
	{   //getter and setter of boolean type is 'is'
		return usable;
	}
	
	public void setUsable(boolean usable)
	{
		this.usable=usable;
	}
}