
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="I am expert in Automation";
		String str2="";
		String []str3=str.split(" ");

		/*
		//Reverse String:: noitamotuA ni trepxe ma I
		for(int i=str.length()-1;i>=0;i--)
		{
			str2=str2+str.charAt(i);
		}*/

		/*
	//	 Automation in expert am I
		for(int j=str3.length-1;j>=0;j--)

		{
			str2=str2+" "+str3[j];
		}*/

		//I ma trepxe ni noitamotuA 
		for(int i=0;i<str3.length;i++)
		{
			for(int j=str3[i].length()-1;j>=0;j-- )
				str2=str2+str3[i].charAt(j);
			str2=str2+" ";
		}

		System.out.println(str2);
	}


}
