 public class Pessoa {
    private Endereco endereco;
    private String nome;
    private Escola escola;

    public Pessoa(Endereco endereco, String nome, Escola escola){
        this.endereco = endereco;
        this.nome = nome;
        this.escola = escola;
    }


    public Endereco getEndereco() {
        return endereco;
    }
    
    public String getNome() {
        return nome;
    }

    public Escola getEscola() {
        return escola;
    }

    @Override
    public String toString(){
        return "Nome: " + nome+
                "\n" + endereco +
                "\n===Escola===" + 
                escola;
    }
    
}

