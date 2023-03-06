package entidad;

public class Edificio {
	//atributos privados
	
	private int codigo;
	private int numDepartamento;
	private int cantPisos;
	private double precioDeptoDolares;
	
	//Constructores
	
	public Edificio() {
			}

	public Edificio(int codigo, int numDepartamento, int cantPisos, double precioDeptoDolares) {
		
		this.codigo = codigo;
		this.numDepartamento = numDepartamento;
		this.cantPisos = cantPisos;
		this.precioDeptoDolares = precioDeptoDolares;
	}

	//Métodos de acceso publicos : get/set
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumDepartamento() {
		return numDepartamento;
	}

	public void setNumDepartamento(int numDepartamento) {
		this.numDepartamento = numDepartamento;
	}

	public int getCantPisos() {
		return cantPisos;
	}

	public void setCantPisos(int cantPisos) {
		this.cantPisos = cantPisos;
	}

	public double getPrecioDepDolares() {
		return precioDeptoDolares;
	}

	public void setPrecioDepDolares(double precioDeptoDolares) {
		this.precioDeptoDolares = precioDeptoDolares;
	}
	
	
	//Operaciones publicas
	//metodo para que retorne el precio en dolares del edificio (#dptos * precios
	
	public double importePrecioDolares() {
		return numDepartamento * precioDeptoDolares;
	}
	
	
	
}
