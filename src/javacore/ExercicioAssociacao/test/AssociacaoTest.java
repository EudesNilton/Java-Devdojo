package javacore.ExercicioAssociacao.test;

import javacore.ExercicioAssociacao.dominio.Aluno;
import javacore.ExercicioAssociacao.dominio.Local;
import javacore.ExercicioAssociacao.dominio.Professor;
import javacore.ExercicioAssociacao.dominio.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Bairro Botafogo");
        Aluno aluno = new Aluno("Luffy", 17);
        Professor professor = new Professor("Barba Branca", "Pirata");
        Aluno[] alunosSeminario = {aluno};
        Seminario seminario = new Seminario("Onde achar one piece",alunosSeminario,local);
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
