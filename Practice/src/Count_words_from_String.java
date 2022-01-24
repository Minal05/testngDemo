
public class Count_words_from_String {

	public static void main(String[] args)
	{
		String str="Welcome to java World You will enjoy alot here";
		String [] str2=str.split(" ");
		int count_Word=0;
		for(int i=0;i<str2.length;i++)
		{
			count_Word++;
		}
		System.out.println("String contains "+ count_Word+" words");
	}
}
