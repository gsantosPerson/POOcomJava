public class Cartao extends Pagamento{
    private String numeroConta;
    private String senha;
    private String transacao;

    public Cartao(double valor, int vencimento, String estabelecimento, String numeroConta, String senha, String transacao){
        super(valor, vencimento, estabelecimento);
        this.numeroConta = numeroConta;
        this.senha = senha;
        this.transacao = transacao;
    }    

    public void setNumeroConta(String numeroConta) {
        this.numeroConta = numeroConta;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setTransacao(String transacao) {
        this.transacao = transacao;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getSenha() {
        return senha;
    }

    public String getTransacao() {
        return transacao;
    }

    public void realizarPagamento(){
        System.out.println("Pagamento realizado com cartão de: "+transacao);
    }

    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Numero da conta: "+numeroConta);
        System.out.println("Código da conta: "+senha);
        System.out.println("Transação realizada com o método: "+transacao);
    }
}