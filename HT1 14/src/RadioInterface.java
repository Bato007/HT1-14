/**
 * @author Pablo Méndez 19195
 * @author Brandon Hernandez 19376
 * @version 17/01/2020
 * Se encarga de modelar un radio
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