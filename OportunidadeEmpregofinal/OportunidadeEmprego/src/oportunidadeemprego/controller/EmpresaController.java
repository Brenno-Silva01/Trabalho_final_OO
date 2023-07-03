package oportunidadeemprego.controller;
import oportunidadeemprego.model.*;

import oportunidadeemprego.model.Empresa;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;
import java.util.stream.Stream;

/**
 * A classe EmpresaController faz ligacao da view com a Classe Empresa
 * @author Breno e Jesse
 * @since 2023
 * @version 2.0
 */

public class EmpresaController {

    private List<Empresa> empresasC = new ArrayList<>();
    private int quantidadeEmpresas;
    private int tamanho;
    
    /**
     * Construtor para adicionar os dados pre cadastrados vindos da DadosController 
     * em um arraylist de empresas
     * @param dado sao os dados pre cadastrados
     */
    public EmpresaController(DadosController dado)
    {
    	// Aqui está atribuindo os valores pre cadastrados
    	empresasC = dado.getEmpresas();
    	quantidadeEmpresas = dado.getQuantidadeEmpresas();
    }
    
    public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	/**
	 *  Para fazer a lista de empresas cadastradas
	 * @return um arraylist de empresas
	 */
    public List<String> getNomeEmpresa()
    {
    	List<String> nomeEmpresa = new ArrayList<>();
    	
    	// Aqui pode usar empresasC.size() em vez de quantidadeEmpresas
    	for(int i = 0; i < quantidadeEmpresas; i++)
    		nomeEmpresa.add(empresasC.get(i).getRazaoSocial());
    	
    	
 
    	return nomeEmpresa;
    	
    }
    
    /**
     * Metodo para pegar o nome da vaga, posicao empresa, posicao vaga, e tipo de vaga
     * @param k eh para saber o tio de retorno esperado. Se 1, lista nome cargo, se 2 lista
     * tipo de vaga, se 3 lista posicao da empresa, se 4 lista posicao da vaga
     * @return retorna uma lista de cargo, lista de tipo de vaga, lista de posicao da empresa 
     * e lista de posicao de vaga
     */
    public List<String> getNomeVaga(int k)
    {
    	List<String> nomeVaga = new ArrayList<>();
    	
    	// criar lista de cargo
    	if(k == 1)
    	{

        	for(int i = 0; i < empresasC.size(); i++)
        	{
        	
        		
        		if(empresasC.get(i).getVagasCLT() != null)
        			for(int j = 0; j < empresasC.get(i).getVagasCLT().size(); j++)	
        				nomeVaga.add(empresasC.get(i).getVagasCLT().get(j).getCargo());
        		
        		if(empresasC.get(i).getVagasEstagio() != null)
        			for(int j = 0; j < empresasC.get(i).getVagasEstagio().size(); j++)
        				nomeVaga.add(empresasC.get(i).getVagasEstagio().get(j).getCargo());
        		
        		if(empresasC.get(i).getVagasMenorAprendiz() != null)
        			for(int j = 0; j < empresasC.get(i).getVagasMenorAprendiz().size(); j++)
        				nomeVaga.add(empresasC.get(i).getVagasMenorAprendiz().get(j).getCargo());
        	}
        	
        	// Para deixar a lista em ordem alfabética. Talvez dê ruim por causa da mudança 
        	// de indice que vou precisar para 
        	//Collections.sort(nomeVaga);

        	tamanho = nomeVaga.size();
        	
        	return nomeVaga;
    	}
    	
    	// criar lista de clt, estagio, menor aprendiz 
    	if(k == 2)
    	{
    		
        	
   
        	
        	for(int i = 0; i < empresasC.size(); i++)
        	{
        	
        		
        		if(empresasC.get(i).getVagasCLT() != null)
        			for(int j = 0; j < empresasC.get(i).getVagasCLT().size(); j++)	
        				nomeVaga.add("1");
        		
        		if(empresasC.get(i).getVagasEstagio() != null)
        			for(int j = 0; j < empresasC.get(i).getVagasEstagio().size(); j++)
        				nomeVaga.add("2");
        		
        		if(empresasC.get(i).getVagasMenorAprendiz() != null)
        			for(int j = 0; j < empresasC.get(i).getVagasMenorAprendiz().size(); j++)
        				nomeVaga.add("3");
        	}
        	
        	// Para deixar a lista em ordem alfabética. Talvez dê ruim por causa da mudança 
        	// de indice que vou precisar para 
        	//Collections.sort(nomeVaga);
   
        	tamanho = nomeVaga.size();
        	
        	return nomeVaga;
    	}
    	
    	// criar lista que contem a posicao da empresa
    	if(k == 3)
    	{
    		
        	
        	
        	for(int i = 0; i < empresasC.size(); i++)
        	{
        	
        		
        		if(empresasC.get(i).getVagasCLT() != null)
        			for(int j = 0; j < empresasC.get(i).getVagasCLT().size(); j++)	
        				nomeVaga.add(""+i);
        		
        		if(empresasC.get(i).getVagasEstagio() != null)
        			for(int j = 0; j < empresasC.get(i).getVagasEstagio().size(); j++)
        				nomeVaga.add(""+i);
        		
        		if(empresasC.get(i).getVagasMenorAprendiz() != null)
        			for(int j = 0; j < empresasC.get(i).getVagasMenorAprendiz().size(); j++)
        				nomeVaga.add(""+i);
        	}
        	
        	// Para deixar a lista em ordem alfabética. Talvez dê ruim por causa da mudança 
        	// de indice que vou precisar para 
        	//Collections.sort(nomeVaga);
        	tamanho = nomeVaga.size();
        	
        	return nomeVaga;
    	}
    	
    	//criar lista que contem a posicao da vaga
    	if(k == 4)
    	{
    		
        	
        	
        	for(int i = 0; i < empresasC.size(); i++)
        	{
        	
        		
        		if(empresasC.get(i).getVagasCLT() != null)
        			for(int j = 0; j < empresasC.get(i).getVagasCLT().size(); j++)	
        				nomeVaga.add(""+j);
        		
        		if(empresasC.get(i).getVagasEstagio() != null)
        			for(int j = 0; j < empresasC.get(i).getVagasEstagio().size(); j++)
        				nomeVaga.add(""+j);
        		
        		if(empresasC.get(i).getVagasMenorAprendiz() != null)
        			for(int j = 0; j < empresasC.get(i).getVagasMenorAprendiz().size(); j++)
        				nomeVaga.add(""+j);
        	}
        	
        	// Para deixar a lista em ordem alfabética. Talvez dê ruim por causa da mudança 
        	// de indice que vou precisar para 
        	//Collections.sort(nomeVaga);
        	tamanho = nomeVaga.size();
        	
        	return nomeVaga;
    	}
    	return nomeVaga;
    }
   
 
    public int getQuantidadeEmpresas() {
		return quantidadeEmpresas;
	}

	public void setQuantidadeEmpresas(int quantidadeEmpresas) {
		this.quantidadeEmpresas = quantidadeEmpresas;
	}

}
