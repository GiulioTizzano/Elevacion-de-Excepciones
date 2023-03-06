package dominio;
import java.lang.*;

public class Factorial {
    public static int factorial(int factorial) throws IllegalArgumentException{
        if(factorial == 1){
            return 1;
        } else if(factorial < 0){
            throw new IllegalArgumentException("La entrada para el factorial tiene que ser igual o mayor a cero!");
        } else{
            return factorial * factorial(factorial - 1);
        }
        
    }
}
