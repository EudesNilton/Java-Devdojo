package javacore.introducaoMetodos.test;

import javacore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividiDoisNumeros(10, 20);
        System.out.println(result);
    }
}
