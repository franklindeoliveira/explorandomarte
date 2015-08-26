package br.com.elo7.tarefa.modelos;

import java.util.List;

import br.com.elo7.tarefa.enums.DirecaoDaSonda;
import br.com.elo7.tarefa.enums.InstrucoesDaSonda;

public class Sonda {
	
	private PosicaoDaSonda posicao;
	private DirecaoDaSonda direcao;
	private List<InstrucoesDaSonda> instrucoes;
	
	public Sonda(PosicaoDaSonda posicao, DirecaoDaSonda direcao, List<InstrucoesDaSonda> instrucoes) {
		this.posicao = posicao;
		this.direcao = direcao;
		this.instrucoes = instrucoes;
	}
	
	public PosicaoDaSonda getPosicao() {
		return posicao;
	}
	public void setPosicao(PosicaoDaSonda posicao) {
		this.posicao = posicao;
	}
	public DirecaoDaSonda getDirecao() {
		return direcao;
	}
	public void setDirecao(DirecaoDaSonda direcao) {
		this.direcao = direcao;
	}
	public List<InstrucoesDaSonda> getInstrucoes() {
		return instrucoes;
	}
	public void setInstrucoes(List<InstrucoesDaSonda> instrucoes) {
		this.instrucoes = instrucoes;
	}

}