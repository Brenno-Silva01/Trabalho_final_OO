package oportunidadeemprego.model;

/**
 * A classe Contato se relaciona com a classe Empresa por meio de uma associacao simples, 
 * esta classe representa as formas de entrar em contato com a empresa.
 * @author Brenno e Jesse.
 * @since 2023
 * @version 2.0
 */

public class Contato {
    private String logradouro;
    private String complemento;
    private String cep;
    private String estado;
    private String cidade;
    private String pais;
    private String telefone;
    private String email;

    /**
     * Construtor vazio
     */
    public Contato() {

    }

    /**
     * Construtor na qual representa Contato.
     * @param telefone representa o numero de telefone.
     * @param email representa o email de contato.
     * @param logradouro representa o endereco da empresa.
     * @param complemento representa o complemento do endereco.
     * @param cep representa o cep da empresa.
     * @param estado representa o estado em que a empresa se localiza.
     * @param cidade representa a cidade em que a empresa se localiza.
     * @param pais representa o pais em que a empresa se localiza.
     */
    public Contato(String telefone, String email, String logradouro, String complemento,
    		String cep, String estado, String cidade, String pais) {
        this.telefone = telefone;
        this.email = email;
        this.logradouro = logradouro;
        this.complemento = complemento;
        this.cep = cep;
        this.estado = estado;
        this.cidade = cidade;
        this.pais = pais;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "telefone=" + telefone +
                ", email='" + email + '\'' +
                ", logradouro='" + logradouro + '\'' +
                ", complemento='" + complemento + '\'' +
                ", cep=" + cep +
                ", estado='" + estado + '\'' +
                ", cidade='" + cidade + '\'' +
                ", pais='" + pais + '\'' +
                '}';
    }
}
