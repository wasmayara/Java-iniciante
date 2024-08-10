package ListaJava01;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		// IMC = Altura (ex.: 1,70) Peso (ex.: 69,2) peso/altura

		Scanner sc = new Scanner(System.in);


		System.out.println("informe o seu peso( ex.:69,2)");
		double peso = sc.nextDouble();

		System.out.println("informe a sua altura ( ex.:1,70)");
		double altura = sc.nextDouble();

		double imc = peso/Math.pow(altura,2);

		System.out.printf("O Seu IMC é %.2f\n", imc);

		if(imc < 18.5) {
			System.out.println(" Magreza");
		}else if((imc >= 18.5) && (imc <= 24.9)){
			System.out.println( " Normal");
		}else if( (imc >= 25) && (imc <= 29.9)){
			System.out.println("Sobrepeso");

		}else if( (imc >= 30) && (imc <= 39.9)){
			System.out.println( "Obesidade grau I" );

		}else if( imc >= 40) {
			System.out.println(" Obesidade Grave");
		}



	}

}
