
/*With the help of finalize method print the how many objects are currently a class is having and which object is going to be freed from the memory with its hashcode.
*/public class Finalize {

	public static void main(String[] args) {
		String s="hello";
		String s1="hello";
		int hashCode = s.hashCode();
		int hashCode2 = s1.hashCode();
		s=null;
		System.gc();
		
		System.out.println(hashCode+" "+hashCode2);

	}

}
