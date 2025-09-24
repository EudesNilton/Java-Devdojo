package javacore.introducao;
public class Aula04Operadores {

    public static void main(String[] args) {
        // Operadores Aritméticos
        // +, -, *, /

        int a = 10;
        int b = 5;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a - b));
        System.out.println("Multiplicação: " + (a * b));
        System.out.println("Divisão: " + (a / b));
    
        // operador de resto %
        
        System.out.println("Resto da Divisão: " + (a % b));

        // Operadores de comparação
        // <, >, <=, >=, ==, !=

        boolean isEqual = (a == b);
        boolean isNotEqual = (a != b);
        boolean isGreater = (a > b);
        boolean isLess = (a < b);
        boolean isGreaterOrEqual = (a >= b);
        boolean isLessOrEqual = (a <= b);

        System.out.println("isEqual: " + isEqual);
        System.out.println("isNotEqual: " + isNotEqual);
        System.out.println("isGreater: " + isGreater);
        System.out.println("isLess: " + isLess);
        System.out.println("isGreaterOrEqual: " + isGreaterOrEqual);
        System.out.println("isLessOrEqual: " + isLessOrEqual);

        // Operadores Lógicos
        // && (AND), || (OR), ! (NOT)

        boolean andResult = (a > b) && (a != b); //precisa que todos sejam verdadeiros
        boolean orResult = (a < b) || (a != b); //precisa que pelo menos um seja verdadeiro
        boolean notResult = !(a != b); //inverte o resultado

        System.out.println("AND Result: " + andResult);
        System.out.println("OR Result: " + orResult);
        System.out.println("NOT Result: " + notResult);

        // Operadores de Atribuição
        // =, +=, -=, *=, /=, %=
        
        int c = 20;
        c += 10; // c = c + 10
        System.out.println("c after += 10: " + c);

        c -= 5; // c = c - 5
        System.out.println("c after -= 5: " + c);

        c *= 2; // c = c * 2
        System.out.println("c after *= 2: " + c);

        c /= 5; // c = c / 5
        System.out.println("c after /= 5: " + c);

        c %= 3; // c = c % 3
        System.out.println("c after %= 3: " + c);


    }
}
