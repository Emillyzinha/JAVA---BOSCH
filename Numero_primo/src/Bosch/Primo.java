package Bosch;

import java.util.Scanner;

public class Primo {

    void verificacao(){
        while (true) {
            Scanner x = new Scanner(System.in);
            System.out.print("Digite um número: ");
            int numero = x.nextInt();
            if (numero <= 0) {
                System.out.println("Digite um número maior que 0.");
                continue;
            }

            int nPrimo = 0;
            int nNormal = 0;

            for(int i = 1; numero >= i; i++){
                if(numero % i == 0){
                    nPrimo++;
                }else{
                    nNormal++;
                }
            }
            if(nPrimo == 2){
                System.out.println("O número "+numero+" é primo.");
            }else{
                System.out.println("O número "+ numero +" não é primo.");
            }

        }
    }
}
