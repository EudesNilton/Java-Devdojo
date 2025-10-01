package javacore.sobrecargaMetodos.test;

import javacore.sobrecargaMetodos.dominio.Anime;

public class AnimeTest01 {
    public static void main(String[] args) {
        Anime anime = new Anime();
        //anime.init("Naruto", "TV",1200);
        anime.init("Naruto", "TV",1200, "Ação");
        anime.imprime();
    }
}
