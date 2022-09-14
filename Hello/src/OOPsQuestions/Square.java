package OOPsQuestions;

public class Square implements Shape {
	
	int r = 5;
    double pi = 3.14, ar = 0;
    @Override
	public void area() {
        ar = pi * r * r;
        System.out.println("Area of circle:"+ar);
		
	}

	public static void main(String[] args) {
		
		Square sc=new Square();
		sc.area();
		
	}

	

}
