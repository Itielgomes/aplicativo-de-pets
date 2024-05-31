import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Denuncia {
    private int idDenuncia;
    private int idAnimal;
    private int idDenunciante;
    private Date dataDenuncia;
    private String descricao;

    private static List<Denuncia> denunciaList = new ArrayList<>();

    
    public Denuncia(int idDenuncia, int idAnimal, int idDenunciante, Date dataDenuncia, String descricao) {
        this.idDenuncia = idDenuncia;
        this.idAnimal = idAnimal;
        this.idDenunciante = idDenunciante;
        this.dataDenuncia = dataDenuncia;
        this.descricao = descricao;
    }

    public int getIdDenuncia() {
        return idDenuncia;
    }

    public void setIdDenuncia(int idDenuncia) {
        this.idDenuncia = idDenuncia;
    }

    public int getIdAnimal() {
        return idAnimal;
    }

    public void setIdAnimal(int idAnimal) {
        this.idAnimal = idAnimal;
    }

    public int getIdDenunciante() {
        return idDenunciante;
    }

    public void setIdDenunciante(int idDenunciante) {
        this.idDenunciante = idDenunciante;
    }

    public Date getDataDenuncia() {
        return dataDenuncia;
    }

    public void setDataDenuncia(Date dataDenuncia) {
        this.dataDenuncia = dataDenuncia;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void registrarDenuncia() {
        denunciaList.add(this);
        System.out.println("Denúncia registrada com sucesso para o animal ID: " + this.getIdAnimal());
    }

    public static List<Denuncia> listarDenuncias() {
        return denunciaList;
    }

}
