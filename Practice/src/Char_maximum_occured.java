
public class Char_maximum_occured {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		           //
		String str="Hello EveryOne Welcome to New Year";
		int [] count=new int[str.length()];
		char minchar=str.charAt(0);
		char maxchar=str.charAt(0);
		int i,j,min,max;
		char [] string=str.toCharArray();
		for( i=0;i<string.length;i++)
		{
			count[i]=1;
			
			for(j=i+1;j<string.length;j++)
			{
				if(string[i]==string[j] && string[i]!=' ' && string[i]!='0')
				{
					count[i]++;
					string[j]='0';
				}
			}
		}
		System.out.println("string is::"+str);
		max=min=count[0];
		for(i=0;i<count.length;i++)
		{
			if(min>count[i] && count[i]!='0')
			{
				min=count[i];
				minchar=string[i];
				System.out.println("minimum occuring character is::"+minchar);
			}
			if(max<count[i])
			{
				max=count[i];
				maxchar=string[i];
				System.out.println("maximum occuring character is::"+maxchar);
			}
			
			
		}
		
		
	}

}
