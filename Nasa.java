package ListaJava01;

import java.util.Scanner;

public class Nasa {
	
	    
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        
	        /*M�ludo 01 - Controle de tempo x funcion�rios:
	        	Mem�ria dispon�vel: 3 bytes
	        	Requisitos: Armazenar o ano atual da miss�o (max 9999), quantidade de funcion�rios envolvidos (max 100).
	         */
	        System.out.println("Informe o ano atual da miss�o");
	        short anoMissao = sc.nextShort();
	        sc.nextLine();
	        System.out.println("Informe a quantidade de funcion�rios");
	        byte func = sc.nextByte();
	       // M�ludo 02 - Controle de dist�ncia x velocidade:Mem�ria dispon�vel: 6 bytes
	        System.out.println("Informe a distancia sat�lite ficar� da terra (max 2 milh�es)"); 
	         int distancia = sc.nextInt();
	        System.out.println("Informe a velocidade do sat�lite (max 30.000 km/h");
	         short velocidade = sc.nextShort();
	         //M�ludo 03 - Status da miss�o:Requisitos: dist�ncia que ser� percorrida durante a miss�o em km (max 3 bilh�es de km) e calibragem das antenas (n�mero racional com precis�o de no m�nimo 14 casa decimais).
             System.out.println("A miss�o foi iniciado? Digite S-sim ou N-n�o");
            
             long distanciaPercorrida; 
             double calibragemAntenas; 

             System.out.print("A miss�o j� foi iniciada? (true/false): ");
             boolean missaoIniciada = sc.nextBoolean();

             System.out.print("Digite a dist�ncia a ser percorrida durante a miss�o (max 3 bilh�es): ");
             distanciaPercorrida = sc.nextLong();

             System.out.print("Digite a calibragem das antenas (n�mero racional com precis�o de 14 casas decimais): ");
             calibragemAntenas = sc.nextDouble();

             System.out.println("\n--- Resumo da Miss�o ---");
             System.out.println("Ano Atual: " +anoMissao);
             System.out.println("Quantidade de Funcion�rios: " + func);
             System.out.println("Dist�ncia da Terra: " + distancia + " km");
             System.out.println("Velocidade M�xima: " + velocidade + " km/h");
             System.out.println("Miss�o Iniciada: " + missaoIniciada);
             System.out.println("Dist�ncia a Percorrer: " + distanciaPercorrida + " km");
             System.out.println("Calibragem das Antenas: " + calibragemAntenas);

             sc.close();
	    }
}