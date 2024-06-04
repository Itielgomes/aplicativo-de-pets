import java.util.ArrayList;
import java.util.List;

public class Animal {
    private static List<Animal> animais = new ArrayList<>();
    private int idAnimal;
    private String nome;
    private int idade;
    private String especie;
    private String raca;
    private String genero;
    private String status;
    private int idResponsavel;

    public Animal(int idAnimal, String nome, int idade, String especie, String raca, String genero, String status, int idResponsavel) {
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
        this.idAnimal = idAnimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public void cadastrarAnimal() {
        animais.add(this);
        System.out.println("Animal cadastrado com sucesso. ID: " + this.idAnimal);
    }

    public void atualizarAnimal() {
        for (Animal animal : animais) {
            if (animal.getIdAnimal() == this.idAnimal) {
                animal.setNome(this.nome);
                animal.setIdade(this.idade);
                animal.setEspecie(this.especie);
                animal.setRaca(this.raca);
                animal.setGenero(this.genero);
                animal.setStatus(this.status);
                animal.setIdResponsavel(this.idResponsavel);
                System.out.println("Animal atualizado com sucesso. ID: " + this.idAnimal);
                return;
            }
        }
        System.out.println("Animal não encontrado para atualização. ID: " + this.idAnimal);
    }

    public void excluirAnimal() {
        if (animais.removeIf(animal -> animal.getIdAnimal() == this.idAnimal)) {
            System.out.println("Animal excluído com sucesso. ID: " + this.idAnimal);
        } else {
            System.out.println("Animal não encontrado para exclusão. ID: " + this.idAnimal);
        }
    }

    public static List<Animal> animaisDoados(List<Animal> animais) {
        List<Animal> doados = new ArrayList<>();
        for (Animal animal : animais) {
            if ("doados".equalsIgnoreCase(animal.getStatus())) {
                doados.add(animal);
            }
        }
        return doados;
    }

    public static List<Animal> animaisParaDoacao(List<Animal> animais) {
        List<Animal> paraDoacao = new ArrayList<>();
        for (Animal animal : animais) {
            if ("paraDoacao".equalsIgnoreCase(animal.getStatus())) {
                paraDoacao.add(animal);
            }
        }
        return paraDoacao;
    }

    public static List<Animal> buscarAnimais(List<Animal> animais, String criterio) {
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
            }
        }
        return resultado;
    }
}
