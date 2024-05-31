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
        this.idPet = idPet;
        this.idAnimal = idAnimal;
        this.idResponsavel = idResponsavel;
        this.dataChegada = dataChegada;
        this.vacinado = vacinado;
        this.descricao = descricao;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(int idPet) {
        this.idPet = idPet;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdResponsavel() {
        return idResponsavel;
    }

    public void setIdResponsavel(int idResponsavel) {
        this.idResponsavel = idResponsavel;
    }

    public Date getDataChegada() {
        return dataChegada;
    }

    public void setDataChegada(Date dataChegada) {
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
        this.descricao = descricao;
    }

    public void cadastrarPet() {

    }

    public void atualizarPet() {

    }

    public void excluirPet() {
        
    }
}
