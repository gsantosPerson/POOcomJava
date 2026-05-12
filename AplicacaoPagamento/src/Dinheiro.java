public class Dinheiro extends Pagamento{
    private String tipoMoeda;

    public Dinheiro(double valor, int vencimento, String estabelecimento, String tipoMoeda){
        super(valor, vencimento, estabelecimento);
        this.tipoMoeda = tipoMoeda;
    }

    public void setTipoMoeda(String tipoMoeda) {
        this.tipoMoeda = tipoMoeda;
    }

    public String getTipoMoeda() {
        return tipoMoeda;
    }

    @Override
    public void realizarPagamento(){
        System.out.println("Pagamento realizado em: "+tipoMoeda);
    }

    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Tipo de moeda: "+tipoMoeda);
    }
    
}
