package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante(); //variavel de referencia do tipo Estudante

        estudante.nome = "Luffy";
        estudante.idade = 18;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
