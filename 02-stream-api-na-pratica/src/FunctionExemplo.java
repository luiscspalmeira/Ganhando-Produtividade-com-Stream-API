import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/*
 * REPRESENTA UMA FUNCAO QUE ACEITA UM ARGMENTO DO TIPO T E RETORNA UM RESULTADO TIPO R.
 */
public class FunctionExemplo {

    public static void main(String[] args){
        //CRIA LISTA DE NUMEROS INTEIROS.
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //USA A FUNCTION COM EXPRESSÃO LAMBDA PARA DOBRAR TODOS OS NÚMEROS.
        Function<Integer, Integer> dobrar = numero -> numero * 2;

        //USA A FUNCAO PARA DOBRAR TODOS OS NUMEROS NO STREAM E ARMAZENAR EM OUTRA LISTA.
        /*List<Integer> numerosDobrados = numeros.stream()
            .map(dobrar)
            .collect(Collectors.toList());  
        
        numerosDobrados.forEach( n -> System.out.println(n));*/

        List<Integer> numerosDobrados = numeros.stream()
            .map(dobrar)
            .toList();
        numerosDobrados.forEach(System.out::println);
    }
}
