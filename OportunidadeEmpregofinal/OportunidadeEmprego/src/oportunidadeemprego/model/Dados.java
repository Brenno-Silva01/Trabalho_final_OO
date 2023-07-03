package oportunidadeemprego.model;
import java.util.List;
import java.util.ArrayList;


/**
 * A classe Dados possui um relacionamento de associacao simples com a classe Empresa.
 * Esta classe armazena uma lista de empresas criadas e faz a busca das mesmas.
 * @author Brenno e Jesse.
 * @since 2023
 * @version 1.0
 */
public class Dados {
    private List<Empresa> empresas;
    
    
    public int getQuantidadeEmpresas() 
    {
		return empresas.size();
	}

	/**
     * Construtor para adicionar empresas separadas
     */
    public Dados()
    {
    	empresas = new ArrayList<Empresa>();
    }

	/**
     * Construtor na qual representa Dados.
     * @param empresas representa uma lista de empresas cadastradas.
     */
    public Dados(List<Empresa> empresas) {
        this.empresas = empresas;
    }

    // Através desse método que consigo acessar os dados do objeto empresa
    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(ArrayList<Empresa> empresas) {
        this.empresas = empresas;
    }
    
    
    /**
     * Metodo criado para adicionar a empresa dentro da lista de empresas.
     * @param empresa eh um objeto do tipo Empresa que eh adicionada a lista de 
     * empresas
     */
    public void adicionarEmpresa(Empresa empresa){
        empresas.add(empresa);
    }
    
    /**
     *  Metodo para editar uma determinada Empresa
     * @param empresa eh um objeto Empresa.
     * @param posicao eh o index da lista da empresa desejada.
     */
    public void editarEmpresa(Empresa empresa, int posicao)
    {
    	empresas.get(posicao).setRazaoSocial(empresa.getRazaoSocial());
    	empresas.get(posicao).setContato(empresa.getContato());
    }
    
    /**
     *  Metodo para editar uma vaga do tipo VagaCLT.
     * @param clt eh um objeto CLT.
     * @param posicaoEmpresa eh a posicao no arraylist da empresa desejada.
     * @param posicaoCLT eh a posicao no arraylist da vagaCLT desejada.
     */
    public void edtarCLT(CLT clt, int posicaoEmpresa, int posicaoCLT)
    {
    	empresas.get(posicaoEmpresa).getVagasCLT().set(posicaoCLT, clt);
    }
    
    /**
     * Metodo para excluir uma vaga do tipo CLT
     * @param posicaoEmpresa eh a posicao no arraylist da empresa desejada.
     * @param posicaoCLT eh a posicao no arraylist da vagaCLT a ser excluida.
     */
    public void excluirCLT(int posicaoEmpresa, int posicaoCLT)
    {
    	empresas.get(posicaoEmpresa).getVagasCLT().remove(posicaoCLT);
    }
    
    /**
     * Metodo para editar uma vaga do tipo Estagio.
     * @param estagio eh um objeto Estagio.
     * @param posicaoEmpresa eh a posicao no arraylist da empresa desejada.
     * @param posicaoEstagio eh a posicao no arraylist da vagaEstagio a ser editada.
     */
    public void edtarEstagio(Estagio estagio, int posicaoEmpresa, int posicaoEstagio)
    {
    	empresas.get(posicaoEmpresa).getVagasEstagio().set(posicaoEstagio, estagio);
    }
    
    /**
     * Metodo para excluir uma vaga do tipo Estagio
     * @param posicaoEmpresa eh a posicao no arraylist da empresa desejada.
     * @param posicaoEstagio eh a posicao no arraylist da vagaEstagio a ser excluida.
     */
    public void excluirEstagio(int posicaoEmpresa, int posicaoEstagio)
    {
    	empresas.get(posicaoEmpresa).getVagasEstagio().remove(posicaoEstagio);
    }
    
    /**
     * Metodo para editar uma vaga do tipo MenorAprendiz.
     * @param menor eh um objeto MenorAprendiz.
     * @param posicaoEmpresa eh a posicao no arraylist da empresa desejada.
     * @param posicaoMenorAprendiz eh a posicao no arraylist da vagaMenorAprendiz a ser desejada.
     */
    public void edtarMenorAprendiz(MenorAprendiz menor, int posicaoEmpresa, int posicaoMenorAprendiz)
    {
    	empresas.get(posicaoEmpresa).getVagasMenorAprendiz().set(posicaoMenorAprendiz, menor);
    }
    
    /**
     * Metodo para excluir uma vaga do tipo MenorAprendiz
     * @param posicaoEmpresa eh a posicao no arraylist da empresa desejada.
     * @param posicaoMenorAprendiz eh a posicao no arraylist da vagaMenorAprendiz a ser excluida.
     */
    public void excluirMenorAprendiz(int posicaoEmpresa, int posicaoMenorAprendiz)
    {
    	empresas.get(posicaoEmpresa).getVagasMenorAprendiz().remove(posicaoMenorAprendiz);
    }
    
    /**
     * Metodo para ter dados pre cadastrados
     */
    
