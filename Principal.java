import java.util.ArrayList;
import java.util.Scanner;

/**
 1-	Faça uma função que compare duas strings e se elas
 tiverem 5 letras iguais na sequencia, considere elas iguais ex:

 String 1 = ramon lummertz
 String 2 = ramon
 String 3 = ramonsl

 Nessa situação o programa deve considerar as strings como iguais, já nessa
 String 1 = ramon lummertz
 String 2 = ramo
 String 3 = remon
 O programa deve considerar como sendo Strings diferentes.

 2-	Faça um programa com o uso de arraylist, para um canil que deve cadastrar os seguintes dados dos cães:
 String nome[40]
 String raça[40]
 Idade int;
 Sexo char (m/f)
 Pedigree char (s/n)
 Premiações char(s/n)

 O Programa deve possuir as seguintes funções:
 a-	Cadastrar cães OK
 a.	Importante o programa não deve deixar cadastrar dois cães com o mesmo nome +/-
 b.	Ao cadastrar sexo, pedigree e premiações só podem aceitar as letras informações. NÃO
 b-	Remover cão por:
 a.	Nome semelhante (função criada no exercício 1);
 b.	Nome igual
 c.	Por Pedigree
 c-	Listar cães por:
 a.	Raça
 b.	Nomes semelhantes
 c.	Listar cães por pedigree
 d-	Exibir abaixo do menu do programa as seguintes informações
 a.	Numero de cães cadastrados
 b.	Numero de fêmeas cadastradas
 c.	Numero de Machos cadastrados
 d.	Total de premiações

 Bônus I – Ao cadastrar um animal, o programa verifica se já não existe um nome semelhante.
 Bônus II- Não aceitar nome em “branco”
 */
public class Principal {

    public static void main(String[] args) {
        Scanner tc = new Scanner(System.in);
        ArrayList<String> Cadastro = new ArrayList<>();

        int op=0;

        do {
            System.out.println("Informe 1 para mostrar");
            System.out.println("Informe 2 para mostrar");
            op = tc.nextInt();

            switch (op)
            {
                case 1: {
                    c1.ler();
                    break;
                }
                case 2:{
                    c1.mostrar();
                    break;
                }

            }


        }while(op!=2);



    }



}
