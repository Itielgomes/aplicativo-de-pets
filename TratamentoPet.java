import java.util.Date;

public class Pet extends Animal {
    private int idPet;
    private int idAnimal;
    private int idResponsavel;
    private Date dataChegada;
    private boolean vacinado;
    private String descricao;

    public Pet(int idPet, int idAnimal, String nome, int idade, String especie, String raca, String genero, String status, int idResponsavel, Date dataChegada, boolean vacinado, String descricao) {
        super(idAnimal, nome, idade, especie, raca, genero, status, idResponsavel);
        setIdPet(idPet);
        setIdAnimal(idAnimal);
        setIdResponsavel(idResponsavel);
        setDataChegada(dataChegada);
        setVacinado(vacinado);
        setDescricao(descricao);
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        if (idPet <= 0) {
            throw new IllegalArgumentException("ID do pet deve ser maior que zero.");
        }
        this.idPet = idPet;
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

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        if (idResponsavel <= 0) {
            throw new IllegalArgumentException("ID do responsável deve ser maior que zero.");
        }
        this.idResponsavel = idResponsavel;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
        if (dataChegada == null) {
            throw new IllegalArgumentException("Data de chegada não pode ser nula.");
        }
        this.dataChegada = dataChegada;
    }

    public boolean isVacinado() {
        return vacinado;
    }

    public void setVacinado(boolean vacinado) {
        this.vacinado = vacinado;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        if (descricao == null || descricao.trim().isEmpty()) {
            throw new IllegalArgumentException("Descrição não pode ser nula ou vazia.");
        }
        this.descricao = descricao;
    }

    public void cadastrarPet() {
        try {
            System.out.println("Pet cadastrado com sucesso. ID: " + this.idPet);
        } catch (Exception e) {
            System.err.println("Erro ao cadastrar pet: " + e.getMessage());
        }
    }

    public void atualizarPet() {
        try {
            System.out.println("Pet atualizado com sucesso. ID: " + this.idPet);
        } catch (Exception e) {
            System.err.println("Erro ao atualizar pet: " + e.getMessage());
        }
    }

    public void excluirPet() {
        try {
            System.out.println("Pet excluído com sucesso. ID: " + this.idPet);
        } catch (Exception e) {
            System.err.println("Erro ao excluir pet: " + e.getMessage());
        }
    }
}
