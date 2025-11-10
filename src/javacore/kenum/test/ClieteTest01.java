package javacore.kenum.test;

import javacore.kenum.dominio.Cliente;
import javacore.kenum.dominio.TipoCliente;

public class ClieteTest01 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("tsubasa", TipoCliente.PESSOA_FISICA);
        Cliente cliente2 = new Cliente("tsubasa", TipoCliente.PESSOA_JURIDICA);

        System.out.println(cliente1);
    }
}
