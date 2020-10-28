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
	
	
}
