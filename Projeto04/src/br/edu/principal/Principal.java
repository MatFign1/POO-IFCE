package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		String nome, situacao;
		double n1, n2, naf, mf = 0,  media;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.next();
		
		System.out.println("Digite sua nota 01: ");
		n1 = sc.nextDouble();
		
		System.out.println("Digite sua nota 02: ");
		n2 = sc.nextDouble();
		
		media = (n1+n2)/2;
				
		if (media >= 6) {
			situacao = "aprovado";
		}
		else {
			if (media >= 3) {
				situacao = "em recuperação";
				System.out.println("Situação: " + situacao);
				System.out.println("Digite a nota da af: ");
				
				naf = sc.nextDouble();
				mf = (naf + media)/2;
				if (mf >= 5) {
					situacao = "Aprovado em recuperação";
					System.out.println("Situação: " + situacao);
				}			
				else {
					situacao = "Reprovado em recuperação";
					System.out.println("Situação: " + situacao);
				}
			}
			else{
				situacao = "Reprovado direto";
				System.out.println("Situação: " + situacao);
			}
		}
		System.out.println("Nome: " + nome);
		System.out.println("Média: " + media);
		System.out.println("Média final: " + mf);
		System.out.println("Situação: " + situacao);
	}
}