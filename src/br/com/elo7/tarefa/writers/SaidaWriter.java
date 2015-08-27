package br.com.elo7.tarefa.writers;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import br.com.elo7.tarefa.modelos.Sonda;

/**
 * Classe responsável por escrever em um arquivo os dados de saída das sondas
 * espaciais após receberem as instruções da NASA.
 */
public class SaidaWriter {
	
	private SaidaWriter() {}
	
	public static void escreveSaida(String saida, List<Sonda> sondas) {
		File file = new File(saida);
		try {
			FileWriter writer = new FileWriter(file);
			for (Sonda sonda : sondas) {
				writer.write(sonda.getCoordenada().getX().toString() + " ");
				writer.write(sonda.getCoordenada().getY().toString() + " ");
				writer.write(sonda.getDirecao().name() + "\n");
			}
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
