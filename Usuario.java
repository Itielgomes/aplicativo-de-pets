import java.util.List;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;


class Usuario {
    private static AtomicInteger idCounter = new AtomicInteger(1); 

    private int idUsuario;
    private String nome;
    private String email;
    private String senha;
    private String endereco;
    private String telefone;

    public Usuario(String nome, String email, String senha, String endereco, String telefone) {
        this.idUsuario = idCounter.getAndIncrement();
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public static Usuario login(List<Usuario> usuarios, String email, String senha) {
        return null;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getSenha() {
        return senha;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public void cadastrarUsuario() {
        System.out.println("Usuário cadastrado com sucesso. ID: " + this.idUsuario);
    }

    public void atualizarUsuario() {
        System.out.println("Usuário atualizado com sucesso.");
    }

    public void excluirUsuario() {
        System.out.println("Usuário excluído com sucesso.");
    }

    public void entrarAnonimo() {
        System.out.println("Entrou como usuário anônimo.");
    }

    public static Usuario login(Usuario[] usuarios, String email, String senha) {
        for (Usuario user : usuarios) {
            if (user.getEmail().equals(email) && user.getSenha().equals(senha)) {
                System.out.println("Login bem-sucedido. ID do usuário: " + user.getIdUsuario());
                return user;
            }
        }
        System.out.println("Email ou senha incorretos.");
        return null;
    }
}
