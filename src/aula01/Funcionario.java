package aula01;

import java.util.ArrayList;
import java.util.Scanner;

public class Funcionario extends Pessoa{

	public Aves cadastroAve(){
		
		Aves ave=  new Aves();
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Nome: ");
		ave.setNome(console.nextLine());
		
		System.out.print("Cor dos olhos: ");
		ave.setCorOlhos(console.nextLine());
		
		System.out.print("Idade: ");
		ave.setIdade(console.nextInt());
		
		System.out.print("Peso: ");
		ave.setPeso(console.nextFloat());
				
		System.out.print("Cor das penas: ");
		ave.setCorPenas(console.nextLine());
		
		System.out.print("Tamanho das penas: ");
		ave.setTamanhoPenas(console.nextFloat());		
		
		return ave;
				
	}
	
	 public void visualizarAves(Aves ave){
		 
		 System.out.println("Nome:  " +ave.getNome());
	 
		 System.out.println("Idade:  " + ave.getIdade());
	 
		 System.out.println("Cor dos olhos:  " + ave.getCorOlhos());
	 
		 System.out.println("Peso:  " + ave.getPeso());  			 
	 
		 System.out.println("Cor das penas: " + ave.getCorPenas());		

		 System.out.print("Tamanho das penas: " + ave.getTamanhoPenas());
	 
	 }
	 
   
	 public void visualizarAves(ArrayList<Aves> aves){
    	int tamanho  = aves.size();
    	
    	 if(tamanho > 0) {
    		 for(int i= 0; i< tamanho; i++) {
    			 Aves aveCadastrada =  aves.get(i);
    			 
    			 visualizarAves(aveCadastrada);
    			        	
        	}
        }
    	 else 
    	 {
    		 System.out.println("Nenhuma ave cadastrada");
    	 }    						
	} 
	
	
	public Mamiferos cadastroMamifero(){
		
		Mamiferos mami = new Mamiferos();
		
		Scanner console = new Scanner(System.in);
		
		System.out.print("Nome: ");
		mami.setNome(console.nextLine());
		
		System.out.print("Cor dos olhos: ");
		mami.setCorOlhos(console.nextLine());
		
		System.out.print("Idade: ");
		mami.setIdade(console.nextInt());
		
		System.out.print("Peso: ");
		mami.setPeso(console.nextFloat());		
		
		System.out.print("Cor dos pelos: ");
		mami.setCorPelos(console.nextLine());
		
		System.out.print("Comprimento dos pelos: ");
		mami.setCompPelos(console.nextFloat());
				
		return mami;
	}
	
    public void visualizarMamifero(Mamiferos mami){
    	
    	System.out.println("Nome: " + mami.getNome());
		
		System.out.println("Idade: " + mami.getIdade());
				
		System.out.println("Peso: " + mami.getPeso());
				
		System.out.println("Cor dos olhos: " + mami.getCorOlhos());
		
		System.out.println("Cor dos pelos: " + mami.getCorPelos());		
		
		System.out.println("Comprimento dos pelos: " + mami.getCompPelos());		
	} 
    
   public void visualizarMamiferos(ArrayList<Mamiferos> mamiferos){
    	
    	int tamanho  = mamiferos.size();
    	
    	 if(tamanho > 0) {
    		 for(int i= 0; i< tamanho; i++) {
    			 Mamiferos mamiferoCadastrado =  mamiferos.get(i);
        	
    			visualizarMamifero(mamiferoCadastrado);
        	
        	}
        }
    	 else 
    	 {
    		 System.out.println("Nenhuma ave cadastrada");
    	 }    						
	}
   
   public Repteis cadastroReptil(){		
		
		Scanner console = new Scanner(System.in);
		Repteis reptel = new Repteis();
		
		
		System.out.print("Nome: ");
		reptel.setNome(console.nextLine());
		
		System.out.print("Cor dos olhos: ");
		reptel.setCorOlhos(console.nextLine());
		
		System.out.print("Idade: ");
		reptel.setIdade(console.nextInt());
		
		System.out.print("Peso: ");
		reptel.setPeso(console.nextFloat());		
		
		System.out.print("Tipo escama: ");
		reptel.setTipoEscama(console.nextLine());
		
		System.out.print("Comprimento da calda: ");
		reptel.setCompCalda(console.nextFloat());		
		
		return reptel;
				
	}
	
   public void visualizarReptil(Repteis reptel){
	   	System.out.println("Nome: " + reptel.getNome());
		
		System.out.println("Idade: " + reptel.getIdade());
				
		System.out.println("Peso: " + reptel.getPeso());
				
		System.out.println("Cor dos olhos: " + reptel.getCorOlhos());
		
		System.out.println("Tipo escama: " + reptel.getTipoEscama());		
		
		System.out.print("Comprimento calda: " + reptel.getCompCalda());		
	} 
   
   public void visualizarRepteis(ArrayList<Repteis> repteis){
   	
   	int tamanho  = repteis.size();
   	
   	 if(tamanho > 0) {
   		 for(int i= 0; i< tamanho; i++) {
   			 Repteis reptelCadastrado =  repteis.get(i);
       	
   			visualizarReptil(reptelCadastrado);
       	
       	}
       }
   	 else 
   	 {
   		 System.out.println("Nenhum reptil cadastrado");
   	 }    						
	}
	
}
