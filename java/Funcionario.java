public class Funcionario {

    String nome, cargo;
    double salario;

    public void aumentarSalario(double percentual) {
        double valorAumento = salario * percentual/100;
        salario += valorAumento;
    
    }
    public void exibirDetalhes(){
        System.out.println("Nome completo: " + nome);
        System.out.println("Cargo: " + cargo);
        System.out.println("Salário: " + salario);
    }
    public void adicionarFuncionario(String n, String c, double salario) {
        nome = n;
        cargo = c;
        this.salario = salario;
    }
}