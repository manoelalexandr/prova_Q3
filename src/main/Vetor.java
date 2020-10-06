package main;

import java.util.Scanner;

public class Vetor {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner (System.in);
		int []par = new int [10]; 
		System.out.println("Informe 10 numeros inteiros: ");

		for(int i =0; i<10; i++) {
			par[i] = sc.nextInt();
		}
		
		System.out.println("São pares: ");
		for(int i =0; i<10; i++) {
			if(par[i]%2 == 0) {
				System.out.println(par[i]);
			}
		}
			
		sc.close();
	}

	}
