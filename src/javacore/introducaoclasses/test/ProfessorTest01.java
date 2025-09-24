package javacore.introducaoclasses.test;

import javacore.introducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Kakashi";
        professor.idade = 32;
        professor.sexo = 'M';

        System.out.println("nome: " +professor.nome + " idade: " + professor.idade + " sexo: " + professor.sexo);
    }
}
