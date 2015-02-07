import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		boolean bu, bp;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Username: ");
		bu= authentication(true, keyboard.next());
		System.out.print("Password: ");
		bp= authentication(false, keyboard.next());
		if(bu && bp)
			System.out.println("Welcome Saman");
		else
			System.out.println("Wrong username or password!");
		

	}
	
	
	
	public static boolean authentication(boolean b, String up){
		
		String cus = "Saman";
		String cp = "1234";
		String s;
		if(b)
			s=cus;
		else
			s=cp;
		
		if(up.equalsIgnoreCase(s))
			return true;
		else
			return false;
		
		
	}

}
