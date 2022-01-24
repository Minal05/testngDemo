import java.util.ArrayList;

public class IdentifydistinctString {

		public static void main(String []args)
		{
			String []str= {"cat", "Dog","Cat","tiger","dog"};
			ArrayList <String>str2=new ArrayList<String>();
			
			for(int i=0;i<str.length;i++)
			{
				str[i]=str[i].toUpperCase();
				if(str2.contains(str[i])) {}
				else
				{
					str2.add(str[i]);
					
				}
			}
			for(int i=0;i<str2.size();i++)
				System.out.println( str2.get(i));
		}
}
