import java.util.Scanner;

public class TestarFuncionario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Funcionario f1 = new Funcionario();

        System.out.println("Digite o nome do funcionário");
        String nome = scanner.nextLine();

        System.out.println("Digite o cargo do funcionário");
        String cargo = scanner.nextLine();

        System.out.println("Digite o salário do funcionário");
        double salario = Double.parseDouble(scanner.nextLine());
        
        f1.adicionarFuncionario(nome, cargo, salario);
        

        f1.aumentarSalario(25.0);
        f1.exibirDetalhes();

        scanner.close();
    }
}
