package br.com.elo7.tarefa.enums;

/**
 * Enum representando a direção cardinal para qual a sonda aponta, seguindo a
 * rosa dos ventos em inglês.
 */
public enum DirecaoDaSonda {
	N, // Direção Norte.
	S, // Direção Sul.
	W, // Direção Leste.
	E; // Direção Oeste.
	
	public boolean isN() {
		return this.equals(N);
	}
	
	public boolean isS() {
		return this.equals(S);
	}
	
	public boolean isW() {
		return this.equals(W);
	}
	
	public boolean isE() {
		return this.equals(E);
	}
}
