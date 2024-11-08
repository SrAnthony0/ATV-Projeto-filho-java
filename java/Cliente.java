public class Cliente {
    
    int id;
    String nome, email, telefone;

    public void atualizarEmail(String novoEmail){
        email = novoEmail;
    }
    public void atualizarTelefone(String novoTel){
        telefone = novoTel;
    }
    public void exibirDetalhes(){
        System.out.println("ID nº: " + id);
        System.out.println("Nome completo: " + nome);
        System.out.println("E-mail: " + email);
        System.out.println("Contato: " + telefone);
    }
}
