package oportunidadeemprego.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

///ddddddddddd
import oportunidadeemprego.controller.*;

public class TelaDetalheEmpresa implements ActionListener {

    private JFrame janela;
    private JLabel tituloRazaoSocial = new JLabel("Razao Social: ");
    private JTextField infoRazaoSocial = new JTextField("", 200);
    private JLabel tituloContato = new JLabel("---CONTATO---");
    private JLabel tituloNumeroTelefone = new JLabel("Telefone: ");
    private JTextField infoNumeroTelefone = new JTextField(200);
    private JLabel tituloEmail = new JLabel("Email: ");
    private JTextField infoEmail = new JTextField(200);
    private JLabel tituloLagradouro = new JLabel("Lagradouro: ");
    private JTextField infoLagradouro = new JTextField(200);
    private JLabel tituloComplemento = new JLabel("Complemento: ");
    private JTextField infoComplemento = new JTextField(200);
    private JLabel tituloCep = new JLabel("Cep: ");
    private JTextField infoCep = new JTextField(200);
    private JLabel tituloEstado = new JLabel("Estado: ");
    private JTextField infoEstado = new JTextField(200);
    private JLabel tituloCidade = new JLabel("Cidade: ");
    private JTextField infoCidade = new JTextField(200);
    private JLabel tituloPais = new JLabel("Pais: ");
    private JTextField infoPais = new JTextField(200);
    private JButton salvar = new JButton("Salvar");
    private JButton excluir = new JButton("Excluir");
    private JButton adicionar = new JButton("<html><center>Cadastrar<br>Vaga</html>");  
    private static DadosController dados;
    int opcao;
    int posicao;
    private String nomeJframe;
    private List<String> dadoNovoList = new ArrayList<>();
    
