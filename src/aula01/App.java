package aula01;

import java.util.Scanner;
import java.util.ArrayList;

public class App {

		
	
	private static void menu(){
		
		Aves ave = new Aves();
		
		
		//Repteis reptel = new Repteis();
		//Mamiferos  mamifero = new Mamiferos();
		
		ArrayList<Aves> aves = new ArrayList<Aves>();
		
		
       //ArrayList<Mamiferos> mamiferos = new ArrayList<Mamiferos>();
       //ArrayList<Repteis> repteis = new ArrayList<Repteis>();
		
		Scanner console = new Scanner(System.in);
		
		int opcao;
		
		
		for(;;) {
			
		System.out.println("================= Sistema Veterinario =================");
		
		System.out.println("1 - Aves");
		System.out.println("2 - Repteis");
		System.out.println("3 - Mamiferos");
		System.out.println("4 - Outros");		
		System.out.print("Opção: ");
		
		opcao = console.nextInt();
		
		switch(opcao){
			case 1: ave.menu(aves);						
					break;
			case 2: 
//					reptel.menu(repteis);
					break;
			case 3: 
//					mamifero.menu(mamiferos);
					break;
			default: System.out.println("Opcao invalida");
		}		
		
		}
	}
	
	
	public static void main(String[] args) {
		
		
			menu();
		
				
	}

}
