package ideyaLabsTest;

public class RemoveDuplicateCHARinString 
{
	public static void main(String[] args) 
	{
		String s="rajkumar";
		String s1="";
		
		for(int i=0; i<s.length()-1; i++)
		{
			char c = s.charAt(i);
			
			if(s1.indexOf(c)==-1)
			{
				s1=s1+c;
			}
			
		}
		
		System.out.println(s1);
		
		
	}
}
