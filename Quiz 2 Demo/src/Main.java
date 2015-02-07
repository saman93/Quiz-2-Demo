import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean bu, bp;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Username: ");
		bu= authentication(keyboard.next(), "Saman");
		System.out.print("Password: ");
		bp= authentication(keyboard.next(), "1234");
		if(bu && bp)
			System.out.println("Welcome Saman");
		else
			System.out.println("Wrong username or password!");
		

	}
	
	
	
	public static boolean authentication(String up, String s){
			
		if(up.equalsIgnoreCase(s))
			return true;
		else
			return false;
		
		
	}

}
