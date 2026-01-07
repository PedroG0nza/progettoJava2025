package progettoJava2025;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestCalcolatrice {

	@Test
	void testSomma() 
	{
		calcolatrice c = new calcolatrice();
		int risultato =c.Somma(2,5);
		assertEquals(7,risultato);
	}
	@Test
	void testSommaNegativo() {
		calcolatrice a = new calcolatrice();
		int risultato =a.Somma(2,-3);
		assertEquals(-1,risultato);
	}
	@Test
	void testSottrazione() 
	{
		calcolatrice a = new calcolatrice();
		int  c = a.Sott(10,6);
		assertEquals(4,c);

		
		
	}
		
	
}
