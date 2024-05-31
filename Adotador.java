import java.util.concurrent.atomic.AtomicInteger;
class Adotador extends Usuario {
    private static AtomicInteger idCounter = new AtomicInteger(1);

    private int idAdotador;

    public Adotador(String nome, String email, String senha, String endereco, String telefone) {
        super(nome, email, senha, endereco, telefone);
        this.idAdotador = idCounter.getAndIncrement();
    }

    public int getIdAdotador() {
        return idAdotador;
    }
}
