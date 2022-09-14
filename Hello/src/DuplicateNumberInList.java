
public class DuplicateNumberInList {

	public static void main(String[] args) {
		int arr[]= {10,76,10,56,10,76};
		int val=0;
		int count=0;
		int num=1;
		for(int i=0;i<arr.length;i++ ) {
			for(int j=num;j<arr.length;j++) {
				
				if(arr[i]==arr[j])
				{
					val=arr[j];
					count++;
				}
			}
			if(count>0)
			{
			System.out.println(val+" "+count);
			}
			count=0;
			num++;
		}

	}

}
