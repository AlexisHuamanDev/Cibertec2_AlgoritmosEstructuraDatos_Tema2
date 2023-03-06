package semana_02;

public class Empleado {
	
	private int codigo;
	private String nombre;
	private int celular;
	private double sueldoSoles;
	
	//Constructores
	public Empleado() {
		super();


	}
	public Empleado(int codigo, String nomnbre, int celular,
			double sueldoSoles) {
		
		this.codigo = codigo;
		this.nombre = nomnbre;
		this.celular = celular;
		this.sueldoSoles = sueldoSoles;
	}
	
	//Metodos get/set
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNomnbre() {
		return nombre;
	}
	public void setNomnbre(String nomnbre) {
		this.nombre = nomnbre;
	}
	public int getCelular() {
		return celular;
	}
	public void setCelular(int celular) {
		this.celular = celular;
	}
	public double getSueldoSoles() {
		return sueldoSoles;
	}
	public void setSueldoSoles(double sueldoSoles) {
		this.sueldoSoles = sueldoSoles;
	}
	
	//Metodos publicos
	
	public String sueldo() {
		if(sueldoSoles>3500) {
			return "Es mayor a 3500";
		}
		else if(sueldoSoles < 3500) {
			return "Es menor  a 3500";
		}
		else 
			return "Es igual a 3500";
	}

}
