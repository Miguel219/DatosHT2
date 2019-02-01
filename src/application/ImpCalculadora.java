
import java.io.*;



public class ImpCalculadora implements Calculadora {
	
	
	public ImpCalculadora() {}
	
	
	@Override
	public int Calculate(int num1, int num2, String op) {
		int ans = 0;
			
		if (op.equals("+")) {
		ans = num1 + num2;	
		}
		
		
		if (op.equals("-")) {
			ans = num2 - num1;
		}
		
		
		if (op.equals("*")) {
			ans = num1 * num2;
		}
		
		
		if (op.equals("/")) {
		
			if (num2 != 0) {
			ans = num1 / num2;
			
			} else {
				System.out.println("error: Division por 0.");
			}
			
		}
		
		return ans;
	}
}