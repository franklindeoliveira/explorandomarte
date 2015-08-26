public class ExplorandoMarte {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String entrada = "5 5,1 2 N,LMLMLMLMM,3 3 E,MMRMMRMRRM";
		
		boolean impar = false;
		boolean par = false;
		int posicaoX = 0;
		int posicaoY = 0;
		String direcao = null;
		char[] movimentos = null;
		
		for (int i = 0; i < entrada.split(",").length; i++) {
			if (i != 0) {
				if (i % 2 != 0) {// se impar
					posicaoX = Integer.parseInt(entrada.split(",")[i].split(" ")[0]);
					posicaoY = Integer.parseInt(entrada.split(",")[i].split(" ")[1]);
					direcao = entrada.split(",")[i].split(" ")[2];
					impar = true;
				} else {// se par.
					movimentos = entrada.split(",")[i].toCharArray();
					par = true;
				}
				if (par == true && impar == true) {
					for (char movimento : movimentos) {
						if (movimento == 'L') {// rotacao esquerda
							if (direcao.equals("N")) {
								direcao = "W";
							} else if (direcao.equals("S")) {
								direcao = "E";
							} else if (direcao.equals("W")) {
								direcao = "S";
							} else if (direcao.equals("E")) {
								direcao = "N";
							}
						}
						if (movimento == 'R') {// rotacao direita
							if (direcao.equals("N")) {
								direcao = "E";
							} else if (direcao.equals("S")) {
								direcao = "W";
							} else if (direcao.equals("W")) {
								direcao = "N";
							} else if (direcao.equals("E")) {
								direcao = "S";
							}
						}
						if (movimento == 'M') {// mover
							if (direcao.equals("N")) {
								posicaoY = posicaoY + 1;
							} else if (direcao.equals("S")) {
								posicaoY = posicaoY - 1;
							} else if (direcao.equals("W")) {
								posicaoX = posicaoX - 1;
							} else if (direcao.equals("E")) {
								posicaoX = posicaoX + 1;
							}
						}
					}
					System.out.println(posicaoX + " " + posicaoY + " " + direcao);
					impar = false;
					par = false;
				}
			}
		}
	}

}