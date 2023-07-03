package oportunidadeemprego.view;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import oportunidadeemprego.controller.*;

/**
 * A classe MenuPrincipal mostra o menu principal e se comunica com as outras telas
 * @author Brenno e Jesse.
 * @since 2023
 */

public class MenuPrincipal implements ActionListener,  ListSelectionListener {
	private JFrame janela;
    private JLabel titulo;
    private JLabel tituloVaga = new JLabel("Lista Vagas");
    private JLabel tituloEmpresa = new JLabel("Lista Empresas");
    private JButton cadastrarEmpresa;
    private JButton atualizarEmpresa;
    private JButton buscarEmpresa;
    private JButton buscarVaga;
    private JList<String> listaEmpresasCadastrados;
    private JList<String> listaVagasCadastradas;
    private JScrollPane scroll;
    private JScrollPane scroll2;
    private List<String> listaEmpresa;
    private List<String> listaVagasList;
    private DefaultListModel<String> listModel;
    private DefaultListModel<String> listModelVagas;
    private DadosController dados;


    public MenuPrincipal()
    {		
    	janela = new JFrame("Oportunidades de Emprego");
        titulo = new JLabel("Menu Principal");
        cadastrarEmpresa = new JButton("<html><center>Cadastrar<br>Empresa</html>");
        atualizarEmpresa = new JButton("Atualizar");
        buscarEmpresa = new JButton("<html><center>Buscar<br>Empresa</html>");
        buscarVaga = new JButton("<html><center>Buscar<br>Vaga</html>");
        dados = new DadosController();
        listaEmpresa = new ArrayList<>();
        listaVagasList = new ArrayList<>();
        listModel = new DefaultListModel<>();
        listModelVagas = new DefaultListModel<>();
        listaEmpresasCadastrados = new JList<>(listModel);
        listaVagasCadastradas = new JList<>(listModelVagas);
        scroll = new JScrollPane(listaEmpresasCadastrados);
        scroll2 = new JScrollPane(listaVagasCadastradas);
        listaEmpresa = new EmpresaController(dados).getNomeEmpresa();
        listaVagasList = new EmpresaController(dados).getNomeVaga(1);

        for (String percorrer : listaEmpresa) {
            listModel.addElement(percorrer);
        }

        for (String percorrer : listaVagasList) {
            listModelVagas.addElement(percorrer);
        }

        titulo.setFont(new Font("Arial", Font.BOLD, 16));
        titulo.setBounds(245, 10, 250, 30);
        scroll.setBounds(20, 50, 200, 120);
        scroll2.setBounds(380, 50, 200, 120);
        tituloEmpresa.setFont(new Font("Arial", Font.BOLD, 12));
        tituloVaga.setFont(new Font("Arial", Font.BOLD, 12));
        tituloEmpresa.setBounds(70, 25, 250, 30);
        tituloVaga.setBounds(440, 25, 250, 30);
        listaEmpresasCadastrados.setSelectionMode(ListSelectionModel.SINGLE_INTERVAL_SELECTION);
        listaEmpresasCadastrados.setVisibleRowCount(10);
        cadastrarEmpresa.setBounds(250, 50, 100, 35);
        buscarEmpresa.setBounds(250, 100, 100, 35);
        buscarVaga.setBounds(250, 150, 100, 35);
        atualizarEmpresa.setBounds(250, 200, 100, 35);
        janela.setLayout(null);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.add(titulo);
        janela.add(scroll);
        janela.add(cadastrarEmpresa);
        janela.add(atualizarEmpresa);
        janela.add(buscarEmpresa);
        janela.add(buscarVaga);
        janela.add(scroll2);
        janela.add(tituloEmpresa);
        janela.add(tituloVaga);
        janela.setSize(615, 290);
        janela.setVisible(true);
        cadastrarEmpresa.addActionListener(this);
        atualizarEmpresa.addActionListener(this);
        buscarEmpresa.addActionListener(this);
        buscarVaga.addActionListener(this);
        listaEmpresasCadastrados.addListSelectionListener(this);
        listaVagasCadastradas.addListSelectionListener(this);   
    }

    public static void main(String[] args){
        MenuPrincipal menu = new MenuPrincipal();   
    }

    @SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
    public void actionPerformed(ActionEvent click){
        Object eventoClick = click.getSource();

        if(eventoClick == cadastrarEmpresa)
        {
            new TelaDetalheEmpresa().inserirEditarEmpresa(dados, 2, 0);
        }

        if (eventoClick == buscarEmpresa) {
            new TelaBusca(listaEmpresasCadastrados).exibirTela();
        }
        
        if (eventoClick == buscarVaga) {
            new TelaBuscaVaga(listaVagasCadastradas).exibirTela();
        }
        
        if (eventoClick == atualizarEmpresa) {
            listaEmpresa = new EmpresaController(dados).getNomeEmpresa();
            listaVagasList = new EmpresaController(dados).getNomeVaga(1);
            listModel.removeAllElements();
            listModelVagas.removeAllElements();
            for (String percorrer : listaEmpresa) {
                listModel.addElement(percorrer);
            }
            for (String percorrer : listaVagasList) {
                listModelVagas.addElement(percorrer);
            }
        }
    }
    
    public void valueChanged(ListSelectionEvent click) 
    {
    	Object evento = click.getSource();
    	
    	if(click.getValueIsAdjusting() && evento == listaEmpresasCadastrados) {
			new TelaDetalheEmpresa().inserirEditarEmpresa(dados, 1, 
					listaEmpresasCadastrados.getSelectedIndex());
		}
    	
    	if(click.getValueIsAdjusting() && evento == listaVagasCadastradas)
    	{
    		new TelaEditarVaga().editar(dados, listaVagasCadastradas.getSelectedIndex());
    	}	
    }
}


