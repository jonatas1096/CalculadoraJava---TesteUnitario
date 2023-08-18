import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Calculadora em Java - Estudo
		
		Scanner ler = new Scanner (System.in);
		int escolha;
		
		//Checagem de operacao
		System.out.println("Qual operacao deseja usar?");
		System.out.println("1 = Soma \n2 = Subtracao \n3 = Divisao \n4 = Multiplicacao");
		escolha = ler.nextInt();
		
		
		//Operacao
		if (escolha == 1) 
		{
			Calculadora calculadora = new Calculadora(); //Novo Objeto
			
	        int numero1 = 0,numero2 = 0;
	        int resultado = calculadora.somarNumeros(numero1, numero2); //chamando a funcao que esta na class Calculadora
	        System.out.println("\nO resultado da soma e: " + resultado); 
		}
		
		else if (escolha == 2) 
		{
			Calculadora calculadora = new Calculadora(); //Novo Objeto
			
	        int numero1 = 0,numero2 = 0;
	        int resultado = calculadora.subtrairNumeros(numero1, numero2); //chamando a funcao que esta na class Calculadora
	        System.out.println("\nO resultado da subtracao e: " + resultado);
		}
		else if(escolha == 3)
		{
			Calculadora calculadora = new Calculadora(); //Novo Objeto
			
	        int numero1 = 0,numero2 = 0;
	        int resultado = calculadora.dividirNumeros(numero1, numero2); //chamando a funcao que esta na class Calculadora
	        System.out.println("\nO resultado da divisao e: " + resultado);	
		}
		else if(escolha == 4)
		{
			Calculadora calculadora = new Calculadora(); //Novo Objeto
			
	        int numero1 = 0,numero2 = 0;
	        int resultado = calculadora.multiplicarNumeros(numero1, numero2); //chamando a funcao que esta na class Calculadora
	        System.out.println("\nO resultado da multiplicacao e: " + resultado);	
		}
		
		System.out.println("Obrigado por usar a minha calculadora.");
		
		ler.close();
	}

}
