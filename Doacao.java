import java.util.Date;

public class Doacao {
    private int idDoacao;
    private int idPet;
    private int idDoador;
    private int idAdotante;
    private Date dataDoacao;
    private double valor;

    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(final int idDoacao) {
        this.idDoacao = idDoacao;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(final int idPet) {
        this.idPet = idPet;
    }

    public int getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(final int idDoador) {
        this.idDoador = idDoador;
    }

    public int getIdAdotante() {
        return idAdotante;
    }

    public void setIdAdotante(final int idAdotante) {
        this.idAdotante = idAdotante;
    }

    public Date getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(final Date dataDoacao) {
        this.dataDoacao = dataDoacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(final double valor) {
        this.valor = valor;
    }
}
