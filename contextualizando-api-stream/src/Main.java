/*
 * Projeto de uma lista de compra. Classes: Item e CarrinhoDeCompra.
 * Objetivo: inserir um objeto com os seus atributos e exibir-los, 
 * bem como o valor total do objeto.
 * Author: Luis Palmeira
 * Data: 2023-10-09
 */


public class Main {
    public static void main(String[] args) {
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();
        carrinhoDeCompra.adicionarItem("Copo", 20.50, 2);
        System.out.println(carrinhoDeCompra.calcularValorTotal());
        carrinhoDeCompra.exibirItem();
        
    }

}
