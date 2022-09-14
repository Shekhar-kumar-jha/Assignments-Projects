package CollectionQues7;

import java.util.ArrayList;
import java.util.List;

public class Student {
	
	private int rollNo;
	private String student_Name;
	private String class_Name;
	private int total_Marks;
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getStudent_Name() {
		return student_Name;
	}
	public void setStudent_Name(String student_Name) {
		this.student_Name = student_Name;
	}
	public String getClass_Name() {
		return class_Name;
	}
	public void setClass_Name(String class_Name) {
		this.class_Name = class_Name;
	}
	public int getTotal_Marks() {
		return total_Marks;
	}
	public void setTotal_Marks(int total_Marks) {
		this.total_Marks = total_Marks;
	}
	  
	  static int First=0;
	  static int second=0;
	  static int third=0;
	  
	  
	  
      public static void main(String[] args) {
		  List<Student> list=new ArrayList<>();
		  Student s=new Student();
    	  s.setClass_Name("First");
    	  s.setRollNo(11);
    	  s.setStudent_Name("rohan");
    	  s.setTotal_Marks(350);
    	 
    	  Student s1=new Student();
    	  s1.setClass_Name("Second");
    	  s1.setRollNo(10);
    	  s1.setStudent_Name("Randeep");
    	  s1.setTotal_Marks(250);
    	  
    	  
    	  list.add(s);
    	  list.add(s1);
    	  
    	  for (Student st : list) {
			if(st.getTotal_Marks()>First)
			{
				
			}
		}
    	  
	}
}
