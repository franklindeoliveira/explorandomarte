package br.com.elo7.tarefa.parsers;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.elo7.tarefa.enums.DirecaoDaSonda;
import br.com.elo7.tarefa.enums.InstrucoesDaSonda;
import br.com.elo7.tarefa.modelos.Planalto;
import br.com.elo7.tarefa.modelos.PosicaoDaSonda;
import br.com.elo7.tarefa.modelos.Sonda;

public class EntradaParser {
	
	private Planalto planalto;
	private List<Sonda> sondas = new ArrayList<Sonda>();
	
	public EntradaParser(String entrada) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new FileReader("src/entrada.txt")).useDelimiter("\\n");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (scanner.hasNext()) {
			String linha = scanner.next();
			PosicaoDaSonda coordenadaInferiorEsquerda = new PosicaoDaSonda(0, 0);
			PosicaoDaSonda coordenadaSuperiorDireita = new PosicaoDaSonda(Integer.parseInt(linha.split(" ")[0]), Integer.parseInt(linha.split(" ")[1]));
			planalto = new Planalto(coordenadaInferiorEsquerda, coordenadaSuperiorDireita);
		}
		
		while (scanner.hasNext()) {
			
			PosicaoDaSonda posicao = null;
			DirecaoDaSonda direcao = null;
			List<InstrucoesDaSonda> instrucoes = new ArrayList<InstrucoesDaSonda>();
			
			String[] sondaSplit = scanner.next().split(" ");
			
			posicao = new PosicaoDaSonda(Integer.parseInt(sondaSplit[0]), Integer.parseInt(sondaSplit[1]));
			
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
