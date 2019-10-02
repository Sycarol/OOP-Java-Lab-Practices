public class Customer
{
	private int customerID;
	private String name;
	private String licenseNo;
	private String phoneNo;

	public int getcustomerID(){
		return customerID;
	}
	
	public void setcustomerID(int customerID){
		this.customerID=customerID;
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