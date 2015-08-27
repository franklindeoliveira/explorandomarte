package br.com.elo7.tarefa.main;

import java.util.List;

import br.com.elo7.tarefa.modelos.Sonda;
import br.com.elo7.tarefa.parsers.EntradaParser;
import br.com.elo7.tarefa.writers.SaidaWriter;

/**
 * Classe principal responsável por iniciar o processo de envio dos comandos às
 * sondas espaciais, fazendo com que as mesmas se movimentem sobre o planalto de
 * marte a partir de dados contidos no arquivo src/entrada.txt.
 */
public class ExplorandoMarte {
	
	public static void main(String[] args) {
		
		// Carrega os dados de entrada.
		EntradaParser entrada = new EntradaParser("src/entrada.txt");
		
		// Executa as instruções enviadas pela NASA.
		List<Sonda> sondas = entrada.getSondas();
		for (Sonda sonda : sondas) {
			sonda.executaInstrucao();
		}
		
		// Escreve os dados de saída.
		SaidaWriter.escreveSaida("src/saida.txt", sondas);

	}

}