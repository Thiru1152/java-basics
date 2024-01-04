package simpleprogramofjava;

public class Son extends Father{
	public void Education() {
		System.out.println("CSE");
	}
public static void main(String[]args) {
	Son obj=new Son();
	obj.business();
	obj.Education();
	obj.vehicle();
	obj.house();
}
}
