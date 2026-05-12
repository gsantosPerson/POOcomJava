public abstract class Pagamento {
    private double valor;
    private int vencimento;
    private String estabelecimento;

    public Pagamento(double valor, int vencimento, String estabelecimento){
        this.valor = valor;
        this.vencimento = vencimento;
        this.estabelecimento = estabelecimento;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setVencimento(int vencimento) {
        this.vencimento = vencimento;
    }

    public void setEstabelecimento(String estabelecimento) {
        this.estabelecimento = estabelecimento;
    }

    public double getValor() {
        return valor;
    }

    public int getVencimento() {
        return vencimento;
    }
    
    public String getEstabelecimento() {
        return estabelecimento;
    }

    public abstract void realizarPagamento();

    public void mostrarDados(){
        System.out.println("Valor: "+valor);
        System.out.println("Vencimento: "+vencimento);
        System.out.println("Estabelecimento: "+estabelecimento);
    }
}
