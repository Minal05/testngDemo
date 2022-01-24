
public abstract class twostring_concatnation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="Sachin ";
		String str2="Tendulkar";
		
		//1st Method
		String str3=str1+str2;
		
		
		
		System.out.println("1st Method::- "+str3);
		
		String str4="Virendra ";
		String str5="Sehvag";
		
		
		//2nd Method
	    String str6=str1.concat(str2).concat(" and ").concat(str4).concat(str5);
	    System.out.println("2nd Method::- "+str6);
	
		//3rd method
		StringBuilder s1= new StringBuilder("Hello, ");
		StringBuilder s2=new StringBuilder("Welcome all!!!!!!!!!!");
		
		System.out.println("3rd Method::- "+s1.append(s2).append(" Enjoy"));
		
		String st1="Dehli ";
		String st2="Airport";
		String st3=String.format("%s%s%s","4th Method::- ",st1,st2);
		System.out.println(st3);
		
		String st4="Dehli ";
		String st5="Airport";
		String st6=String.join(",",st4,st5,"5th Method::- ");
		System.out.println(st6.toString());
		
				
	}
	

}
