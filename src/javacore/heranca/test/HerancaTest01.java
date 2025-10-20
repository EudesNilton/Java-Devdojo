package javacore.heranca.test;

import javacore.heranca.dominio.Endereco;
import javacore.heranca.dominio.Funcionario;
import javacore.heranca.dominio.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco(null, null);
        endereco.setRua("Rua 10");
        endereco.setCep("0123456-789");
        Pessoa pessoa = new Pessoa("Toyohisa Shimazu");
        pessoa.setCpf("1111111111");
        pessoa.setEndereco(endereco);
        pessoa.imprime();
        System.out.println("*---------------*");

        Funcionario funcionario = new Funcionario("Naruto Uzumaki");
        funcionario.setCpf("35484848484548");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20000.0);
        funcionario.imprime();
    }
}
