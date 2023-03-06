package dominio;
import aplicacion.*;
import java.util.*;
import java.lang.*;

public class ProductoEscalar {
    public static int calcularProductoEscalar(int [] array4, int [] array5) throws IllegalArgumentException{
        if(array4.length == 0 && array5.length == 0 || array4.length != array5.length){
            return 0;
        } else if(array5.length < 0){
            throw new IllegalArgumentException("El valor introducido tiene que ser mayor o igual a 0!");
        } 
        else {
            return (array4[0] * array5[0]) + calcularProductoEscalar(Arrays.copyOfRange(array4, 1, array4.length), Arrays.copyOfRange(array5, 1, array5.length));
        }

    }
}
