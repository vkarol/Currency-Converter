import javax.swing.JOptionPane;

public class Runner {

	public static void main(String[] args) {
		
		Function f = new Function();
		
		JOptionPane.showMessageDialog(null, "Welcome to My Currency Converter");
		
		double curr = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the currency code: \n1:Dollar\n2:Euro ")); 
		
		if(curr == 1)
        {
			double input = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value [PLN]: "));
			System.out.println(input);
			Function.plnToDollar(input);
        }
        else if (curr == 2)
        {
    		double input = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter value [PLN]: "));
    		System.out.println(input);
    		Function.plnToEuro(input);
        }
        else
        	JOptionPane.showMessageDialog(null, "Invalid Code!");

	}

}
