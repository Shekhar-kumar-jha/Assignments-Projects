
public class ThirdLargestNumber {
	public static void main(String[] args) {
		int thirdLargestNumber=0,secondlargestNumber=0,largestNumber=0,b;
		int arr[]= {10,20,30,40,50,76,65,99,100,89,90};
		for(int i=0;i<arr.length;i++) {
				if(arr[i]>largestNumber)
				{
					thirdLargestNumber=secondlargestNumber;
					secondlargestNumber=largestNumber;
					
					largestNumber=arr[i];
				
				}else if(arr[i]>secondlargestNumber)
				{
					
					secondlargestNumber=arr[i];
				}else if(arr[i]>thirdLargestNumber)
				{
					
					thirdLargestNumber=arr[i];
				}
			}
			System.out.println(thirdLargestNumber);
		}
		
		
		
	}


