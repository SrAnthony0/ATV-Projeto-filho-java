public class TesteAnimal {
    public static void main(String[] args) {
        
        Animal a1 = new Animal();

        a1.id = 9901;
        a1.nome = "Rex";
        a1.especie = "Pastor Alemão";
        a1.idade = 2;

        a1.vacinar();
        a1.vacinado = false;

        a1.setNome("bob");
        a1.setEspecie("salsicha");

        System.out.println("Nome do animal: " +a1.getNome());
        System.out.println("Espécie do animal: " +a1.getEspecie());
    }
}
