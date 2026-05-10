public class ItemPedido {
    private String sanduiche;
    private String tamanhoBatata;
    private String bebida;

    public ItemPedido(String sanduiche, String tamanhoBatata, String bebida){
        this.sanduiche = sanduiche;
        this.tamanhoBatata = tamanhoBatata;
        this.bebida = bebida;
    }

    public void setSanduiche(String sanduiche) {
        this.sanduiche = sanduiche;
    }

    public void setTamanhoBatata(String tamanhoBatata) {
        this.tamanhoBatata = tamanhoBatata;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
    }

    public String getSanduiche() {
        return sanduiche;
    }

    public String getTamanhoBatata() {
        return tamanhoBatata;
    }

    public String getBebida() {
        return bebida;
    }

    @Override

    public String toString(){
        return "\nSanduiche: "+ sanduiche+
                "\nTamanho da batata: " + tamanhoBatata+
                "\nBebida: " + bebida;           
    }
}
