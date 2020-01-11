package entities;

public class ContaBancaria {
	
	public static double TARIFA_SAQUE = 5.0;
	
	private int numero;
	private String cliente;
	private double saldo;
	
	public ContaBancaria(int numero, String cliente, double depositoInicial) {
		this.numero = numero;
		this.cliente = cliente;
		deposito(depositoInicial);
	}
	
	public ContaBancaria(int numero, String cliente) {
		this.numero = numero;
		this.cliente = cliente;
	}
	
	public String toString() {
		return "Account " + this.numero + ", Holder: " + this.cliente.toUpperCase() + ", Balance: $ " + String.format("%.2f", this.saldo);
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valorDeposito) {
		this.saldo += valorDeposito;
	}
	
	public void saque(double valorSaque) {
		this.saldo -= valorSaque + TARIFA_SAQUE;
	}

	public int getNumero() {
		return numero;
	}
	
}