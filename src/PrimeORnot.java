import javax.swing.JOptionPane;

public class PrimeORnot {
public static void main(String[] args) {
String number=	JOptionPane.showInputDialog("Give me a number");
int integer=Integer.parseInt(number);
for (int i = 2; i < integer; i++) {
	if (integer%i==0) {
		JOptionPane.showMessageDialog(null, "Not a prime number");
		System.exit(0);}
}
	JOptionPane.showMessageDialog(null, "Its a prime number!");
	System.exit(0);
}
}
