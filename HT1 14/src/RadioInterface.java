/* Autores:
 * Pablo
 * Brandon Hern�ndez - 19376
 * Fecha de Creaci�n: 17 de Enero de 2020
 * Nombre: RadioInterface.java 
 * 
 * Modelo de un radio.
 */
public interface RadioInterface {

	public String estacionActual();
	
	public Boolean estado();
	
	public void onOff();
	
	public void cambiarFrecuencia();
	
	public void avanzar();
	
	public void guardar(int boton);
	
	public void seleccionarEmisora(int boton);
}