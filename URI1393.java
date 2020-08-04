//importacão de bibliotecas
import java.io.IOException;
import java.util.Scanner; 

public class URI1393
{
    
    public static void main(String[] args) throws IOException
    {
        //criacao de Scanner e de arrays
        Scanner sc = new Scanner(System.in);
        int array[] = new int[100];
        array[0] = 0; array[1] = 1;
        //laco de repeticao for para preenchimento de array
        for(int i = 2; i <=42;i++)
        {
            array[i] = (array[i-1] + array[i-2]);
        }
        //while booleano que recebe entrada de dado e imprime o resultado desejado
        boolean t = true;
        while(t)
        {
            int n = sc.nextInt();
            if(n == 0){t = false; break;}
            System.out.println(array[n+1]);
        }
  
        
    }
}
