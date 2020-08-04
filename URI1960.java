//importacao de bibliotecas
import java.io.IOException;
import java.util.Scanner;

public class URI1960{
    
    public static void main(String[] args) throws IOException
    {
        int j = 0;
        Scanner sd = new Scanner(System.in);
        //array de String que armazena as letras correspondentes do numero romano
        String[] numRom = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        //array de int que armazena os numeros usados pra indentificacao dos numeros romanos
        int[] Numeros = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        //entrada de inteiro
        int num = sd.nextInt();
        
        while (num > 0)
        {
            //formula as letras de acordo com o valor digitado e as imprime respectivamente
            if (num >= Numeros[j])
            {
                System.out.print(numRom[j]);
                num -= Numeros[j];
            }
            else{
            
                j++;
            }
        }
        System.out.print("\n");
    }
	
}
