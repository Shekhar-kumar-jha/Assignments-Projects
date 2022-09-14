
public class PrimePerfectEvenOdd {

	public static void main(String[] args) {
		int arr[]= {10,5,20,65,89,6,28};
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println("even number:-"+arr[i]);
			}else
			{
				System.out.println("odd number:-"+arr[i]);
			}
		}
		int sum=0;
         for(int j=0;j<arr.length;j++)
         {
        	 int num=arr[j];
        	 for(int k=1;k<=num/2;k++)
        	 {
        		 if(num%k==0)
        		 {
        			sum=sum+k;
        		 }
        	 }if(sum==num)
        	 {
        		 System.out.println("perfect number");
        	 }else {
        		 System.out.println("not perfect number");
        	 }sum=0;
         }
	}

}
