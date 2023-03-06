package entidad;

public class Celular {
	//atributos privados
	//numero(int), usuario(String), segundos consumidos (int), precio por segundo(double)
	
	private int numero;
	private String usuario;
	private int segnConsumidos;
	private double precxSegundo;
	
	//constructores
	public Celular() {
		
	}
	
	public Celular(int num,String user,int sCons, double precSeg) {
		numero = num;
		usuario = user;
		segnConsumidos = sCons;
		precxSegundo = precSeg;
	}
	
	//metodos de acceso , get y set
	//set
	
	public void setNumero(int num) {
		numero = num;
	}
	
	public void setUsuario(String user) {
		usuario = user;
	}
	
	public void setSegundosConsumidos(int segCons) {
		segnConsumidos = segCons;
	}
	
	public void setPrecioSegundo(double pre) {
		precxSegundo = pre;
	}
	
	//GET
	
	public int getNumero() {
		return numero;
	}
	
	public String getUsuario() {
		return usuario;
	}
	
	public int getSegundosConsumidos () {
		return segnConsumidos;
	}
	
	public double getPrecioSegundo() {
		return precxSegundo;
	}
	
	//operaciones publicas
	// un metodo que retorne el costo por consumo(segundo*precio).
	
	public double costoXConsumo() {
		return segnConsumidos * precxSegundo;
	}
	
	// Un metodo que retorne el impuesto IGV (18% del costo x consumo)
	public double impuestoIGV() {
		return costoXConsumo() * 0.18;
	}
	
	//Un metodo que retorne el total a pagar(Costo por consumo + impuesto por IGV)
	public double totalAPagar() {
		return costoXConsumo() - impuestoIGV();
	}
}
