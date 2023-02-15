package libs;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class FuncionesTest {
	
	private static Funciones f;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
		System.out.println("Iniciando tests...");
		f=new Funciones();
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
		System.out.println("Tests finalizados."); 
	}

	@Test
	void testDevuelveCentral() {
		assertEquals(5,f.devuelveCentral(1, 5, 9));
		assertEquals(5,f.devuelveCentral(5, 1, 9));
		assertEquals(5,f.devuelveCentral(9, 1, 5));
		assertEquals(5,f.devuelveCentral(9, 5, 1));
		assertEquals(5,f.devuelveCentral(1, 9, 5));
		// comprobamos cuando dos números sean iguales
		assertEquals(3,f.devuelveCentral(3, 3, 0));
		assertEquals(-9,f.devuelveCentral(0, -9, -9));
		assertEquals(-2,f.devuelveCentral(-2, 0, -2));
		// comprobamos cuando los tres números sean iguales
		assertEquals(9,f.devuelveCentral(9, 9, 9));
	}

	@Test

    void testMinutosEntre() {
          assertEquals(130, f.minutosEntre(12,20,14,30));
          assertEquals(130, f.minutosEntre(14,30,12,20));
          assertEquals(1439, f.minutosEntre(23,59,0,0));
          assertThrows(ArithmeticException.class,
                       () -> f.minutosEntre(32,10,14,20));
          assertThrows(ArithmeticException.class,
                       () -> f.minutosEntre(22,70,14,20));
          assertThrows(ArithmeticException.class,
                       () -> f.minutosEntre(22,10,95,20));
          assertThrows(ArithmeticException.class,
                       () -> f.minutosEntre(22,10,14,75));
          assertThrows(ArithmeticException.class,
                  () -> f.minutosEntre(-10,10,14,20));
          assertThrows(ArithmeticException.class,
                  () -> f.minutosEntre(22,-22,14,20));
          assertThrows(ArithmeticException.class,
                  () -> f.minutosEntre(22,10,-9,20));
          assertThrows(ArithmeticException.class,
                  () -> f.minutosEntre(22,10,14,-28));
	}

	@Test
	void testEsCapicua() {
		int v1[]= {3,5,6,5,3};
		int v2[]= {3,4,2,3,4,3};
		assertTrue(f.esCapicua(v1));
		assertFalse(f.esCapicua(v2));
	}

	@Test
	void testSuma_vectores() {
		int v1[]= {1,2,-3};
		int v2[]= {0,-2,5};
		int v3[]= {2,5,-7,4};
		int suma[]= {1,0,2};
		assertArrayEquals(suma,f.suma_vectores(v1, v2));
		assertThrows(ArithmeticException.class,()->f.suma_vectores(v1, v3));
	}

}
