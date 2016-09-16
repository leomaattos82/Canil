import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by leonardo.mattos on 15/09/2016.
 */
public class Validacao {
    public static void main(String[] args)
    {
            String palavra1="leonardo";
            String palavra2="Ramon";

        int comp = palavra1.compareTo(palavra2);


            if (palavra1.contains(palavra2) == true) {
                System.out.println("Encontrado!");
            }

            if (comp > 0)
            {
                System.out.println("String1 é maior que a String2");
            }
            if(palavra1.startsWith(palavra2, 5))
            {
                System.out.println("5 primeiras letras são iguais");
            }

            if (comp < 0)
            {
                System.out.println("String1 é menor que a String2");
            }else
                if(palavra1.equals(palavra2))
                {
                    System.out.println("String iguais!");
                }

    }

}
