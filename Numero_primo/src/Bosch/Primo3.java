package Bosch;

import java.util.ArrayList;

public class Primo3 {

    ArrayList<Integer> numerosPrimos = new ArrayList<>();
    ArrayList<Integer> naoPrimos = new ArrayList<>();

    boolean verificacao(int numero) {
        int cont = 0;

        for(int i = 1; numero >= i; i++){
            if(numero % i == 0){
                cont++;
            }
        }return cont == 2;
    }

    void verificacao2(int numero){
        for(int j = 1; numero >= j; j++){
            if(verificacao(j)){
                numerosPrimos.add(j);
            }else{
                naoPrimos.add(j);
            }
        }
    System.out.println("Todos os números primos anteriores do digitado são: "+numerosPrimos);
    System.out.println("Todos os números não primos anteriores do digitado são:"+naoPrimos);
    }

}
