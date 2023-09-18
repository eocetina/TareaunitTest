package funcionesParaPalabras;



import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class PrimerCharTest {
	PrimerChar test;
	@Test
	@DisplayName ("Prueba de casos de tipo de palabra")
	void testVerificarPalabra() {
		assertEquals("Mayus",PrimerChar.verificarPalabra("Hola"));
		assertEquals("Number",PrimerChar.verificarPalabra("12 street"));
		assertEquals("Minus",PrimerChar.verificarPalabra("crayoli"));
		assertEquals("Other",PrimerChar.verificarPalabra("#ch30"));
		
	}

}
