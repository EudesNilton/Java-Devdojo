package javacore.introducaoMetodos.dominio;

public class Calculadora {
    public void somaDoisNumeros(){
        System.out.println(10 + 10);
    }

    public void subtraiDoisNumeros(){
        System.out.println(28 - 10);
    }

    public void multiplicaDoisNumeros(int num1, int num2){
        System.out.println(num1 * num2);
    }

    public double dividiDoisNumeros(double num1, double num2){
        if(num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public double dividiDoisNumeros02(double num1, double num2){
        if(num2 != 0){
            return num1/num2;
        } 
        return 0;
    }

    public void imprimeDivisao(double num1, double num2){
        if(num2 == 0){
            System.out.println("Não existe divisão por zero!");
            return;
        }
        System.out.println(num1/num2);
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do alteraDoisNumeros!");
        System.out.println("Num1 = " + num1);
        System.out.println("Num1 = " + num2);
    }

    public void somaArray(int[] numeros){
        int soma = 0;

        for (int i : numeros) {
            soma += i;
        }
        System.out.println(soma);
    }

    public void somaVarargs(int... numeros){
        int soma = 0;

        for (int i : numeros) {
            soma += i;
        }
        System.out.println(soma);
    }
}
