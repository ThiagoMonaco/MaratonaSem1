//importacao de bibliotecas
import java.io.IOException;
import java.util.Scanner; 
public class URI1890
{
     public static void main(String[] args) throws IOException
     {
        //entrada de dados que define a quantidade de vezes que sera repetido
        Scanner sc = new Scanner(System.in);
        int nums = sc.nextInt();
        
        for(int i = 0; i < nums;i++)
        {
            //criacao de array e preenchimento dele com os numeros digitados
            int[] numbers = new int[2];
            for(int j = 0; j < 2; ++j)
            {
                 numbers[j] = sc.nextInt();
            }
            //se os numeros forem zero, sera impresso zero
            if(numbers[0] == 0 && numbers[1] == 0){System.out.println(0);}
            else
            {   
                //calculo do resultado final, multiplicando por 26 e depois por 10
                int res = 1;
                while(numbers[0]!=0)
                {
                    res *=26;
                    numbers[0]--;
                }
                while(numbers[1]!=0)
                {
                    res *= 10;
                    numbers[1]--;
                }   
                // impressão do resultado
                System.out.println(res);
            }
        }
     }
}