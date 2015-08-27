package br.com.elo7.tarefa.modelos;

/**
 * Classe representando uma coordenada no plano xy.
 */
public class Coordenada {
	
	private Integer x;
	private Integer y;
	
	public Coordenada(Integer x, Integer y) {
		this.x = x;
		this.y = y;
	}
	
	public Integer getX() {
		return x;
	}
	public void setX(Integer x) {
		this.x = x;
	}
	public Integer getY() {
		return y;
	}
	public void setY(Integer y) {
		this.y = y;
	}	

}
