package ExceptionQues1;

import java.util.Scanner;



 class ResultException extends RuntimeException


{

	ResultException(String msg)
	{
		super(msg);
	}
	
	
	
}

class Myclass
{
	public void newExecution()
	{
		Student s=new Student();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Roll Number");
		int r=sc.nextInt();
		s.setRollNo(r);
		int roll=s.getRollNo();
		System.out.println("Enter  Name");
		String n=sc.next();
		s.setsName(n);
		String name=s.getsName();
		System.out.println("Enter Address");
		String a=sc.next();
		s.setsName(a);
		String address=s.getsName();
		
		
		
	}
	
	public void valueExecution()
	{
		Scanner sc=new Scanner(System.in);
		StudentResult sr=new StudentResult();
		System.out.println("Enter the marks of math");
		int m=sc.nextInt();
		sr.setMath(m);
		int math = sr.getMath();
		System.out.println("Enter the marks of Science");
		int s=sc.nextInt();
		sr.setScience(s);
		int science=sr.getScience();
		System.out.println("Enter the marks of hindi");
		int h=sc.nextInt();
		sr.setHindi(h);
		int hindi=sr.getHindi();
		System.out.println("Enter the marks of social science");
		int ss=sc.nextInt();
		sr.setSocialScience(ss);
		int socialScience=sr.getSocialScience();
		System.out.println(sr);
		float total=(math+science+hindi+socialScience/4);
		System.out.println(total);
		if(math<33||science<33||hindi<33||socialScience<33) {
			try {
			throw new ResultException("You are failed");
			}catch(Exception e)
			{
				System.out.println(e);
			}
			
		}else if(math<0||science<0||hindi<0||socialScience<0)
		{
			try {
				throw new ResultException("Negative Marks Not Acceptable");
				}catch(Exception e)
				{
					System.out.println(e);
				}
		}else if(total<40f)
		{
			try {
				throw new ResultException("FAILED");
				}catch(Exception e)
				{
					System.out.println(e);
				}
		}else {
			System.out.println("PASSED");
		}
	}
	public static void main(String args[])
	{
		Myclass m=new Myclass();
		//m.newExecution();
		m.valueExecution();
		
		
	}
}
