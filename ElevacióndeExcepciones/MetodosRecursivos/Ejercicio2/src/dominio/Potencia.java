package dominio;
import java.lang.*;

public class Potencia {
    int exponente;
    int base;
    // defino una función que recibe dos parámetros, la base y el exponente.
    // Guardamos el resultado de la operación recursiva en una variable.
    public static int potencia(int base, int exponente) throws IllegalArgumentException{
        
        /*if((exponente) == 1){
            return base;
        } */
        // El código es más eficiente con el caso base con el exponente igual a 0
        if(exponente == 0){
            return 1;
        } else if(base < 0 || exponente < 0){
            throw new IllegalArgumentException("La base y el exponente han de ser iguales o mayores que cero!");
        } else{
            return base * potencia(base, exponente - 1);
        }
    }   
 }
    

