package es.curso.java;

import static org.junit.Assert.*;

import org.junit.Test;

public class DiosTest {

	@Test
	public void test() {
		
		/*Dios dios = new Dios();
		
		Dios dios2 = new Dios();*/
		
		Dios dios = Dios.getInstance();
		
		Dios dios2 = Dios.getInstance(); 
		
		assertEquals(dios, dios2);
		
		//fail("Not yet implemented");
	}

}
