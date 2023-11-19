
public class X2 {
	public static double X2(double a, double b, double c) {
		double x2 = 0;
		if (Math.sqrt(Delta.Delta(a, b, c)) % 1 == 0) {
			x2 = (-b - (Math.sqrt(Delta.Delta(a, b, c)))) / (2 * a);
		}
		return x2;
	}

}
