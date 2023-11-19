import java.util.*;

public class SegundoGrau {
	public static void main(String[] args) {
		double a = valorA.valorA(0), b = valorB.valorB(0), c = valorC.valorC(0);

		while (true) {

			switch (Menu.menu()) {

			case 1:
				System.out.println("O valor de Delta é: " + Delta.Delta(a, b, c));
				break;

			case 2:
				if (QuantR.quant(a, b, c) > 0) {
					System.out.println("A função possui " + QuantR.quant(a, b, c) + " Raízes Reais ");
				} else {
					System.out.println("A funçõa não possui Raíz Real");
				}

				break;

			case 3:

				X1.X1(a, b, c);

				break;

			case 4:

				Concav.idade(a);

				break;

			case 5:

				Vertice.ponto(a, b, c);

				break;

			case 6:

				System.out.println("O valor do X Vértice é " + xVert.x(a, b));
				break;

			case 7:

				System.out.println("O valor do Y Vértice é " + yVert.y(a, b, c));

				break;

			case 8:

				CortaY.CortaY(c);

				break;

			case 9:
				valorA.valorA(0);
				valorB.valorB(0);
				valorC.valorC(0);

			case 0:

				System.out.println("Fim do algoritimo");

				break;

			default:

				System.out.println("Opção inválida");

				break;

			}

		}
	}
}