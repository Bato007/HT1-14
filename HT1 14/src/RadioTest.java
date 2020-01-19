import static org.junit.Assert.*;
import org.junit.Test;
/**
 * @author Pablo Méndez 19195
 * @author Brandon Hernandez 19376
 * @version 19/01/2020
 * Prueba unitaria del metodo avanzar()
 */
public class RadioTest {

	@Test
	// Verifica si el metodo avanzar le suma 10 al valor de frecuencia actual am
	public void estacionAumentaAM() {
		Radio radio = new Radio();
		radio.avanzar();
		String mensaje = radio.estacionActual();
		assertEquals(mensaje, "540");
	}
	
	@Test
	// Se verifica que la estacion se vuelva FM viendo si su estado actual es 87.9
	public void estacionAumentaEnFM() {
		Radio radio = new Radio();
		radio.cambiarFrecuencia();
		String mensaje = radio.estacionActual();
		assertEquals(mensaje, "87.9");
	}
	
	@Test
	// Verifica que el método onOff cambie el estado de apgado(false) a encendido(true)
	public void encendidoApagado() {
		Radio radio = new Radio();
		boolean estadoInicial = radio.estado();
		assertEquals(estadoInicial, radio.estado());
		radio.onOff();
		assertEquals(!estadoInicial, radio.estado());
		radio.onOff();
		assertEquals(estadoInicial, radio.estado());
	}

}
