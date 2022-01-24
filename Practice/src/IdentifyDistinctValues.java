import java.util.ArrayList;

public class IdentifyDistinctValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int []a= {1,2,3,4,5,5,3,6,2};
		ArrayList <Integer>x =new ArrayList<Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			if (x.contains(a[i]))
			{
				
			}
			else 
			{
				x.add(a[i]);
			}
				
		}
		for(int i=0;i<x.size();i++)
		System.out.println(x.get(i));
	}

}
