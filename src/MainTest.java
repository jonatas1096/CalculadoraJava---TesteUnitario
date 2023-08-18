import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class MainTest {
	
	@Test
	public void testeSoma() {
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.somarNumeros(4, 5); 
	    assertEquals(9, resultado);
	}
	
	@Test
	public void testeSubtracao() {
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.subtrairNumeros(5, 2); //Subtração errada:
	    assertEquals(2, resultado);
	}
	
	
	@Test
	public void testeDivisao() {
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.dividirNumeros(4, 0); //divisão por zero retornando erro como o esperado!
	    assertEquals(2, resultado);
	}
	
	@Test
	public void testeMultiplicacao() {
		Calculadora calculadora = new Calculadora();
		
		int resultado = calculadora.multiplicarNumeros(2, 10);
	    assertEquals(20, resultado);
	}
	
	
}
