package br.com.elo7.tarefa.enums;

public enum DirecaoDaSonda {
	N, S, W, E;
	
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
