
public class FetchNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="i am hhgj#%1234";
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isDigit(str.charAt(i))){
				System.out.print(str.charAt(i));
			}
				
				
		}

	}

}
