package dominio;
import aplicacion.*;
import java.lang.*;

public class SumaElementosLista{
    int m;
    
    public static float sumaElementosArray(float[] array, int m) throws IllegalArgumentException{
        // si la posicion m del array es igual a 0, entonces devolvemos el valor de la posicion m (que es el índice 0).
        if(m == 0){
            return array[m];
        } else if(m < 0){
            throw new IllegalArgumentException("La entrada tiene que ser positiva");
        }
        // sino, devolvemos el valor de la posicion m del array, y le sumamos el valor de la posicion m - 1 del array hasta llegar
        // al paso base.
        else{
            return array[m] + sumaElementosArray(array, m - 1);
        }
        
    }

}