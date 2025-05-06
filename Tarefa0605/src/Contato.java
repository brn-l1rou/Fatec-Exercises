public class Contato{
    private String nome;
    private String numeroCelular;

    public Contato(String nome, String numeroCelular){
        this.nome = nome;
        this.numeroCelular = numeroCelular;
    }

    public String getNome(){

        return nome;
    }

    public String getNumeroCelular(){

        return numeroCelular;
    }

    @Override
    public String toString(){
        return nome + " - " + numeroCelular;
    }
}