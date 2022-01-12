package work;

import java.util.Scanner;
import java.util.function.*;

class Calc {
	public static int add(int a, int b) {
		return a + b;
	}
	
	public static int sub(int a, int b) {
		return a - b;
	}
}

@FunctionalInterface
interface Doable {
	public void printCalc();
}

public class Functions {
	public static void main(String[] args) {
		//Functions fi = new Functions();
		System.out.print("Enter operation selection: \n1: Add\n2: Subtract\n");
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int firstVal;
		int secondVal;
		int result;
		
		switch(input){
			case 1:
				//BiFunction and method reference
				BiFunction<Integer, Integer, Integer> adder = Calc::add;
				System.out.print("Enter first value...\n");
				firstVal = sc.nextInt();
				System.out.print("Enter second value...\n");
				secondVal = sc.nextInt();
				result = adder.apply(firstVal, secondVal);
				
				//Functional If
				Doable fi = () -> System.out.println(firstVal + " + " + secondVal + " is " + result);
				fi.printCalc();
				
				break;
			case 2:
				BiFunction<Integer, Integer, Integer> subber = Calc::sub;
				System.out.print("Enter first value...\n");
				firstVal = sc.nextInt();
				System.out.print("Enter second value...\n");
				secondVal = sc.nextInt();
				result = subber.apply(firstVal, secondVal);
				Doable fi2 = () -> System.out.println(firstVal + " + " + secondVal + " is " + (firstVal + secondVal));
				fi2.printCalc();

				break;
			default:
				System.out.println("Number entered was neither 1 or 2\n");
				break;
		}
		
		sc.close();
	}
	
	public static void test() {
		System.out.println("Method reference works too.");
	}
}