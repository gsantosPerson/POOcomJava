public class Estagiario extends Funcionario{
    private int horasTrabalhadas;

    public Estagiario(String nome, String cpf, double salarioBase, int horasTrabalhadas){
        super(nome, cpf, salarioBase);
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public void setHorasTrabalhadas(int horasTrabalhadas) {
        this.horasTrabalhadas = horasTrabalhadas;
    }

    public int getHorasTrabalhadas() {
        return horasTrabalhadas;
    }

    @Override
    public double calcularSalario(){
        return getHorasTrabalhadas() * 20;
        
    }

    @Override
    public void exibirDados(){
        System.out.println();
        super.exibirDados();
        System.out.println("Horas trabalhadas: "+getHorasTrabalhadas());
    }
}
