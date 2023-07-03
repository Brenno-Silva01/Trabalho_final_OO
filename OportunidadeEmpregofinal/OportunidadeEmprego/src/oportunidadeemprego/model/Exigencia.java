package oportunidadeemprego.model;

/**
 * A classe Exigencia se ralaciona com a classe Vaga por meio de uma associacao simples,
 * esta classe representa algumas exigencias que uma vaga pode ter.
 * @author Brenno e Jesse.
 * @since 2023
 * @version 1.0
 */
public class Exigencia {

    private String escolaridade;
    private String habilidade;
    private String idioma;

    /**
     * Construtor na qual representa exigencias.
     * @param escolaridade representa qual nivel de escolaridade desejada.
     * @param habilidade representa alguma habilidade especial desejada.
     * @param idioma representa algum idioma desejado.
     */
    public Exigencia(String escolaridade, String habilidade, String idioma) {
        this.escolaridade = escolaridade;
        this.habilidade = habilidade;
        this.idioma = idioma;
    }

    // Gets e sets
    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getHabilidade() {
        return habilidade;
    }

    public void setHabilidade(String habilidade) {
        this.habilidade = habilidade;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    @Override

    public String toString() {
        return "\nEscolaridade: " + this.escolaridade + "\nHabilidades: " + this.habilidade +
                "\nIdioma(s): " + this.idioma;
    }

}
