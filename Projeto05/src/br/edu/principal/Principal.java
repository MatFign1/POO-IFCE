package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int dia = 0;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um dia da semana de 1 a 7: ");
		dia = sc.nextInt();
		
		// IF E ELSE IF(equivalente ao elif do python)
		if(dia == 1) {
			System.out.println("Domingo");
		}
		else if(dia == 2) {
			System.out.println("Segunda");
		}
		else if(dia == 3) {
			System.out.println("Terça");
		}
		else {
			System.out.println("Esse dia não existe");
		}
		// SWITCH CASE(antigo)
		
		switch(dia) {
		case 1:
			System.out.println("Domingo");
			break;// SE NÃO TIVER O BREAK ELE IA EXECUTAR TODOS OS CASES
		case 2:
			System.out.println("Segunda");
			break;
		case 3:
			System.out.println("Terça");
			break;
		default:
			System.out.println("Esse dia não existe");
			break;
		}
		
		// SWITCH CASE (moderno)
		switch(dia) {
		case 1 -> System.out.println("Domingo");
		case 2 -> System.out.println("Segunda");
		case 3 -> System.out.println("Terça");
		default -> System.out.println("Esse dia não existe");	
		}		
	}	
}