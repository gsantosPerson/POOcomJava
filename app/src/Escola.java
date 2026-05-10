public class Escola {
    private String nome;
    private Endereco endereco;

    public Escola(String nome, Endereco endereco){
        this.nome = nome;
        this.endereco = endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    @Override
    public String toString(){
        return "\nNome: " + nome + 
                "\n" + endereco;
    }
    
}



