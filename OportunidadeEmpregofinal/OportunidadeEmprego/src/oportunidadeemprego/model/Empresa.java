package oportunidadeemprego.model;
import java.util.ArrayList;
import java.util.List;

/**
 * A classe Empresa possui uma agregacao com as classes CTT, Estagio
 * e MenorAprendiz.
 * Possui uma associacao simples com a classe Contato e com a classe Dados.
 * Esta classe representa uma empresa na qual deseja oferecer vagas de emprego.  
 * @author Brenno e Jesse.
 * @since 2023
 * @version 2.0
 */
public class Empresa {

    private String razaoSocial;
    private Contato contato;
    private List<CLT> vagasCLT;
    private List<Estagio> vagasEstagio;
    private List<MenorAprendiz> vagasMenorAprendiz;

    
    /**
     * Construtor vazio 	
     */
    public Empresa()
    {
    	vagasCLT = new ArrayList<CLT>();
    	vagasEstagio = new ArrayList<Estagio>();
    	vagasMenorAprendiz = new ArrayList<MenorAprendiz>();
    }
    
    /**
     * Construtor na qual representa Empresa.
     * @param razaoSocial representa o nome da empresa.
     * @param contato representa os meios de contado da empresa.
     * @param vagasCLT representa uma lista de vagas CLT ofertadas pela empresa.
     * @param vagasEstagio representa uma lista de vagas Estagio ofertadas pela empresa.
     * @param vagasMenorAprendiz representa uma lista de vags MenorAprendiz ofertadas pela empresa.
     */
    public Empresa(String razaoSocial, Contato contato, List<CLT> vagasCLT, List<Estagio> vagasEstagio,
    				List<MenorAprendiz> vagasMenorAprendiz ) {
        this.razaoSocial = razaoSocial;
        this.contato = contato;
        this.vagasCLT = vagasCLT;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public Contato getContato() {
        return contato;
    }

    public void setContato(Contato contato) {
        this.contato = contato;
    }

    /**
     * Metodo criado para adicionar a vaga CLT dentro da lista de vagas.
     * @param vaga é um objeto CLT que eh adicionado a lista de vagasCLT.
     */
    public void adicionarVagaClt(CLT vaga){
        vagasCLT.add(vaga);
    }
    
    public List<CLT> getVagasCLT() {
        return vagasCLT;
    }

    public void setVagasCLT(List<CLT> vagasCLT) {
    	this.vagasCLT = vagasCLT;
    }

    // Vaga estagio
    public List<Estagio> getVagasEstagio() {
        return vagasEstagio;
    }

    public void setVagasEstagio(List<Estagio> vagasEstagio) {
        this.vagasEstagio = vagasEstagio;
    }

    /**
     * Metodo criado para adicionar a vaga Estagio dentro da lista de vagas.
     * @param vaga é um objeto Estagio que eh adicionado a lista de vagasEstagio.
     */
    public void adicionarVagaEstagio(Estagio vaga){
        vagasEstagio.add(vaga);
    }
    
    // Vaga menor aprendiz
    public List<MenorAprendiz> getVagasMenorAprendiz() {
        return vagasMenorAprendiz;
    }

    public void setVagasMenorAprendiz(List<MenorAprendiz> vagasMenorAprendiz) {
        this.vagasMenorAprendiz = vagasMenorAprendiz;
    }

    /**
     * Metodo criado para adicionar a vaga MenorAprendiz dentro da lista de vagas.
     * @param vaga é um objeto MenorAprendiz que eh adicionado a lista de vagasAprendiz
     */
    public void adicionarVagaMenorAprendiz(MenorAprendiz vaga){
        vagasMenorAprendiz.add(vaga);
    }

    @Override
    public String toString() {
        return "Empresa{" +
                "razaoSocial='" + razaoSocial + '\'' +
                ", contato=" + contato +
                ", vagasCLT=" + //vagasCLT +
                '}';
    }
}