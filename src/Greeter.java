import javax.swing.JOptionPane;

public class Greeter {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is you name");
		JOptionPane.showMessageDialog(null, "Hi");
		JOptionPane.showMessageDialog(null, "Hi, " + name);

	}

}
