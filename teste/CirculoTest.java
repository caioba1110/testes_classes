package teste;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;

import aula02.Circulo;

import org.junit.jupiter.api.Test;

class CirculoTest {
	Circulo cir;
	@BeforeEach
	void preparar() {
		cir = new Circulo(5);
	}
	
	
	@Test
	void testArea() {
		assertEquals(78.53981633974483, cir.area());
	}
	
	@Test
	void testPerimetro() {
		assertEquals(4, cir.perimetro());
	}
	
	@AfterEach
	void limpar() {
		cir = null;
		
	}

}
