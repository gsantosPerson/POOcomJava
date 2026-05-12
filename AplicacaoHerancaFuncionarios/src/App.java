public class App {
    public static void main(String[] args){
        Funcionario f1 = new Funcionario("Pedro", "909999999", 50000);
        Gerente gerente1 = new Gerente("Gustavo", "9999999", 10000, 1000);
        Desenvolvedor d1 = new Desenvolvedor("Paullo", "11111111111111", 7000, "Pleno");
        Estagiario e1 = new Estagiario("Marcos", "444444444444444", 2000, 56);
        f1.exibirDados();
        System.out.println("Salario calculado: "+f1.calcularSalario());

        gerente1.exibirDados();
        System.out.println("Salario com bonus: "+gerente1.calcularSalario());
        
        d1.exibirDados();
        System.out.println("Salario com adiocional: "+d1.calcularSalario());

        e1.exibirDados();
        System.out.println("Salario multiplicado por horas trabalhadas: "+e1.calcularSalario());
    }

        
      
    }

