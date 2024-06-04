import java.util.ArrayList;
import java.util.List;

public class Animal {
    private int idAnimal;
    private String nome;
    private int idade;
    private String especie;
    private String raca;
    private String genero;
    private String status;
    private int idResponsavel;

    public Animal(int idAnimal, String nome, int idade, String especie, String raca, String genero, String status, int idResponsavel) {
        if (idAnimal <= 0) {
            throw new IllegalArgumentException("ID do animal deve ser maior que zero.");
        }
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException("Espécie não pode ser nula ou vazia.");
        }
        if (raca == null || raca.trim().isEmpty()) {
            throw new IllegalArgumentException("Raça não pode ser nula ou vazia.");
        }
        if (genero == null || genero.trim().isEmpty()) {
            throw new IllegalArgumentException("Gênero não pode ser nulo ou vazio.");
        }
        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException("Status não pode ser nulo ou vazio.");
        }
        if (idResponsavel <= 0) {
            throw new IllegalArgumentException("ID do responsável deve ser maior que zero.");
        }
        
        this.idAnimal = idAnimal;
        this.nome = nome;
        this.idade = idade;
        this.especie = especie;
        this.raca = raca;
        this.genero = genero;
        this.status = status;
        this.idResponsavel = idResponsavel;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        if (idAnimal <= 0) {
            throw new IllegalArgumentException("ID do animal deve ser maior que zero.");
        }
        this.idAnimal = idAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.trim().isEmpty()) {
            throw new IllegalArgumentException("Nome não pode ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0) {
            throw new IllegalArgumentException("Idade não pode ser negativa.");
        }
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        if (especie == null || especie.trim().isEmpty()) {
            throw new IllegalArgumentException("Espécie não pode ser nula ou vazia.");
        }
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca == null || raca.trim().isEmpty()) {
            throw new IllegalArgumentException("Raça não pode ser nula ou vazia.");
        }
        this.raca = raca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        if (genero == null || genero.trim().isEmpty()) {
            throw new IllegalArgumentException("Gênero não pode ser nulo ou vazio.");
        }
        this.genero = genero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        if (status == null || status.trim().isEmpty()) {
            throw new IllegalArgumentException("Status não pode ser nulo ou vazio.");
        }
        this.status = status;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        if (idResponsavel <= 0) {
            throw new IllegalArgumentException("ID do responsável deve ser maior que zero.");
        }
        this.idResponsavel = idResponsavel;
    }

    public void cadastrarAnimal() {

    }

    public void atualizarAnimal() {

    }

    public void excluirAnimal() {
        
    }

    public static List<Animal> animaisDoados(List<Animal> animais) {
        if (animais == null) {
            throw new IllegalArgumentException("A lista de animais não pode ser nula.");
        }
        List<Animal> doados = new ArrayList<>();
        for (Animal animal : animais) {
            if ("doados".equalsIgnoreCase(animal.getStatus())) {
                doados.add(animal);
            }
        }
        return doados;
    }

    public static List<Animal> animaisParaDoacao(List<Animal> animais) {
        if (animais == null) {
            throw new IllegalArgumentException("A lista de animais não pode ser nula.");
        }
        List<Animal> paraDoacao = new ArrayList<>();
        for (Animal animal : animais) {
            if ("paraDoacao".equalsIgnoreCase(animal.getStatus())) {
                paraDoacao.add(animal);
            }
        }
        return paraDoacao;
    }

    public static List<Animal> buscarAnimais(List<Animal> animais, String criterio) {
        if (animais == null) {
            throw new IllegalArgumentException("A lista de animais não pode ser nula.");
        }
        if (criterio == null || criterio.trim().isEmpty()) {
            throw new IllegalArgumentException("O critério de busca não pode ser nulo ou vazio.");
        }
        List<Animal> resultado = new ArrayList<>();
        for (Animal animal : animais) {
            if (animal.getNome().equalsIgnoreCase(criterio) || 
                animal.getEspecie().equalsIgnoreCase(criterio) || 
                animal.getRaca().equalsIgnoreCase(criterio)) {
                resultado.add(animal);
            }
        }
        return resultado;
    }

    public static List<Animal> filtrarAnimais(List<Animal> animais, String filtro, String valor) {
        if (animais == null) {
            throw new IllegalArgumentException("A lista de animais não pode ser nula.");
        }
        if (filtro == null || filtro.trim().isEmpty()) {
            throw new IllegalArgumentException("O filtro não pode ser nulo ou vazio.");
        }
        if (valor == null || valor.trim().isEmpty()) {
            throw new IllegalArgumentException("O valor do filtro não pode ser nulo ou vazio.");
        }
        List<Animal> resultado = new ArrayList<>();
        for (Animal animal : animais) {
            switch (filtro.toLowerCase()) {
                case "nome":
                    if (animal.getNome().equalsIgnoreCase(valor)) {
                        resultado.add(animal);
                    }
                    break;
                case "especie":
                    if (animal.getEspecie().equalsIgnoreCase(valor)) {
                        resultado.add(animal);
                    }
                    break;
                case "raca":
                    if (animal.getRaca().equalsIgnoreCase(valor)) {
                        resultado.add(animal);
                    }
                    break;
                case "genero":
                    if (animal.getGenero().equalsIgnoreCase(valor)) {
                        resultado.add(animal);
                    }
                    break;
                case "status":
                    if (animal.getStatus().equalsIgnoreCase(valor)) {
                        resultado.add(animal);
                    }
                    break;
                case "idResponsavel":
                    if (Integer.toString(animal.getIdResponsavel()).equals(valor)) {
                        resultado.add(animal);
                    }
                    break;
                default:
                    throw new IllegalArgumentException("Filtro inválido: " + filtro);
            }
        }
        return resultado;
    }
}
