public class Cliente {
    String nome;
    long cpf;
    Computador computador = new Computador();


    float calculaTotalCompra() {

        computador.preco = computador.preco + computador.preco;

        return computador.preco;
    }
}
