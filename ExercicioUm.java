package ListaJava01;

import java.util.Scanner;

public class ExercicioUm {
/*Escreva um programa que captura nome, idade e profissão do usuário e mostra na tela os valores.
 *(Utilize a classe Scanner e os 3 métodos print, printf e println).*/
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Informe o seu nome ");
		String nome = sc.nextLine();
		System.out.println("O seu nome é:\n" +nome);
		
		System.out.print("Informe a sua idade\n");
		Integer idade = sc.nextInt();
		System.out.printf("A sua idade é: %d\n",idade);
		sc.nextLine();
		System.out.println("Informe a sua profissão");
		String prof = sc.nextLine();
		
		System.out.println("A sua profissão é:\n" +prof);
		
		sc.close();
}

}