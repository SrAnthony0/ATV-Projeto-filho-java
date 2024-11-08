public class TestarCliente{

    public static void main(String[] args) {
    
    Cliente c1 = new Cliente();

    c1.id = 5001;
    c1.nome = "José";
    c1.email = "Jose@email.com";
    c1.telefone = "(81) 9999-9999";

    c1.atualizarEmail("josesilva@email.com");
    c1.atualizarEmail("jose_silva@email.com");
    c1.atualizarTelefone("(81) 3721-3976");

    c1.exibirDetalhes();
    }
}