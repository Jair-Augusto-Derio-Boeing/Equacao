
public class yVert {
	public static double y(double a, double b, double c) {
		double yVertice = -(Delta.Delta(a, b, c) / (4 * a));
		return yVertice;
	}
}
