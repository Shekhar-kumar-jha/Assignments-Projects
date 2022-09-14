package ExceptionQues1;

public class StudentResult {
	private int math;
	private int science;
	private int hindi;
	private int socialScience;
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getHindi() {
		return hindi;
	}
	public void setHindi(int hindi) {
		this.hindi = hindi;
	}
	public int getSocialScience() {
		return socialScience;
	}
	public void setSocialScience(int socialScience) {
		this.socialScience = socialScience;
	}
	
	@Override
	public String toString() {
		return "StudentResult [math=" + math + ", science=" + science + ", hindi=" + hindi + ", socialScience="
				+ socialScience + "]";
	}
	


}
