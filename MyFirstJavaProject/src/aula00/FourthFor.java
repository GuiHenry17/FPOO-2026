package aula00;

import java.util.Scanner;

public class FourthFor {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite um número: ");
		int n = scanner.nextInt();
		
		for (int i = 1; i <= 10; i++) {
			System.out.println(n + " x " + i + " = " + (n*i));
		}
		
		scanner.close();
	}

}
