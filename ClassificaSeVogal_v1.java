package casosComSwitch;

import java.util.Scanner;

public class ClassificaSeVogal_v1 {

	public static void main(String[] args) {
	/*Faça um programa em Java que leia uma letra, 
	 * escreva na tela se essa letra é uma vogal ou consoante 
	 * (considerar apenas letras minúsculas).
	 * versao 1.0
	 * */	
		char letra;
		Scanner lerTeclado = new Scanner(System.in);
		
	        System.out.println("Informe uma letra: ");
		letra = lerTeclado.next().charAt(0);
		
		switch (letra) {
		case 'a':
			System.out.println("Vogal");
			break;
		case 'A':
			System.out.println("Vogal");
			break;
		case 'e':
			System.out.println("Vogal");
			break;
		case 'E':
			System.out.println("Vogal");
			break;
		case 'i':
			System.out.println("Vogal");
			break;
		case 'I':
			System.out.println("Vogal");
			break;
		case 'o':
			System.out.println("Vogal");
			break;
		case 'O':
			System.out.println("Vogal");
			break;
		case 'u':
			System.out.println("Vogal");
			break;
		case 'U':
			System.out.println("Vogal");
			break;
		default:
			System.out.println("Consoante");
		}
		lerTeclado.close();
		
	}

}
