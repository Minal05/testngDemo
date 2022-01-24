
public class FrequencyofChar {
	public static void main(String []args)
	{
		String str="I am expert in Automation";
		int count=0;
		for(int i=0;i<str.length();i++)
		{
	
			str=str.toLowerCase(); 
			if( str.charAt(i)=='i')
			{
				count++;
				System.out.println(count+" at location::- "+i);
			}
			
		}
		
	}
	

}
