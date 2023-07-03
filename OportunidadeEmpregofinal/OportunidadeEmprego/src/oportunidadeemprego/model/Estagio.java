package oportunidadeemprego.model;

/**
 * A classe Estagio eh uma classe filha herdada da classe mae Vaga,
 * esta classe representa um dos tipos de vaga que pode se oferecer.
 * @author Brenno e Jesse.
 * @since 2023
 * @version 1.0
 */
public class Estagio extends Vaga {

    private String InstituicaoEnsinoSuperior;
    private String periodo;
    private boolean remuneracao;
    
    /**
     * Construtor vazio
     * @
     */
    public Estagio()
    {
    	
    }

    /**
     * Construtor na qual representa Estagio.
     * @param cargo representa o cargo para a vaga de Estagio.
     * @param quantidade representa a quantidade de vagas ofertadas.
     * @param exigencias representa exigencias desejadas.
     * @param jornadaTrabalho representa a carga horaria do trabalho.
     * @param presencial representa se o trabalho eh presencial ou nao.
     * @param remoto representa se o trabalho eh remoto ou nao.
     * @param regiao representa para qual regiao esta sendo ofertada o trabalho.
     * @param valorSalario representa o salario ofertado.
     * @param beneficio representa os benefios ofertados.
     * @param InstiruicaoEnsinoSuperior representa para qual Instituicao de Ens. Superior eh direcionada.
     * @param periodo representa o periodo desejado que o graduando deve estar.
     * @param remuneracao representa se o estagio eh remunerado ou nao.
     */
    public Estagio(String cargo, int quantidade, Exigencia exigencias,
                   String jornadaTrabalho, boolean presencial,
                   boolean remoto, String regiao, String valorSalario,
                   String beneficio, String InstiruicaoEnsinoSuperior,
                   String periodo, boolean remuneracao) {
        super(cargo, quantidade, exigencias, jornadaTrabalho, presencial, remoto,
                regiao, valorSalario, beneficio);
        this.InstituicaoEnsinoSuperior = InstiruicaoEnsinoSuperior;
        this.periodo = periodo;
        this.remuneracao = remuneracao;
    }

    public String getInstiruicaoEnsinoSuperior() {
        return InstituicaoEnsinoSuperior;
    }

    public void setInstiruicaoEnsinoSuperior(String instiruicaoEnsinoSuperior) {
        InstituicaoEnsinoSuperior = instiruicaoEnsinoSuperior;
    }

    public String getPeriodo() {
        return periodo;
    }

    public void setPeriodo(String periodo) {
        this.periodo = periodo;
    }

    public boolean isRemuneracao() {
        return remuneracao;
    }

    public void setRemuneracao(boolean remuneracao) {
        this.remuneracao = remuneracao;
    }

    @Override
    public String toString() {
        return "Estagio{" +
                "InstiruicaoEnsinoSuperior='" + InstituicaoEnsinoSuperior + '\'' +
                ", periodo='" + periodo + '\'' +
                ", remuneracao=" + remuneracao +
                '}';
    }
}
