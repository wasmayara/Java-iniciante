package ListaJava01;

import java.util.Scanner;

public class Nasa {
	
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        /*Móludo 01 - Controle de tempo x funcionários:
	        	Memória disponível: 3 bytes
	        	Requisitos: Armazenar o ano atual da missão (max 9999), quantidade de funcionários envolvidos (max 100).
	         */
	        System.out.println("Informe o ano atual da missão");
	        short anoMissao = sc.nextShort();
	        sc.nextLine();
	        System.out.println("Informe a quantidade de funcionários");
	        byte func = sc.nextByte();
	       // Móludo 02 - Controle de distância x velocidade:Memória disponível: 6 bytes
	        System.out.println("Informe a distancia satélite ficará da terra (max 2 milhões)"); 
	         int distancia = sc.nextInt();
	        System.out.println("Informe a velocidade do satélite (max 30.000 km/h");
	         short velocidade = sc.nextShort();
	         //Móludo 03 - Status da missão:Requisitos: distância que será percorrida durante a missão em km (max 3 bilhões de km) e calibragem das antenas (número racional com precisão de no mínimo 14 casa decimais).
             System.out.println("A missão foi iniciado? Digite S-sim ou N-não");
            
             long distanciaPercorrida; 
             double calibragemAntenas; 

             System.out.print("A missão já foi iniciada? (true/false): ");
             boolean missaoIniciada = sc.nextBoolean();

             System.out.print("Digite a distância a ser percorrida durante a missão (max 3 bilhões): ");
             distanciaPercorrida = sc.nextLong();

             System.out.print("Digite a calibragem das antenas (número racional com precisão de 14 casas decimais): ");
             calibragemAntenas = sc.nextDouble();

             System.out.println("\n--- Resumo da Missão ---");
             System.out.println("Ano Atual: " +anoMissao);
             System.out.println("Quantidade de Funcionários: " + func);
             System.out.println("Distância da Terra: " + distancia + " km");
             System.out.println("Velocidade Máxima: " + velocidade + " km/h");
             System.out.println("Missão Iniciada: " + missaoIniciada);
             System.out.println("Distância a Percorrer: " + distanciaPercorrida + " km");
             System.out.println("Calibragem das Antenas: " + calibragemAntenas);

             sc.close();
	    }
}