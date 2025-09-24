package javacore.introducao;
public class Aula05EstruturasCondicionais {
    public static void main(String[] args) {
        // Estruturas Condicionais
        // if , else, else if
        int age = 14;
        boolean isAutorized = age >= 18;

        if(isAutorized){
            System.out.println("Você pode comprar bebidas alcoólicas");
        } else {
            System.out.println("Você não pode comprar bebidas alcoólicas");
        }

        if(!isAutorized){
            System.out.println("Você não pode comprar bebidas alcoólicas");
        }

        // se idade < 15 -> categoria infantil
        // se idade >= 15 e idade < 18 -> categoria juvenil 
        // se idade >= 18 -> categoria adulto  

        int ageCategory = 18;
        String category;

        if(ageCategory < 15){
            category = "Categoria Infantil";
        } else if(ageCategory >= 15 && ageCategory < 18){
            category = "Categoria Juvenil";
        } else {
            category = "Categoria Adulto";
        }

        System.out.println(category);

        // Operador Ternário
        double salary = 3000;

        String messageDonate = "Eu vou doar 500 para o DevDojo";
        String messageNotDonate = "Ainda não tenho condições de doar, mas vou ter!";
        // condição ? verdadeiro : falso
        String result = (salary > 5000) ? messageDonate : messageNotDonate;
        System.out.println(result);


        // switch case
        int number = 4;
        String day;

        switch(number){
            case 1:
                day = "Domingo";
                break; // para o código aqui
            case 2:
                day = "Segunda";
                break; // para o código aqui
            case 3:
                day = "Terça";
                break; // para o código aqui 
            case 4:
                day = "Quarta";
                break; // para o código aqui
            case 5:
                day = "Quinta";
                break; // para o código aqui
            case 6:
                day = "Sexta";
                break; // para o código aqui
            case 7:
                day = "Sábado";
                break; // para o código aqui
            default:
                day = "Dia inválido";
                break; // para o código aqui
        }
        System.out.println(day);
    }
}
