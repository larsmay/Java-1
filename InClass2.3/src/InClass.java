import javax.swing.JOptionPane;

public class InClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, num3, sum;
		double avg;
		String numb1, numb2, numb3;
		numb1 = JOptionPane.showInputDialog("Please Input first Integer");
		numb2 = JOptionPane.showInputDialog("Please Input second Integer");
		numb3 = JOptionPane.showInputDialog("Please Input third Integer");
		num1 = Integer.parseInt(numb1);
		num2 = Integer.parseInt(numb2);
		num3 = Integer.parseInt(numb3);
		sum = num1 + num2+ num3;
		avg = sum / 3.0;
		JOptionPane.showMessageDialog(null, "Your average is " + avg);
	}

}
