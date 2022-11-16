package Bosch;

import java.util.ArrayList;
import java.util.Arrays;

public class Estudo {
    //    PUBLIC = todas as classes vao ver
    //    STATIC =  pq não precisa instanciar
    //    VOID = não tem retorno
    //    MAIN = nome da função
    //    STRING[] = lista de Strings
    //    ARGS = nome da lista

    public static void main(String[] args) {
        int[] meuArray = new int[5];
//        Não tem como criar mais posições depois de criar a lista ARRAY, SEMPRE vai ser a mesma posição.
        System.out.println(Arrays.toString(meuArray)+"\n");

        System.out.println("-----------");
        meuArray[0] = 1;
        meuArray[1] = 2;
        meuArray[2] = 3;
        meuArray[3] = 4;
        meuArray[4] = 5;
        System.out.println(Arrays.toString(meuArray)+"\n");

        System.out.println("-----------");
        Arrays.fill(meuArray, 6);
        System.out.println(Arrays.toString(meuArray)+"\n");
//        FILL = para preencher. Método da classe ARRAY

        System.out.println("-----------");
        for(int i = 0; i<meuArray.length; i++){
            meuArray[i] = i+1;
        }
        System.out.println(Arrays.toString(meuArray));

        System.out.println("\n"+"-----------");
        double[] notas = {5.0, 4.0, 3.0, 6.0, 2.0}; /*inicializando a lista*/
        for (double nota:notas)  /*para cada nota na minha lista de notas (some um)*/
        {
            System.out.println(nota+1);
        }
        System.out.println("\n"+"-----------");
        System.out.println(notas[notas.length-1]); /*para ler o último valor da lista (quando não sabe quando termina a lista isso é útil*/

        String[] nomes1 = {"Ana", "Bea", "Carlos"};
        System.out.println(Arrays.toString(nomes1));
        System.out.println(nomes1[2].charAt(2)); /*para printar a primeira posição da posição desejada na lista*/

        System.out.println("\n"+"--------------------");
        System.out.println(Arrays.toString(args));

        System.out.println("\n"+"--------- ARRAY LIST -----------");

        //        <> se chama DIAMANTE, coloca o TIPO da lista
        ArrayList<String> nomes = new ArrayList<>();
        System.out.println(nomes);

        System.out.println("\n"+"--------------------");
        nomes.add("João"); /*add == append*/
        nomes.add("Pedro");
        nomes.add("Marcos");
        nomes.add("Mateus");
        System.out.println(nomes);

        System.out.println("\n"+"--------------------");
        System.out.println(nomes.get(0)); /*get = para pegar um índice*/

        System.out.println("\n"+"--------------------");
        System.out.println(nomes.size()); /*size = para ver o tamanho*/

        System.out.println("\n"+"--------------------");
        System.out.println(nomes.remove(1)); /*remove = para remover*/
        System.out.println(nomes);

        System.out.println("\n"+"--------------------");
        System.out.println(nomes.remove("Marcoss")); /*remove = para remover. quando remove indiciando o parâmetro, ele retorna um TRUE pq tem esse parâmetro na lista*/
        System.out.println(nomes);

        System.out.println("\n"+"--------------------");
        System.out.println(nomes.remove("Marcos")); /*remove = para remover. quando remove indiciando o parâmetro, ele retorna um FALSE pq não tem esse parâmetro na lista*/
        System.out.println(nomes);

        System.out.println("\n"+"--------------------");
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(19);
        numeros.add(15);
        System.out.println(numeros);

        System.out.println("\n"+"--------------------");
        ArrayList<Object> comDois = new ArrayList<>();
        comDois.add(19);
        comDois.add("Ana");
        System.out.println(comDois);
    }
}