    public void inserirEditarEmpresa(DadosController ddados, int oopcao, int pposicao)
    {
    	dados = ddados;
    	opcao = oopcao;
    	posicao = pposicao; // posição da empresa, por isso perdemos tanto tempo
    	
    	if(opcao == 1)
    		nomeJframe = "Detalhe de Empresa";
    	if(opcao == 2)
    		nomeJframe = "Cadastro de Empresa";
    	
    	janela = new JFrame(nomeJframe);

    	// Preenche os dados da empresa clicada na JList de empresa
    	if(opcao == 1)
    	{
    		infoRazaoSocial = new JTextField(dados.getEmpresas().get(posicao).getRazaoSocial(), 200);
    		infoNumeroTelefone = new JTextField(String.valueOf(dados.getEmpresas().get(posicao).getContato().getTelefone()), 200);
    		infoEmail = new JTextField(dados.getEmpresas().get(posicao).getContato().getEmail(), 200);;
    		infoCep = new JTextField(String.valueOf(dados.getEmpresas().get(posicao).getContato().getCep()), 200);;
    		infoCidade = new JTextField(dados.getEmpresas().get(posicao).getContato().getCidade(), 200);;
    		infoEstado = new JTextField(dados.getEmpresas().get(posicao).getContato().getEstado(), 200);;
    		infoPais = new JTextField(dados.getEmpresas().get(posicao).getContato().getPais(), 200);;
    		infoLagradouro = new JTextField(dados.getEmpresas().get(posicao).getContato().getLogradouro(), 200);;
    		infoComplemento = new JTextField(dados.getEmpresas().get(posicao).getContato().getComplemento(), 200);;
    		salvar.setBounds(50, 340, 100, 35);
            excluir.setBounds(350, 340, 100, 35);
            adicionar.setBounds(200, 340, 100, 35);
    		this.janela.add(adicionar);
    	}
    	else {
    		salvar.setBounds(100, 340, 100, 35);
    		excluir.setBounds(300, 340, 100, 35);
    	}

        //tamanho dos botoes e das informacoes presentes na janela.
        tituloRazaoSocial.setBounds(30, 20, 150, 25);
        infoRazaoSocial.setBounds(190, 20, 180, 25);
        tituloContato.setBounds(150, 50, 150, 25);
        tituloNumeroTelefone.setBounds(30, 80, 180, 25);
        infoNumeroTelefone.setBounds(190, 80, 180, 25);
        tituloEmail.setBounds(30, 110, 180, 25);
        infoEmail.setBounds(190, 110, 180, 25);
        tituloLagradouro.setBounds(30, 140, 180, 25);
        infoLagradouro.setBounds(190, 140, 180, 25);
        tituloComplemento.setBounds(30, 170, 180, 25);
        infoComplemento.setBounds(190, 170, 180, 25);
        tituloCep.setBounds(30, 200, 180, 25);
        infoCep.setBounds(190, 200, 180, 25);
        tituloEstado.setBounds(30, 230, 180, 25);
        infoEstado.setBounds(190, 230, 180, 25);
        tituloCidade.setBounds(30, 260, 180, 25);
        infoCidade.setBounds(190, 260, 180, 25);
        tituloPais.setBounds(30, 290, 180, 25);
        infoPais.setBounds(190, 290, 180, 25);

        //adicionando as informacoes na janela.
        this.janela.add(tituloRazaoSocial);
        this.janela.add(infoRazaoSocial);
        this.janela.add(tituloContato);
        this.janela.add(tituloNumeroTelefone);
        this.janela.add(infoNumeroTelefone);
        this.janela.add(tituloEmail);
        this.janela.add(infoEmail);
        this.janela.add(tituloLagradouro);
        this.janela.add(infoLagradouro);
        this.janela.add(tituloComplemento);
        this.janela.add(infoComplemento);
        this.janela.add(tituloCep);
        this.janela.add(infoCep);
        this.janela.add(tituloEstado);
        this.janela.add(infoEstado);
        this.janela.add(tituloCidade);
        this.janela.add(infoCidade);
        this.janela.add(tituloPais);
        this.janela.add(infoPais);
        this.janela.add(salvar);
        this.janela.add(excluir);  
        this.janela.setLayout(null);
        
        //tamanho e visibilidade da janela.
        this.janela.setSize(500, 425);
        this.janela.setVisible(true);
        adicionar.addActionListener(this);
        salvar.addActionListener(this);
        excluir.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent evento) 
    {
    	Object clicar = evento.getSource();
    	
    	if(clicar == adicionar)
    	{
    		new TelaOpcoesVaga(dados, posicao);
    	}
    	
    	if(clicar == salvar)
    	{
	
    		dadoNovoList.add(infoRazaoSocial.getText());
    		dadoNovoList.add(infoNumeroTelefone.getText());
    		dadoNovoList.add(infoEmail.getText());
    		dadoNovoList.add(infoLagradouro.getText());
    		dadoNovoList.add(infoComplemento.getText());
    		dadoNovoList.add(infoCep.getText());
    		dadoNovoList.add(infoEstado.getText());
    		dadoNovoList.add(infoCidade.getText());
    		dadoNovoList.add(infoPais.getText());
	
    		// Se escolheu editar
    		if(opcao == 1)
    		{
    			// chamando o método para editar a empresa
    			dados.editarEmpresaList(dadoNovoList, posicao);
    		}
    		else
    		{
    			// Chamando o método para adicionar empresa
    			dados.adicionarEmpresaList(dadoNovoList);
    		}
    		
    		JOptionPane.showMessageDialog(janela, "Empresa Salva com sucesso.", "Salvo",
	                JOptionPane.INFORMATION_MESSAGE);
	        janela.dispose();
    	}
    	
    	if (clicar == excluir) {
    	    int resposta = JOptionPane.showConfirmDialog(janela, "Deseja realmente excluir esta empresa?", "Confirmação",
    	            JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
    	    if (resposta == JOptionPane.YES_OPTION) {
    	        // Excluir empresa da lista de empresas em Dados
    	        dados.excluirEmpresaList(posicao);

    	        // Atualizar a lista de empresas no JList do MenuPrincipal
//    	       menuPrincipal.atualizarListaEmpresas(dados.getEmpresas());

    	        JOptionPane.showMessageDialog(janela, "Empresa excluída com sucesso.", "Exclusão",
    	                JOptionPane.INFORMATION_MESSAGE);
    	        janela.dispose(); // Fecha a janela após a exclusão
    	    }
    	}
    }
}