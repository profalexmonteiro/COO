package aula01;

import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;


public class App {
	
	static final Runtime run = Runtime.getRuntime();
	
	public static void cls() {
		try {
	        if (System.getProperty("os.name").contains("Windows"))
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        else
	            Runtime.getRuntime().exec("clear");
	    } catch (IOException | InterruptedException ex) {}
	}
	
	public static void menuRepteis(Funcionario func, ArrayList<Repteis> repteis){
		Scanner console = new Scanner(System.in);
		
		int opcao;
		
		cls();
				
		System.out.println("================= Sistema Veterinario =================");
		
		System.out.println("- Repteis");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Visualizar Cadastro");
		System.out.print("Opção: ");
		
		opcao = console.nextInt();
		
		switch(opcao){			
			case 1: repteis.add(func.cadastroReptil());			
					break;
			case 2: func.visualizarRepteis(repteis);
					break;					
			default: System.out.println("Opcao invalida");
					break;
		}		
		
	}
	
	public static void menuAves(Funcionario func, ArrayList<Aves> aves) {
		Scanner console = new Scanner(System.in);
		
		int opcao;
		
		cls();
		
		System.out.println("================= Sistema Veterinario =================");
		
		System.out.println("- Aves");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Visualizar Cadastro");
		System.out.print("Opção: ");
		
		opcao = console.nextInt();
		
		switch(opcao){
			case 1: 			
					aves.add(func.cadastroAve());
					break;
			case 2: func.visualizarAves(aves);
					break;						
			default: System.out.println("Opcao invalida");
					break;
		}				
	}
	
	
	public static void menuMamifero(Funcionario func, ArrayList<Mamiferos> mamiferos) {
		Scanner console = new Scanner(System.in);
		
		int opcao;
		
	
		cls();
		System.out.println("================= Sistema Veterinario =================");		
		System.out.println("- Mamiferos");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Visualizar Cadastro");
		System.out.print("Opção: ");
		
		opcao = console.nextInt();
		
		switch(opcao){
			case 1: mamiferos.add(func.cadastroMamifero());					
					break;
			case 2: func.visualizarMamiferos(mamiferos);
					break;					
			default: System.out.println("Opcao invalida");
					break;
		}
		
	}

		
	
	private static void menu(){
		
				
		ArrayList<Aves> aves = new ArrayList<Aves>();		
        ArrayList<Mamiferos> mamiferos = new ArrayList<Mamiferos>();
        ArrayList<Repteis> repteis = new ArrayList<Repteis>();
		
		Scanner console = new Scanner(System.in);
		
		int opcao;
		
		Funcionario func =  new Funcionario();
		
		
		for(;;) {
			
			
			cls();
		System.out.println("================= Sistema Veterinario =================");
		
		System.out.println("1 - Aves");
		System.out.println("2 - Repteis");
		System.out.println("3 - Mamiferos");
		System.out.println("4 - Outros");		
		System.out.print("Opção: ");
		
		opcao = console.nextInt();
		
		switch(opcao){
			case 1: menuAves(func,aves);						
					break;
			case 2: 
				    menuRepteis(func,repteis);
					break;
			case 3: 
				    menuMamifero(func,mamiferos);
					break;
			default: System.out.println("Opcao invalida");
		}		
		
		}
	}
	
	
	public static void main(String[] args) {
		
		
			menu();
		
				
	}

}
