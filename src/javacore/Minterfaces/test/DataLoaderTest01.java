package javacore.Minterfaces.test;

import javacore.Minterfaces.dominio.DatabaseLoader;
import javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTest01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();

        databaseLoader.remove();
        databaseLoader.load();
        databaseLoader.checkPermission();

        System.out.println("*============*");

        fileLoader.load();
        fileLoader.remove();
        fileLoader.checkPermission();
    }

    
}   
