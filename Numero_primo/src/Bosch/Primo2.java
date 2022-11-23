package Bosch;

import java.util.ArrayList;
import java.util.Scanner;

public class Primo2 {

    static void verificacao(){
        Scanner x = new Scanner(System.in);
        int nPrimo;
        int nNormal;
        ArrayList<Integer> numerosPrimos = new ArrayList<>();
        ArrayList<Integer> todosNumeros = new ArrayList<>();

        while(true){
            System.out.print("Digite um número: ");
            int numero = x.nextInt();
            if (numero < 0){
                System.out.println("Digite um número maior que 0.");
                return;
            }
            for(int i = 1; numero >= i; i++){
                todosNumeros.add(i);
            }

            for (int j = 1; todosNumeros.size() >= j; j++){
                for(int k = 1; todosNumeros.size() >= k; k++){
                    if(j % k == 0){
                        if(numerosPrimos.size() == 0){
                            System.out.println("Passou");
                        }else if (numerosPrimos.get(numerosPrimos.size()-1) == k){
                            System.out.println("Passou");
                        }else{
                            numerosPrimos.add(j);
                    }
                    }
                }
            }
            System.out.println(todosNumeros);
            System.out.println("PRIMOS: "+numerosPrimos);
        }
    }
}

