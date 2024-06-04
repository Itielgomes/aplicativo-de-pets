import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

class Adocao extends Adotador {
    private static AtomicInteger idCounter = new AtomicInteger(1);

    private int idPet;
    private Date dataDaAdocao;

    public Adocao(String nome, String email, String senha, String endereco, String telefone, int idPet, Date dataDaAdocao) {
        super(nome, email, senha, endereco, telefone);
        
        if (idPet <= 0) {
            throw new IllegalArgumentException("ID do pet deve ser maior que zero.");
        }
        if (dataDaAdocao == null) {
            throw new IllegalArgumentException("Data da adoção não pode ser nula.");
        }
        
        this.idPet = idPet;
        this.dataDaAdocao = dataDaAdocao;
    }

    public void registrarAdocao() {
        try {
            if (Math.random() > 0.5) {
                throw new Exception("Erro ao registrar adoção.");
            }
            System.out.println("Adoção registrada com sucesso.");
        } catch (Exception e) {
            System.err.println("Falha ao registrar adoção: " + e.getMessage());
        }
    }

    public void processarAdocao() {
        try {
            if (Math.random() > 0.5) {
                throw new Exception("Erro ao processar adoção.");
            }
            System.out.println("Adoção processada com sucesso.");
        } catch (Exception e) {
            System.err.println("Falha ao processar adoção: " + e.getMessage());
        }
    }
}
