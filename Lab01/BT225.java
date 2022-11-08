import javax.swing.JOptionPane;
public class BT225 {
	public static void main(String[] args) {
		
		String strNum1, strNum2;	
		strNum1 = JOptionPane.showInputDialog(null,"Please input the number a: ","Input the first number",JOptionPane.INFORMATION_MESSAGE);
		double num1 = Double.parseDouble(strNum1);
		strNum2 = JOptionPane.showInputDialog(null,"Please input the number b: ","Input the second number",JOptionPane.INFORMATION_MESSAGE);
		double num2 = Double.parseDouble(strNum2);
		double sum = num1 + num2;
		double differentce = num1 - num2;
		double product = num1 * num2;
		double a = (num1 / num2);
		double quotient = Math.round(a * 100.0) / 100.0;
		System.out.println("a + b = "+ sum);
		System.out.println("a - b = "+ differentce);
		System.out.println("a * b = "+ product);
		System.out.println("a / b = "+ quotient);
		
		System.exit(0);
	}
}
