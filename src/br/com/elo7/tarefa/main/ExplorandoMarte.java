package br.com.elo7.tarefa.main;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import br.com.elo7.tarefa.enums.DirecaoDaSonda;
import br.com.elo7.tarefa.enums.InstrucoesDaSonda;
import br.com.elo7.tarefa.modelos.Sonda;
import br.com.elo7.tarefa.parsers.EntradaParser;

public class ExplorandoMarte {
	
	private static final String ARQUIVO_ENTRADA = "src/entrada.txt";
	private static final String ARQUIVO_SAIDA = "src/saida.txt";

	public static void main(String[] args) throws FileNotFoundException {
		
		List<Sonda> sondas = new EntradaParser(ARQUIVO_ENTRADA).getSondas();
		for (Sonda sonda : sondas) {
			for (InstrucoesDaSonda instrucoes : sonda.getInstrucoes()) {
				executaInstrucao(sonda, instrucoes);
			}
		}
		escreveSaida(sondas);
		
	}
	
	public static void executaInstrucao(Sonda sonda, InstrucoesDaSonda instrucoes) {
		if (instrucoes.isL()) {
			if (sonda.getDirecao().isN()) {
				sonda.setDirecao(DirecaoDaSonda.W);
			} else if (sonda.getDirecao().isS()) {
				sonda.setDirecao(DirecaoDaSonda.E);
			} else if (sonda.getDirecao().isW()) {
				sonda.setDirecao(DirecaoDaSonda.S);
			} else if (sonda.getDirecao().isE()) {
				sonda.setDirecao(DirecaoDaSonda.N);
			}
		}
		if (instrucoes.isR()) {
			if (sonda.getDirecao().isN()) {
				sonda.setDirecao(DirecaoDaSonda.E);
			} else if (sonda.getDirecao().isS()) {
				sonda.setDirecao(DirecaoDaSonda.W);
			} else if (sonda.getDirecao().isW()) {
				sonda.setDirecao(DirecaoDaSonda.N);
			} else if (sonda.getDirecao().isE()) {
				sonda.setDirecao(DirecaoDaSonda.S);
			}
		}
		if (instrucoes.isM()) {
			if (sonda.getDirecao().isN()) {
				sonda.getPosicao().setPosicaoY(sonda.getPosicao().getPosicaoY() + 1);
			} else if (sonda.getDirecao().isS()) {
				sonda.getPosicao().setPosicaoY(sonda.getPosicao().getPosicaoY() - 1);
			} else if (sonda.getDirecao().isW()) {
				sonda.getPosicao().setPosicaoX(sonda.getPosicao().getPosicaoX() - 1);
			} else if (sonda.getDirecao().isE()) {
				sonda.getPosicao().setPosicaoX(sonda.getPosicao().getPosicaoX() + 1);
			}
		}
	}
	
	public static void escreveSaida(List<Sonda> sondas) {
		File file = new File(ARQUIVO_SAIDA);
		try {
			FileWriter writer = new FileWriter(file);
			for (Sonda sonda : sondas) {
				writer.write(sonda.getPosicao().getPosicaoX().toString() + " ");
				writer.write(sonda.getPosicao().getPosicaoY().toString() + " ");
				writer.write(sonda.getDirecao().name() + "\n");
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}