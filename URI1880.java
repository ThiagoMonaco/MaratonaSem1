import java.util.Scanner;
import java.io.IOException;
public class URI1880
{
    public static void main(String[] args)throws IOException {
        Scanner s = new Scanner(System.in);
        // cria a lista que vai receber as bases que sao capicuas;
        int [] cap = new int [16];
        int n, cont=0, t;
        t = s.nextInt();
        for (int x=0; x<t; x++) {
            n = s.nextInt();
            boolean resp = true;
            String convert = "";
            // laço que verifica as bases que sao capicuas e as atribui no array;
            for (int b=2; b<=16; b++) {
                convert = converteBase(n, b);
                resp = testaCap(convert);
                if (resp == true) {
                    cap[cont]=b;
                    cont++;
                }
            }
            /* laço que verifica se existem bases no array e imprime
             * as bases uma do lado da outra e da nova linha no fim
             * ou '-1' caso o numero nao tenha nenhuma base capicua, e encerra o laço;
             */ 
            for(int c=0; c < cont; c++) {
                if (cap[c]==0) {
                    System.out.println(-1);
                    break;
                }else if (c+1<cont) {
                    System.out.print(cap[c]+" ");
                } else {
                    System.out.print(cap[c]+"\n");
                }
            }
        }
    }
    
    // metodo que verifica se o numero convertido para String eh capicua ou nao. retorna um booleano.
    public static boolean testaCap(String n) {
        String cap=inverteNum(n);
        if (n.equals(cap)) {
            return true;
        } else {
            return false;
        }
    }
    
    // metodo que recebe o numero e a base a qual ele vai ser convertido;
    // retorna a String do numero convertido sem inverter;
    public static String converteBase(int num, int base) {
        String convertido="";
        int q=0, r;
        while (num>=base) {
            r = num%base;
            q = num/base;
            convertido += Integer.toString(r);
            while (r > 0) {
                num--;
                r = num%base;
                q = num/base;
            }
            num = q;
        }
        convertido += Integer.toString(q);
        return convertido;
    }
    
    // metodo que inverte o numero passado como uma String;
    public static String inverteNum(String num) {
        String inverso="";
        for (int i = num.length()-1; i>=0;i--) {
            inverso += num.charAt(i);
        }
        return inverso;
    }
}