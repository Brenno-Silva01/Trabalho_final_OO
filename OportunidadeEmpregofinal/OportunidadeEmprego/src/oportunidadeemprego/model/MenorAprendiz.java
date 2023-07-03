package oportunidadeemprego.model;


/**
 * A classe MenorAprendiz eh uma classe filha herdada da classe mae Vaga,
 * esta classe representa um dos tipos de vaga que pode se oferecer.
 * @author Brenno e Jesse
 * @since 2023
 * @version 1.0
 */
public class MenorAprendiz extends Vaga {

    //private Horario horario;
	private String horario;
    private int idadeMinima;
    private int idadeMaxima;

    /**
     * Construtor vazio
     */
    public MenorAprendiz()
    {
    	
    }
    
    /**
     * Construtor na qual representa MenorAprendiz.
     * @param cargo representa o cargo para a vaga de Menor aprendiz.
     * @param quantidade representa a quantidade de vagas ofertadas.
     * @param exigencias representa exigencias desejadas.
     * @param jornadaTrabalho representa a carga horaria do trabalho.
     * @param presencial representa se o trabalho eh presencial ou nao.
     * @param remoto representa se o trabalho eh remoto ou nao.
     * @param regiao representa para qual regiao esta sendo ofertada o trabalho.
     * @param valorSalario representa o salario ofertado.
     * @param beneficio representa os benefios ofertados.
     * @param horario representa o horario em que o trabalho sera realizado.
     * @param idadeMinima representa a idade minima desejada.
     * @param idadeMaxima representa a idade maxima desejada.
     */
    public MenorAprendiz(String cargo, int quantidade, Exigencia exigencias, String jornadaTrabalho,
                         boolean presencial, boolean remoto, String regiao, String valorSalario,
                         String beneficio, String horario, int idadeMinima, int idadeMaxima) {

        super(cargo, quantidade, exigencias, jornadaTrabalho, presencial, remoto, regiao, valorSalario, beneficio);
        this.horario = horario;
        this.idadeMinima = idadeMinima;
        this.idadeMaxima = idadeMaxima;
    }
    
    
    public String getHorario() {
		return horario;
	}


	public void setHorario(String horario) {
		this.horario = horario;
	}


	/*
    public Horario getHorario() {
        return horario;
    }

    public void setHorario(Horario horario) {
        this.horario = horario;
    }
	*/
    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public int getIdadeMaxima() {
        return idadeMaxima;
    }

    public void setIdadeMaxima(int idadeMaxima) {
        this.idadeMaxima = idadeMaxima;
    }

    @Override
    public String toString() {
        return "MenorAprendiz{" +
                "horario=" + horario +
                ", idadeMinima=" + idadeMinima +
                ", idadeMaxima=" + idadeMaxima +
                '}';
    }
}
