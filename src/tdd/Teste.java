package tdd;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class Teste {

	@Test
	public void NomeTeste() {
		Produto p = new Produto("iMac", 100, (float) 5000.00);
		assertTrue(p.getName().equals("iMac"));		
	}

}
