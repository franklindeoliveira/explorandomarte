package br.com.elo7.tarefa.modelos;

public class PosicaoDaSonda {
	
	private Integer posicaoX;
	private Integer posicaoY;
	
	public PosicaoDaSonda(Integer posicaoX, Integer posicaoY) {
		this.posicaoX = posicaoX;
		this.posicaoY = posicaoY;
	}
	
	public Integer getPosicaoX() {
		return posicaoX;
	}
	public void setPosicaoX(Integer posicaoX) {
		this.posicaoX = posicaoX;
	}
	public Integer getPosicaoY() {
		return posicaoY;
	}
	public void setPosicaoY(Integer posicaoY) {
		this.posicaoY = posicaoY;
	}
	

}
