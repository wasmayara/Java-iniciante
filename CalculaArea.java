package ListaJava01;

import java.util.Scanner;

public class CalculaArea {
/*Faça um programa que calcula a área das seguites figuras geometricas
 * - Retângulo, Triângulo, Círculo e Trapézio.*/
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int opcao = 5;

	        while(opcao < 5)
	            System.out.println("Qual figura geométrica deseja calcular:");
	            System.out.println("1. Retângulo");
	            System.out.println("2. Triângulo");
	            System.out.println("3. Círculo");
	            System.out.println("4. Trapézio");
	            System.out.println("5. Sair");
	            opcao = sc.nextInt();

	            switch (opcao) {
	                case 1:
	                    System.out.println("Digite a largura do retângulo:");
	                    double largura = sc.nextDouble();
	                    System.out.println("Digite a altura do retângulo:");
	                    double altura = sc.nextDouble();
	                    double areaRetangulo = largura * altura;
	                    System.out.println("A área do retângulo é: " + areaRetangulo);
	                    break;

	                case 2:
	                    System.out.println("Digite a base do triângulo:");
	                    double baseTriangulo = sc.nextDouble();
	                    System.out.println("Digite a altura do triângulo:");
	                    double alturaTriangulo = sc.nextDouble();
	                    double areaTriangulo = (baseTriangulo * alturaTriangulo) / 2;
	                    System.out.println("A área do triângulo é: " + areaTriangulo);
	                    break;

	                case 3:
	                    System.out.println("Digite o raio do círculo:");
	                    double raio = sc.nextDouble();
	                    double areaCirculo = Math.PI * raio * raio;
	                    System.out.println("A área do círculo é: " + areaCirculo);
	                    break;

	                case 4:
	                    System.out.println("Digite a base maior do trapézio:");
	                    double baseMaior = sc.nextDouble();
	                    System.out.println("Digite a base menor do trapézio:");
	                    double baseMenor = sc.nextDouble();
	                    System.out.println("Digite a altura do trapézio:");
	                    double alturaTrapezio = sc.nextDouble();
	                    double areaTrapezio = ((baseMaior + baseMenor) * alturaTrapezio) / 2;
	                    System.out.println("A área do trapézio é: " + areaTrapezio);
	                    break;

	                case 5:
	                    System.out.println("Saindo...");
	                    break;

	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	            sc.close();
	        } 

	       
	    }
	

