package CustomerAccountStatement;

public class Customer_Account_Statement {
	/* CAID, CustId, amount, deposit_withdrawl, deposit_date. */
	private int caid;
	private int custId;
	private long amount;
	private String deposit_Withdrawl;
	private String deposit_Date;
	private Customer cobj;
	public Customer_Account_Statement(int caid, int custId, long amount, String deposit_Withdrawl, String deposit_Date,
			Customer cobj) {
		super();
		this.caid = caid;
		this.custId = custId;
		this.amount = amount;
		this.deposit_Withdrawl = deposit_Withdrawl;
		this.deposit_Date = deposit_Date;
		this.cobj = cobj;
	}
	public int getCaid() {
		return caid;
	}
	public void setCaid(int caid) {
		this.caid = caid;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public long getAmount() {
		return amount;
	}
	public void setAmount(long amount) {
		this.amount = amount;
	}
	public String getDeposit_Withdrawl() {
		return deposit_Withdrawl;
	}
	public void setDeposit_Withdrawl(String deposit_Withdrawl) {
		this.deposit_Withdrawl = deposit_Withdrawl;
	}
	public String getDeposit_Date() {
		return deposit_Date;
	}
	public void setDeposit_Date(String deposit_Date) {
		this.deposit_Date = deposit_Date;
	}
	public Customer getCobj() {
		return cobj;
	}
	public void setCobj(Customer cobj) {
		this.cobj = cobj;
	}
	@Override
	public String toString() {
		return "Customer_Account_Statement [caid=" + caid + ", custId=" + custId + ", amount=" + amount
				+ ", deposit_Withdrawl=" + deposit_Withdrawl + ", deposit_Date=" + deposit_Date + ", cobj=" + cobj
				+ "]";
	}
	

}
