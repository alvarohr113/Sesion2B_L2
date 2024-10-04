package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import pkg.Empleado;
import pkg.Empleado.TipoEmpleado;

class EmpleadoTest {
	
	Empleado empleado1;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		empleado1 = new Empleado();
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void testCalculoNominaBrutaVendedorventasinferior1000() {
		
		float expected = 2090;
		float actual = empleado1.calculoNominaBruta(TipoEmpleado.vendedor, 500, 3);
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testCalculoNominaBrutaVendedorventassuperior1000() {
		
		float expected = 2100;
		float actual = empleado1.calculoNominaBruta(TipoEmpleado.vendedor, 1100, 0);
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testCalculoNominaBrutaVendedorventassuperior1500() {
		
		float expected = 2200;
		float actual = empleado1.calculoNominaBruta(TipoEmpleado.vendedor, 1600, 0);
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testCalculoNominaBrutaEncargadoventasinferior1000() {
		
		float expected = 2590;
		float actual = empleado1.calculoNominaBruta(TipoEmpleado.Encargado, 500, 3);
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testCalculoNominaBrutaEncargadoventassuperior1000() {
		
		float expected = 2600;
		float actual = empleado1.calculoNominaBruta(TipoEmpleado.Encargado, 1100, 0);
		
		assertEquals(expected,actual);
		
	}
	
	@Test
	void testCalculoNominaBrutaEncargadoventassuperior1500() {
		
		float expected = 2700;
		float actual = empleado1.calculoNominaBruta(TipoEmpleado.Encargado, 1600, 0);
		
		assertEquals(expected,actual);
		
	}

	@Test
	void testCalculoNominaNeta() {
		fail("Not yet implemented");
	}

}
