package PaginaInvestidor;

import java.util.Scanner;

import cadastroUsuario.Investidor;

public class AcessoInvestidor extends Investidor {

	Scanner leia = new Scanner (System.in);
	
	private int op;
	private double doacao;
	private double totalDoado = 0;
	
	public AcessoInvestidor(int id, String nome, String sobrenomesDoMeio, String ultimoSobrenome,
			String email, String cpf, double quantiaDoada, double totalDoado, double doacao) {
		super(id, nome, sobrenomesDoMeio, ultimoSobrenome, email, cpf, quantiaDoada);
		this.totalDoado = totalDoado;
		this.doacao = doacao;
	}
	
	public void inicio () {
		
		do {
			System.out.println("\nSeja Bem vindo " + getNome() + getSobrenomesDoMeio() + getUltimoSobrenome());
			System.out.println("\nEscolha uma op��o:");
			System.out.println("\n1 - Ver suas informa��es.");
			System.out.println("\n2 - Ver a quantidade total que voc� doou.");
			System.out.println("\n3 - Ver o total arrecadado para o projeto.");
			System.out.println("\n4 - Fazer doa��es.");
			System.out.println("\n5 - Sair");
			op = leia.nextInt();
			switch (op){
			case 1: 
				System.out.println("\nID: " + getId());
				System.out.println("\nNome: " + getNome() + getSobrenomesDoMeio() + getUltimoSobrenome());
				System.out.println("\nEmail: " + getEmail());
				System.out.println("\nCPF: " + getCpf());
				System.out.println("\nValor total doado: " + totalDoado);
				break;
			case 2:
				System.out.println("\nValor total doado: " + totalDoado);
				break;
			case 3:
				System.out.println("\nValor arrecadado pelo projeto: " + getQuantiaDoada());
				break;
			case 4:
				System.out.println("Informe o falor que deseja doar: ");
				doacao = leia.nextDouble();
				totalDoado += doacao;
				break;
			case 5:
				System.out.println("\nObrigado por fazer parte desse projeto!");
				break;
			default:
				System.out.println("\nOp��o inv�lida, escolha uma das 5 mencionadas.");
			}
		}while (op != 5);
		
	}

	public double getTotalDoado() {
		return totalDoado;
	}

	public void setTotalDoado(double totalDoado) {
		this.totalDoado = totalDoado;
	}

	public double getDoacao() {
		return doacao;
	}

	public void setDoacao(double doacao) {
		this.doacao = doacao;
	}
	
	
}