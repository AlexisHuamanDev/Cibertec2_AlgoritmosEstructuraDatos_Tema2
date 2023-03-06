package semana_02;

public class Celular {
	private int numero;
	private String usuario;
	private int segCon;
	private double precSeg;
	
	
	//Constructor
	
	public Celular() {
		
	}
	
	public Celular(int numero, String usuario, int segCon, double precSeg) {
		super();
		this.numero = numero;
		this.usuario = usuario;
		this.segCon = segCon;
		this.precSeg = precSeg;
	}

	//Metodos set/get
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public int getSegCon() {
		return segCon;
	}

	public void setSegCon(int segCon) {
		this.segCon = segCon;
	}

	public double getPrecSeg() {
		return precSeg;
	}

	public void setPrecSeg(double precSeg) {
		this.precSeg = precSeg;
	}
	
	//Operaciones publicas
	
	public double costoConsumo() {
		return(segCon*precSeg);
			}
	
	public double impuestoIGV() {
		return(costoConsumo()*0.18);
	}
	
	public double totalPagar(){
		return(costoConsumo()+ impuestoIGV() );
	}
		
	
}
