package string;

public class String_9 {

	public static void main(String[] args) {
		 String a="sathiya";
	     String b="";
	     for(int i=a.length()-1; 0<=i; i--)
	     {
	    	 b=b+a.charAt(i);
	     }
System.out.println(b);
if(a==b) {
	System.out.println("It is palindrome");
}
else
	System.out.println("Not a palindrome");
	
	}

	}


