public class PrincipalPessoa {
    
        public static void main(String[] args) {
            OrdenacaoPessoa ordenaPessoa = new OrdenacaoPessoa();

            ordenaPessoa.adicionaPessoa("Luis", 1.86);
            ordenaPessoa.adicionaPessoa("Claudio", 1.80);
            ordenaPessoa.adicionaPessoa("dos", 1.96);

            ordenaPessoa.exibirPessoa();
            System.out.println(ordenaPessoa.ordenaPorAltura());
            

        }
    
}

