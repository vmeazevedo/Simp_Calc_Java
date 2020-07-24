package calculadora_simples;
import java.util.Locale;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("==================================================================");
		System.out.println("||Bem vindo a Calculadora Simples em Java.			||");
		System.out.println("||Menu: 1-Adi��o / 2-Subtra��o / 3-Divis�o / 4-Multiplica��o.	||");
		System.out.println("==================================================================");
		System.out.print("Digite a op��o desejada: ");
		
		int x = sc.nextInt();
		switch (x) {
		case 1:
			System.out.println();
			System.out.println("=======================");
			System.out.println("||Adi��o selecionada!||");
			System.out.println("=======================");
			while (true) {
				System.out.print("Informe o primeiro numero: ");
				double n1 = sc.nextDouble();
				System.out.print("Informe o segundo numero: ");
				double n2 = sc.nextDouble();
				double soma = n1 + n2;
				System.out.println("O resultado �: " + soma);
				System.out.println("Deseja realizar mais uma adi��o? [S/N]: ");
				char resp = sc.next().charAt(0);
				if (resp=='N') {
					System.out.println("At� logo!");
					break;
				}
			}
			break;
			
		case 2:
			System.out.println();
			System.out.println("==========================");
			System.out.println("||Subtra��o selecionada!||");
			System.out.println("==========================");
			while (true) {
				System.out.print("Informe o primeiro numero: ");
				double n1 = sc.nextDouble();
				System.out.print("Informe o segundo numero: ");
				double n2 = sc.nextDouble();
				double sub = n1 - n2;
				System.out.println("O resultado �: " + sub);
				System.out.println("Deseja realizar mais uma subtra��o? [S/N]: ");
				char resp = sc.next().charAt(0);
				if (resp=='N') {
					System.out.println("At� logo!");
					break;
				}
			}
			break;
		
		case 3:
			System.out.println();
			System.out.println("========================");
			System.out.println("||Divis�o selecionada!||");
			System.out.println("========================");
			while (true) {
				System.out.print("Informe o primeiro numero: ");
				double n1 = sc.nextDouble();
				System.out.print("Informe o segundo numero: ");
				double n2 = sc.nextDouble();
				double div = n1 / n2;
				System.out.println("O resultado �: " + div);
				System.out.println("Deseja realizar mais uma divis�o? [S/N]: ");
				char resp = sc.next().charAt(0);
				if (resp=='N') {
					System.out.println("At� logo!");
					break;
				}
			}
			break;
			
		case 4:
			System.out.println();
			System.out.println("==============================");
			System.out.println("||Multiplica��o selecionada!||");
			System.out.println("==============================");
			while (true) {
				System.out.print("Informe o primeiro numero: ");
				double n1 = sc.nextDouble();
				System.out.print("Informe o segundo numero: ");
				double n2 = sc.nextDouble();
				double mult = n1 * n2;
				System.out.println("O resultado �: " + mult);
				System.out.println("Deseja realizar mais uma multiplica��o? [S/N]: ");
				char resp = sc.next().charAt(0);
				if (resp=='N') {
					System.out.println("At� logo!");
					break;
				}
			}
			break;
		
		default:
			System.out.println("Op��o inv�lida!");
			System.out.println("At� logo.");
			break;
		
		}
		sc.close();
	}

}
