# Java DevDojo

### Tipos primitivos

- Criação de nomes de variaveis é estilo camelCase 
- Casting -> int number = (int) 100000000; //NÃO É UMA BOA PRATICA 
- a String não é um tipo primitivo e sim uma Classe

### Operadores

- O resultado de soma, multiplicação, divisão e adição de inteiros sempre sera um número inteiro
- Os valores lógicos sempre vão resultar em um valor booleano (true or false)
- Operadores aritméticos ` +, -, *, / `
- Operador de resto ` % `
- Operador de comparação ` <, >, <=, >=, ==, != `
- Operadores lógicos são ` &&(and), ||(or), !(not) `
- Operadores de atribuição ` =, +=, -=, *=, /=, %= `

### Estruturas condicionais
- O if só é executado se a condição for verdadeira
- else não precisa de condição
- Condição ternária ` condição ? verdadeiro : falso `
- Sempre utilizar o `break` apos cada caso quando se utiliza o `switch`

### Estruturas de repetição
- Colocar um contador, caso contrário sempre ter a um loop infinito
- Definir variáveis usadas antes de iniciar o laço de repetição
- O `break` também é utilizado nas estruturas de repetições
- O `break` não pode estar dentro somente do if, precisa estar dentro de um laço de repetição

### Arrays
- São referencias 
- Você pode inicializar com nulo
- O tamanho do array não pode mudar de tamanho dinamicamente
- O for each não entrega os indices do array

### Arrays Multidimensionais
- É um array dentro de um array
- Melhor sintaxe `int[][] dias = new int[3][3]`
- Desenhe e observe no papel antes de ir para o código

### OO
- Coesão
    - As classes precisam ter um proposito unico
    
- Métodos
    - O metodo retorna ou não algo
    - Diferença entre saída e retorno
    - `void` não retorna nada
    - Caso o método tenha muitos parâmetros você pode divir em um outro método
    
    *Retorno*
    - Usa a palvra reservada `return`
    - Funciona como um "`break`" 
    - Não é possivel imprimir um void como parametro do `System.out.println()`
    - Você pode usar só `return;` quando o método é `void`

    *Parâmetros tipo primitivo*
    - Quando você passa valores primitivos você passa uma cópia desses valores, não o caminho

    *Parâmetros tipo referência*
    - Ter cuidado ao passar por referência pois pode alterar o valor da variável