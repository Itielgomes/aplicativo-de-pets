import java.util.Date;

public class Doacao {

    public int getIdDoacao() {
        return idDoacao;
    }

    public void setIdDoacao(final int idDoacao) {
        if (idDoacao <= 0) {
            throw new IllegalArgumentException("ID da doação deve ser maior que zero.");
        }
        this.idDoacao = idDoacao;
    }

    public int getIdPet() {
        return idPet;
    }

    public void setIdPet(final int idPet) {
        if (idPet <= 0) {
            throw new IllegalArgumentException("ID do pet deve ser maior que zero.");
        }
        this.idPet = idPet;
    }

    public int getIdDoador() {
        return idDoador;
    }

    public void setIdDoador(final int idDoador) {
        if (idDoador <= 0) {
            throw new IllegalArgumentException("ID do doador deve ser maior que zero.");
        }
        this.idDoador = idDoador;
    }

    public int getIdAdotante() {
        return idAdotante;
    }

    public void setIdAdotante(final int idAdotante) {
        if (idAdotante <= 0) {
            throw new IllegalArgumentException("ID do adotante deve ser maior que zero.");
        }
        this.idAdotante = idAdotante;
    }

    public Date getDataDoacao() {
        return dataDoacao;
    }

    public void setDataDoacao(final Date dataDoacao) {
        if (dataDoacao == null) {
            throw new IllegalArgumentException("Data da doação não pode ser nula.");
        }
        this.dataDoacao = dataDoacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(final double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor da doação não pode ser negativo.");
        }
        this.valor = valor;
    }
}
