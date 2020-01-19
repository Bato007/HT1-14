import static org.junit.Assert.*;
import org.junit.Test;
/**
 * @author Pablo Méndez 19195
 * @author Brandon Hernandez 19376
 * @version 19/01/2020
 * Prueba unitaria del metodo cambairFrecuencia()
 */
public class RadioTest2 {

	@Test
	// Se verifica que la estacion se vuelva FM viendo si su estado actual es 87.9
	public void test() {
		Radio radio = new Radio();
		radio.cambiarFrecuencia();
		String mensaje = radio.estacionActual();
		assertEquals(mensaje, "87.9");
	}

}
