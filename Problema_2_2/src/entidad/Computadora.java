package entidad;

public class Computadora {
		
	private int codigo;
	private String marca;
	private String color;
	private double precioDolares;
	
	//Constructores
	
	public Computadora() {
		}

	public Computadora(int codigo, String marca, String color, double precioDolares) {
		
		this.codigo = codigo;
		this.marca = marca;
		this.color = color;
		this.precioDolares = precioDolares;
	}
	
	//metodos de acceso get y set
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

	public double getPrecio() {
		return precioDolares;
	}

	public void setPrecio(double precio) {
		this.precioDolares = precio;
	}

	//operaciones publicas
	// Un método que retorne el precio de la computadora en soles (1 dólar = 3.35 soles).
		
		public double precioSoles(){
			return precioDolares*3.35;
		}
		
	//Un método que retorne el precio de la computadora en euros (1 euro = 1.20 dólares).
		
		public double precioEuros() {
			return precioDolares/1.20;
		}
		
}