import java.util.Date;

public class Denuncia {
    private int idDenuncia;
    private int idAnimal;
    private int idDenunicante;
    private Date dataDenuncia;
    private String descricao;

    public int getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(final int idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(final int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdDenunicante() {
        return idDenunicante;
    }

    public void setIdDenunicante(final int idDenunicante) {
        this.idDenunicante = idDenunicante;
    }

    public Date getDataDenuncia() {
        return dataDenuncia;
    }

    public void setDataDenuncia(final Date dataDenuncia) {
        this.dataDenuncia = dataDenuncia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(final String descricao) {
        this.descricao = descricao;
    }
}
