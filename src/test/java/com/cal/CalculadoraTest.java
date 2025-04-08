package com.cal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import org.junit.Test;

public class CalculadoraTest {

	private static Calculadora calculadora;

	public CalculadoraTest() {
        // Constructor público sin argumentos
    }
	
	@BeforeAll
	static void inicializar() {
		calculadora = new Calculadora(6, 2);
	}

	@AfterAll
	static void finTest() {
		System.out.println("Test 'Calculadora.java' finalizado");
	}

	@Test
	public void testSuma() {
		Calculadora calculadora = new Calculadora(5, 3);
		int resultadoSuma = calculadora.suma();
		assertEquals(8, resultadoSuma);
	}

	@Test
	public void testResta() {
		Calculadora calculadora = new Calculadora(8, 4);
		int resultadoResta = calculadora.resta();
		assertEquals(4, resultadoResta);
	}

	@Test
	public void testProducto() {
		Calculadora calculadora = new Calculadora(4, 3);
		int resultadoProducto = calculadora.producto();
		assertEquals(12, resultadoProducto);
	}

	@Test
	public void testDivision() {
		Calculadora calculadoraExcepcion = new Calculadora(6, 0);

		try {
			calculadoraExcepcion.division();
			fail("No ha saltado la excepción");
		} catch (ArithmeticException e) {
			assertEquals(5, 5);
		}

	}

	@Test
	public void raiz() {
		Calculadora calculadora = new Calculadora(8, 3);
		int resultado = calculadora.raiz();
		assertEquals(resultado, 2);
	}
}
