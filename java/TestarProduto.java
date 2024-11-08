public class TestarProduto{

    public static void main(String[] args) {
    
    Produto p1 = new Produto();
    Produto p2 = new Produto();

    p1.cadastrarProduto(1001, "Feijão", 500, 8.99);
    p2.cadastrarProduto(1002, "Arroz", 350, 6.89);

    p1.aumentarEstoque(200);
    p1.aumentarEstoque(150);
    p1.reduzirEstoque(800);
    p1.reduzirEstoque(5);

    p1.exibirDetalhes();

    }
}