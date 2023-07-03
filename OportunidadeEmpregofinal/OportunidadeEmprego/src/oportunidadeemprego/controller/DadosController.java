package oportunidadeemprego.controller;
import java.util.ArrayList;
import java.util.List;

import oportunidadeemprego.model.*;

/**
 * A classe DadosController faz a ligação entre a view e a classe Dados.
 * @author Brenno Jesse.
 * @since 2023
 * @version 2.0
 */

public class DadosController 
{
	private Dados dado = new Dados();
	
	
	/**
	 * Construtor vazio.
	 */
	public DadosController()
	{
		dado.algunsDados2();
	}
	
	public Dados getDados()
	{
		return dado;
	}
	
	public void setDados(Dados dado)
	{
		this.dado = dado;
	}
	
	
	// Esse método possibilita acessar o método getEmpresas que possibilita acessar os dados
	public List<Empresa> getEmpresas()
	{
		return this.dado.getEmpresas();
	}
	
	public int getQuantidadeEmpresas()
	{
		return this.dado.getQuantidadeEmpresas();
	}
	
	/**
	 * Metodo para fazer o controle de editar uma empresa especifica
	 * @param dadoView eh um dado editado vindo da view
	 * @param posicao eh a posicao da empresa a ser editada
	 */
	public void editarEmpresaList(List<String> dadoView, int posicao)
	{
		Empresa empresa = new Empresa();
		
		empresa.setRazaoSocial(dadoView.get(0));
		empresa.setContato(new Contato((dadoView.get(1)), dadoView.get(2),
				dadoView.get(3), dadoView.get(4),(dadoView.get(5)), dadoView.get(6),
				dadoView.get(7),dadoView.get(8)));			

		dado.editarEmpresa(empresa, posicao);
	}
	
	/**
	 *  Método para passar os dados de uma lista vinda da TelaDetalheEmpresa de 
	 *  uma empresa para o método adicionarEmpresa
	 * @param dadoView eh uma lista de string que contem os dados recebidos na view
	 */
	public void adicionarEmpresaList(List<String> dadoView)
	{
		Empresa empresa = new Empresa();
		
		empresa.setRazaoSocial(dadoView.get(0));
		empresa.setContato(new Contato((dadoView.get(1)), dadoView.get(2),
				dadoView.get(3), dadoView.get(4),(dadoView.get(5)), dadoView.get(6),
				dadoView.get(7),dadoView.get(8)));
		
		dado.adicionarEmpresa(empresa);
	}
	
	/**
	 * Metodo para fazer o controle de adicionar uma vagaCLT
	 * @param dadoView eh uma lista de string que contem os dados recebidos na view
	 * @param posicaoEmpresa eh a posicao da empresa que contem a vagaCLT
	 */
	public void adicionarVagaCLT(List<String> dadoView, int posicaoEmpresa)
	{
		CLT clt = new CLT();
		
		clt.setCargo(dadoView.get(0));
		clt.setQuantidade(Integer.parseInt(dadoView.get(1)));
		clt.setExigencia(new Exigencia(dadoView.get(2), dadoView.get(3), dadoView.get(4)));
		clt.setJornadaTrabalho(dadoView.get(5));
		clt.setPresencial(Boolean.parseBoolean(dadoView.get(6)));
		clt.setRemoto(Boolean.parseBoolean(dadoView.get(7)));
		clt.setRegiao(dadoView.get(8));
		clt.setValorSalario(dadoView.get(9));
		clt.setBeneficio(dadoView.get(10));
		clt.setIdadeMinima(Integer.parseInt(dadoView.get(11)));
		clt.setPossuiClt(Boolean.parseBoolean(dadoView.get(12)));
		clt.setAnosDeExperiencia(Integer.parseInt(dadoView.get(13)));
		
		dado.getEmpresas().get(posicaoEmpresa).adicionarVagaClt(clt);
	}
	
