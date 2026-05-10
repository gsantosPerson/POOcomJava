public class App {
    public static void main(String[] args) throws Exception {
        Pedido p1 = new Pedido(1, "Gustavo", 5);
        p1.adicionarItens("x-tudo", "batata grande", "Coca Cola");

        Pedido p2 = new Pedido(2, "Marcos",50);
        p2.adicionarItens("x-salada", "Média", "Guarná");
        System.out.println(p1);
        System.out.println("");
        System.out.println(p2);
        System.out.println("");
        System.out.println(p1);
    }
}
