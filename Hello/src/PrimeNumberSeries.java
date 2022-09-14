import java.util.Scanner;

public class PrimeNumberSeries {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		int count=1;
		for(int i=2;i<n-1;i++)
		{
			if(n%i==0)
			{
				count++;
				break;
			}
		}
		if(count>1)
		{
			System.out.println("its not prime number");
		}else {
			System.out.println("its prime number");
		}

	}

}
