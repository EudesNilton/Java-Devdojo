package javacore.associacao.dominio;

public class Jogador {
    private String name;

    public void imprime(){
        System.out.println(this.name);
    }

    public Jogador(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    
}
