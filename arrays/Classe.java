package arrays;

import java.util.Arrays;
import java.util.List;

public class Classe {
    public static void main(String[] args) {
        String alunos[] = new String[]{"Lucas", "Laura","Henrique", "Felipe", "Gabriel",
                "Diego Castan","Esther","Caio", "Diego Jacober", "Nicole", "Giovanna Vieira", "Giovanna Fiuza",
                "Angelo",  "Kadu", "Giovana Radaeli", "Allana", "Eduarda", "Julia"};

        List<String> list1 = Arrays.asList(alunos);

        list1.remove(0);
        System.out.println(list1);

    }
}
