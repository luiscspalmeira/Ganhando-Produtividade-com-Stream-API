import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {

    //Declaracao dos atributos.
    private List<Item> itemList;

    //Metodo construtor que inicializa a lista vazia.
    public CarrinhoDeCompra(){
        this.itemList = new ArrayList<>();
    }

    //Metodo para adicionar o item.
    public void adicionarItem(String nome, double preco,int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    //Metodo para calcular o valor total do item.
    public double calcularValorTotal(){
        double valorTotal = 0;
        
        //Expressao Lambda (representa interfaces funcionais) para substituir a expressão comentada.
        return itemList.stream().mapToDouble(item -> item.getPreco() * item.getQuantidade()).sum();

       /* if(!itemList.isEmpty()){
            for (Item i : itemList)
                valorTotal = valorTotal + i.getPreco() * i.getQuantidade();
        }else
            throw new RuntimeException("A lista está vazia");

        return valorTotal;*/

    }

    //Metodo para exibir a lista.
    public void exibirItem(){
        System.out.println(itemList);
    }
    
}
