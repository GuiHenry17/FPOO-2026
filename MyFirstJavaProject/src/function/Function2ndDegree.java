package function;

import java.util.Scanner;

public class Function2ndDegree {

	private Scanner scanner = new Scanner(System.in);

	private float readFloat(String message) {

		System.out.print(message);

		float value = scanner.nextFloat();
		scanner.nextLine();

		return value;
	}

	private void showNumberOfRoots(Quadratic function) {

		System.out.println("Quantidade de raízes: " + function.numberOfRoots());
	}

	private void showRoots(Quadratic function) {

		System.out.println("Raízes:");

		float[] roots = function.rootsValues();

		for (int i = 0; i < roots.length; i++)
			System.out.printf("x%d = %.2f%n", i + 1, roots[i]);
	}

	private void showVertex(Quadratic function) {

		float x = function.vertexCoordinate();
		float y = function.valueFor(x);

		if (function.isConcaveUp())
			System.out.printf("Ponto de mínimo: (%.2f, %.2f)%n", x, y);
		else
			System.out.printf("Ponto de máximo: (%.2f, %.2f)%n", x, y);
	}

	private void showFunctionValues(Quadratic function) {

		System.out.println("Valores da função de -10 a +10:");

		for (int i = -10; i <= 10; i++)
			System.out.printf("%+3d | %.2f%n", i, function.valueFor(i));
	}

	private void run() {

		System.out.println("Função do Segundo Grau");

		float a = readFloat("Digite o valor de a: ");
		float b = readFloat("Digite o valor de b: ");
		float c = readFloat("Digite o valor de c: ");

		Quadratic function = new Quadratic(a, b, c);

		System.out.println();
		System.out.println("Dados da função:");

		showNumberOfRoots(function);
		showRoots(function);
		showVertex(function);
		showFunctionValues(function);
	}

	public static void main(String[] args) {

		Function2ndDegree app = new Function2ndDegree();
		app.run();

	}

}
