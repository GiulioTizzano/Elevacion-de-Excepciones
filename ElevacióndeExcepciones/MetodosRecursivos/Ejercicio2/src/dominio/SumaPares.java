package dominio;
import aplicacion.*;
import java.lang.*;

public class SumaPares{
    public static int sumaPares(int t) throws IllegalArgumentException{
        if(t < 2){
            return 0;
        } if(t <= 1){
            throw new IllegalArgumentException("El numero tiene que ser mayor que 2!");
        }  
        else if(t % 2 == 0){
            return t + sumaPares(t - 2);
        } else{
           return  + sumaPares(t - 1);
        } 

        
    } 



}