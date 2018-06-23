import javax.swing.JOptionPane;

public class HappyPet {
	
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
String pet = JOptionPane.showInputDialog("What pet do you want to buy?");

		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		for (int i = 0; i < 1000; i++) {
			
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want your pet to do?", "Task", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "Cuddle", "Food", "Take a walk" }, null);

			// 5. Use user input to call the appropriate method created in step 4.
			System.out.println(task);
			if (task==0) {
				cuddle();
			}
			if (task==1) {
				food();
			}
			if (task==2) {
				TakeAwalk();
			}
			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if (happinessLevel>=10) {
	JOptionPane.showMessageDialog(null,"You love your pet and you should use a break");
	break;
}}
	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
static	void cuddle() {
		JOptionPane.showMessageDialog(null, "cat will meow");
		happinessLevel+=1;
	}
static	void food() {
		JOptionPane.showMessageDialog(null, "cat will scratch");
		happinessLevel+=5;
	}
static	void TakeAwalk() {
		JOptionPane.showMessageDialog(null, "cat will lay down");
		happinessLevel-=2;
	}
}