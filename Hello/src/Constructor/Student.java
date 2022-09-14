package Constructor;

public class Student {
	int rollno;
	String name;
	long fee;
	Student (int rollno,String name,long fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
		System.out.println(this.rollno+ " "+this.name+" "+this.fee);
     
	}
	Student(int roll)
	{
		this(10,"monali",1000l);
	
	}
	public void m1()
	{
		System.out.println("Hiiiii");
		
	}
	
	public long m2()
	{
		return fee;
		
	}
 
	public void main(int rollno,String name,long fee)
	{
		this.m1();
		System.out.println(rollno+""+name+""+fee);
	}
	
	public static void main(String args[])
	{
		Student s1=new Student(1,"payal",3000l);
		//Student s2=new Student();
		
		//s1.main(9,"Kiran",6000l);
		//s2.main(5,"mahesh",4000l);
		
		
		
	    
	    
		
	}
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


