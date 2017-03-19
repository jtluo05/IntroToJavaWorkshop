import javax.swing.JOptionPane;

public class Snooper {
	public static void main(String[] args) {
		String Credit = JOptionPane.showInputDialog("What is your Credit Card number");
		String house = JOptionPane.showInputDialog("Where do you live");
		String ssid = JOptionPane.showInputDialog("What is your Social Security Number");
		JOptionPane.showMessageDialog(null, "Thank you for your cooporation, we have now stolen all of your money," + Credit
				+ house
				+ ssid);

	}

}
