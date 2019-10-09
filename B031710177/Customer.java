public class Customer extends Model
{
	private String name;
	private String licenseNo;
	private String phoneNo;
	
	public Customer(int customerID){
		super(customerID);
	}
	
	public String getname(){
		return name;
	}
	
	public void setname(String name){
		this.name=name;
	}
	
	public String getlicenseNo(){
		return licenseNo;
	}
	
	public void setlicenseNo(String licenseNo){
		this.licenseNo=licenseNo;
	}
	
	public String getphoneNo(){
		return phoneNo;
	}
	
	public void setphoneNo(String phoneNo){
		this.phoneNo=phoneNo;
	}
}