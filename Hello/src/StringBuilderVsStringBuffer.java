import java.security.DrbgParameters.Capability;
import java.util.GregorianCalendar;

public class StringBuilderVsStringBuffer {

	public static void main(String[] args) {
		long Start=new GregorianCalendar().getTimeInMillis();
		StringBuilder sb=new StringBuilder();
		StringBuffer sf=new StringBuffer();
		for(int i=0;i<100000000;i++)
		{
			
			sf.append(':').append('i');
		}
		long end=new GregorianCalendar().getTimeInMillis();
		System.out.println("time taken:"+(end-Start));
		int capacity = sb.capacity();
        System.out.println(capacity);
	}

}
