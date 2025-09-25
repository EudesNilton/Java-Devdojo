package javacore.introducaoMetodos.test;

import javacore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somaDoisNumeros();
        System.out.println("Toma outra variavel");
        calculadora.subtraiDoisNumeros();
    }
}
