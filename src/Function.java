import javax.swing.JOptionPane;

public class Function {
	

	public static void plnToDollar(double input) {
		double dol = input * 4.8;
		JOptionPane.showMessageDialog(null, "Amount of Dollar: " +dol+" DOL");

	}
	
	public static void plnToEuro(double input) {
		double eur = input * 4.75;
		JOptionPane.showMessageDialog(null, "Amount of Euro: " +eur+" EURO");
	}
}
