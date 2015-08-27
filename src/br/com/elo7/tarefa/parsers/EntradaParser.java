package br.com.elo7.tarefa.parsers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.elo7.tarefa.enums.DirecaoDaSonda;
import br.com.elo7.tarefa.enums.InstrucoesDaSonda;
import br.com.elo7.tarefa.modelos.Planalto;
import br.com.elo7.tarefa.modelos.Coordenada;
import br.com.elo7.tarefa.modelos.Sonda;

/**
 * Classe responsável por fazer o parser dos dados de entrada e armazená-los nas
 * classes de modelo Planalto e Sonda.
 */
public class EntradaParser {
	
	private Planalto planalto;
	private List<Sonda> sondas;
	
	public EntradaParser(String arquivo) {
		carregaEntrada(arquivo);
	}
	
	private void carregaEntrada(String arquivo) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileReader(arquivo)).useDelimiter("\\n");
			carregaPlanalto(scanner);
			carregaSondas(scanner);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	private void carregaPlanalto(Scanner scanner) {
		if (scanner.hasNext()) {
			String linha = scanner.next();
			Coordenada coordenadaInferiorEsquerda = new Coordenada(0, 0);
			Coordenada coordenadaSuperiorDireita = new Coordenada(Integer.parseInt(linha.split(" ")[0]), Integer.parseInt(linha.split(" ")[1]));
			planalto = new Planalto(coordenadaInferiorEsquerda, coordenadaSuperiorDireita);
		}
	}
	
	private void carregaSondas(Scanner scanner) {
		sondas = new ArrayList<Sonda>();
		while (scanner.hasNext()) {
			Coordenada posicao = null;
			DirecaoDaSonda direcao = null;
			List<InstrucoesDaSonda> instrucoes = new ArrayList<InstrucoesDaSonda>();
			
			String[] sondaSplit = scanner.next().split(" ");
			
			posicao = new Coordenada(Integer.parseInt(sondaSplit[0]), Integer.parseInt(sondaSplit[1]));
			
			String direcaoString = sondaSplit[2];
			if (direcaoString.equals("N")) {
				direcao = DirecaoDaSonda.N;
			} else if (direcaoString.equals("S")) {
				direcao = DirecaoDaSonda.S;
			} else if (direcaoString.equals("W")) {
				direcao = DirecaoDaSonda.W;
			} else if (direcaoString.equals("E")) {
				direcao = DirecaoDaSonda.E;
			}
			
			char[] instrucoesToCharArray = scanner.next().toCharArray();
			for (char instrucao : instrucoesToCharArray) {
				if (instrucao == 'L') {// rotacao esquerda
					instrucoes.add(InstrucoesDaSonda.L);
				} else if (instrucao == 'R') {// rotacao direita
					instrucoes.add(InstrucoesDaSonda.R);
				} else if (instrucao == 'M') {// movimento
					instrucoes.add(InstrucoesDaSonda.M);
				}
			}
			sondas.add(new Sonda(posicao, direcao, instrucoes));			
		}
	}
	
	public Planalto getPlanalto() {
		return planalto;
	}

	public List<Sonda> getSondas() {
		return sondas;
	}

}
