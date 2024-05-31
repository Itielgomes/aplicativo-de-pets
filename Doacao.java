import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
class Doacao extends Doador {
    private static AtomicInteger idCounter = new AtomicInteger(1);

    private int idDoacao;
    private int idPet;
    private Date dataDoacao;
    private double valorDoacao;

    public Doacao(String nome, String email, String senha, String endereco, String telefone, int idPet, Date dataDoacao, double valorDoacao) {
        super(nome, email, senha, endereco, telefone);
        this.idDoacao = idCounter.getAndIncrement();
        this.idPet = idPet;
        this.dataDoacao = dataDoacao;
        this.valorDoacao = valorDoacao;
    }

    public void registrarDoacao() {
        System.out.println("Doação registrada com sucesso. ID da doação: " + this.idDoacao);
    }

    public void processarDoacao() {
        System.out.println("Doação processada com sucesso.");
    }
}
