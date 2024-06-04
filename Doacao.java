import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;
 class Doacao extends Doador {
    private static AtomicInteger idCounter = new AtomicInteger(1);

    private int idDoacao;
    private int idPet;
    private Doador idDoador;
    private int idAdotante;
    private Date dataDoacao;
    private double valor;

    public Doacao(int i, int idAnimal, int idDoador, int i1, Date date, double valor, String nome, String email, String senha, String endereco, String telefone) {
        super(nome, email, senha, endereco, telefone);

    }

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

    public void setIdDoador(final Doador idDoador) {
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
