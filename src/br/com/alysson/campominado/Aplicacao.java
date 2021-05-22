package br.com.alysson.campominado;

import br.com.alysson.campominado.modelo.Tabuleiro;
import br.com.alysson.campominado.visao.TabuleiroConsole;

public class Aplicacao {

	public static void main(String[] args) {
		
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroConsole(tabuleiro);
	}
}
