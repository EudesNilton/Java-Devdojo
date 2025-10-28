package javacore.ModificadorFinal.Test;

import javacore.ModificadorFinal.dominio.Carro;
import javacore.ModificadorFinal.dominio.Comprador;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();
        carro.COMPRADOR.setNome("Kuririn");
        
        System.out.println(Carro.VELOCIDADE_LIMITE);
        System.out.println(carro.COMPRADOR);
    }
}
