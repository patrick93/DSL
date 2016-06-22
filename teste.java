package org.ufrj.teste

public class teste {
	private String teste;
	private int prop2;
	private boolean prop3;

	public teste(int prop2, String teste, boolean prop3){
		this.prop2 = prop2;
		this.teste = teste;
		this.prop3 = prop3;
	}

	public int getProp2(){
		return prop2;
	}

	public void setProp2(int prop2){
		this.prop2 = prop2;
	}

	public String getTeste(){
		return teste;
	}

	public void setTeste(String teste){
		this.teste = teste;
	}

	public boolean getProp3(){
		return prop3;
	}

	public void setProp3(boolean prop3){
		this.prop3 = prop3;
	}

}
