package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import aula02.Quadrado;

class QuadradoTeste {
	Quadrado quad;
	
	@BeforeEach
	void prepara() {
		quad = new Quadrado(2,2);
	}
	
	@Test
	void testPerimetro() {
		assertEquals(16, quad.perimetro());
	}
	void testArea() {
		assertEquals(16, quad.area());
	}
	
	@AfterEach
	void limpa() {
		quad = null;
	}

}
