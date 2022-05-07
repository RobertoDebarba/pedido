package br.com.cedup.vetoresematrizes;

public class Vetoresematrizes {

    public static void main(String[] args) {

//        int[][] numeros = new int[4][4];
//        numeros[0][0] = 0;
//        numeros[0][1] = 1;
//        numeros[0][2] = 2;
//        numeros[0][3] = 3;
//        numeros[1][0] = 1;
//        numeros[1][1] = 2;
//        numeros[1][2] = 3;
//        numeros[1][3] = 4;

        int[][] numeros = {
            {0, 1, 2, 3},
            {4, 5, 6, 7},
            {8, 9, 10, 11},
            {12, 13, 14, 15}
        };
        
       for (int i = 0; i < numeros.length; i++) { // Iteração de linha
            int[] linha = numeros[i];
            for (int j = 0; j < linha.length; j++) { // Iteração de coluna
                int celula = linha[j];
                System.out.print(celula + " ");
            }
            System.out.println();
       }

//        int tamanho = 5;
//        int[] idades = new int[tamanho];
//        idades[0] = 18;
//        idades[1] = 21;
//        idades[2] = 27;
//        idades[3] = 20;
//        idades[4] = 50;
// 
//        // Mesma coisa que o exemplo anterior
//        // int[] idades = {18, 21, 27, 20, 50};
//        
//        //System.out.println(idades); Imprime o endereço de memória do vetor
//        
//        // Imprimir os valores
//        for (int i = 0; i < idades.length; i++) {
//            System.out.print(idades[i]);
//            if (i < idades.length - 1) {
//                System.out.print(", ");
//            }
//        }
    }
}

/*
1. Leia um conjunto de valores inteiros e em seguida exiba-os na ordem inversa 
do que foram digitados.
 */

 /*
2. Leia um conjunto de notas, cuja quantidade seja determinada pelo usuário. 
Calcule a média, maior e menor nota de todas elas.
 */

 /*
3. Leia um conjunto de nomes e grave em um vetor de tamanho zero. Aumente o 
tamanho do vetor conforme são cadastrados mais nomes.
 */

/*
4. Faça um cadastro pessoas com nome e idade. O usuário pode consultar pelo 
indice e o programa deve exibir as duas informações cadastradas.
*/

/*
5. Faça um cadastro de pessoas com nome, idade e salário utilizando matrizes. 
O usuário pode consultar pelo indice da pessoa e o programa deve exibir todas 
as informações informações cadastradas.
*/

/*
6. Escreva um código, usando laço(s), que preencha uma matriz com os valores:
{0, 1, 2, 3},
{0, 1, 2, 3},
{0, 1, 2, 3},
{0, 1, 2, 3}
*/

/*
7. Escreva um código, usando laço(s), que preencha uma matriz com os valores:
{0, 0, 0, 0},
{1, 1, 1, 1},
{2, 2, 2, 2},
{3, 3, 3, 3}
*/

/*
8. Dada a seguinte matriz, implemente um jogo de batalha naval onde o jogador
informa a posição (linha e coluna) e, caso acerte um barco (*), altere o valor
da celula para X. Caso todas as celulas O tenha sido transformadas em X o jogo
deve finalizar.
{-, -, -, *, -, -},
{-, *, -, *, -, -},
{-, *, -, *, *, *},
{-, *, -, -, -, -},
{-, *, -, *, *, -},
{-, -, -, -, -, -}
*/