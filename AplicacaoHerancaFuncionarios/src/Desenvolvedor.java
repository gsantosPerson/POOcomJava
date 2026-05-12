public class Desenvolvedor extends Funcionario{
    private String nivel;

    public Desenvolvedor(String nome, String cpf, double salarioBase, String nivel){
        super(nome, cpf, salarioBase);
        this.nivel = nivel;
    }

    public void setNivel(String nivel) {
        this.nivel = nivel;
    }

    public String getNivel() {
        return nivel;
    }

    @Override
    public double calcularSalario(){
        return getSalarioBase() + 500;
    }

    @Override
    public void exibirDados(){
        super.exibirDados();
        System.out.println("Nível: "+getNivel());
    }
}
