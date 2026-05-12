public class Pix extends Pagamento{
    private String usuario;
    private String chave;

    public Pix(double valor, int vencimento, String estabelecimento, String usuario, String chave){
        super(valor, vencimento, estabelecimento);
        this.usuario = usuario;
        this.chave = chave;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getChave() {
        return chave;
    }

    @Override
    public void realizarPagamento(){
            System.out.println("Pagamento realizado com pix");
        }
    
    @Override
    public void mostrarDados(){
        super.mostrarDados();
        System.out.println("Usuário: "+usuario);
        System.out.println("Chave pix: "+chave);
    }
}
