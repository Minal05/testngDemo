
 class TestPalindrome {
	public static boolean isPalidrome(String str)
	{
		StringBuilder sb1=new StringBuilder(str);
		sb1.reverse();
		String rev=sb1.toString();
		if(str.equals(rev))
			return true;
		else 
			return false;
	}
}
 public class Palindrome{
	public static void main(String[] args)
	{
		System.out.println(TestPalindrome.isPalidrome("madam"));
	}
}