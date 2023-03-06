package dominio;
import aplicacion.*;
import java.lang.*;

public class SumaNumerosParesLista{
    public static double sumaNumerosPares(double [] array2, int k) throws IllegalArgumentException{
        if(k == 2){
            return k;
        } else if(array2[k] % 2 == 0){
            return array2[k] + sumaNumerosPares(array2, k - 1);
        } else if(k < 1){
            throw new IllegalArgumentException("El valor tiene que ser mayor que 1");
        }
        else{
            return sumaNumerosPares(array2, k - 1);
        }
    }

}