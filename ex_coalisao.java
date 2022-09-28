import java.util.Scanner;

public class ex_coalisao {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);

        double pos_a = 0, pos_b = 0, velo_a = 0, velo_b = 0, tempo, km, resposta;

        while (true) {
            while (true) {
                try {
                    System.out.print("Digite um número entre 0 e 10.000 para a primeira posição: ");
                    pos_a = x.nextDouble();
                    if (pos_a > 10000 || pos_a < 0) {
                        System.out.println("Você não digitou um número entre 0 e 10.000");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Você digitou algo diferente de um número.");
                    x.nextLine();
                    continue;
                }
                break;
            }

            while (true) {
                try {
                    System.out.print("Digite um número entre 0 e 10.000 para a segunda posição: ");
                    pos_b = x.nextDouble();
                    if (pos_b > 10000 || pos_b < 0) {
                        System.out.println("Você não digitou um número entre 0 e 10.000");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Você digitou algo diferente de um número.");
                    x.nextLine();
                    continue;
                }
                break;
            }

            while (true) {
                try {
                    System.out.print("Digite a velocidadedo trem 'a'(máximo: 300 km/j): ");
                    velo_a = x.nextDouble();
                    if (velo_a < 0 || velo_a > 300) {
                        System.out.println("Você não digitou um número entre 0 e 10.000.");
                        continue;
                    }
                } catch (Exception e) {
                    System.out.println("Você digitou algo diferente de um número.");
                    x.nextLine();
                    continue;
                }
                break;
            }

            while (true) {
                try {
                    System.out.print("Digite a velocidade do trem 'b'(máximo: -300 km/j): ");
                    velo_b = x.nextDouble();
                    if (velo_b > +0) {
                        System.out.println("A velocidade do trem B sempre será negativa.");
                        continue;
                    }
                    if(velo_b < -300){
                        System.out.println("A velocidade do trem B sempre será entre 0 e -300.");
                    }
                } catch (Exception e) {
                    System.out.println("Você digitou algo diferente de um número.");
                    x.nextLine();
                    continue;
                }
                break;
            }


            tempo = (pos_a - pos_b) / (velo_b - velo_a);
            km = pos_a + velo_a * tempo;

            System.out.printf("A coalisão dos trens acontecerá no KM %.0f " +
                    "e ocorrerá após %.0f segundos.", km, tempo * 3600);


            System.out.println("\nDeseja executar o programa novamente?" +
                    "\n Digite a tecla '1' para 'sim' ou qaulquer outra tecla para 'não' ");
            resposta = x.nextInt();
            if (resposta == 1) {
                continue;
            }
            else{
                break;
            }
        }

    }
}