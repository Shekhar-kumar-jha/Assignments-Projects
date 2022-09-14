package CustomerAccountStatement;

public class Customer {
	
	/*
	 * CustId, accountno, custname, cust_address, cust_dob,
	 * cust_account_opening_date, Branch_Obj.
	 */
      private int cust_Id;
      private int account_No;
      private String cust_Name;
      private String cust_Address;
      private String cust_Dob;
      private String cust_acc_date;
      Branch obj;
	public int getCust_Id() {
		return cust_Id;
	}
	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}
	public int getAccount_No() {
		return account_No;
	}
	public void setAccount_No(int account_No) {
		this.account_No = account_No;
	}
	public String getCust_Name() {
		return cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}
	public String getCust_Address() {
		return cust_Address;
	}
	public void setCust_Address(String cust_Address) {
		this.cust_Address = cust_Address;
	}
	public String getCust_Dob() {
		return cust_Dob;
	}
	public void setCust_Dob(String cust_Dob) {
		this.cust_Dob = cust_Dob;
	}
	public String getCust_acc_date() {
		return cust_acc_date;
	}
	public void setCust_acc_date(String cust_acc_date) {
		this.cust_acc_date = cust_acc_date;
	}
	public Branch getObj() {
		return obj;
	}
	public void setObj(Branch obj) {
		this.obj = obj;
	}
	public Customer(int cust_Id, int account_No, String cust_Name, String cust_Address, String cust_Dob,
			String cust_acc_date, Branch obj) {
		super();
		this.cust_Id = cust_Id;
		this.account_No = account_No;
		this.cust_Name = cust_Name;
		this.cust_Address = cust_Address;
		this.cust_Dob = cust_Dob;
		this.cust_acc_date = cust_acc_date;
		this.obj = obj;
	}
      
  
}
