public class Cliente {
    private String nome;
    private String curso;
    private int matricula;
    private Computador[] computadores;
    private int qtd;

    public Cliente(String nome, String curso, int matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
        this.computadores = new Computador[10];
        this.qtd = 0;
    }

    public void adicionarComputador(Computador c) {
        computadores[qtd] = c;
        qtd++;
    }

    public void mostrarInfos() {
        System.out.println("Cliente: " + nome);
        System.out.println("Curso: " + curso);
        System.out.println("Matrícula: " + matricula);
        System.out.println("Computadores adquiridos:");
        float total = 0;
        for (int i = 0; i < qtd; i++) {
            computadores[i].mostrarInfos();
            System.out.println("--------------");
            total += computadores[i].getPreco();
        }
        System.out.println("Total: R$" + total);
    }

    public Computador[] getComputadores() {
        return computadores;
    }

    public int getMatricula() {
        return matricula;
    }
}