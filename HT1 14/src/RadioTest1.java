import static org.junit.Assert.*;

import org.junit.Test;

public class RadioTest1 {

	@Test
	public void test() {
		Radio radio = new Radio();
		String mensaje = radio.estacionActual();
		assertEquals("530", mensaje);
	}

}
