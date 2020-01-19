package src;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author Pablo Méndez 19195
 * @author Brandon Hernandez 19376
 * @version 19/01/2020
 * Prueba unitaria del metodo avanzar()
 */
public class RadioTest1 {

	@Test
	// Verifica si el metodo avanzar le suma 10 al valor de frecuencia actual am
	public void test() {
		Radio radio = new Radio();
		radio.avanzar();
		String mensaje = radio.estacionActual();
		assertEquals(mensaje, "540");
	}

}
