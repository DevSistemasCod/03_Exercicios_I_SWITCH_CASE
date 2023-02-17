package casosComSwitch;

import java.util.Scanner;

public class EstacoesDoAno {
	public static void main(String[] args) {
		int estacao = 1;
		String estacaoDoAno = "";
		
		System.out.println("=== Escolha uma estação do ano ===");
		System.out.println("1 - Primavera");
		System.out.println("2 - Verão");
		System.out.println("3 - Outono");
		System.out.println("4 - Inverno");
		System.out.println("Digite uma opção numérica:");
		
		Scanner ler = new Scanner(System.in);
		estacao = ler.nextInt();
		
		switch (estacao) {
		case 1:
			estacaoDoAno = "Primavera - estação das flores";
			break;
		case 2:
			estacaoDoAno = "Verão - estação de muito calor, hidrate-se";
			break;
		case 3:
			estacaoDoAno = "Outono - estação dos ventos e refriados";
			break;
		case 4:
			estacaoDoAno= "Invero - estação das chuvas cuidado com os locais de alagamento";
			break;
		default:
			System.out.println("Estação Inválida!");
		}
		
		System.out.println(estacaoDoAno);
		ler.close();
	}

}
