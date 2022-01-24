
public class Palindrome_String {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="madam";
		//String[] str2;
		int i=0;
		int j=str1.length()-1;
		boolean flag=true;
		while(i<j)
		{
			if(str1.charAt(i)!=str1.charAt(j))
			{
				flag=false;
				break;
			}
			
			else
				i++;
				j--;
		}
				
		if(flag==true)
			System.out.println("String is Palidrome");
		else
			System.out.println("String is not Palidrome");
	}

}
