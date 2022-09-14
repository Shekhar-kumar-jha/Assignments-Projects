
public class Patient {
	String patientName;
	Double height;
	Double weight;
	
	public Patient(String patientName, Double height, Double weight) {
		super();
		this.patientName = patientName;
		this.height = height;
		this.weight = weight;
	}
	public Double computeBMI() {
		Double BMI=weight/height;
		
		return BMI;
		
	}
	
	public static void main(String args[]) {
		Patient p=new Patient("Sayali",6.5,65.9);
		Double Patient=p.computeBMI();
		System.out.println(Patient);
	
	}
	
	

	
	
	

}
