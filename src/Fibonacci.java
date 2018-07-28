import javax.swing.JOptionPane;

public class Fibonacci {
public static void main(String[] args) {
		int first=1;
		int second=1;
		int third;
	System.out.println(first);
	System.out.println(second);
	for (int i = 0; i < 13; i++) {
	third=first+second;
		System.out.println(third);
		first=second;
		second=third;
		}
//1+1=2+1=3+2=5+3=8+5=13
	}
}