	/**
	 * Metodo para fazer o controle de adicionar VagaEstagio, 
	 * @param dadoView eh uma lista de string que contem os dados recebidos na view
	 * @param posicaoEmpresa eh a posicao da empresa que contem a vagaEstagio
	 */
	public void adicionarVagaEstagio(List<String> dadoView, int posicaoEmpresa)
	{
		Estagio estagio = new Estagio();
		
		estagio.setCargo(dadoView.get(0));
		estagio.setQuantidade(Integer.parseInt(dadoView.get(1)));
		estagio.setExigencia(new Exigencia(dadoView.get(2), dadoView.get(3), dadoView.get(4)));
		estagio.setJornadaTrabalho(dadoView.get(5));
		estagio.setPresencial(Boolean.parseBoolean(dadoView.get(6)));
		estagio.setRemoto(Boolean.parseBoolean(dadoView.get(7)));
		estagio.setRegiao(dadoView.get(8));
		estagio.setValorSalario(dadoView.get(9));
		estagio.setBeneficio(dadoView.get(10));
		estagio.setInstiruicaoEnsinoSuperior(dadoView.get(11));
		estagio.setPeriodo(dadoView.get(12));
		estagio.setRemuneracao(Boolean.parseBoolean(dadoView.get(13)));
		
		dado.getEmpresas().get(posicaoEmpresa).adicionarVagaEstagio(estagio);
	}
	
	/**
	 * Metodo para fazer o controle de adicionarVagaMenorAprendiz
	 * @param dadoView eh uma lista de string que contem os dados recebidos na view
	 * @param posicaoEmpresa eh a posicao da empresa que contem a vagaMenorAprendiz
	 */
	public void adicionarVagaMenorAprendiz(List<String> dadoView, int posicaoEmpresa)
	{
		MenorAprendiz menor = new MenorAprendiz();
		
		menor.setCargo(dadoView.get(0));
		menor.setQuantidade(Integer.parseInt(dadoView.get(1)));
		menor.setExigencia(new Exigencia(dadoView.get(2), dadoView.get(3), dadoView.get(4)));
		menor.setJornadaTrabalho(dadoView.get(5));
		menor.setPresencial(Boolean.parseBoolean(dadoView.get(6)));
		menor.setRemoto(Boolean.parseBoolean(dadoView.get(7)));
		menor.setRegiao(dadoView.get(8));
		menor.setValorSalario(dadoView.get(9));
		menor.setBeneficio(dadoView.get(10));
		menor.setHorario(dadoView.get(11));
		menor.setIdadeMinima(Integer.parseInt(dadoView.get(12)));
		menor.setIdadeMaxima(Integer.parseInt(dadoView.get(13)));
		
		
		dado.getEmpresas().get(posicaoEmpresa).adicionarVagaMenorAprendiz(menor);
	}
	
	/**
	 * Metodo para fazer o controle de excluir uma vagaCLT
	 * @param posicaoEmpresa eh a posicao da empresa que contem a vagaCLT
	 * @param posicaoCLT eh a posicao da empresa que contem a posicao a ser excluida
	 */
	public void excluirVagaCLT(int posicaoEmpresa, int posicaoCLT)
	{
		dado.excluirCLT(posicaoEmpresa, posicaoCLT);
	}
	
	/**
	 * Metodo para fazer o controle de excluir uma vagaEstagio
	 * @param posicaoEmpresa eh a posicao da empresa qeu contem a vagaEstagio
	 * @param posicaoEstagio eh a posicao da vagaEstagio a ser escluida
	 */
	public void excluirVagaEstagio(int posicaoEmpresa, int posicaoEstagio)
	{
		dado.excluirEstagio(posicaoEmpresa, posicaoEstagio);
	}
	
	/**
	 * Metodo para fazer a controle de excluir uma vagaMenorAprendiz
	 * @param posicaoEmpresa eh a posicao da empresa que contem a vagaMenorAprendiz
	 * @param posicaoMenorAprendiz eh a posicoa da vagaMenorAprendiz a ser excluida
	 */
	public void excluirVagaMenorAprendiz(int posicaoEmpresa, int posicaoMenorAprendiz)
	{
		dado.excluirMenorAprendiz(posicaoEmpresa, posicaoMenorAprendiz);
	}
	
