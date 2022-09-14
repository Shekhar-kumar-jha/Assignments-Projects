package CustomerAccountStatement;

public class Branch {
	
	/* branch_id, branch_name, branch_address. */
	private int branch_Id;
	private String branch_Name;
	private String branch_Address;
	public Branch(int branch_Id, String branch_Name, String branch_Address) {
		super();
		this.branch_Id = branch_Id;
		this.branch_Name = branch_Name;
		this.branch_Address = branch_Address;
	}
	public int getBranch_Id() {
		return branch_Id;
	}
	public void setBranch_Id(int branch_Id) {
		this.branch_Id = branch_Id;
	}
	public String getBranch_Name() {
		return branch_Name;
	}
	public void setBranch_Name(String branch_Name) {
		this.branch_Name = branch_Name;
	}
	public String getBranch_Address() {
		return branch_Address;
	}
	public void setBranch_Address(String branch_Address) {
		this.branch_Address = branch_Address;
	}
	@Override
	public String toString() {
		return "Branch [branch_Id=" + branch_Id + ", branch_Name=" + branch_Name + ", branch_Address=" + branch_Address
				+ "]";
	}
	
	

}
