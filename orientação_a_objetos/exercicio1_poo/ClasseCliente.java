package exercicio1_poo;

public class ClasseCliente {
	
	private String nome;
	private String matricula;
	private String idade;
	private String altura;
	private String nacionalidade;
	
	public ClasseCliente (String nome, String matricula, String idade, String altura, String nacionalidade) {
		super();
		this.nome = nome;
		this.matricula = matricula;
		this.idade = idade;
		this.altura = altura;
		this.nacionalidade = nacionalidade;
	}
	
	// TODO Auto-generated constructor stub
	

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
		this.matricula = matricula;
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
		return nacionalidade;
	}
	
	public void setnacionalidadeClasseCliente() {
		this.nacionalidade = nacionalidade;
	}
	
	public void visualizar() {
		System.out.println("A cliente se chama: " + nome + ", sua matrícula é: " + matricula + ", possui "+idade+ " anos"+", tem "+ altura+ "m de altura" +", sua nacionalidade é: "+ nacionalidade);
	}





}
