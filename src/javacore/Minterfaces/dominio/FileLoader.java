package javacore.Minterfaces.dominio;

public class FileLoader implements DataLoader, DataRemover{

    @Override
    public void load() {
        System.out.println("Carregando dados de um arquivo ... ");
    }

    @Override
    public void remove() {
        System.out.println("Removendo dados fileLoader");
    }

    @Override
    public void checkPermission(){
        System.out.println("Checando a permissão à um arquivo");
    }

}
