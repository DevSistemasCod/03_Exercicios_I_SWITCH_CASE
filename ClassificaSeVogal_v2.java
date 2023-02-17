package casosComSwitch;

import java.util.Scanner;

public class ClassificaSeVogal_v2 {

	public static void main(String[] args) {
	/*Faça um programa em Java que leia uma letra, 
	 * escreva na tela se essa letra é uma vogal ou consoante 
	 * (considerar apenas letras minúsculas).
	 * versao 2.0
	 * */	
		char letra;
		Scanner lerTeclado = new Scanner(System.in);
	    
		System.out.println("Informe uma letra: ");
		letra = lerTeclado.next().charAt(0);
		
		switch (letra) {
		case 'a':
		case 'A':
		case 'e':
		case 'E':
		case 'i':
		case 'I':
		case 'o':
		case 'O':
		case 'u':
		case 'U':
			System.out.println("Vogal");
			break;
		default:
			System.out.println("Consoante");
		}
		lerTeclado.close();
	}

}
