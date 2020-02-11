
import java.util.Scanner;
import math_op.operations;
public class calci {

	public static void main(String[] args) {
				operations c= new operations();
		        Scanner sc = new Scanner(System.in);
		        System.out.print("Enter two numbers: ");
		        // nextDouble() reads the next double from the keyboard
		        double num1 = sc.nextDouble();
		        double num2 = sc.nextDouble();
		        System.out.print("Enter an operator (+, -, *, /): ");
		        char operator = sc.next().charAt(0);
	double result;
    switch(operator)
    {
        case '+':
            result = c.add(num1,num2);
            break;
        case '-':
            result = c.sub(num1,num2);
            break;
        case '*':
            result = c.mul(num1,num2);
            break;
        case '/':
            result = c.div(num1,num2);
            break;
        // operator doesn't match any case constant (+, -, *, /)
        default:
            System.out.printf("Error! operator is not correct");
            return;
    }
    System.out.printf("%.1f %c %.1f = %.1f", num1, operator, num2, result);
}

}
