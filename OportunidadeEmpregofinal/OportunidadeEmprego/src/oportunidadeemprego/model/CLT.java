package oportunidadeemprego.model;

/**
 * A classe Clt eh uma classe filha herdada da classe mae Vaga,
 * esta classe representa um dos tipos de vaga que pode se oferecer.
 * @author Brenno e Jesse
 * @since 2023
 * @version 2.0
 */
public class CLT extends Vaga {

    private int idadeMinima;
    private boolean possuiClt;
    private int anosDeExperiencia;

    /**
     *  Construtor vazio
     */
    public CLT()
    {
    	super();
    }
    
    /**
     * Construtor na qual representa Clt.
     * @param cargo representa o cargo para a vaga de Clt.
     * @param quantidade representa a quantidade de vagas ofertadas.
     * @param exigencias representa exigencias desejadas.
     * @param jornadaTrabalho representa a carga horaria do trabalho.
     * @param presencial representa se o trabalho eh presencial ou nao.
     * @param remoto representa se o trabalho eh remoto ou nao.
     * @param regiao representa para qual regiao esta sendo ofertada o trabalho.
     * @param valorSalario representa o salario ofertado.
     * @param beneficio representa os benefios ofertados.
     * @param idadeMinima representa a idade minima desejada.
     * @param possuiClt representa se possui Clt.
     * @param anosDeExperiencia representa anos de experiencias desejado.
     */
    public CLT(String cargo, int quantidade, Exigencia exigencias,
               String jornadaTrabalho, boolean presencial,
               boolean remoto, String regiao,
               String valorSalario, String beneficio,
               int idadeMinima, boolean possuiClt, int anosDeExperiencia) {
        super(cargo, quantidade, exigencias, jornadaTrabalho,
                presencial, remoto, regiao, valorSalario,
                beneficio);
        this.idadeMinima = idadeMinima;
        this.possuiClt = possuiClt;
        this.anosDeExperiencia = anosDeExperiencia;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public boolean isPossuiClt() {
        return possuiClt;
    }

    public void setPossuiClt(boolean possuiClt) {
        this.possuiClt = possuiClt;
    }

    public int getAnosDeExperiencia() {
        return anosDeExperiencia;
    }

    public void setAnosDeExperiencia(int anosDeExperiencia) {
        this.anosDeExperiencia = anosDeExperiencia;
    }

    @Override
    public String toString() {
        return "CLT{" +
                "idadeMinima=" + idadeMinima +
                ", possuiClt=" + possuiClt +
                ", anosDeExperiencia=" + anosDeExperiencia +
                '}';
    }
}
