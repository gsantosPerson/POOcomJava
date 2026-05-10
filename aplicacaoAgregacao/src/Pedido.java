public class Pedido {
    private int numComanda;
    private String nomeComanda;
    private ItemPedido itemPedido;
    private double preco;


    

    public Pedido(int numComanda, String nomeComanda, double preco){
        this.numComanda = numComanda;
        this.nomeComanda = nomeComanda;
        this.preco = preco;
    }

    public void setNumComanda(int numComanda) {
        this.numComanda = numComanda;
    }

    public void setNomeComanda(String nomeComanda) {
        this.nomeComanda = nomeComanda;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getNumComanda() {
        return numComanda;
    }

    public String getNomeComanda() {
        return nomeComanda;
    }

    public double getPreco() {
        return preco;
    }

    public void adicionarItens(String sanduiche, String tamanhoBatata, String bebida){
        this.itemPedido = new ItemPedido(sanduiche, tamanhoBatata, bebida);
    }

    @Override

       public String toString(){
            return      "Número da comanda: " + numComanda +
                        "\nNome da comanda: " + nomeComanda +
                        "\nItens do pedido" + itemPedido +
                        "\nPreço da comanda: " + preco;
        }
}
