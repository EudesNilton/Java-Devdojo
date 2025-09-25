package javacore.introducaoMetodos.test;

import javacore.introducaoMetodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double result = calculadora.dividiDoisNumeros(12, 20);
        System.out.println(result);

        Calculadora calculadora02 = new Calculadora();
        double result02 = calculadora02.dividiDoisNumeros02(5, 0);
        System.out.println(result02);
        
        calculadora02.imprimeDivisao(8, 0);

    }


}
