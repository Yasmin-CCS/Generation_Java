package exercicio1_poo;

public class PessoaFisica extends ClasseCliente {
	
	private String cpf;
		
	public PessoaFisica (String nome, String matricula, String idade, String altura, String nacionalidade, String cpf) {
		super(nome, matricula, idade, altura, nacionalidade);
		this.cpf = cpf;
	}
	
	public void setCPF(String cpf) {
		this.cpf = cpf;
	}

	public String getCPF() {
		return cpf;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println(cpf);
	}


}
