package semana_02;

public class Computadora {
	
	private int codigo;
	private String marca;
	private String color;
	private double precioDolar;
	
	//Constructores 
	
	public Computadora() {
			}

	public Computadora(int codigo, String marca, String color,
			double precioDolar) {
	
		this.codigo = codigo;
		this.marca = marca;
		this.color = color;
		this.precioDolar = precioDolar;
	}

	//Metodos set/get
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getPrecioDolar() {
		return precioDolar;
	}

	public void setPrecioDolar(double precioDolar) {
		this.precioDolar = precioDolar;
	}
	
	//Metodos publicos
	
	public double precioSoles() {
		return precioDolar*3.35;
	}
	
	public double precioEuros() {
		return precioDolar/1.20;
	}
	
}
