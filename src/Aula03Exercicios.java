/* Pática
 * Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
 * 
 * Eu <name>, morando no endereço <adress>,
 * confirmo que recebi o salário de <salary>, na data <date>.
 */
public class Aula03Exercicios {
    public static void main(String[] args) {
        String name = "Eudes Nilton";
        String address = "Rua Helena da Silva, n381";
        double salary = 1670.00;
        String date = "10/10/2023";
        String relatoryString = "Eu " + name + ", morando no endereço " + address + ", confirmo que recebi o salário de " + salary + ", na data " + date + ".";
        
        System.out.println(relatoryString);
    }
}
