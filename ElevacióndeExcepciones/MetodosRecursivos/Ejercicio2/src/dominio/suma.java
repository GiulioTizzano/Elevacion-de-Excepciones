package dominio;
import aplicacion.Principal;
import java.lang.*;

public class suma{
    static int m;
    public static int sumaEnteroPositivos(int numero) throws IllegalArgumentException{
        
        if(numero == 1){
            return 1;
        } else if(numero < 0){
            throw new IllegalArgumentException("n tiene que ser esctricamente mayor que 0");
        } else{
            return numero + sumaEnteroPositivos(numero - 1);
        } 

        
    }
}