//importa bibliotecas
import java.io.IOException;
import java.util.Scanner; 
public class URI1573 {
    public static void main(String[] args) throws IOException
    {   
        Scanner sc = new Scanner(System.in);
        boolean zero = false;
        while(!zero)
        {
            //entrada de dados(3 numeros inteiros em uma linha)
            int[] num= new int[3];
             for(int j = 0; j < 3; ++j) {
             num[j] = sc.nextInt();
            }
            if(num[0] == 0 &&num[1] == 0 && num[2] == 0){  zero = true;break;}
                //formula que retorna o resultado desejado
                int res = (num[0] * num[1] * num[2]);
                res = (int)Math.cbrt((num[0] * num[1] * num[2]));  
                System.out.println(res);
        }
    }
}
