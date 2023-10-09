public class Pessoa {
    
    private String nome;
    private double altura;

    public Pessoa(String nome, double altura){
        this.nome = nome;
        this.altura = altura;
    }

    public double getAltura(){
        return altura;
    }

    @Override
	public String toString() {
		return "\n " + nome + ", " + altura + "\n";
	}
}
