package OOPsQuestions;

public class Rectangle implements Shape {
	
	 int l = 5, b = 4;
	    double ar;
	
	@Override
	public void area() {
		
		 ar = l * b;
	        System.out.println("Area of rectangle:"+ar);
	}

	public static void main(String[] args) {
		Rectangle r=new Rectangle();
		r.area();
		

	}

	

}
