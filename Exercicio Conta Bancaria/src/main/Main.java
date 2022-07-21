package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira o número da conta: ");
		int nConta = sc.nextInt();
		
		System.out.print("Insira o nome do dono da conta: ");
		String nomeDonoConta = sc.next();
		
		System.out.print("Existe algum depósito inicial (S/N)?");
		char resposta = sc.next().charAt(0);
		
		double depositoInicial;
		Conta conta;
		
		if(resposta == 'S') {
			System.out.print("Digite o valor do depósito inicial: ");
			depositoInicial = sc.nextDouble();
			conta = new Conta(nConta, nomeDonoConta, depositoInicial);
		}else{
			conta = new Conta(nConta, nomeDonoConta);
		}
		
		System.out.println(conta);
		
		System.out.print("Digite um valor para aumentar o saldo depositado: ");
		conta.depositar(sc.nextDouble());
		System.out.println(conta);
		
		System.out.print("Digite um valor para sacar do saldo depositado: ");
		conta.sacar(sc.nextDouble());
		System.out.println(conta);
		
		sc.close();
	}

}
