package ListaJava01;

import java.util.Scanner;
/*Escreva um programa que captura nome, sal�rio, idade, altura e sexo. 
*Mostre na tela utilizando o printf.*/
public class Funcionario {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe  o seu nome");
		String nome = sc.nextLine();
		System.out.println("Voc� informou o seu nome: " + nome);
        
		System.out.println("Informe o seu sal�rio");
		Double sal = sc.nextDouble();
		System.out.printf("Sal�rio �: %.2f\n", sal);
		sc.nextLine();
		System.out.println("Informe a sua idade");
		Integer idade = sc.nextInt();
		System.out.printf("A sua idade �: %d\n",idade);
		sc.nextLine();
		System.out.println("Informe a sua altura");
		float altura = sc.nextFloat();
		System.out.printf("A sua altura �: %.2f\n", altura);
		sc.nextLine();
		System.out.println("Informe o seu sexo");
		char sexo = sc.next().charAt(0);
		System.out.println("Voc� informou o sexo: " + sexo);
        
		
        sc.close();
	}
	
}
