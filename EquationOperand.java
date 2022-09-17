S
import java.util.Scanner;
public class task2 {

	
	
	public static void main(String[] args) {		
	
		System.out.println("Enter an equation with one operator and two operands separated by space, like 3 + 5");
		
		 
		
		Scanner keyboard = new Scanner(System.in);
			


String equation = keyboard.nextLine( );

int firstSpaceIdx = equation.indexOf(" ");
int secondSpaceIdx = equation.indexOf(" ") + 2;


String firstNumStr = equation.substring(0, firstSpaceIdx);
String secondNumStr = equation.substring(secondSpaceIdx);




double firstNum = Double.parseDouble(firstNumStr);
double secondNum = Double.parseDouble(secondNumStr);



	
	
	
if(equation.contains("-")) {

	System.out.println("Result of " + firstNum + "-" + secondNum + "=" + (firstNum - secondNum));
			
} else if(equation.contains("+")) {
	

			
System.out.println("Result of " + firstNum + "+" + secondNum + "=" + (firstNum + secondNum));
			
			
}  else if(equation.contains("/")) {
	

			
System.out.println("Result of " + firstNum + "/" + secondNum + "=" + (firstNum / secondNum));
			
			
}  else if(equation.contains("*")) {
	

			
System.out.println("Result of " + firstNum + "*" + secondNum + "=" + (firstNum * secondNum));
			
			
}  else if(equation.contains("%")) {
	

			
System.out.println("Result of " + firstNum + "%" + secondNum + "=" + (firstNum % secondNum));
			
			
} else {
	
System.out.println("Invalid Operator");

}
	
	
	
	
	}
	
	
	
	

}
