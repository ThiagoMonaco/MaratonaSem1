import java.io.IOException;
import java.util.Scanner;

public class URI2180
{
    public static void main(String[] args) throws IOException
    {
        Scanner mc = new Scanner(System.in);
        // array de numeros primos referentes a velocidades de tamanho 10 (numero maximo de velocidades);
        int [] primos = new int [10];
        int peso = 0, contador = 0;
        int v = 0, tHoras = 0, tDias = 0;
        
        peso = mc.nextInt();
        /* laço verifica se o peso eh primo e atribui ao array a velocidade, caso seja primo;
         * caso contrario ele soma em uma unidade ao valor da velocidade atual e verifica novamente;
         * o laço acaba quando a variavel 'contador' eh igual a 10;
         */
        while (contador < 10) {
            if (confirmaPrimo(peso)==true) {
                primos[contador] = peso;
                contador++;
            }
            peso++;
        }
        // laço que acumula em 'v' a soma das velocidades;
        for (int i=0; i<10; i++) {
            v +=primos[i];
        }
        tHoras = 60000000 / v;
        tDias = tHoras / 24;
        System.out.printf("%d km/h\n%d h / %d d\n",v,tHoras,tDias);
    }
    /* metodo que recebe um inteiro e verifica se o inteiro eh primo e retorna um  booleano de confirmacao;
     * se for primo retorna 'true', caso contrario retorna 'false';
     */
    public static boolean confirmaPrimo (int num) {
        int cont = 0;
        int rest;
        for (int x=num; x>0; x--) {
            rest = num%x;
            if (rest == 0) {
                cont++;
            }
        }
        if (cont <= 2) {
            return true;
        }
        return false;
    }
}