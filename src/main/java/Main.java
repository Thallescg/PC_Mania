import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Computador c1;
        Computador c2;
        Computador c3;
        Cliente cl1;

        c1 = new Computador();
        c2 = new Computador();
        c3 = new Computador();
        cl1 = new Cliente();

        c1.nome = "Positivo";
        c2.nome = "Acer";
        c3.nome = "Vaio";

        c1.preco = 1300;
        c2.preco = 1800;
        c3.preco = 2800;

        c1.hardware.processador = "Pentium Core i3 (1200 Mhz)";
        c2.hardware.processador = "Pentium Core i5 (2260 Mhz)";
        c3.hardware.processador = "Pentium Core i7 (3500 Mhz)";

        c1.hardware.capacidadeRam = 4;
        c2.hardware.capacidadeRam = 8;
        c3.hardware.capacidadeRam = 16;

        c1.hardware.capacidadeHD = 500;
        c2.hardware.capacidadeHD = 1000;
        c3.hardware.capacidadeHD = 2000;

        c1.sistema.nome = "Sistema Operacional Linux Ubuntu";
        c2.sistema.nome = "Sistema Operacional Windows";
        c3.sistema.nome = "Sistema Operacional Windows 10";

        c1.sistema.tipo = 32;
        c2.sistema.tipo = 64;
        c3.sistema.tipo = 64;

        c1.memoria.nome = "Pen-drive";
        c2.memoria.nome = "Pen-drive";
        c3.memoria.nome = "HD Externo";

        c1.memoria.capacidade = 16;
        c2.memoria.capacidade = 32;
        c3.memoria.capacidade = 1000;

        int promocao;
        int cont1 = 0;
        int cont2 = 0;
        int cont3 = 0;


        Scanner entradapromo = new Scanner(System.in);
        Scanner entradaclientecpf = new Scanner(System.in);
        Scanner entradaclientenome = new Scanner(System.in);

        System.out.println("Digite seu CPF:");
        cl1.cpf = entradaclientecpf.nextLong();
        System.out.println("Digite seu nome:");
        cl1.nome = entradaclientenome.next();

        do {
            System.out.println("Escolha a promocao:");
            promocao = entradapromo.nextInt();
            if(promocao == 1) {
                cont1++;
                cl1.calculaTotalCompra();
            } else if(promocao == 2) {
                cont2++;
                cl1.calculaTotalCompra();
            } else if(promocao == 3){
                cont3++;
                cl1.calculaTotalCompra();
            }
            cl1.calculaTotalCompra();
        } while (promocao!= 0);

        System.out.println(cl1.nome);
        System.out.println(cl1.cpf);
        if(cont1 != 0 && cont2!= 0 && cont3!= 0) {
            c1.mostraPCconfigs();
            c2.mostraPCconfigs();
            c3.mostraPCconfigs();
            System.out.println(cl1.calculaTotalCompra());}
            else if(cont1 != 0 && cont2 != 0 && cont3 == 0){
            c1.mostraPCconfigs();
            c2.mostraPCconfigs();
            System.out.println(cl1.calculaTotalCompra());}
            else if(cont1 != 0 && cont2 == 0 && cont3 != 0){
            c1.mostraPCconfigs();
            c3.mostraPCconfigs();
            System.out.println(cl1.calculaTotalCompra());}
            else if(cont1 == 0 && cont2 != 0 && cont3 != 0){
            c1.mostraPCconfigs();
            c2.mostraPCconfigs();
            System.out.println(cl1.calculaTotalCompra());}
            else if(cont1 == 0 && cont2 == 0 && cont3 == 0){
                System.out.println("Voce nao comprou nada");}
            }
        }