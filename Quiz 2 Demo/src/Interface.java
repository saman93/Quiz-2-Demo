import javax.swing.JOptionPane;

public class Interface {

	public static void main(String[] args) {
		
		boolean bu, bp;
		bu= Main.authentication(JOptionPane.showInputDialog("Username"), "Saman");
		bp= Main.authentication(JOptionPane.showInputDialog("Password"), "1234");
		if(bu && bp)
			JOptionPane.showMessageDialog(null, "Welcome Saman");
		else
			JOptionPane.showMessageDialog(null, "Wrong username or password!");
	}
	

}