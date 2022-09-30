package string;//wrapper class 

public class String_10 {

	public static void main(String[] args) {
		String  ccode="+91";
		long num=7094549316l ;
		String from=ccode+num;
		System.out.println(from);//exop:-return the String value
		
		String name="Sathiya";
		int secondname=33;
		String names=name+secondname;
		System.out.println(names);
		
		
		
 		int a=23;
		String b =Integer.toString(a);	
		int c=Integer.parseInt(b);
		System.out.println(c);
		
		String small="35";
		short sha=25;
		String small_1=Short.toString(sha);
		System.out.println(small_1+","+sha);
		
		int i=10;
		Integer i2=Integer.valueOf(i);//boxing ,wrapping
		int j=i2.intValue();//unboxing
		Integer i3=20;//integer.valueof(),autoboxing
		System.out.println(i3);
		
		Integer n1=new Integer(100);
		Integer n2=new Integer(100);
		
		Integer n3=200;
		Integer n4=200;
		System.out.println(n3.equals(n4));
		
		
	}

}
