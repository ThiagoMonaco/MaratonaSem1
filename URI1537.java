//importacao de bibliotecas
import java.io.IOException;
import java.util.Scanner; 
public class URI1537
{
      public static void main(String[] args) throws IOException
     {
         Scanner sc = new Scanner(System.in);
         int n = 1;
         //array de long
         long z[] = new long[100002];
         //posicao 3 do array pois as as tres primeiras estao ocupadas por André, Bruno e Carlos
         z[3] = 1;
         //laco de repeticao for para preencher array
         for(int i = 4; i <=100000;i++)
         {
             z[i] = (i*z[i-1]%1000000009);
         }     
         while(n !=0)
         {
             //entrada de dados e impressao do resultado desejado
             n = sc.nextInt();
             if(n == 0) break;
             System.out.println(z[n]);
         }

         
     }
}