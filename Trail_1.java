package string; // given the String value to remove the space

import java.util.Scanner;

public class Trail_1 {

	public static void main(String[] args) {
Trail_1 obj=new Trail_1();
obj.Gapremove();
obj.scanuser();
	}

public void scanuser()
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a Slogan");
	String slogan=sc.nextLine();
	String slo=slogan.replace(" " , "");
	System.out.println(slo);
}	
	
public void Gapremove()
{
	String Slogan=("i have a creative mind");
	String slo=Slogan.replace(" ", "");
	System.out.println(slo);	
}	
}