    /**
     * Metodo para gerar alguns dados pre cadastrados.
     */
    public void algunsDados2()
    {
    	Contato ichi = new Contato("1111", "email@1", "Gama1", "Leste1", "721", "DF1", "Brasilia1", "Brasil1");
    	Contato ni = new Contato("2222", "email@2", "Gama2", "Leste2", "722", "DF2", "Brasilia2", "Brasil2");
    	Contato san = new Contato("3333", "email@3", "Gama3", "Leste3", "723", "DF3", "Brasilia3", "Brasil3");
    	Contato yon = new Contato("4444", "email@4", "Gama4", "Leste4", "724", "DF4", "Brasilia4", "Brasil4");
    	Contato go = new Contato("5555", "email@5", "Gama5", "Leste5", "721", "DF5", "Brasilia5", "Brasil5");
    	Contato roku = new Contato("6666", "email@6", "Gama6", "Leste6", "721", "DF6", "Brasilia6", "Brasil6");
    	Contato nana = new Contato("7777", "email@7", "Gama7", "Leste7", "727", "DF7", "Brasilia7", "Brasil7");
    	Contato hachi = new Contato("8888", "email@8", "Gama8", "Leste8", "728", "DF8", "Brasilia8", "Brasil8");
    	Contato kyu = new Contato("9999", "email@9", "Gama9", "Leste9", "729", "DF9", "Brasilia9", "Brasil9");
    	Contato ju = new Contato("10101010", "email@10", "Gama10", "Leste10", "7210", "DF10", "Brasilia10", "Brasil10");
    	
    	
    	// Aqui já podia passar os dadas como argumentos do método direto de uma vez
    	// então precisa usar os sets. Por não usar os sets eu tinha que declarrar 
    	// todos os atributos de Empresa, incluindo o array de vagas
    	Empresa one = new Empresa();
    	one.setRazaoSocial("Empresa A");
    	one.setContato(ichi);
    	
    	Empresa two = new Empresa();
    	two.setRazaoSocial("Empresa B");
    	two.setContato(ni);
    	
    	Empresa three = new Empresa();
    	three.setRazaoSocial("Empresa C");
    	three.setContato(san);
    	
    	Empresa four = new Empresa();
    	four.setRazaoSocial("Empresa D");
    	four.setContato(yon);
    	
    	Empresa five = new Empresa();
    	five.setRazaoSocial("Empresa E");
    	five.setContato(go);
    	
    	Empresa six = new Empresa();
    	six.setRazaoSocial("Empresa F");
    	six.setContato(roku);
    	
    	Empresa seven = new Empresa();
    	seven.setRazaoSocial("Empresa G");
    	seven.setContato(nana);
    	
    	Empresa eight = new Empresa();
    	eight.setRazaoSocial("Empresa H");
    	eight.setContato(hachi);
    	
    	Empresa nine = new Empresa();
    	nine.setRazaoSocial("Empresa I");
    	nine.setContato(kyu);
    	
    	Empresa ten = new Empresa();
    	ten.setRazaoSocial("Empresa J");
    	ten.setContato(ju);
    	
    	// Testando lista de vagasCLT
    	
    	CLT[] vaga = new CLT[11];
    	Estagio[] vagaE = new Estagio[11];
    	MenorAprendiz[] vagaM = new MenorAprendiz[11];
    	
    	List<CLT> vagaClt = new ArrayList<>();
    	List<Estagio> vagaEstagio = new ArrayList<>();
    	List<MenorAprendiz> vagaMenorAprendiz = new ArrayList<>();
    	
    	// Para criar dados de vagas 
    	for(int i = 1; i <= 2; i++)
    	{
    		boolean aux, aux2;
    		
    		if(i % 2 == 0)
    		{
    			aux = true;
    			aux2 = false;
    		}
    		else
    		{
    			aux = false;
    			aux2 = true;
    		}
    		
    		// dados de clt
    		vaga[i] = new CLT("Auxiliar de CLT " +i, i, new Exigencia("Ensino Superior " + i, "POO " +i, "Ingles " +i), 
    				"Segunda a sexta " +i, aux, aux2, "DF " +i, 
					"2" +i+ "k mensal", "Plano de saude " +i, 18+i, aux, i);
    		
    		// Dados de estagio
    		vagaE[i] = new Estagio("Auxiliar de Estagio " +i, i, new Exigencia("Ensino Medio " + i, "Boa Comunicacao " +i, "Espanhol " +i), 
    				"Segunda a sexta " +i, aux, aux2, "DF " +i, 
					"" +(i+5)+ "k mensal", "Plano de saude " +i, "Faculdade " +i, " " +i+" Periodo", aux);
    		
    		// Dados de Menoraprendiz
    		vagaM[i] = new MenorAprendiz("Auxiliar de MenorAprendiz " +i, i, new Exigencia("Ensino Fundamental " + i, "Ler " +i, "Nenhum " +i), 
    				"Segunda a sexta " +i, aux, aux2, "DF " +i, 
					"" +i+ "k mensal", "Plano de saude " +i, "Depois da escola" +i, 14+i, i);
    		
    		// Adicionando as vagas na lista
    		vagaClt.add(vaga[i]);
    		vagaEstagio.add(vagaE[i]);
    		vagaMenorAprendiz.add(vagaM[i]);	
    	}
    	
    	ten.setVagasCLT(vagaClt);
    	ten.setVagasEstagio(vagaEstagio);
    	ten.setVagasMenorAprendiz(vagaMenorAprendiz);
    	
    	
    	empresas.add(one);
    	empresas.add(two);
    	empresas.add(three);
    	empresas.add(four);
    	empresas.add(five);
    	empresas.add(six);
    	empresas.add(seven);
    	empresas.add(eight);
    	empresas.add(nine);
    	empresas.add(ten);
    }

    @Override
    public String toString() {
        return "Dados{" +
                "empresas=" + empresas +
                '}';
    }
}
