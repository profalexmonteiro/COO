package aula01;

import java.util.Scanner;

public class Repteis extends Animais {
	private String tipoEscama;
	private float compCalda;
	
		
	public String getTipoEscama() {
		return tipoEscama;
	}

	public void setTipoEscama(String tipoEscama) {
		this.tipoEscama = tipoEscama;
	}

	public float getCompCalda() {
		return compCalda;
	}

	public void setCompCalda(float compCalda) {
		this.compCalda = compCalda;
	}

	public void rastejar() {
		System.out.println("rastejando...");
	}
	

	public void cadastro(){
		super.cadastro();
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Tipo escama: ");
		this.setTipoEscama(console.nextLine());
		
		System.out.print("Comprimento da calda: ");
		this.setCompCalda(console.nextFloat());		
				
	}
	
    public void visualizarDados(){
		super.visualizarDados();
		
		System.out.println("Tipo escama: " + this.getTipoEscama());		
		
		System.out.print("Comprimento calda: " + this.getCompCalda());		
	} 
	
	public void menu(){
		Scanner console = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("================= Sistema Veterinario =================");
		
		System.out.println("- Repteis");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Visualizar Cadastro");
		System.out.print("Opção: ");
		
		opcao = console.nextInt();
		
		switch(opcao){
			case 1: this.cadastro();					
					break;
			case 2: this.visualizarDados();
					break;					
			default: System.out.println("Opcao invalida");
					break;
		}		
		
	}
	
}
