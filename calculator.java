package calculater;

import java.util.Scanner;

public class calculator {
	public static void main(String[]args) {
		Double num1,num2,result;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1");
		num1=sc.nextDouble();
		System.out.println("Enter num2");
		num2=sc.nextDouble();
		System.out.println("Enter Operator");
		char operator = sc.next().charAt(0);
		
		switch (operator)
		{
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
			default:
				System.out.println("Wrong Operator");
				return;
		}
		System.out.println("result is:"+result);
				
				
		}
		
	}

