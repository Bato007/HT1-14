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
	
	/**
	 * Constructor
	 */
	public Radio() {
		this.tipoEstacion = "AM";
		this.frecuenciaActualAM = 530;
		this.frecuenciaActualFM = 87.9;
		this.onOff = false;
		Arrays.fill(favoritoAm, 530);
		Arrays.fill(favoritoFm, 87.9);
	}
	
	/**
	 * Devuelve la frecuencia actual de la AM o FM, dependiendo de la frecuencia actual
	 * @return String con solo la frecuencia en la que se esta.
	 */
	public String estacionActual() {
		if(tipoEstacion.equalsIgnoreCase("AM")) {
			return Integer.toString(frecuenciaActualAM);
		}else {
			return Double.toString(frecuenciaActualFM);
		}
	}
	
	/**
	* Devuelve el estado en el que se encuentra el radio
	* @return true(encendido) o false(apagado)
	*/
	public Boolean estado() {
		return onOff;
	}
		
	/**
	 * Cambia el valor del atributo 'estado' de false a true o viceversa 
	 */
	public void onOff() {
		this.onOff = !this.onOff;
	}
	
	/**
	* Cambia el tipo de frecuencia a la que se escucha, de AM a FM o viceversa
	*/
	public void cambiarFrecuencia() {
		if(tipoEstacion.equalsIgnoreCase("AM")) {
			this.tipoEstacion = "FM";
		}else {
			this.tipoEstacion = "AM";
		}
	}
	
	/**
	* Cambia la frecuencia en intervalos de 10 (AM) o 0.2 (FM) 
	* Si las frecuencias ya llegaron al limite superior, vuelven al inferior
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
	}
	
	/**
	* Guarda la frecuencia actual de la emisora en un lugar del array
	* @param boton El parámetro boton(- 1) define en que lugar del array se debe de guardar la frecuencia.
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
	}
	
	/**
	* Vuelve la frecuencia actual una de las frecuencias en la  lista de favoritas
	* @param boton El parámetro boton(- 1) define el lugar de la frecuencia favorita que se quiere asignar a la frecuencia actual.
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
	}
	
}