public class Gerente extends Funcionario{
    private double bonus;

    public Gerente(String nome, String cpf, double salarioBase, double bonus){
        super(nome, cpf, salarioBase);
        this.bonus = bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double calcularSalario(){
       return getSalarioBase() + getBonus();
       
       
    }

    @Override
    public void exibirDados(){
        System.out.println();
        super.exibirDados();
        System.out.println("Bonus: "+getBonus());
    } 
}