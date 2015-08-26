package br.com.elo7.tarefa.modelos;

public class Planalto {
	
	private PosicaoDaSonda coordenadaInferiorEsquerda;
	private PosicaoDaSonda coordenadaSuperiorDireita;
	
	
	public Planalto(PosicaoDaSonda coordenadaInferiorEsquerda, PosicaoDaSonda coordenadaSuperiorEsquerda) {
		this.coordenadaInferiorEsquerda = coordenadaInferiorEsquerda;
		this.coordenadaSuperiorDireita = coordenadaSuperiorEsquerda;
	}
	
	public PosicaoDaSonda getCoordenadaSuperiorDireita() {
		return coordenadaSuperiorDireita;
	}
	public void setCoordenadaSuperiorDireita(
			PosicaoDaSonda coordenadaSuperiorDireita) {
		this.coordenadaSuperiorDireita = coordenadaSuperiorDireita;
	}
	public PosicaoDaSonda getCoordenadaInferiorEsquerda() {
		return coordenadaInferiorEsquerda;
	}
	public void setCoordenadaInferiorEsquerda(
			PosicaoDaSonda coordenadaInferiorEsquerda) {
		this.coordenadaInferiorEsquerda = coordenadaInferiorEsquerda;
	}
	
}
