package javacore.associacao.test;

import javacore.associacao.dominio.Jogador;
import javacore.associacao.dominio.Time;

public class JogadorTest02 {
    public static void main(String[] args) {
        Jogador jogador1 = new Jogador("Coutinho"); 
        Time time1 = new Time("Seleção Brasileira");

        jogador1.setTime(time1);
        jogador1.imprime();
    }
}
