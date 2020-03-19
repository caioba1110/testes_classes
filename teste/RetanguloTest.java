package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import aula02.Retangulo;

class RetanguloTest {
	
	Retangulo retan;
	
	@BeforeEach
	void preparacao() {
		retan = new Retangulo(4, 5);
	}
	@Test
	void testPerimetro() {
		assertEquals(16, retan.perimetro());
	}
	@Test
	void testArea() {
		assertEquals(20, retan.area());
		
	}
	
	@AfterEach
	void limpa() {
		retan = null;
	}

}
