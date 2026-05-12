public class App {
    public static void main(String[] args) throws Exception {
        Pagamento cartao = new Cartao(50, 12, "bancoMaster", "2930", "123", "Débito");
        Pagamento dinheiro = new Dinheiro(100, 13, "bancoCentral", "Real");
        Pagamento pix = new Pix(200, 14, "BRB", "Gustavo", "12345");

        cartao.mostrarDados();
        cartao.realizarPagamento();
        System.out.println();

        dinheiro.mostrarDados();
        dinheiro.realizarPagamento();
        System.out.println();
        
        pix.mostrarDados();
        pix.realizarPagamento();
    }
}
