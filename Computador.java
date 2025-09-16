public class Computador {
    private String marca;
    private float preco;
    private HardwareBasico[] hardware;
    private SistemaOperacional so;
    private MemoriaUSB memoriaUsb;

    public Computador(String marca, float preco, HardwareBasico[] hardware, SistemaOperacional so, MemoriaUSB memoriaUsb) {
        this.marca = marca;
        this.preco = preco;
        this.hardware = hardware;
        this.so = so;
        this.memoriaUsb = memoriaUsb;
    }

    public String getMarca() {
        return marca;
    }

    public float getPreco() {
        return preco;
    }

    public void mostrarInfos() {
        System.out.println("Marca: " + marca);
        for (HardwareBasico h : hardware) {
            System.out.println(h.getNome() + ": " + h.getCapacidade());
        }
        System.out.println("SO: " + so.getNome() + " " + so.getTipo() + " bits");
        System.out.println("Acompanha: " + memoriaUsb.getNome() + " " + memoriaUsb.getCapacidade() + "Gb");
        System.out.println("Preço: R$" + preco);
    }
}