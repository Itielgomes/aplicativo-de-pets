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
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario[] usuarios = new Usuario[10]; 
        int userCount = 0;

        Usuario loggedUser = null;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Atualizar Usuário");
            System.out.println("3. Excluir Usuário");
            System.out.println("4. Entrar Anônimo");
            System.out.println("5. Login");
            System.out.println("6. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); 

            switch (opcao) {
                case 1:
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Email: ");
                    String email = scanner.nextLine();
                    System.out.print("Senha: ");
                    String senha = scanner.nextLine();
                    System.out.print("Endereço: ");
                    String endereco = scanner.nextLine();
                    System.out.print("Telefone: ");
                    String telefone = scanner.nextLine();

                    Usuario newUser = new Usuario(nome, email, senha, endereco, telefone);
                    usuarios[userCount++] = newUser;
                    newUser.cadastrarUsuario();
                    break;
                case 2:
                    if (loggedUser != null) {
                        System.out.print("Novo Nome: ");
                        loggedUser.setNome(scanner.nextLine());
                        System.out.print("Novo Email: ");
                        loggedUser.setEmail(scanner.nextLine());
                        System.out.print("Nova Senha: ");
                        loggedUser.setSenha(scanner.nextLine());
                        System.out.print("Novo Endereço: ");
                        loggedUser.setEndereco(scanner.nextLine());
                        System.out.print("Novo Telefone: ");
                        loggedUser.setTelefone(scanner.nextLine());

                        loggedUser.atualizarUsuario();
                    } else {
                        System.out.println("Você precisa estar logado para atualizar os dados.");
                    }
                    break;
                case 3:
                    if (loggedUser != null) {
                        loggedUser.excluirUsuario();
                        loggedUser = null;
                    } else {
                        System.out.println("Você precisa estar logado para excluir o usuário.");
                    }
                    break;
                case 4:
                    new Usuario("", "", "", "", "").entrarAnonimo();
                    break;
                case 5:
                    System.out.print("Email: ");
                    String loginEmail = scanner.nextLine();
                    System.out.print("Senha: ");
                    String loginSenha = scanner.nextLine();
                    loggedUser = login(usuarios, loginEmail, loginSenha);
                    break;
                case 6:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
    }
}
