package simpleprogramofjava;

public class Operator {
public static void main (String[]args) {
//Arithmetic Operator	
	int x=40;
	int y=20;
	System.out.println(x+y);
	System.out.println(x-y);
	System.out.println(x*y);
	System.out.println(x/y);
	System.out.println(x%y);
	System.out.println(++x);
	System.out.println(--y);
	
//Assignment Operator
	
	System.out.println(x +=3);
	System.out.println(x -=3);
	System.out.println(x *=3);
	System.out.println(x /=3);
	System.out.println(x %=3);
	System.out.println(x &=3);
	System.out.println(x |=3);
	System.out.println(x <<=3);
	System.out.println(x >>=3);
	
//Comparison Operator
	System.out.println(x<y);
	System.out.println(x>y);
	System.out.println(x==y);
	System.out.println(x!=y);
	System.out.println(x<=y);
	System.out.println(x>=y);
	
//Logical operator
	System.out.println((x==y)&&(x>=y));
	System.out.println((x==y)||(x>=y));
	System.out.println(!(x==y)||(x>=y));
	
//loop
	int i=0;
	while(i<=15) {
		System.out.println(i);
		i++;
		}

	
//for loop
	for(int j=0;j<=15;j++) {
		if(j==4) {
			break;
		}
		System.out.println(j);
	}
	
	for(int k=0;k<=15;k++) {
		if(k==4) {
			continue;
		}
		System.out.println(k);
	}
	
} 
}
