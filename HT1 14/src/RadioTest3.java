package src;

import static org.junit.Assert.*;

import org.junit.Test;
/**
 * @author Pablo M�ndez 19195
 * @author Brandon Hernandez 19376
 * @version 19/01/2020
 * Prueba unitaria del metodo onOff()
 */
public class RadioTest3 {

	@Test
	// Verifica que el m�todo onOff cambie el estado de apgado(false) a encendido(true)
	public void test() {
		Radio radio = new Radio();
		radio.onOff();
		Boolean mensaje = radio.estado();
		assertEquals(mensaje, true);
	}

}