	/**
	 * Metodo para fazer o controle de editarVAgaCLT
	 * @param dadoView eh uma lista de string que contem os dados recebidos na view
	 * @param posicaoEmpresa eh a posicao da empresa que contem a vagaCLT
	 * @param posicaoCLT eh a posicao no arraylist da vagaCLT desejada.
	 */
	public void editarVagaCLT(List<String> dadoView, int posicaoEmpresa, int posicaoCLT)
	{
		CLT clt = new CLT();
		
		clt.setCargo(dadoView.get(0));
		clt.setQuantidade(Integer.parseInt(dadoView.get(1)));
		clt.setExigencia(new Exigencia(dadoView.get(2), dadoView.get(3), dadoView.get(4)));
		clt.setJornadaTrabalho(dadoView.get(5));
		clt.setPresencial(Boolean.parseBoolean(dadoView.get(6)));
		clt.setRemoto(Boolean.parseBoolean(dadoView.get(7)));
		clt.setRegiao(dadoView.get(8));
		clt.setValorSalario(dadoView.get(9));
		clt.setBeneficio(dadoView.get(10));
		clt.setIdadeMinima(Integer.parseInt(dadoView.get(11)));
		clt.setPossuiClt(Boolean.parseBoolean(dadoView.get(12)));
		clt.setAnosDeExperiencia(Integer.parseInt(dadoView.get(13)));
		
		dado.edtarCLT(clt, posicaoEmpresa, posicaoCLT);
	}
	
	
	/**
	 * Metodo para fazer o controle de editarVaga Estagio
	 * @param dadoView eh uma lista de string que contem os dados recebidos na view
	 * @param posicaoEmpresa eh a posicao da empresa que contem a vagaEstagio
	 * @param posicaoCLT eh a posicao no arraylist da vagaEstagio desejada.
	 */
	public void editarVagaEstagio(List<String> dadoView, int posicaoEmpresa, int posicaoEstagio)
	{
		Estagio estagio = new Estagio();
		
		estagio.setCargo(dadoView.get(0));
		estagio.setQuantidade(Integer.parseInt(dadoView.get(1)));
		estagio.setExigencia(new Exigencia(dadoView.get(2), dadoView.get(3), dadoView.get(4)));
		estagio.setJornadaTrabalho(dadoView.get(5));
		estagio.setPresencial(Boolean.parseBoolean(dadoView.get(6)));
		estagio.setRemoto(Boolean.parseBoolean(dadoView.get(7)));
		estagio.setRegiao(dadoView.get(8));
		estagio.setValorSalario(dadoView.get(9));
		estagio.setBeneficio(dadoView.get(10));
		estagio.setInstiruicaoEnsinoSuperior(dadoView.get(11));
		estagio.setPeriodo(dadoView.get(12));
		estagio.setRemuneracao(Boolean.parseBoolean(dadoView.get(13)));
		
		dado.edtarEstagio(estagio, posicaoEmpresa, posicaoEstagio);
	}
	
	/**
	 * Metodo para fazer o controle de editarVAgaMenorAprendiz
	 * @param dadoView eh uma lista de string que contem os dados recebidos na view
	 * @param posicaoEmpresa eh a posicao da empresa que contem a vagaMenorAprendiz
	 * @param posicaoCLT eh a posicao no arraylist da vagaMenorAprendiz desejada.
	 */
	public void editarVagaMenorAprendiz(List<String> dadoView, int posicaoEmpresa, int posicaoMenorAprendiz)
	{
		MenorAprendiz menor = new MenorAprendiz();
		
		menor.setCargo(dadoView.get(0));
		menor.setQuantidade(Integer.parseInt(dadoView.get(1)));
		menor.setExigencia(new Exigencia(dadoView.get(2), dadoView.get(3), dadoView.get(4)));
		menor.setJornadaTrabalho(dadoView.get(5));
		menor.setPresencial(Boolean.parseBoolean(dadoView.get(6)));
		menor.setRemoto(Boolean.parseBoolean(dadoView.get(7)));
		menor.setRegiao(dadoView.get(8));
		menor.setValorSalario(dadoView.get(9));
		menor.setBeneficio(dadoView.get(10));
		menor.setHorario(dadoView.get(11));
		menor.setIdadeMinima(Integer.parseInt(dadoView.get(12)));
		menor.setIdadeMaxima(Integer.parseInt(dadoView.get(13)));
		
		dado.edtarMenorAprendiz(menor, posicaoEmpresa, posicaoMenorAprendiz);
	}
	
	/**
	 * Metodo para excluir uma empresa desejada
	 * @param posicao da empresa a ser excluida
	 */
	public void excluirEmpresaList(int posicao) {
        if (!dado.getEmpresas().isEmpty()) {
            dado.getEmpresas().remove(posicao);
        }
    }
}