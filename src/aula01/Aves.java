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
		
	

}
