package javacore.introducaoMetodos.test;

import javacore.introducaoMetodos.dominio.Funcionario;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario();
        funcionario.setNome("Sanji");
        funcionario.setIdade(23);
        funcionario.setSalarios(new double[]{1500, 2000, 3000});
        funcionario.imprime();
    }
}
