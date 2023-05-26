package application;
import java.util.Locale;
import java.util.Scanner;

import entities.Aluguel;

public class Project {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		Locale.setDefault(Locale.US);
		
		Aluguel [] vect = new Aluguel [10];
		
		Aluguel a = new Aluguel ("elizeu" , "elizeu@gmail.com");
		
		System.out.print("How many rooms will be rented? ");
		int n = sc.nextInt();
		
		for (int i = 1 ; i <=n ; i++) {
			System.out.println("\nRent #"+i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.next(); //nao possui espacos 
			System.out.print("Room: ");
			int roomNumber = sc.nextInt();
			
			Aluguel alug = new Aluguel (name , email);
			
			vect[roomNumber] = alug; //o numero do quarto sera salvo na posicao correspondente do vetor 
			
		}
		
		System.out.println("\nBussy rooms: ");
		
		for (int i = 0; i < 10 ; i++) {
			if(vect[i] != null) {
				System.out.println(i+": "+vect[i]);
			}
			
		}
		
		
		sc.close();
	}

}
