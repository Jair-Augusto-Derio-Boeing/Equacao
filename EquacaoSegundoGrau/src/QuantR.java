
public class QuantR {
	public static double quant(double a, double b, double c) {
		double quant = 0;
		if (Math.sqrt(Delta.Delta(a, b, c)) % 1 == 0 && Delta.Delta(a, b, c) > 0) {
			quant = 2;
		} else if (Delta.Delta(a, b, c) == 0) {
			quant = 1;
		} else {
			quant = 0;
		}
		return quant;
	}
}
