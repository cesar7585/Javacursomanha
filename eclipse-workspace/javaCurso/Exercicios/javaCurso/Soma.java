package javaCurso;

import java.util.Scanner;

public class Soma {
public static void main(String[] args) {
	Scanner teclado = new Scanner(System.in);
	
	System.out.println("Digite os numeros para saber o seu valor: ");
	
	int a = teclado.nextInt();
	int b= teclado.nextInt();
	int total = a + b ;
	
	System.out.println("A soma será: "+total);
}
}
