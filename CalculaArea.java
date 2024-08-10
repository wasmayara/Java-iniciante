package ListaJava01;

import java.util.Scanner;

public class CalculaArea {
/*Fa�a um programa que calcula a �rea das seguites figuras geometricas
 * - Ret�ngulo, Tri�ngulo, C�rculo e Trap�zio.*/
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int opcao = 5;

	        while(opcao < 5)
	            System.out.println("Qual figura geom�trica deseja calcular:");
	            System.out.println("1. Ret�ngulo");
	            System.out.println("2. Tri�ngulo");
	            System.out.println("3. C�rculo");
	            System.out.println("4. Trap�zio");
	            System.out.println("5. Sair");
	            opcao = sc.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Digite a largura do ret�ngulo:");
	                    double largura = sc.nextDouble();
	                    System.out.println("Digite a altura do ret�ngulo:");
	                    double altura = sc.nextDouble();
	                    double areaRetangulo = largura * altura;
	                    System.out.println("A �rea do ret�ngulo �: " + areaRetangulo);
	                    break;

	                case 2:
	                    System.out.println("Digite a base do tri�ngulo:");
	                    double baseTriangulo = sc.nextDouble();
	                    System.out.println("Digite a altura do tri�ngulo:");
	                    double alturaTriangulo = sc.nextDouble();
	                    double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
	                    System.out.println("A �rea do tri�ngulo �: " + areaTriangulo);
	                    break;

	                case 3:
	                    System.out.println("Digite o raio do c�rculo:");
	                    double raio = sc.nextDouble();
	                    double areaCirculo = Math.PI * raio * raio;
	                    System.out.println("A �rea do c�rculo �: " + areaCirculo);
	                    break;

	                case 4:
	                    System.out.println("Digite a base maior do trap�zio:");
	                    double baseMaior = sc.nextDouble();
	                    System.out.println("Digite a base menor do trap�zio:");
	                    double baseMenor = sc.nextDouble();
	                    System.out.println("Digite a altura do trap�zio:");
	                    double alturaTrapezio = sc.nextDouble();
	                    double areaTrapezio = ((baseMaior + baseMenor) * alturaTrapezio) / 2;
	                    System.out.println("A �rea do trap�zio �: " + areaTrapezio);
	                    break;

	                case 5:
	                    System.out.println("Saindo...");
	                    break;

	                default:
	                    System.out.println("Op��o inv�lida. Tente novamente.");
	            }
	            sc.close();
	        } 

	       
	    }
	

