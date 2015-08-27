package br.com.elo7.tarefa.modelos;

import java.util.List;

import br.com.elo7.tarefa.enums.DirecaoDaSonda;
import br.com.elo7.tarefa.enums.InstrucoesDaSonda;

public class Sonda {

	private Coordenada coordenada;
	private DirecaoDaSonda direcao;
	private List<InstrucoesDaSonda> instrucoes;

	public Sonda(Coordenada coordenada, DirecaoDaSonda direcao,
			List<InstrucoesDaSonda> instrucoes) {
		this.coordenada = coordenada;
		this.direcao = direcao;
		this.instrucoes = instrucoes;
	}

	public Coordenada getCoordenada() {
		return coordenada;
	}
	public void setCoordenada(Coordenada coordenada) {
		this.coordenada = coordenada;
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

	public void executaInstrucao() {
		for (InstrucoesDaSonda instrucoes : this.getInstrucoes()) {
			if (instrucoes.isL()) {
				if (this.getDirecao().isN()) {
					this.setDirecao(DirecaoDaSonda.W);
				} else if (this.getDirecao().isS()) {
					this.setDirecao(DirecaoDaSonda.E);
				} else if (this.getDirecao().isW()) {
					this.setDirecao(DirecaoDaSonda.S);
				} else if (this.getDirecao().isE()) {
					this.setDirecao(DirecaoDaSonda.N);
				}
			}
			if (instrucoes.isR()) {
				if (this.getDirecao().isN()) {
					this.setDirecao(DirecaoDaSonda.E);
				} else if (this.getDirecao().isS()) {
					this.setDirecao(DirecaoDaSonda.W);
				} else if (this.getDirecao().isW()) {
					this.setDirecao(DirecaoDaSonda.N);
				} else if (this.getDirecao().isE()) {
					this.setDirecao(DirecaoDaSonda.S);
				}
			}
			// INFO: Seria interessante validar as instruções para que a sonda
			// não se mova para fora do planalto.
			if (instrucoes.isM()) {
				if (this.getDirecao().isN()) {
					this.getCoordenada().setY(this.getCoordenada().getY() + 1);
				} else if (this.getDirecao().isS()) {
					this.getCoordenada().setY(this.getCoordenada().getY() - 1);
				} else if (this.getDirecao().isW()) {
					this.getCoordenada().setX(this.getCoordenada().getX() - 1);
				} else if (this.getDirecao().isE()) {
					this.getCoordenada().setX(this.getCoordenada().getX() + 1);
				}
			}
		}
	}

}