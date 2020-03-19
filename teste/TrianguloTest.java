package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import aula02.Triangulo;
class TrianguloTest {
	Triangulo trian;
	
	@BeforeEach
	void preparacao() {
		trian = new Triangulo(4,5);
	}
	@Test
	void testPerimetro() {
		assertEquals(14, trian.perimetro());
	}
	@Test
	void testArea() {
		assertEquals(14, trian.area());
	}
	@AfterEach
	void limpa() {
		trian = null;
	}

}
