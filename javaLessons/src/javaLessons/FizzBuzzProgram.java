package javaLessons;

import java.util.Scanner;

public class FizzBuzzProgram {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the no.");
		int number = sc.nextInt();
		
		if(number%3==0 && number%5==0) {
			System.out.println("FizzBuzz");
		}
		else if(number%3==0) {
			System.out.println("Fizz");
		}
		else if(number%5==0) {
			System.out.println("Buzz");
		}
		else System.out.println(-1);
	}

}
