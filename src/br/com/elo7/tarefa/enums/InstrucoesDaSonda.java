package br.com.elo7.tarefa.enums;

/**
 * Enum representando as intruções a serem executadas pela sonda espacial.
 */
public enum InstrucoesDaSonda {
	L, // Instrução que faz a sonda rotacionar 90 graus no sentido anti-horário.
	R, // Instrução que faz a sonda rotacionar 90 graus no sentido horário.
	M; // Instrução que faz a sonda se movimentar segundo a sua direção atual.
	
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
