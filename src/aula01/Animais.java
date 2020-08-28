package aula01;
import java.util.Scanner;

public class Animais {
	private String nome;
	private int idade;
	private float peso;
	private String corOlhos;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	public String getCorOlhos() {
		return corOlhos;
	}
	
	public void setCorOlhos(String corOlhos) {
		this.corOlhos = corOlhos;
	}
	
	public void comer(String alimento) {
		System.out.println("Comendo: " + alimento);
	}
	
	public void dormir() {
		System.out.println("zzZZZzzZZZzZZZzzZZ");
	}	
	
	public void cadastro() {
		Scanner console = new Scanner(System.in);
		System.out.println("Cadastro de Animal");
		
		System.out.print("Nome: ");
		this.setNome(console.nextLine());
		
		System.out.print("Cor dos olhos: ");
		this.setCorOlhos(console.nextLine());
		
		System.out.print("Idade: ");
		this.setIdade(console.nextInt());
		
		System.out.print("Peso: ");
		this.setPeso(console.nextFloat());
		
		
	}
	
	public void visualizarDados() {
		System.out.println("Dados de Animal");
		//Método imprime a string "Nome: " concatenada com o atributo nome da Classe animal
		System.out.println("Nome: " + getNome());
		
		System.out.println("Idade: " + getIdade());
				
		System.out.println("Peso: " + getPeso());
				
		System.out.println("Cor dos olhos: " + getCorOlhos());
				
	}
		
	
}
