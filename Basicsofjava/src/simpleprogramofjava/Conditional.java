package simpleprogramofjava;

public class Conditional {
	public static void main (String[]args) {
		int age=18;
		if(age>18) {
			System.out.println("allow to vote");
		}
		else if(age==18) {
			System.out.println("also allow to vote");
		}
		else {
			System.out.println(" not allow to vote");
		}
		
//Switch
		int day = 5;
		switch (day) {
		  case 1:
		    System.out.println("Monday");
		    break;
		  case 2:
		    System.out.println("Tuesday");
		    break;
		  case 3:
		    System.out.println("Wednesday");
		    break;
		  case 4:
		    System.out.println("Thursday");
		    break;
		  case 5:
		    System.out.println("Friday");
		    break;
		  case 6:
		    System.out.println("Saturday");
		    break;
		  case 7:
		    System.out.println("Sunday");
		    break;
		  default:
			    System.out.println("not found");
		}
		
		int year = 2019;
		if(year % 4==0 || year%400==0) {
		System.out.println("leap year");
		}
		else {
			System.out.println("not a leap year");
		}
		
		int i=0;
		for(i=0;i<=30;i++) {
		if(i%2==0) {
			System.out.println(i);
			}
		}
}
}
	
