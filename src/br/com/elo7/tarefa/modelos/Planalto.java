package br.com.elo7.tarefa.modelos;

/**
 * Classe representando o planalto de marte que será explorado penas sondas
 * espaciais.
 */
public class Planalto {
	
	private Coordenada coordenadaInferiorEsquerda;
	private Coordenada coordenadaSuperiorDireita;
	
	public Planalto () {};
	
	public Planalto(Coordenada coordenadaInferiorEsquerda,
			Coordenada coordenadaSuperiorEsquerda) {
		this.coordenadaInferiorEsquerda = coordenadaInferiorEsquerda;
		this.coordenadaSuperiorDireita = coordenadaSuperiorEsquerda;
	}
	
	public Coordenada getCoordenadaSuperiorDireita() {
		return coordenadaSuperiorDireita;
	}
	public void setCoordenadaSuperiorDireita(
			Coordenada coordenadaSuperiorDireita) {
		this.coordenadaSuperiorDireita = coordenadaSuperiorDireita;
	}
	public Coordenada getCoordenadaInferiorEsquerda() {
		return coordenadaInferiorEsquerda;
	}
	public void setCoordenadaInferiorEsquerda(
			Coordenada coordenadaInferiorEsquerda) {
		this.coordenadaInferiorEsquerda = coordenadaInferiorEsquerda;
	}
	
}
