package semana_02;

public class Pelota {

	private String marca;
	private double peso;
	private double presionLibras;
	private double diametroCentimetro;
	private double precio;
	
	//Constructor
	public Pelota() {
			}
	
	public Pelota(String marca, double peso, double presionLibras,
			double diametroCentimetro, double precio) {
		super();
		this.marca = marca;
		this.peso = peso;
		this.presionLibras = presionLibras;
		this.diametroCentimetro = diametroCentimetro;
		this.precio = precio;
	}
	
	//Metodos get/set
	
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getPresionLibras() {
		return presionLibras;
	}
	public void setPresionLibras(double presionLibras) {
		this.presionLibras = presionLibras;
	}
	public double getDiametroCentimetro() {
		return diametroCentimetro;
	}
	public void setDiametroCentimetro(double diametroCentimetro) {
		this.diametroCentimetro = diametroCentimetro;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	//Metodos publicos
	
	public double radio() {
		return diametroCentimetro/2;
	
}
	public double volumen() {
		return (4*3.1416*radio()*radio()*radio()/3);
	}
	
	public double descuento() {
		return precio*0.1;
	}
	
	public double importePagar() {
		return precio - descuento();
	}
	
}


