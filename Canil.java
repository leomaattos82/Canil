import java.util.ArrayList;
import java.util.Scanner;

public class Canil {
        ArrayList<String> cadCanil = new ArrayList<String> ();



        int idade;
        char sexo;
        char pedigree = 0;
        char premiacoes = 0;
        String nome;
        String raca;
        int cont=0;


        public void ler()
        {
            Canil c1 = new Canil();
            Scanner tc = new Scanner(System.in);
            System.out.println("informe o nome do cachorro: ");
            this.nome = tc.next();
            System.out.println("Informe raça do cachorro: ");
            this.raca = tc.next();
             System.out.println("Informe a idade do cachorro: ");
             this.idade = tc.nextInt();
            System.out.println("informe o sexo do cachorro (M/F): ");
              this.sexo = tc.nextLine().charAt(1);
             System.out.println("Informe se o cachorro possui pedigree: ");
              this.pedigree = tc.nextLine().charAt(0);
             System.out.println("Informe se o cachorro possui premiações: ");
              this.premiacoes = tc.nextLine().charAt(0);
            cadCanil++;
        }

    public void mostrar (){

        System.out.println("Nome do cachorro " + this.nome);
        System.out.println("Raça do cachorro " + this.raca);
        System.out.println("Idade do cachorro " + this.idade);
        System.out.println("Sexo do cachorro " + this.sexo);
        System.out.println("Pedigree do cachorro " + this.pedigree);
        System.out.println("Premiações do cachorro " + this.premiacoes);
    }




 }
