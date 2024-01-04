package simpleprogramofjava;

import java.util.Scanner;

public class Exercise6 {
public static void main(String[]args) {
	    Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int i=num;
		int rev =0;
		while(num>0) {
			rev=rev*10+num%10;
			num=num/10;
		}
		if(i==rev) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		
		
		{
			int num1 =12345, reverse=0;
			while(num1!=0)
			{
				int remainder=num1%10;
				reverse=reverse*10+remainder;
				num1=num1/10;
			}
			System.out.println("the reverse of the number is:"+reverse);		}
	}
}
