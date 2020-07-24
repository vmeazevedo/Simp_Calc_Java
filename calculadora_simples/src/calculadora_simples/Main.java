package calculadora_simples;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================================");
		System.out.println("||Bem vindo a Calculadora Simples em Java.			||");
		System.out.println("||Menu: 1-Adição / 2-Subtração / 3-Divisão / 4-Multiplicação.	||");
		System.out.println("==================================================================");
		System.out.print("Digite a opção desejada: ");
		
		int x = sc.nextInt();
		switch (x) {
		case 1:
			System.out.println();
			System.out.println("=======================");
			System.out.println("||Adição selecionada!||");
			System.out.println("=======================");
			while (true) {
				System.out.print("Informe o primeiro numero: ");
				double n1 = sc.nextDouble();
				System.out.print("Informe o segundo numero: ");
				double n2 = sc.nextDouble();
				double soma = n1 + n2;
				System.out.println("O resultado é: " + soma);
				System.out.println("Deseja realizar mais uma adição? [S/N]: ");
				char resp = sc.next().charAt(0);
				if (resp=='N') {
					System.out.println("Até logo!");
					break;
				}
			}
			break;
			
		case 2:
			System.out.println();
			System.out.println("==========================");
			System.out.println("||Subtração selecionada!||");
			System.out.println("==========================");
			while (true) {
				System.out.print("Informe o primeiro numero: ");
				double n1 = sc.nextDouble();
				System.out.print("Informe o segundo numero: ");
				double n2 = sc.nextDouble();
				double sub = n1 - n2;
				System.out.println("O resultado é: " + sub);
				System.out.println("Deseja realizar mais uma subtração? [S/N]: ");
				char resp = sc.next().charAt(0);
				if (resp=='N') {
					System.out.println("Até logo!");
					break;
				}
			}
			break;
		
		case 3:
			System.out.println();
			System.out.println("========================");
			System.out.println("||Divisão selecionada!||");
			System.out.println("========================");
			while (true) {
				System.out.print("Informe o primeiro numero: ");
				double n1 = sc.nextDouble();
				System.out.print("Informe o segundo numero: ");
				double n2 = sc.nextDouble();
				double div = n1 / n2;
				System.out.println("O resultado é: " + div);
				System.out.println("Deseja realizar mais uma divisão? [S/N]: ");
				char resp = sc.next().charAt(0);
				if (resp=='N') {
					System.out.println("Até logo!");
					break;
				}
			}
			break;
			
		case 4:
			System.out.println();
			System.out.println("==============================");
			System.out.println("||Multiplicação selecionada!||");
			System.out.println("==============================");
			while (true) {
				System.out.print("Informe o primeiro numero: ");
				double n1 = sc.nextDouble();
				System.out.print("Informe o segundo numero: ");
				double n2 = sc.nextDouble();
				double mult = n1 * n2;
				System.out.println("O resultado é: " + mult);
				System.out.println("Deseja realizar mais uma multiplicação? [S/N]: ");
				char resp = sc.next().charAt(0);
				if (resp=='N') {
					System.out.println("Até logo!");
					break;
				}
			}
			break;
		
		default:
			System.out.println("Opção inválida!");
			System.out.println("Até logo.");
			break;
		
		}
		sc.close();
	}

}
