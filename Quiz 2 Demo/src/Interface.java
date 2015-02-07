import javax.swing.JOptionPane;

public class Interface {

	public static void main(String[] args) {
		
		boolean bu, bp;
		bu= Main.authentication(true, JOptionPane.showInputDialog("Username"));
		bp= Main.authentication(false, JOptionPane.showInputDialog("Password"));
		if(bu && bp)
			JOptionPane.showMessageDialog(null, "Welcome Saman");
		else
			JOptionPane.showMessageDialog(null, "Wrong username or password!");
	}
	

}