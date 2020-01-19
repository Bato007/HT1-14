import java.text.DecimalFormat;
import java.util.Arrays;
/**
 * @author Pablo Méndez 19195
 * @author Brandon Hernandez 19376
 * @version 19/01/2020
 * Esta clase se encarga de modelar los comportamientos y caractertisicas 
 * de un radio.
 */
public class Radio implements RadioInterface{
	
	// Atributos del radio
	private String tipoEstacion; 
	private Integer frecuenciaActualAM;
	private Double frecuenciaActualFM;
	private Boolean onOff;
	private Integer[] favoritoAm = new Integer[12];
	private Double[] favoritoFm = new Double[12];
	
	// Constructor para un radio, se inicializan todos los atributos del radio
	public Radio() {
		this.tipoEstacion = "AM";
		this.frecuenciaActualAM = 530;
		this.frecuenciaActualFM = 87.9;
		this.onOff = false;
		Arrays.fill(favoritoAm, 530);
		Arrays.fill(favoritoFm, 87.9);
	}
	
	/*
	 * Método que devuelve la informacion del valor de frecuenciaActualFM o frecuenciaActualAM 
	 * dependiendo del tipo de estacion en la que se encuentre el radio AM o FM
	 * @return. Devuelve un string que indica si se encuentra en la estacion 
	 * AM o FM y en que frecuencia se encuentran
	 */
	public String estacionActual() {
		if(tipoEstacion.equalsIgnoreCase("AM")) {
			return Integer.toString(frecuenciaActualAM);
		}else {
			return Double.toString(frecuenciaActualFM);
		}
	}// Fin del método
	
	/*
	* Método que devuelve el estado en el que se encuentra el radio
	* @return. Devuelve true(encendido) o false(apagado)
	*/
	public Boolean estado() {
		return onOff;
	}// Fin del método
		
	// Método que cambia el valor del atributo 'estado' de false(apagado) a true(encendido)
	// y de true(encendido) a false(apagado)
	public void onOff() {
		if(this.onOff == false) {
			this.onOff = true;
		}else {
			this.onOff = false;
		}
	}// Fin del método
	
	/*
	* Método que se encarga de cambiar el tipo de frecuencia a la que se escucha, de AM a FM
	* y de FM a AM.
	*/
	public void cambiarFrecuencia() {
		if(tipoEstacion.equalsIgnoreCase("AM")) {
			this.tipoEstacion = "FM";
		}else {
			this.tipoEstacion = "AM";
		}
	}// Fin del método
	
	/*
	* Método que se encarga de cambiar la frecuencia y devolverlos al principio 
	* cuando se acaben las mismas.
	*/
	public void avanzar() {
		DecimalFormat decimal = new DecimalFormat("#.0");
		
		if(tipoEstacion.equalsIgnoreCase("AM")) {
			this.frecuenciaActualAM += 10;
			// Verificando que todavia hay frecuenicas disponibles, de lo contrario reiniciandolo
			if(this.frecuenciaActualAM > 1610) {
				this.frecuenciaActualAM = 530;
			}
		}else {
			this.frecuenciaActualFM = Double.parseDouble(decimal.format(frecuenciaActualFM + 0.2));
			// Verificando que todavia hay frecuenicas disponibles, de lo contrario reiniciandolo
			if(this.frecuenciaActualFM > 107.9) {
				this.frecuenciaActualFM  = 87.9;

			}
		}
	}// Fin del método
	
	/*
	* Método que guarda la frecuencia actual de la emisora en un lugar del array
	* @param boton El parámetro boton(- 1) define en que lugar del array se debe de guardar
	* la frecuencia.
	*/
	public void guardar(int boton) {
		if(tipoEstacion.equalsIgnoreCase("AM")) {
			try {
				favoritoAm[boton - 1] = frecuenciaActualAM;
			}catch(ArrayIndexOutOfBoundsException e){
			}
		}else {
			try {
				favoritoFm[boton - 1] = frecuenciaActualFM;
			}catch(ArrayIndexOutOfBoundsException e){
			}
		}
	}// Fin del método
	
	/*
	* Método que asigna una frecuencia favorita a la frecuencia actual de la emisora
	* @param boton El parámetro boton(- 1) define el lugar de la frecuencia favorita que 
	* se quiere asignar a la frecuencia actual.
	*/
	public void seleccionarEmisora(int boton) {
		if(tipoEstacion.equalsIgnoreCase("AM")) {
			try {
				frecuenciaActualAM = favoritoAm[boton - 1];
			}catch(ArrayIndexOutOfBoundsException e){
			}
		}else {
			try {
				frecuenciaActualFM = favoritoFm[boton - 1];
			}catch(ArrayIndexOutOfBoundsException e){
			}
		}
	}// Fin del método
	
}