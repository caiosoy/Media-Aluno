package Media;

import java.util.Scanner;

public class Aluno {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.println("Insira suas notas abaixo: ");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();


        double media = (n1 + n2 + n3) / 3;


        if (media >= 7.0) {


            System.out.println("Aluno Aprovado!");


        } else if (media >= 5.0 && media < 7.0) {


            System.out.println("Aluno em Recuperação");
        } else {


            System.out.println("Aluno Reprovado!");
        }


        sc.close();

    }
}
