package semana_02;

public class Obrero {
	
	private int codigo;
	private String nombre;
	private int horasTrabajadas;
	private double tarifaHora;
	
	//Constructores 
	public Obrero() {
		}

	public Obrero(int codigo, String nombre, int horasTrabajadas,
			double tarifaHora) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.horasTrabajadas = horasTrabajadas;
		this.tarifaHora = tarifaHora;
	}

	//Metodos get/set
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getHorasTrabajadas() {
		return horasTrabajadas;
	}

	public void setHorasTrabajadas(int horasTrabajadas) {
		this.horasTrabajadas = horasTrabajadas;
	}

	public double getTarifaHora() {
		return tarifaHora;
	}

	public void setTarifaHora(double tarifaHora) {
		this.tarifaHora = tarifaHora;
	}
	 
	//Operaciones publicas
	
	public double sueldoBruto() {
		return horasTrabajadas*tarifaHora;
	}
	
	public double descuentoAFP() {
		return sueldoBruto()*0.10;
	}
	
	public double descuentoEPS() {
		return sueldoBruto()*0.05;
	}
	
	public double sueldoNeto() {
		return (sueldoBruto()-descuentoAFP()-descuentoEPS());
	}
}
