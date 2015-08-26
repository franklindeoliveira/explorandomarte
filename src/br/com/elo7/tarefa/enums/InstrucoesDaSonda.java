package br.com.elo7.tarefa.enums;

public enum InstrucoesDaSonda {
	L, R, M;
	
	public boolean isL() {
		return this.equals(L);
	}
	
	public boolean isR() {
		return this.equals(R);
	}
	
	public boolean isM() {
		return this.equals(M);
	}
}
