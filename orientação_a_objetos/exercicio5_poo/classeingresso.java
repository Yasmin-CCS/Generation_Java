package exercicio5_poo;

public class classeingresso {
	
	public String nomecliente;
	public String numero;
	public String data;
	public String lugar;
	public String evento;
	
	public classeingresso (String nomecliente, String numero, String data, String lugar, String evento) {
		this.nomecliente = nomecliente;
		this.numero = numero;
		this.data = data;
		this.lugar = lugar;
		this.evento = evento;
	}
	
	public String getnomeclienteClasseCliente() {
		return nomecliente;
	}
	
	public void setnomeClasseCliente() {
		this.nomecliente = nomecliente;
	}
	
	public String getnumeroClasseCliente() {
		return numero;
	}
	
	public void setnumeroClasseCliente() {
		this.numero = numero;
	}
	
	public String getdataClasseCliente() {
		return data;
	}
	
	public void setdataClasseCliente() {
		this.data = data;
	}
	
	public String getlugarClasseCliente() {
		return lugar;
	}
	
	public void setlugarClasseCliente() {
		this.lugar = lugar;
	}
	
	public String geteventoClasseCliente() {
		return evento;
	}
	
	public void seteventoClasseCliente() {
		this.evento = evento;
	}
	
	public void visualizar() {
		System.out.println("O cliente se chama: " + nomecliente + ", o número do seu ingresso é: " + numero + ", o evento é : "+evento+ ", seu lugar é: "+ lugar + " a data do evento é: "+ data);
	}

}
