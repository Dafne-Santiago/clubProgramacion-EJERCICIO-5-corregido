
import java.util.Arrays;
public class Array
{
    public static int [] b = new int [20];
    public static int indice=0;
    public static int i=0;
    public Array(){
    }

    public static int[] regresaPosicion(int []t, int num){
        
        if(indice != t.length)
            if(t[indice]==num){
                b[i]=indice+1;
                indice++;
                i++;
                regresaPosicion(t, num);

            }
            else{
                indice++;
                regresaPosicion(t, num);
            }
            return b;

    }

    public static void main(String [] args){
        int [] a = {1,2,3,3,3,4,5,6,6,2};
        System.out.println(Arrays.toString(regresaPosicion(a,3)));
    }

}
