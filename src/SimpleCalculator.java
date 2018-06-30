

import javax.swing.JOptionPane;

public class SimpleCalculator {
	public static void main(String[] args) {

		// 1. Get 2 numbers from the user and convert them to integer.
String integer=JOptionPane.showInputDialog("Give me integers");
String secondInteger= JOptionPane.showInputDialog("Give me another integer");
int first=Integer.parseInt(integer);
int second=Integer.parseInt(secondInteger);
		// 2. Customize pop-up to support add/subtract/multiply/divide operations.
		int operation = JOptionPane.showOptionDialog(null, "What do you want to do?", "Pop-up Title", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "Add", "Subtract", "Multiply", "Divide" },
				null);

		// 5. Call the methods created in steps 3 and 4 to perform the appropriate operation.
System.out.println(operation);
if (operation==0);{
	Add(first, second);
}
if (operation==1);{
	Subtract(first, second);
}
if (operation==2);{
	Multipy(first, second);
}
if (operation==3);{
	Divide(first, second);
}
		// 6. Wrap steps 1, 2 and 5 in a for loop to repeat calculator operations
	for (int i = 0; i < 3000; i++) {
		
	}

	// 3. Create method for addition operation.
	}
		
		static void Add(int integer, int secondInteger) {
		System.out.println(integer+secondInteger);
	}
	//    Method should create pop-up that shows equation and solution, eg. 45 + 25 = 70.
	//    HINT: use 'static void add(int num1, num2) { ... }

	// 4. Create similar methods for subtraction, multiplication and division.
	static void Subtract(int integer, int secondInteger) {
		System.out.println(integer+secondInteger);
	}
	static void Multiply(int integer, int secondInteger) {
		System.out.println(integer+secondInteger);
	}
	static void Divide(int integer, int secondInteger) {
		System.out.println(integer+secondInteger);
	}
	}
	
