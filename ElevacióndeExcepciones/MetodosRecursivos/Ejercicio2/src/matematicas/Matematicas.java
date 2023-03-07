package matematicas;
import java.util.*;

public class Matematicas{
    // Suma numeros pares
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
    // Suma numeros pares de una lista
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
    // Suma elementos de una lista
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
    // Suma numeros naturales
    public static int sumaEnteroPositivos(int numero) throws IllegalArgumentException{
        
        if(numero == 1){
            return 1;
        } else if(numero < 0){
            throw new IllegalArgumentException("n tiene que ser esctricamente mayor que 0");
        } else{
            return numero + sumaEnteroPositivos(numero - 1);
        }  
    }
    // Producto escalar
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
    // Primeros numeros pares
    public static ArrayList<Integer> primeros_pares(int x, ArrayList<Integer> lista_pares){
        if(x < 2){
            return lista_pares;
        } else if(x % 2 == 0){
            lista_pares.add(x);
        }
        return primeros_pares(x - 1, lista_pares);
    }
    // Potencia
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
    // Media aritmetica de los elementos de una lista
    public static float mediaAritmeticaElementos(float [] array){
        return Matematicas.sumaElementosArray(array, array.length - 1) / array.length;
}
    // Fibonacci
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
    // Factorial
    public static int factorial(int factorial) throws IllegalArgumentException{
        if(factorial == 1){
            return 1;
        } else if(factorial < 0){
            throw new IllegalArgumentException("La entrada para el factorial tiene que ser igual o mayor a cero!");
        } else{
            return factorial * factorial(factorial - 1);
        }
        
    }
    // Desviación tipica
    public static float Desviacion(float [] array){
        return (float) Math.sqrt(Matematicas.mediaAritmeticaElementos(array));
    }
    // Lista de numeros pares
        public static ArrayList<Integer> pares_lista(int [] array3, ArrayList<Integer> lista_pares) throws IllegalArgumentException{
            if(array3.length == 0){
                return lista_pares;
            } else if(array3.length < 0){
                throw new IllegalArgumentException("El numero tiene que ser mayor o igual a 0!");
            }
            else if(array3[0] % 2 == 0){
                lista_pares.add(array3[0]);
            }
            return pares_lista(Arrays.copyOfRange(array3, 1, array3.length), lista_pares);
            
        }
    // Cociente fibonacci
    public static double cocienteFibonacci(){
        return (double) Matematicas.secuenciaFibonacci(13) / Matematicas.secuenciaFibonacci(12);
    }

}