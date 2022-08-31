public class Computador {
    String nome;
    float preco = 0;
    SistemaOperacional sistema = new SistemaOperacional();
    HardwarweBasico hardware = new HardwarweBasico();
    MemoriaUSB memoria = new MemoriaUSB();



    void mostraPCconfigs() {
        System.out.println(nome);
        System.out.println(preco + "R$");
        System.out.println(hardware.processador);
        System.out.println(hardware.capacidadeRam + "Gb");
        System.out.println(hardware.capacidadeHD + "Gb");
        System.out.println(sistema.nome);
        System.out.println(sistema.tipo + "Bits");
        System.out.println(memoria.nome);
        System.out.println(memoria.capacidade + "Gb");
    }
}
