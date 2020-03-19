package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import aula02.Losango;

class LosangoTest {
	
	Losango losan;
	@BeforeEach
	void prepara() {
		losan = new Losango(2, 2);
	}
	@Test
	void testPerimetro() {
		assertEquals(16, losan.perimetro());
	}
	
	@Test
	void testArea() {
		assertEquals(15, losan.area());
	}
	
	@AfterEach
	void limpa() {
		losan = null;
	}

}
