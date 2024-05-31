import java.util.concurrent.atomic.AtomicInteger;

class Doador extends Usuario {
    private static AtomicInteger idCounter = new AtomicInteger(1);

    private int idDoador;

    public Doador(String nome, String email, String senha, String endereco, String telefone) {
        super(nome, email, senha, endereco, telefone);
        this.idDoador = idCounter.getAndIncrement();
    }

    public int getIdDoador() {
        return idDoador;
    }

}
