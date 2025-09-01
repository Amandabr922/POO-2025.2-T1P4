package br.edu.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		 double dep, rend, total;
		 
		 Scanner scanner = new Scanner(System.in);
		 
		
		 System.out.print("Digite o valor do depósito: ");
	        dep = scanner.nextDouble();

	        System.out.print("Digite a taxa: ");
	        double taxa = scanner.nextDouble();

	        
	        rend = dep * taxa / 100;

	        
	        total = dep + rend;

	        
	        System.out.println("Rendimento: " + rend);
	        System.out.println("Total (depósito + rendimento): " + total);
	  

	}

}
