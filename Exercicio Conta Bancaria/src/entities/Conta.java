package entities;

public class Conta {

	private int numeroConta;
	private String nomeDonoConta;
	private double saldo;

	public int getNumeroConta() {
		return numeroConta;
	}

	public String getNomeDonoConta() {
		return nomeDonoConta;
	}

	public void setNomeDonoConta(String nomeDonoConta) {
		this.nomeDonoConta = nomeDonoConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public Conta(int numeroConta, String nomeDonoConta, double saldo) {
		this.numeroConta = numeroConta;
		this.nomeDonoConta = nomeDonoConta;
		this.saldo = saldo;
	}
	
	public Conta(int numeroConta, String nomeDonoConta) {
		this.numeroConta = numeroConta;
		this.nomeDonoConta = nomeDonoConta;
		this.saldo = 0;
	}

	@Override
	public String toString() {
		return "Numero da conta=" + numeroConta + ", Nome do dono da conta=" + nomeDonoConta + ", Saldo da conta=" + saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
	
	public void sacar(double valor) {
		saldo -= valor;
	}
	
	
}
