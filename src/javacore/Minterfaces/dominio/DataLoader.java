package javacore.Minterfaces.dominio;

public interface DataLoader {
    void load();

    default void checkPermission(){
        System.out.println("Checando as permissões ");
    }

    public static void retriveMaxDataSize(){
        System.out.println("Dentro do retriveMaxDataSize");
    }
}
