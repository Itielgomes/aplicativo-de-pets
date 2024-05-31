import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
class Adocao extends Adotador {
    private static AtomicInteger idCounter = new AtomicInteger(1);

    private int idPet;
    private Date dataDaAdocao;

    public Adocao(String nome, String email, String senha, String endereco, String telefone, int idPet, Date dataDaAdocao) {
        super(nome, email, senha, endereco, telefone);
        this.idPet = idPet;
        this.dataDaAdocao = dataDaAdocao;
    }

    public void registrarAdocao() {
        System.out.println("Adoção registrada com sucesso.");
    }

    public void processarAdocao() {
        System.out.println("Adoção processada com sucesso.");
    }
}
