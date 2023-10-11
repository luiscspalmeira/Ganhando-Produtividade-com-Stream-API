import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/*
 * REPRESENTA UMA OPERACAO QUE NÃO ACEITA ARGUMENTO E RETORNA O RESULTADO TIPO T.
 */

public class SupplierExemplo {

    public static void main(String[] args){
        //USAR O SUPPLIER COM EXPRESSÃO LAMBDA P FORNECER SAUDAÇÃO PERSONALIZADA.
        Supplier<String> saudacao = () -> "Olá, seja bem vindo!";


        //USAR O SUPPLIER PARA OBTER UMA LISTA COM 5 SAUDACOES.
        /*List<String> listaSaudacoes = Stream.generate(saudacao)
            .limit(5)
            .collect(Collectors.toList());*/
        //listaSaudacoes.forEach(s -> System.out.println(s));

        List<String> listaSaudacoes = Stream.generate(() -> "Olá, seja bem vindo!")
            .limit(5)
            .toList();
        listaSaudacoes.forEach(System.out::println);
    }
    
}
