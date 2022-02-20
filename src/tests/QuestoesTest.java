package tests;

import org.junit.jupiter.api.Test;

import desafios.Questao1;
import desafios.Questao2;
import junit.framework.TestCase;

class QuestoesTest extends TestCase{
	
	@Test
	public void testQuestao1() {
		String res1 = "   *\n  **\n ***\n****\n";
		String res2 = "     *\n    **\n   ***\n  ****\n *****\n******\n";
		Questao1 questao1 = new Questao1();
		
		assertEquals(res1, questao1.desafio(4));
		assertEquals(res2, questao1.desafio(6));
	}
	
	
	@Test
	public void testQuestao2() {
		String ent1 = "Ya3";
		Questao2 questao2 = new Questao2();
		
		assertEquals(3, questao2.desafio(ent1));
	}
}
