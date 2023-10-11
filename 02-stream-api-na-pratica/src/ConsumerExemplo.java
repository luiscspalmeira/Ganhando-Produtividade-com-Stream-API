import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;


/*
 * REPRESENTA UMA OPERAÇÃO QUE ACEITA UM ARGUMENTO TIPO T E NÃO RETORNA NENHUM RESULTADO.
 */


public class ConsumerExemplo {

    public static void main(String[] args) throws Exception {

        //CRIA UMA LISTA DE NUMEROS INTEIROS.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

        //USA O CONSUMER COM EXPRESSAO LAMBDA PARA IMPRIMIR NUMEROS PARES.
        numeros.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
        // PRIMEIRO
        /*Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0){
                System.out.println(numero);
            }
        };*/

        // SEGUNDO
        /*numeros.forEach( t -> {
                if (t % 2 == 0)
                    System.out.println(t);
            }            
        );*/
    }
    
}
