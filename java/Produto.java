 public class Produto {

        int codigo, quantidade;
        String nome;
        double preco;

        public void aumentarEstoque(int quantidade){
            this.quantidade += quantidade;

    }
    public void reduzirEstoque(int quantidade) {
        if(quantidade > this.quantidade){
            System.out.println("Quantidade insuficiente");
        }else{
             this.quantidade -= quantidade;
        }
    }
    public void exibirDetalhes(){
        System.out.println("Codigo do produto: " + codigo);
        System.out.println("Nome: " + nome);
        System.out.println("Quantidade: " + quantidade);
        System.out.println("Preço: " + preco);
    }
    public void cadastrarProduto(int codigoProduto, String nome, int qtd, double preco){
        codigo = codigoProduto;
        this.nome = nome;
        quantidade = qtd;
        this.preco = preco;
    }
}
