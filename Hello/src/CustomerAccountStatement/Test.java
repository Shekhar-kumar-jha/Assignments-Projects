package CustomerAccountStatement;

public class Test {

	public static void main(String[] args) {
		
		Branch b=new Branch(101,"hinjewadi","Pune");
		
		Customer c=new Customer(1, 102, "xyz", "pune", "20-01", "12-10",b);
		Customer c1=new Customer(1, 104, "abc", "pune", "20-02", "12-12",b);
		Customer c2=new Customer(1, 103, "acd", "pune", "20-03", "12-11",b);
		
		Customer_Account_Statement cat=new Customer_Account_Statement(1, 201, 301, "deposit", "20-1", c);
		Customer_Account_Statement cat1=new Customer_Account_Statement(2, 202, 302, "withdrwal", "20-2", c);
		Customer_Account_Statement cat2=new Customer_Account_Statement(3, 203, 303, "deposit", "20-2", c);
		
		 Test t=new Test();
		 

	}
      
       
}
