package dominio;

public class FibonacciRecursivo {
    public static int secuenciaFibonacci(int n) throws IllegalArgumentException{
        if(n == 0){
            return 0;
        } else if(n == 1){
            return 1;
        } else if(n < 0){
            throw new IllegalArgumentException("n tiene que ser mayor o igual a 0");
        } 
        else{
            return secuenciaFibonacci(n - 2) + secuenciaFibonacci(n - 1);
        }
        // Puesto que la definicion recursiva de la serie fibonacci es f(n) = (n - 2) + (n - 1), podemos
        // definir su recursividad como se ha hecho en el programa de arriba.
    }
}
