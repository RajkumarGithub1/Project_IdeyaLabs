package ideyaLabsTest;


public class ReverseIntArray 
{
	public static void main(String[] args) 
	{
		int []arr= {1,3,5,4,9,8,2,6};
		int []ar=new int[arr.length];
		
		int count=0;
		for(int i=arr.length-1; i>=0; i--)
		{
			ar[count]=arr[i];
			count++;
			
		}
		
		for(int a:ar)
		{
			System.out.print(a+" ");
		}
		
		
	}
}
