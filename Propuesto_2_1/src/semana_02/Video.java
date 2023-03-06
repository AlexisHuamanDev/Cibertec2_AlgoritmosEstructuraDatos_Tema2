package semana_02;

public class Video {
	
	private int codigo;
	private String nombreVideo;
	private double duracion;
	private double precioSoles;
	private double tipoCambio;
	
	//Contructores 
	
	public Video() {
		
	}
	public Video(int codigo, String nombreVideo, double duracion,
			double precioSoles, double tipoCambio) {
		super();
		this.codigo = codigo;
		this.nombreVideo = nombreVideo;
		this.duracion = duracion;
		this.precioSoles = precioSoles;
		this.tipoCambio = tipoCambio;
	}
	
	//Metodos get/set
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public String getNombreVideo() {
		return nombreVideo;
	}
	public void setNombreVideo(String nombreVideo) {
		this.nombreVideo = nombreVideo;
	}
	public double getDuracion() {
		return duracion;
	}
	public void setDuracion(double duracion) {
		this.duracion = duracion;
	}
	public double getPrecioSoles() {
		return precioSoles;
	}
	public void setPrecioSoles(double precioSoles) {
		this.precioSoles = precioSoles;
	}
	public double getTipoCambio() {
		return tipoCambio;
	}
	public void setTipoCambio(double tipoCambio) {
		this.tipoCambio = tipoCambio;
	}
	
	//Metodos publicos 
	
	public double precioDolar() {
		return precioSoles/tipoCambio;
	}
	
}
