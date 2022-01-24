
public class Reverse_Word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Welcome to Java World";
		String [] str2=str.split(" ");
		String str3="";
		for(int i=str2.length-1;i>=0;i--)
		{
			str3=str3+str2[i]+" ";
		}
		System.out.println(str3);
	}

}
