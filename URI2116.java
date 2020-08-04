//importacao de biblioteca
import java.io.IOException;
import java.util.Scanner;

public class URI2116
{
    public static void main(String[] args) throws IOException
    {
        //Criacao de arrays e entrada dos dados
        Scanner sc = new Scanner(System.in);
        String n1 = sc.nextLine();
        //transforma os dados do array de String pra um de int
        int num[] = new int[2];
        String[] array = n1.split(" ");        
        for(int i = 0;i < 2;i++)
        {
            num[i] = Integer.valueOf(array[i]);
        }                
        int t = verifica(num[0]);
        int h = verifica(num[1]);
        
        System.out.println(t * h);
    }
    //metodo que retorna 0, 2 ou o valor de i(e recebendo um inteiro que representa
    //um dos numeros digitados) para multiplicar e obter o resultado esperado
    public static int verifica(int p)
    {
    if(p==2)
    {
        return 2;
    }
    else
    {
        int b=0;
        for(int i=p;i>0;i--)
        {
            for(int z=2;z<=i/2;z++)
            {
                if(i%z==0)
                {
                    b=0;
                    break;
                }
                else
                    b=1;
            }
            if(b==1)
            return i;
        }
    }
    return 0;
    }
}