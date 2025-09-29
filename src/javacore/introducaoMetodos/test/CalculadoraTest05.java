package javacore.introducaoMetodos.test;

import javacore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest05 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        int [] numeros = {1, 8, 8, 8, 5};
        calculadora.somaArray(numeros);

        calculadora.somaVarargs(1, 5, 8, 74, 7, 8, 9, 10);
    }
}
