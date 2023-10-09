import java.util.ArrayList;
import java.util.List;

import javax.management.RuntimeErrorException;

public class OrdenacaoPessoa {

    private List pessoaList;

    public OrdenacaoPessoa(){
        this.pessoaList = new ArrayList<>();
    }

    public void adicionaPessoa(String nome, double altura){
        pessoaList.add(new Pessoa(nome, altura));
    }

    public List<Pessoa> ordenaPorAltura(){
        if(!pessoaList.isEmpty()){
            List<Pessoa> pessoaPorAltura = new ArrayList<>(pessoaList);
            pessoaPorAltura.sort((p1, p2) -> Double.compare(p1.getAltura(), p2.getAltura()));
            return pessoaPorAltura;
        }else
            throw new RuntimeException("A lista está vazia.");
    }
    
    public void exibirPessoa(){
        System.out.println(pessoaList);
    }
}
