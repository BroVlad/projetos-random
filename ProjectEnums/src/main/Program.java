package main;

import entities.enums.Operations;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Digite um valor: ");
		double valueA = sc.nextDouble();
		
		System.out.println("");
		
		System.out.println("What the operation you want to do?: ");
		System.out.println("1)Multiplication");
		System.out.println("2)Division");
		System.out.println("3)Subtraction");
		System.out.println("4)Sum");
		int operator = sc.nextInt();
		
		System.out.println("");
		
		System.out.print("Enter a value: ");
		double valueB = sc.nextDouble();
		
		System.out.println("");
		
		System.out.println("Result: ");
		
		if (operator == 1) {
			System.out.println(Operations.MULTIPLICACAO.aplicar(valueA, valueB));
		} else if (operator == 2) {
			System.out.println(Operations.DIVISAO.aplicar(valueA, valueB));
		} else if (operator == 3) {
			System.out.println(Operations.SUBTRACAO.aplicar(valueA, valueB));
		} else if (operator == 4) {
			System.out.println(Operations.SOMA.aplicar(valueA, valueB));
		}
		
		sc.close();
		
	} // end of main class
} // end of principal class
