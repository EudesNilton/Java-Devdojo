package javacore.Npolimorfismo.servico;

import javacore.Npolimorfismo.dominio.Computador;
import javacore.Npolimorfismo.dominio.Tomate;

public class CalculadoraImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("Relatório de imposto do computador");
        double imposto = computador.calcularImposto();
        System.out.println("Computador nome = "+ computador.getNome());
        System.out.println("Valor = "+ computador.getValor());
        System.out.println("Imposto a ser pago = "+imposto);
    }

    public static void calcularImpostoTomate(Tomate tomate){
        System.out.println("Relatório de imposto do computador");
        double imposto = tomate.calcularImposto();
        System.out.println("Toomate nome = "+ tomate.getNome());
        System.out.println("Valor = "+ tomate.getValor());
        System.out.println("Imposto a ser pago = "+imposto);
    }
}
