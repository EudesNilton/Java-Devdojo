package javacore.introducao;
public class aula07Arrays {
    public static void main(String[] args) {

        //tipo reference 
        int[] ages = new int[3];
        ages[0] = 21;
        ages[1] = 22;
        ages[2] = 23;

        System.out.println(ages[0]); //21
        System.out.println(ages[1]); //22
        System.out.println(ages[2]); //23

        //valores default
        //byte, short, int, long, float, double = 0
        //char = '\u0000', ' '
        //boolean = false
        //reference = null

        //pegar todos os valores do array
        String[] names = new String[3];
        names[0] = "João";
        names[1] = "Maria";
        names[2] = "Pedro";

        for(int i = 0; i < names.length; i++){
            System.out.println(names[i]);
        }

        //outra forma de criar array

        int[] numbers = new int[5];
        int[] numbers2 = {1, 2, 3, 4, 5};
        int[] numbers3 = new int[]{1, 2, 3, 4, 5};

        for(int i = 0; i < numbers3.length; i++){
            System.out.println(numbers3[i]);
        }

        // for each
        for(int number : numbers3){
            System.out.println(number);
        }
    }

}