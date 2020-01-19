import static org.junit.Assert.*;
import org.junit.jupiter.api.Test;

class RadioTest2 {

	@Test
	public void test() {
		Radio radio = new Radio();
		for(int i = 0; i < 108;i++) {
			radio.avanzar();
		}
		String mensaje = radio.estacionActual();
		assertEquals("1610", mensaje);
		radio.avanzar();
		mensaje = radio.estacionActual();
		assertEquals("530", mensaje);
	}

}
