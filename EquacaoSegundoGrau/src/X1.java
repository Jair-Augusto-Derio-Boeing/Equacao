
public class X1 {
	public static double X1(double a, double b, double c) {

		double x1 = 0;

		if (Math.sqrt(Delta.Delta(a, b, c)) % 1 == 0) {
			x1 = (-b + (Math.sqrt(Delta.Delta(a, b, c)))) / (2 * a);
			System.out.println("O Valor de X' é: " + x1);
			System.out.println("O Valor de X'' é: " + X2.X2(a, b, c));
		} else {
			System.out.println("Não possui Raíz Real");
		}

		return x1;
	}

}
