import java.util.Scanner;

public class Menu {
	public static int menu() {
		Scanner t = new Scanner(System.in);
		while (true) {
			System.out.println("    ");

			System.out.println("       Menu de opções");

			System.out.println("");

			System.out.println("1ª opção: Valor de Delta.");

			System.out.println("2ª opção: Quantas raízes a função tem.");

			System.out.println("3ª opção: As raízes reais.");

			System.out.println("4ª opção: Concavidade.");

			System.out.println("5ª opção: Vértice.");

			System.out.println("6ª opção: X Vértice.");

			System.out.println("7ª opção: Y Vértice.");

			System.out.println("8ª opção: Onde o Y Corta no Gáfico.");

			System.out.println("9ª opção: Para Outra Função.");

			System.out.println("Digite 0 para sair.");

			System.out.println("");

			System.out.println("Digite a opção desejada:");

			int escolha = t.nextInt();
			return escolha;
		}

	}
}