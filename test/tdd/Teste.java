package tdd;

import static org.junit.Assert.assertTrue;
import org.junit.Test;


public class Teste {

	Loja loja;
	
	public Teste() {
		this.loja = new Loja();
	}
	
	@Test
	public void testeQuantidade() {
		Produto p = new Produto("SonyVaio", 100, (float) 3000);
		loja.addProduto(p);
		Produto p2 = new Produto("Dell", 100, (float) 2000);
		loja.addProduto(p2);
		Produto p3 = new Produto("MacBookAir", 100, (float) 3500);
		loja.addProduto(p3);
		Produto p4 = new Produto("iMac", 100, (float) 5000);
		loja.addProduto(p4);
		
		assertTrue(loja.Quantidade() == 4);
	}
	
	@Test
	public void testeAdiciona() {
		Produto p = new Produto("SonyVaio", 100, (float) 3000);
		loja.addProduto(p);
		
		assertTrue(loja.Quantidade() == 1);
	}
	
	@Test
	public void testeRemocao() {
		Produto p = new Produto("Dell", 100, (float) 2000);
		loja.addProduto(p);
		loja.RemoveProduto("Dell");
		assertTrue(loja.Quantidade() == 0);
	}
	
	@Test
	public void testeBusca() {
		Produto p = new Produto("iMac", 100, (float) 5000);
		loja.addProduto(p);
		assertTrue(loja.Busca("iMac"));
	}

}
        @Test
        publiv void SomaProduto(){
                Produto p = new Produto ("DVD", 100, (float) 30);
                loja.addProduto(p);
                assertTrue(loja.Soma("DVD"));
}
