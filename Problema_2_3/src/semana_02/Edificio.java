package semana_02;

public class Edificio {
	
	private int codigo;
	private int numDpto;
	private int cantPisos;
	private double precioDolar;
	
	//Constructores
	
	public Edificio() {
			}

	public Edificio(int codigo, int numDpto, int cantPisos,
			double precioDolar) {
		super();
		this.codigo = codigo;
		this.numDpto = numDpto;
		this.cantPisos = cantPisos;
		this.precioDolar = precioDolar;
	}

	//Metodos get/set
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public int getNumDpto() {
		return numDpto;
	}

	public void setNumDpto(int numDpto) {
		this.numDpto = numDpto;
	}

	public int getCantPisos() {
		return cantPisos;
	}

	public void setCantPisos(int cantPisos) {
		this.cantPisos = cantPisos;
	}

	public double getPrecioDolar() {
		return precioDolar;
	}

	public void setPrecioDolar(double precioDolar) {
		this.precioDolar = precioDolar;
	}
	
	//Metodos publicos
	
	public double precioEdificio() {
		return numDpto*precioDolar;
	}

}
