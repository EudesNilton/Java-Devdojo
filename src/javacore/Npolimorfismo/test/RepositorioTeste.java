package javacore.Npolimorfismo.test;

import java.util.ArrayList;
import java.util.List;

import javacore.Npolimorfismo.repositorio.Repositorio;
import javacore.Npolimorfismo.servico.RepositorioArquivo;
import javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import javacore.Npolimorfismo.servico.RepositorioMemoria;

public class RepositorioTeste {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioBancoDeDados();
        repositorio.salvar();

        List<String> list = new ArrayList<>();
        list.add("Goku");
        list.add("Vedita");
        list.add("Kuririn");
        System.out.println(list);
        
    }
}
