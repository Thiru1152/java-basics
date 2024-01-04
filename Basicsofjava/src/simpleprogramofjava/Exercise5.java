package simpleprogramofjava;

public class Exercise5 {
	public static void main(String[]args) {
		String color = "pink";
		char result = color. charAt(1);
		System.out.println(result);
		
		String first = "thiru";
		String last = "thamizhi";
		String name ="pink is my favorite color pink is wonderfull";
		String result2 =first.concat(last);
		System.out.println(result2);
		System.out.println(first.contains("c"));
		System.out.println(first.contains("r"));
		System.out.println(first.indexOf("r"));
		System.out.println(first.toLowerCase());
		System.out.println(first.toUpperCase());
		System.out.println(first.length());
		System.out.println(first.isEmpty());
		System.out.println(name.replace("pink","blue"));
		System.out.println(name.replaceAll("pink","blue"));
		System.out.println(name.replaceFirst("pink","blue"));
		
	}
}
