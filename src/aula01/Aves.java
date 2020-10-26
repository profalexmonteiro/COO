package aula01;

import java.util.Scanner;
import java.util.ArrayList;

public class Aves extends Animais {
	
	private String corPenas;
	private float tamanhoPenas;
	
	public String getCorPenas() {
		return corPenas;
	}
	public void setCorPenas(String corPenas) {
		this.corPenas = corPenas;
	}
	public float getTamanhoPenas() {
		return tamanhoPenas;
	}
	public void setTamanhoPenas(float tamanhoPenas) {
		this.tamanhoPenas = tamanhoPenas;
	}		
	
	public void botarOvo() {
		System.out.println("botando Ovo");
	}
	
	public void cadastro(){
		super.cadastro();
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Cor das penas: ");
		this.setCorPenas(console.nextLine());
		
		System.out.print("Tamanho das penas: ");
		this.setTamanhoPenas(console.nextFloat());		
				
	}
	
    public void visualizarDados(ArrayList<Aves> aves){
    	
    	int tamanho  = aves.size();
    	
    	 if(tamanho > 0) {
    		 for(int i= 0; i< tamanho; i++) {
    			 Aves aveCadastrada =  aves.get(i);
        	
    			 System.out.println("Nome:  " +aveCadastrada.getNome());
    			 
    			 System.out.println("Idade:  " + aveCadastrada.getIdade());
    			 
    			 System.out.println("Cor dos olhos:  " + aveCadastrada.getCorOlhos());
    			 
    			 System.out.println("Peso:  " + aveCadastrada.getPeso());  			 
    			 
    			 System.out.println("Cor das penas: " + aveCadastrada.getCorPenas());		
    		
    			 System.out.print("Tamanho das penas: " + aveCadastrada.getTamanhoPenas());
        	
        	}
        }
    	 else 
    	 {
    		 System.out.println("Nenhuma aves cadastrada");
    	 }
    			

		
		
	} 
	
	public void menu(ArrayList<Aves> aves){
		Scanner console = new Scanner(System.in);
		
		int opcao;
		
		System.out.println("================= Sistema Veterinario =================");
		
		System.out.println("- Aves");
		System.out.println("1 - Cadastro");
		System.out.println("2 - Visualizar Cadastro");
		System.out.print("Opção: ");
		
		opcao = console.nextInt();
		
		switch(opcao){
			case 1: this.cadastro();				
					aves.add(this);
					break;
			case 2: this.visualizarDados();
					break;					
			default: System.out.println("Opcao invalida");
					break;
		}		
		
		
	}
		
		
	

}
