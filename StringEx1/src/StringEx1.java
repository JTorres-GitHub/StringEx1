import java.util.Scanner;

public class StringEx1 {
	public static String greeting(String name){
		String greet = "Hello, ";
		return greet + name + "!";
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		String name;
		
		System.out.println("Enter a first name: ");
		name = input.nextLine();
		
		System.out.println(greeting(name));
		
		input.close();
	}
}
