import java.util.Scanner;

public class PCMania {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Cliente cliente = new Cliente("Hugo Henrique Reis Camilo", "Gep", 98);

        int mat = cliente.getMatricula();

        Computador promo1 = new Computador(
            "Apple", mat,
            new HardwareBasico[]{
                new HardwareBasico("Pentium Core i3",2200),
                new HardwareBasico("Memória RAM",8),
                new HardwareBasico("HD",500)
            },
            new SistemaOperacional("macOS Sequoia",64),
            new MemoriaUSB("Pen-drive",16)
        );

        Computador promo2 = new Computador(
            "Samsung", mat+1234,
            new HardwareBasico[]{
                new HardwareBasico("Pentium Core i5",3370),
                new HardwareBasico("Memória RAM",16),
                new HardwareBasico("HD",1000)
            },
            new SistemaOperacional("Windows 8",64),
            new MemoriaUSB("Pen-drive",32)
        );

        Computador promo3 = new Computador(
            "Dell", mat+5678,
            new HardwareBasico[]{
                new HardwareBasico("Pentium Core i7",4500),
                new HardwareBasico("Memória RAM",32),
                new HardwareBasico("HD",2000)
            },
            new SistemaOperacional("Windows 10",64),
            new MemoriaUSB("HD Externo",1000)
        );

        System.out.println("Bem-vindo(a) à PCMania!");
        System.out.println("Escolha entre as promoções abaixoc:\n");
        System.out.println("Promoção 1:");
        promo1.mostrarInfos();
        System.out.println("--------------");
        System.out.println("Promoção 2:");
        promo2.mostrarInfos();
        System.out.println("--------------");
        System.out.println("Promoção 3:");
        promo3.mostrarInfos();
        System.out.println("--------------");

        while (true) {
            System.out.println("Digite uma opção:");
            System.out.println("1 - Promoção 1");
            System.out.println("2 - Promoção 2");
            System.out.println("3 - Promoção 3");
            System.out.println("0 - Sair\n");
            int op = sc.nextInt();

            if (op==1) {
                cliente.adicionarComputador(promo1);
            }
            else if (op==2) {
                cliente.adicionarComputador(promo2);
            }
            else if (op==3) {
                cliente.adicionarComputador(promo3);
            } else if (op==0) {
                break;
            }
        }

        cliente.mostrarInfos();
        ProcessarPedido.enviar(cliente.getComputadores());
    }
}