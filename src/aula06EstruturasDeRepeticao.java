public class aula06EstruturasDeRepeticao {
    public static void main(String[] args) {
        // Estruturas de Repetição
        // while, do while, for

        //while
        int count = 0;
        while(count <= 10){
            System.out.println("Contador: " + count);
            count++;
        }

        //do while
        do{
            System.out.println("Contador no do while: " + count);
            count++;
        } while(count <= 10);


        //for
        for(int i = 0; i <= 10; i++){
            System.out.println("Contador no for: " + i);
        }

        //Exercício
        //Imprima os números pares de 0 a 1000000
        for(int i = 0; i <= 100; i++){
            if(i % 2 == 0){
                System.out.println("Número par: " + i);
            }
        }

        // Exercício
        // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
        // Condição: o valor da parcela não pode ser menor que 1000 reais
        double valorCarro = 30000;
        for(int parcela = 1; parcela <= valorCarro; parcela++){
            double valorParcela = valorCarro / parcela;
            if(valorParcela < 1000){
                break;
            }
            System.out.println("Parcela " + parcela + " R$ " + valorParcela);
            
        }

        //continue
        //imprima os números ímpares de 0 a 20 pulando os pares
        double valorCarro2 = 30000;
        for(int parcela2 = (int) valorCarro2; parcela2 >= 1; parcela2--){
            double valorParcela = valorCarro2 / parcela2;
            if(valorParcela < 1000){
                continue;
            }   
            System.out.println("Parcela " + parcela2 + " R$ " + valorParcela);
        }
    }

}
