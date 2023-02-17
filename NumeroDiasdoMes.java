package casosComSwitch;

import java.util.Scanner;

public class NumeroDiasdoMes {

	public static void main(String[] args) {
		int mes;
		Scanner lerMes = new Scanner(System.in);
		
		System.out.println("Informe o número do mês para saber a quantidade de dias");
		mes = lerMes.nextInt();
		
		switch (mes){
			case 1, 3, 5, 7, 8, 10, 12:
				System.out.println("O mês tem 31 dias\n");
				break;
			case 4, 6, 9, 11:
				System.out.println("O mês tem 30 dias\n");
				break;
			case 2:
				System.out.println("O mês tem 28 dias\n");
				break;
		}
		lerMes.close();

	}

}
