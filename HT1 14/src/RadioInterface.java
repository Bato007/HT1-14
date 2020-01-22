/**
 * @author Pablo Méndez 19195
 * @author Brandon Hernandez 19376
 * @version 21/01/2020
 * Se encarga de modelar un radio
 */
public interface RadioInterface {

	/**
	 * pre: el estado debe de estar en true
	 * pos: verifica que emisora esta y elige cual de las frecuencias se debe de mandar
	 * @return la frecuencia en la que se encuentre dependiendo en que 
	 * emisora este.
	 */
	public String estacionActual();
	
	/**
	 * pre: 
	 * pos: verifica el valor del radio
	 * @return devuelve el estado del radio encendido(true) o apagado(false)
	 */
	public boolean estado();
	
	/**
	 * pre: 
	 * pos: cambia el estado del radio, de true a false y viceversa
	 */	
	public void onOff();
	
	/**
	 * pre: debe de estar encendido el radio
	 * pos: cambia la emisora en la que esta de AM a FM y viceversa
	 */
	public void cambiarFrecuencia();
	
	/**
	 * pre: debe de estar encendido el radio
	 * post: le suma a la frecuencia con base a la emisora en la que 
	 * se encuentre el radio
	 */
	public void avanzar();
	
	/**
	 * pre: debe de estar encendido el radio
	 * pos: guarda la frecuencia actual en los favoritos de la emisora 
	 * actual 
	 * @param boton es en donde el usuario quiere que se guarde la emisora
	 */
	public void guardar(int boton);
	
	/**
	 * pre: debe de estar encendido el radio
	 * pos: consiguie la frecuencia solicitada con base a la emisora actual 
	 * y la asigna a la frecuencia que se esta escuchando
	 * @param boton boton es la frecuencia que el usuario quiere escuchar
	 */
	public void seleccionarEmisora(int boton);
	
}