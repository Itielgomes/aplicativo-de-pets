import java.util.concurrent.atomic.AtomicInteger;

class Adotador extends Usuario {
    private static AtomicInteger idCounter = new AtomicInteger(1);

    private int idAdotador;

    public Adotador(String nome, String email, String senha, String endereco, String telefone) {
        super(nome, email, senha, endereco, telefone);
        
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser nulo ou vazio.");
        }
        if (senha == null || senha.trim().isEmpty()) {
            throw new IllegalArgumentException("Senha não pode ser nula ou vazia.");
        }
        if (endereco == null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Endereço não pode ser nulo ou vazio.");
        }
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone não pode ser nulo ou vazio.");
        }

        this.idAdotador = idCounter.getAndIncrement();
    }

    public int getIdAdotador() {
        return idAdotador;
    }
}
