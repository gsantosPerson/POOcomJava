public class Banda {
    private String nome;
    private String origem;

    public Banda(String nome, String origem){
        this.nome = nome;
        this.origem = origem;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNacionalidade(String nacionalidade) {
        this.origem = nacionalidade;
    }

    public String getNome() {
        return nome;
    }

    public String getNacionalidade() {
        return origem;
    }

    @Override

        public String toString(){
            return "Nome: " + nome + 
                    "\nOrigem: " + origem + "\n";

        }
}
