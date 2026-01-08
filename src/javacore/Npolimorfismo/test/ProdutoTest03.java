package javacore.Npolimorfismo.test;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Produto;
import javacore.Npolimorfismo.dominio.Tomate;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Macbook", 5000);
        System.out.println("*===============*");

        Tomate tomate = new Tomate("Italia", 12);
        tomate.setDataValidade("11/12/2027");
        System.out.println("*===============*");

    }
}
    