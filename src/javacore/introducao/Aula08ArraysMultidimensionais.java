package javacore.introducao;
public class Aula08ArraysMultidimensionais {
    public static void main(String[] args) {
        //1, 2, 3, 4, 5 meses
        // 31, 28, 31, 30, 31 dias

        int[][] dias = new int[3][3];
        System.out.println(dias[0]); // imprime o endereço de memoria
        System.out.println(dias[0][0]); // imprime o valor de 0
        dias[0][0] = 31; // atribui valor ao primeiro elemento
        dias[0][1] = 28;
        dias[0][2] = 31;

        dias[1][0] = 30;
        dias[1][1] = 31;
        dias[1][2] = 30;
        
        // imprimindo os valores com for
        for(int i = 0; i < dias.length; i++){
            for(int j = 0; j < dias[i].length; j++){
                System.out.println(dias[i][j]);
            }
        }

        // imprimindo os valores com for each
        for(int[] arrBase : dias){
            for(int num : arrBase){
                System.out.println(num);
            }
        }

        //iniciando de outra forma os arrays multidimensionais
        int[][] arrayInt = new int[3][];

        arrayInt[0] = new int[2];
        arrayInt[1] = new int[]{1, 2, 3};
        arrayInt[2] = new int[]{4, 5, 6, 7, 8, 9};

        //imprimindo os valores com for each
        for(int[] arrayBase2 : arrayInt){
            System.out.println("\n----------");
            for(int num2 : arrayBase2){
                System.out.print(num2 + " ");
            }
        }

        int arrayInt2[][] = {
            {1, 2},
            {3, 4, 5},
            {6, 7, 8, 9}
        };

        //imprimindo os valores com for each
        for(int[] arrayBase2 : arrayInt2){
            System.out.println("\n----------");
            for(int num2 : arrayBase2){
                System.out.print(num2 + " ");
            }
        }

    }
}
