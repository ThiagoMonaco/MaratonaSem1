//importacão de bibliotecas
import java.io.IOException;
import java.util.Scanner; 

public class URI1962
{
    public static void main(String[] args) throws IOException
    {
        //entrada de dados que define quantas repeticões serão feitas
        Scanner sd = new Scanner(System.in);
        int n = sd.nextInt();
        for(int i = 0; i<n; i++)
        {
            // entrada de dado e calculo do resultado
            int t = sd.nextInt();
            int res = 2015 - t;
            //define se o ano é antes ou depois de cristo
            if(res<0 || res == 0)
            {
                System.out.println(Math.abs(res-1)+ " A.C.");
            }
            else{
                System.out.println(res + " D.C.");
            }
        }
    }
}
