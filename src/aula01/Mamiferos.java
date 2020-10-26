package aula01;

import java.util.Scanner;

public class Mamiferos extends Animais{

	private String corPelos;
	private float compPelos;
		
	public String getCorPelos() {
		return corPelos;
	}

	public void setCorPelos(String corPelos) {
		this.corPelos = corPelos;
	}

	public float getCompPelos() {
		return compPelos;
	}

	public void setCompPelos(float compPelos) {
		this.compPelos = compPelos;
	}

	public void sentar() {
		System.out.println("sentar");
	}
	
	public void amamentar() {
		System.out.println("amamentando");
	}
	
	public void cadastro(){
		super.cadastro();
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Cor dos pelos: ");
		this.setCorPelos(console.nextLine());
		
		System.out.print("Comprimento dos pelos: ");
		this.setCompPelos(console.nextFloat());
				
	}
	
    public void visualizarDados(){
		super.visualizarDados();
		
		System.out.println("Cor dos pelos: " + this.getCorPelos());		
		
		System.out.print("Comprimento dos pelos: " + this.getCompPelos());		
	} 
	
	public void menu(){
		Scanner console = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("================= Sistema Veterinario =================");
		
		System.out.println("- Mamiferos");
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
