import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Usuario> usuarios = new ArrayList<>();
        List<Animal> animais = new ArrayList<>();
        List<Denuncia> denuncias = new ArrayList<>();
        List<Doacao> doacoes = new ArrayList<>();
        List<Adocao> adocoes = new ArrayList<>();

        Usuario loggedUser = null;

        while (true) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Atualizar Usuário");
            System.out.println("3. Excluir Usuário");
            System.out.println("4. Entrar Anônimo");
            System.out.println("5. Login");
            System.out.println("6. Cadastrar Animal");
            System.out.println("7. Atualizar Animal");
            System.out.println("8. Excluir Animal");
            System.out.println("9. Listar Animais Doados");
            System.out.println("10. Listar Animais para Doação");
            System.out.println("11. Registrar Denúncia");
            System.out.println("12. Listar Denúncias");
            System.out.println("13. Registrar Doação");
            System.out.println("14. Registrar Adoção");
            System.out.println("15. Sair");

            int opcao = scanner.nextInt();
            scanner.nextLine(); // Consume newline

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
                    usuarios.add(newUser);
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
                        usuarios.remove(loggedUser);
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
                    loggedUser = Usuario.login(usuarios.toArray(new Usuario[0]), loginEmail, loginSenha);
                    break;

                case 6:
                    if (loggedUser != null) {
                        System.out.print("Nome do Animal: ");
                        String nomeAnimal = scanner.nextLine();
                        System.out.print("Idade: ");
                        int idade = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Espécie: ");
                        String especie = scanner.nextLine();
                        System.out.print("Raça: ");
                        String raca = scanner.nextLine();
                        System.out.print("Gênero: ");
                        String genero = scanner.nextLine();
                        System.out.print("Status: ");
                        String status = scanner.nextLine();

                        Animal newAnimal = new Animal(0, nomeAnimal, idade, especie, raca, genero, status, loggedUser.getIdUsuario());
                        animais.add(newAnimal);
                        newAnimal.cadastrarAnimal();
                    } else {
                        System.out.println("Você precisa estar logado para cadastrar um animal.");
                    }
                    break;

                case 7:
                    if (loggedUser != null) {
                        // Implementar a lógica de atualização de animal
                    } else {
                        System.out.println("Você precisa estar logado para atualizar um animal.");
                    }
                    break;

                case 8:
                    if (loggedUser != null) {
                        // Implementar a lógica de exclusão de animal
                    } else {
                        System.out.println("Você precisa estar logado para excluir um animal.");
                    }
                    break;

                case 9:
                    if (loggedUser != null) {
                        List<Animal> doados = Animal.animaisDoados(animais);
                        for (Animal a : doados) {
                            System.out.println("Animal doado: " + a.getNome());
                        }
                    } else {
                        System.out.println("Você precisa estar logado para listar animais doados.");
                    }
                    break;

                case 10:
                    if (loggedUser != null) {
                        List<Animal> paraDoacao = Animal.animaisParaDoacao(animais);
                        for (Animal a : paraDoacao) {
                            System.out.println("Animal para doação: " + a.getNome());
                        }
                    } else {
                        System.out.println("Você precisa estar logado para listar animais para doação.");
                    }
                    break;

                case 11:
                    if (loggedUser != null) {
                        System.out.print("ID do Animal: ");
                        int idAnimal = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Descrição: ");
                        String descricao = scanner.nextLine();

                        Denuncia newDenuncia = new Denuncia(denuncias.size() + 1, idAnimal, loggedUser.getIdUsuario(), new Date(), descricao);
                        denuncias.add(newDenuncia);
                        newDenuncia.registrarDenuncia();
                    } else {
                        System.out.println("Você precisa estar logado para registrar uma denúncia.");
                    }
                    break;

                case 12:
                    if (loggedUser != null) {
                        for (Denuncia d : denuncias) {
                            System.out.println("Denúncia: " + d.getDescricao() + ", Data: " + d.getDataDenuncia());
                        }
                    } else {
                        System.out.println("Você precisa estar logado para listar denúncias.");
                    }
                    break;

                case 13:
                    if (loggedUser != null && loggedUser instanceof Doador) {
                        System.out.print("ID do Pet: ");
                        int idPet = scanner.nextInt();
                        scanner.nextLine();
                        System.out.print("Valor da Doação: ");
                        double valor = scanner.nextDouble();
                        scanner.nextLine();

                        Doacao newDoacao = new Doacao(doacoes.size() + 1, idPet, loggedUser.getIdUsuario(), 0, new Date(), valor, loggedUser.getNome(), loggedUser.getEmail(), loggedUser.getSenha(), loggedUser.getEndereco(), loggedUser.getTelefone());
                        doacoes.add(newDoacao);
                        System.out.println("Doação registrada com sucesso.");
                    } else {
                        System.out.println("Você precisa estar logado como doador para registrar uma doação.");
                    }
                    break;

                case 14:
                    if (loggedUser != null && loggedUser instanceof Adotador) {
                        System.out.print("ID do Pet: ");
                        int idPetAdocao = scanner.nextInt();
                        scanner.nextLine();

                        Adocao newAdocao = new Adocao(loggedUser.getNome(), loggedUser.getEmail(), loggedUser.getSenha(), loggedUser.getEndereco(), loggedUser.getTelefone(), idPetAdocao, new Date());
                        adocoes.add(newAdocao);
                        newAdocao.registrarAdocao();
                    } else {
                        System.out.println("Você precisa estar logado como adotador para registrar uma adoção.");
                    }
                    break;

                case 15:
                    System.out.println("Saindo...");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}

