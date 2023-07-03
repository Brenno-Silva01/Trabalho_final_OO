package oportunidadeemprego.model;

/**
 * A classe Vaga eh uma classe mae e abstrata, que possui tres classes filhas, 
 * posssui uma associacao simples com a classe Exigencia.
 * @author Brenno e Jesse.
 * @since 2023
 * @version 2.0
 */

public abstract class Vaga {

    private String cargo;
    private int quantidade;
    private Exigencia exigencias;
    private String jornadaTrabalho;
    private boolean presencial;
    private boolean remoto;
    private String regiao;
    private String valorSalario;
    private String beneficio;

    /**
     *Contrutor na qual representa Vaga.
     * @param cargo representa o cargo para a vaga.
     * @param quantidade representa a quantidade de vagas ofertadas.
     * @param exigencias representa exigencias desejadas.
     * @param jornadaTrabalho representa a carga horaria do trabalho.
     * @param presencial representa se o trabalho eh presencial ou nao.
     * @param remoto representa se o trabalho eh remoto ou nao.
     * @param regiao representa para qual regiao esta sendo ofertada o trabalho.
     * @param valorSalario representa o salario ofertado.
     * @param beneficio representa os benefios ofertados.
     */
    public Vaga(String cargo, int quantidade, Exigencia exigencias,
                String jornadaTrabalho, boolean presencial,
                boolean remoto, String regiao, String valorSalario, String beneficio) {
        this.cargo = cargo;
        this.quantidade = quantidade;
        this.exigencias = exigencias;
        this.jornadaTrabalho = jornadaTrabalho;
        this.presencial = presencial;
        this.remoto = remoto;
        this.regiao = regiao;
        this.valorSalario = valorSalario;
        this.beneficio = beneficio;
    }

    /**
     * Construtor vazio
     * 
     */
    public Vaga() 
    {
		
	}

	public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Exigencia getExigencias() {
        return exigencias;
    }

    public void setExigencia(Exigencia exigencias) {
        this.exigencias = exigencias;
    }

    public String getJornadaTrabalho() {
        return jornadaTrabalho;
    }

    public void setJornadaTrabalho(String jornadaTrabalho) {
        this.jornadaTrabalho = jornadaTrabalho;
    }

    public boolean isPresencial() {
        return presencial;
    }

    public void setPresencial(boolean presencial) {
        this.presencial = presencial;
    }

    public boolean isRemoto() {
        return remoto;
    }

    public void setRemoto(boolean remoto) {
        this.remoto = remoto;
    }

    public String getRegiao() {
        return regiao;
    }

    public void setRegiao(String regiao) {
        this.regiao = regiao;
    }

    public String getValorSalario() {
        return valorSalario;
    }

    public void setValorSalario(String valorSalario) {
        this.valorSalario = valorSalario;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    @Override

    public String toString() {
        return "\nCargo: " + this.cargo + "\nQuantidade de vagas: " + this.quantidade +
                "\n\n--exigencia-- " + this.exigencias + "\nJornada de trabalho: " + this.jornadaTrabalho +
                "\nEh presencial: " + this.presencial + "\nEh remoto: " + this.remoto +
                "\nRegiao: " + this.regiao + "\nSalario: " + this.valorSalario +
                "\nBeneficios: " + this.beneficio;
    }

}
