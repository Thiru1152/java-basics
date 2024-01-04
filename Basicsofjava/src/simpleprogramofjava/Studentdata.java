package simpleprogramofjava;

public class Studentdata {
	public void student(int id) {
		System.out.println(id);
		}
	public void student(String name) {
		System.out.println(name);
		}
	public void student(float salary) {
		System.out.println(salary);
		}
	
public static void main(String[]args) {
	Studentdata obj = new Studentdata();
	obj.student(1);
	obj.student("Thiru");
	obj.student(30000);
	
}

}
