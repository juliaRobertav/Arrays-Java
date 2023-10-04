package aulas;

import java.util.ArrayList;

public class Vetores {
    public static void main(String[] args) {

        ArrayList<Usuario> listaDeUsuarios= new ArrayList<>();
        Usuario u1 = new Usuario("João", 16);
        listaDeUsuarios.add(u1);
        System.out.println(listaDeUsuarios);
        System.out.println(listaDeUsuarios.get(0).nome);    //exemplo
        listaDeUsuarios.add(new Usuario("Maria", 17));
        listaDeUsuarios.add(new Usuario("José", 18));
        listaDeUsuarios.add(new Usuario("Pedro", 20));
        System.out.println(listaDeUsuarios);    //acessa a lista de objetos

        for (Usuario usuario:listaDeUsuarios) {
            System.out.println(usuario.nome);   //acessa a lista de nomes
        }

        String listadeNomes="";
        for (Usuario usuario: listaDeUsuarios) {
            listadeNomes = listadeNomes.concat(""+usuario.nome);    //concatena os nomes em um str só
        }

        ArrayList<String>= new ArrayList<>();
        for (Usuario usuario:listaDeUsuarios) { //cria uma variável local do tipo usuario e vai ser dinâmica(parâmetro)
            listadeNomes.add(usuario.nome); //lista de str
        }
//quando cria um obj utiliza o new
    }
}
