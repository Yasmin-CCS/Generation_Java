package exercicio1_poo;

public class PessoaJuridica extends ClasseCliente {
	
	private String cnpj;
	
	public PessoaJuridica  (String nome, String matricula, String idade, String altura, String nacionalidade, String cnpj) {
		super(nome, matricula, idade, altura, nacionalidade);
		this.cnpj = cnpj;
	}
	
	public void setCNPJ(String CNPJ) {
		this.cnpj = cnpj;
	}

	public String getCNPJ() {
		return cnpj;
	}
	
	public void visualizar() {
		super.visualizar();
		System.out.println(cnpj);
	}
	
	
	

}
