package exercicio1_poo;

public class ClasseCliente {
	
	public String nome;
	public String matricula;
	public String idade;
	public String altura;
	public String nacionalidade;
	
	public ClasseCliente (String nome, String matricula, String idade, String altura, String nacionalidade) {
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.altura = altura;
		this.nacionalidade = nacionalidade;
	}
	
	public String getnomeClasseCliente() {
		return nome;
	}
	
	public void setnomeClasseCliente() {
		this.nome = nome;
	}
	
	public String getmatriculaClasseCliente() {
		return matricula;
	}
	
	public void setmatriculaClasseCliente() {
		this.nome = matricula;
	}
	
	public String getidadeClasseCliente() {
		return idade;
	}
	
	public void setidadeClasseCliente() {
		this.idade = idade;
	}
	
	public String getalturaClasseCliente() {
		return altura;
	}
	
	public void setalturaClasseCliente() {
		this.altura = altura;
	}
	
	public String getnacionalidadeClasseCliente() {
		return nome;
	}
	
	public void setnacionalidadeClasseCliente() {
		this.nacionalidade = nacionalidade;
	}
	
	public void visualizar() {
		System.out.println("A cliente se chama: " + nome + ", sua matrícula é: " + matricula + ", possui "+idade+ " anos"+", tem "+ altura+ "m de altura" +", sua nacionalidade é: "+ nacionalidade);
	}





}
