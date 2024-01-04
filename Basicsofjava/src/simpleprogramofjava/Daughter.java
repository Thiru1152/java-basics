package simpleprogramofjava;

public class Daughter extends Father{
	public void Education() {
		System.out.println("CSE");
	} 
	public static void main(String[]args) {
		Daughter obj=new Daughter();
		obj.business();
		obj.Education();
		obj.vehicle();
		obj.house();
	}

}
