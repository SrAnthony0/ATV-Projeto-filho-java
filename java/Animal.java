public class Animal {
    int id, idade;
    String nome, especie;
    boolean vacinado;

    public void setNome(String novoNome){
        this.nome = novoNome;
    }
    public void setID(int novoID){
        this.id = novoID;
    }
    public void setEspecie(String novaEspecie){
        this.especie = novaEspecie;
    }

    public int getID(){
        return this.id;
    }
    public String getNome(){
        return this.nome;
    }
    public String getEspecie(){
        return this.especie;
    }
    public int getIdade(){
        return this.idade;
    }
    public boolean getVacinado(){
        return this.vacinado;
    }
    

    public void vacinar(){
        vacinado = true;
    }
    public void alterarIdade(int novaIdade){
        idade = novaIdade;
    }
    public void exibirDetalhes(){
        System.out.println("Nº de identificação: " + id);
        System.out.println("Nome do animal: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Espécial: " + especie);
        if(this.vacinado == true){
            System.out.println("Vacinado: SIM");
        }else{
            System.out.println("Vacinado: NÃO");
        }
    }
}
