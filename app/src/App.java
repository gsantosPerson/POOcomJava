public class App {
    public static void main(String[] args) throws Exception {
        Endereco e1 = new Endereco("vila brasilia", "Limeira", "235");
        Endereco endEscola = new Endereco("Central", "r2", "150");
        Escola escola1 = new Escola("IF", endEscola);
        Escola escola2 = new Escola("Osório", e1);
        Pessoa p1 = new Pessoa(e1, "Gustavo", escola1);
        Pessoa p2 = new Pessoa(e1, "Nathália", escola2);
        
        System.out.println(p1);
        System.out.println("\n==========================\n");
        System.out.println(p2);
    }
}
