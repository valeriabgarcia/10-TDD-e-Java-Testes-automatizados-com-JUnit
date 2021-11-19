package br.com.alura.tdd;

public class CalculadoraTestes {

	public static void main(String[] args) {
		
		Calculadora calc = new Calculadora();
		
		int soma = calc.somar(2 , 3);
		System.out.println(soma);
		
		soma = calc.somar(0 , 0);
		System.out.println(soma);
		
		soma = calc.somar(20 , -3);
		System.out.println(soma);
		

	}

}
