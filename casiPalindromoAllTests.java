package funcionesParaPalabras;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.BeforeEach;

public class casiPalindromoAllTests {
	CasiPalindromos testCase;

	@BeforeEach
	void setup() {
		testCase = new CasiPalindromos("Oso");
	}

	@Test
	@DisplayName("Prueba de casos de la funcion esCasiPalindromo")
	void testPalindromo() {
		assertEquals(false, testCase.esCasiPalindromo());
		assertEquals(true, CasiPalindromos.esCasiPalindromo("Ver"));
		assertEquals(false, CasiPalindromos.esCasiPalindromo("Hola"));
		assertEquals(true, CasiPalindromos.esCasiPalindromo("Ocho"));
		assertEquals(false, CasiPalindromos.esCasiPalindromo("Veronica"));
		assertEquals(true, CasiPalindromos.esCasiPalindromo("Anita lavó la tina"));
		assertEquals(false, CasiPalindromos.esCasiPalindromo("A mamá, Roma le aviva el amor a papá, y a papá, Roma le aviva el amor a mamá"));
		

	}
}
