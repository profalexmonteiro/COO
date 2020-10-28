package aula01;

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
			
}
