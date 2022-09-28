package string; //array palindrome program we use to while and for loop

public class String_8 {

	public static void main(String[] args) {
	String_8 obj=new String_8();
	obj.saw();
	obj.saw_1();
	}
		public void saw()
		{
		char c []=new char[7];
		c[0]='s';
		c[1]='a';
		c[2]='t';
		c[3]='h';
		c[4]='i';
		c[5]='y';
		c[6]='a';
		for(int i=c.length-1; i>=0; i--) {
			System.out.println(c[i]);
			
	}
		}

	public void saw_1()
	{
		char c[]=new char[5];
		c[0]='y';
		c[1]='u';
		c[2]='g';
		c[3]='a';
	int var=c.length-1;
	while(var>=0) {
	System.out.println(c[var]);
		 var--;
	}//while loop
	}	
}		