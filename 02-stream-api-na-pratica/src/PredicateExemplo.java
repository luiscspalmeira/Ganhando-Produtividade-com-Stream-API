import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExemplo {
    
    public static void main(String[] args){

        //CRIA LISTA DE PALAVRAS
        List<String> palavras = Arrays.asList("Java", "Kotlin", "Python", "JavaScript", "C", "Ruby");

        //CRIA UM PREDICATE PRA VER SE A PALAVRA TEM MAIS DE 5 CARACTERES.
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        //USA O STREAM PARA FILTRAS AS PALAVRAS COM MAIS DE 5 CARACTERES E EM SEGUIDA AS IMPRIME.
        palavras.stream()
            .filter(p -> p.length() > 5)
            //.filter(maisDeCincoCaracteres)
            .forEach(System.out::println);
    }
}
