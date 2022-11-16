package Bosch;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

//        USUARIO = classe, tipo definido
//        usuarios = lista, criar o nome no plural pois lista é um conjunto de variáveis

        ArrayList<Usuario> usuarios = new ArrayList<>();
        Usuario u1 = new Usuario("Emilly", 17);
        usuarios.add(u1);
        System.out.println(usuarios.get(0).nome);

        System.out.println("-----------------------------------\n");
        usuarios.add(new Usuario("Ana", 16));
        System.out.println(usuarios.get(1).nome);

        System.out.println("-----------------------------------\n");
        for (Usuario usuario: usuarios){
//        usuario = variável local
            System.out.println(usuario.nome);
        }
    }
}
