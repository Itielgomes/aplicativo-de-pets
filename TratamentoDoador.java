import java.util.concurrent.atomic.AtomicInteger;

class Doador extends Usuario {
    private static AtomicInteger idCounter = new AtomicInteger(1);

    private int idDoador;

    public Doador(String nome, String email, String senha, String endereco, String telefone) {
        super(validarNome(nome), validarEmail(email), validarSenha(senha), validarEndereco(endereco), validarTelefone(telefone));
        this.idDoador = idCounter.getAndIncrement();
    }

    public int getIdDoador() {
        return idDoador;
    }

    private static String validarNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser vazio.");
        }
        return nome;
    }

    private static String validarEmail(String email) {
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Email não pode ser vazio.");
        }
        return email;
    }

    private static String validarSenha(String senha) {
        if (senha == null || senha.trim().isEmpty()) {
            throw new IllegalArgumentException("Senha não pode ser vazia.");
        }
        return senha;
    }

    private static String validarEndereco(String endereco) {
        if (endereco == null || endereco.trim().isEmpty()) {
            throw new IllegalArgumentException("Endereço não pode ser vazio.");
        }
        return endereco;
    }

    private static String validarTelefone(String telefone) {
        if (telefone == null || telefone.trim().isEmpty()) {
            throw new IllegalArgumentException("Telefone não pode ser vazio.");
        }
        return telefone;
    }
}
