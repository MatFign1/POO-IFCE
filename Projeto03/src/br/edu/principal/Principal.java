package br.edu.principal;
import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		String nome, rua, num, bairro, compl, cep, cidade, uf, cpf, datanasc, idade;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite seu nome: ");
		nome = sc.nextLine();
		
		System.out.println("Digite sua rua: ");
		rua = sc.nextLine();
		
		System.out.println("Digite seu número: ");
		num = sc.nextLine();
		
		System.out.println("Digite seu bairro: ");
		bairro = sc.nextLine();
		
		System.out.println("Digite seu complemento: ");
		compl = sc.nextLine();
		
		System.out.println("Digite seu cep: ");
		cep = sc.nextLine();
		
		System.out.println("Digite sua cidade: ");
		cidade = sc.nextLine();
		
		System.out.println("Digite sua uf: ");
		uf = sc.nextLine();
		
		System.out.println("Digite seu cpf: ");
		cpf = sc.nextLine();
		
		System.out.println("Digite sua data de nascimento: ");
		datanasc = sc.nextLine();
		
		System.out.println("Digite sua idade: ");
		idade = sc.nextLine();
		
		System.out.println("Nome: " + nome);
		System.out.println("Endereço: " + rua + ", " + num + ", " + bairro + ", " + compl + ", " + cep + ", " + cidade + " - " + uf);
		System.out.println("CPF: " + cpf);
		System.out.println("Data de Nascimento: " + datanasc);
		System.out.println("Idade: " + idade);
	}
}