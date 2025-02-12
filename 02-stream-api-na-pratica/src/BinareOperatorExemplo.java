import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma operação que combina dois argumentos do tipo T e retorna um resultado do mesmo tipo T.
 * É usada para realizar operações de redução em pares de elementos, como somar números ou combinar objetos.
 */

public class BinareOperatorExemplo {

    public static void main(String[] args){

        //CRIA LISTA DE NUMEROS INTEIROS.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        BinaryOperator<Integer> somar = Integer::sum;
        //BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;
        

        int resultado = numeros.stream()
            .reduce(0, Integer::sum);
        System.out.println("A soma dos numeros é: " + resultado);

        /*int resultado = numeros.stream()
            .reduce(0,somar);

        System.out.println("A soma dos numeros é: " + resultado);*/


    }
    
}
