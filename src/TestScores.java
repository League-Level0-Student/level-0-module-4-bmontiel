import javax.swing.JOptionPane;

public class TestScores {
public static void main(String[] args) {
String score=JOptionPane.showInputDialog("What are your test scores?");
double d= Double.parseDouble(score);
if (d<70.0) {
	JOptionPane.showMessageDialog(null, "Study more next time!");
}
else if (d>70.0){
	JOptionPane.showMessageDialog(null, "Great job, I can tell you studied hard!");
}


}
}
