package oportunidadeemprego.view;
import java.awt.Font;
import java.awt.event.*;
import java.util.*;
import java.util.List;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import oportunidadeemprego.controller.DadosController;
import oportunidadeemprego.controller.EmpresaController;

public class TelaDetalheVaga implements ActionListener
{
	private JFrame janela;
	private JLabel tituloCargo = new JLabel("Cargo: ");
	private JTextField infoCargo = new JTextField(200);
	private JLabel tituloQuantidade = new JLabel("Qtd. de Vagas: ");
	private JTextField infoQuantidade = new JTextField(200);
	private JLabel tituloJornadaDeTrabalho = new JLabel("Jornada de Trabalho: ");
	private JTextField infoJornada = new JTextField(200);
	private JLabel tituloRegiao = new JLabel("Regiao: ");
	private JTextField infoRegiao = new JTextField(200);
	private JLabel tituloValorSalario = new JLabel("Valor Salario: ");
	private JTextField infoSalario = new JTextField(200);
	private JLabel exigencia = new JLabel ("---EXIGENCIAS---");
	private JLabel tituloEscolaridade = new JLabel("Escolaridade: ");
	private JTextField infoEscolaridade = new JTextField(200);
	private JLabel tituloHabilidades = new JLabel("Habilidades: ");
	private JTextField infoHabilidades = new JTextField(200);
	private JLabel tituloIdiomas = new JLabel("Idiomas: ");
	private JTextField infoIdiomas = new JTextField(200);
	private JButton botaosalvar = new JButton("Salvar");
	private JLabel tituloBeneficio = new JLabel("Beneficio: ");
	private JTextField infoBeneficio = new JTextField(200);
	private int posicao;
	private int opcao;
	private String s;
	private JCheckBox infoRemoto = new JCheckBox();
	private JLabel tituloRemoto = new JLabel("Eh Remoto: ");
	private JCheckBox infoPresencial = new JCheckBox();
	private JLabel tituloPresencial = new JLabel("Eh Presencial: ");	
	//MenorAprediz.
	private JLabel tituloDisponibildadeHorario = new JLabel("Disponibilidade de horario: ");
	private JTextField infoDisponibilidadeHorario = new JTextField(200);
	private JLabel tituloIdadeMaxima = new JLabel("Idade Maxima: ");
	private JTextField infoIdadeMaxima = new JTextField(200);
	private JLabel tituloIdadeMinima = new JLabel("Idade Minima:");
	private JTextField infoIdadeMinima = new JTextField(200);
	//Estagio.
	private JLabel tituloPeriodo = new JLabel("Periodo Min. exigido: ");
	private JTextField infoPeriodo = new JTextField(200);
	private JCheckBox infoRemuneracao = new JCheckBox();
	private JLabel tituloRemuneracao = new JLabel("Eh Remunerado: ");
	private JLabel tituloInstituicao = new JLabel("Instituicao: ");
	private JTextField infoInstituicao = new JTextField(200);
	//Clt.
	private JCheckBox infoPossuiClt = new JCheckBox();
	private JLabel tituloPossuiClt = new JLabel("Possui CLT: ");
	private JLabel tituloExperiencia = new JLabel("Anos de experiencia: ");
	private JTextField infoExperiencia = new JTextField(200);
	private static DadosController dados;
	private List<String> novoDado = new ArrayList<>();
	private List<String> listaTipoVaga = new ArrayList<String>();
	
	public void inserirEditar(DadosController ddado,  int oopcao, int posicaoEmpresa) {
		
		dados = ddado;
		opcao = oopcao;
		posicao = posicaoEmpresa;

		if (opcao == 1) s = "Cadastro de Menor Aprendiz";
		if (opcao == 2) s = "Cadastro de Estagio";
		if (opcao == 3) s = "Cadastro de Clt";
		
		janela = new JFrame(s);

		// Obs: 30 de distancia de altura de um para o outro.
		tituloCargo.setBounds(30, 20, 150, 25);
		infoCargo.setBounds(190, 20, 180, 25);
		tituloQuantidade.setBounds(30, 50, 150, 25);
		infoQuantidade.setBounds(190, 50, 30, 25);
		tituloJornadaDeTrabalho.setBounds(30, 80, 180, 25);
		infoJornada.setBounds(190, 80, 180, 25);		
		tituloRegiao.setBounds(30, 110, 150, 25);
		infoRegiao.setBounds(190, 110, 180, 25);
		tituloValorSalario.setBounds(30, 140, 150, 25);
		infoSalario.setBounds(190, 140, 180, 25);
		tituloBeneficio.setBounds(30, 170, 150, 25);
		infoBeneficio.setBounds(190, 170, 180, 25);
		tituloPossuiClt.setBounds(30, 230, 150, 25);
		infoPossuiClt.setBounds(190, 230, 25, 25);
		exigencia.setBounds(150, 350, 180, 25);
		tituloEscolaridade.setBounds(30, 380, 180, 25);
		infoEscolaridade.setBounds(190, 380, 180, 25);
		tituloHabilidades.setBounds(30, 410, 180, 25);
		infoHabilidades.setBounds(190, 410, 180, 25);
		tituloIdiomas.setBounds(30, 440, 180, 25);
		infoIdiomas.setBounds(190, 440, 180, 25);
		botaosalvar.setBounds(200, 480, 100, 35);

		// Acrescenta os campos para as informacoes excluisvas de Menor Aprendiz. 
		if (opcao == 1) {
			this.janela.add(tituloDisponibildadeHorario);
			this.janela.add(infoDisponibilidadeHorario);
			this.janela.add(tituloIdadeMaxima);
			this.janela.add(infoIdadeMaxima);
			this.janela.add(tituloIdadeMinima);
			this.janela.add(infoIdadeMinima);
			this.janela.add(botaosalvar);
			this.tituloIdadeMinima.setBounds(30, 200, 180, 25);
			this.infoIdadeMinima.setBounds(190, 200, 30, 25);
			this.janela.add(tituloIdadeMinima);
			this.janela.add(infoIdadeMinima);			
			this.tituloDisponibildadeHorario.setBounds(30, 260, 180, 25);
			this.infoDisponibilidadeHorario.setBounds(190, 260, 180, 25);
			this.tituloIdadeMaxima.setBounds(30, 230, 180, 25);
			this.infoIdadeMaxima.setBounds(190, 230, 30, 25);			
			this.tituloPresencial.setBounds(30, 290, 150, 25);
			this.infoPresencial.setBounds(190, 290, 25, 25);
			this.tituloRemoto.setBounds(30, 320, 150, 25);
			this.infoRemoto.setBounds(190, 320, 25, 25);
			this.janela.add(tituloPresencial);
			this.janela.add(infoPresencial);
			this.janela.add(tituloRemoto);
			this.janela.add(infoRemoto);
		}
		
		// Acrescenta os campos para as informacoes excluisvas de Estagio. 
		if(opcao == 2) {			
			this.tituloPeriodo.setBounds(30, 200, 180, 25);
			this.infoPeriodo.setBounds(190, 200, 180, 25);
			this.tituloInstituicao.setBounds(30, 230, 180, 25);
			this.infoInstituicao.setBounds(190, 230, 180, 25);
			this.tituloRemuneracao.setBounds(30, 260, 150, 25);
			this.infoRemuneracao.setBounds(190, 260, 25, 25);
			this.tituloPresencial.setBounds(30, 290, 150, 25);
			this.infoPresencial.setBounds(190, 290, 25, 25);
			this.tituloRemoto.setBounds(30, 320, 150, 25);
			this.infoRemoto.setBounds(190, 320, 25, 25);
			this.janela.add(tituloPresencial);
			this.janela.add(infoPresencial);
			this.janela.add(tituloRemoto);
			this.janela.add(infoRemoto);
			this.janela.add(tituloPeriodo);
			this.janela.add(infoPeriodo);
			this.janela.add(botaosalvar);
			this.janela.add(tituloRemuneracao);
			this.janela.add(infoRemuneracao);
			this.janela.add(tituloInstituicao);
			this.janela.add(infoInstituicao);
		}
		
		// Acrescenta os campos para as informacoes exclusivas de Clt.
		if(opcao == 3) {
			this.janela.add(tituloIdadeMinima);
			this.janela.add(infoIdadeMinima);
			this.janela.add(botaosalvar);
			this.janela.add(tituloPossuiClt);
			this.janela.add(infoPossuiClt);
			this.tituloIdadeMinima.setBounds(30, 200, 180, 25);
			this.infoIdadeMinima.setBounds(190, 200, 30, 25);
			this.janela.add(tituloIdadeMinima);
			this.janela.add(infoIdadeMinima);
			this.tituloExperiencia.setBounds(30, 230, 180, 25);
			this.infoExperiencia.setBounds(190, 230, 30, 25);
			this.janela.add(tituloExperiencia);
			this.janela.add(infoExperiencia);
			this.tituloPossuiClt.setBounds(30, 260, 150, 25);
			this.infoPossuiClt.setBounds(190, 260, 25, 25);
			this.tituloPresencial.setBounds(30, 290, 150, 25);
			this.infoPresencial.setBounds(190, 290, 25, 25);
			this.tituloRemoto.setBounds(30, 320, 150, 25);
			this.infoRemoto.setBounds(190, 320, 25, 25);
			this.janela.add(tituloPresencial);
			this.janela.add(infoPresencial);
			this.janela.add(tituloRemoto);
			this.janela.add(infoRemoto);
		}
		
		// Add na janela os campos das informacoes genericas de vaga.
		this.janela.add(tituloCargo);
		this.janela.add(infoCargo);
		this.janela.add(tituloQuantidade);
		this.janela.add(infoQuantidade);
		this.janela.add(tituloJornadaDeTrabalho);
		this.janela.add(infoJornada);
		this.janela.add(tituloRegiao);
		this.janela.add(infoRegiao);
		this.janela.add(tituloValorSalario);
		this.janela.add(infoSalario);
		this.janela.add(exigencia);
		this.janela.add(tituloEscolaridade);
		this.janela.add(infoEscolaridade);
		this.janela.add(tituloHabilidades);
		this.janela.add(infoHabilidades);
		this.janela.add(tituloIdiomas);
		this.janela.add(infoIdiomas);
		this.janela.add(tituloPresencial);
		this.janela.add(tituloRemoto);
		this.janela.add(infoPresencial);
		this.janela.add(infoRemoto);
		this.janela.add(tituloBeneficio);
		this.janela.add(infoBeneficio);		
		this.janela.setLayout(null);
		this.janela.setSize(500, 580);
		this.janela.setVisible(true);
		botaosalvar.addActionListener(this);		
	}
	
	public void actionPerformed(ActionEvent click){
        Object eventoClick = click.getSource();
        
        if(eventoClick == botaosalvar)
        {
        	//CLT
        	if(opcao == 3)
        	{            	
            	novoDado.add(infoCargo.getText());
            	novoDado.add(infoQuantidade.getText());
            	novoDado.add(infoEscolaridade.getText());
            	novoDado.add(infoHabilidades.getText());
            	novoDado.add(infoIdiomas.getText());
            	novoDado.add(infoJornada.getText());
            	if(infoPresencial.isSelected())
            		novoDado.add("true");
            	else
            		novoDado.add("false");
            	if(infoRemoto.isSelected())
            		novoDado.add("true");
            	else
            		novoDado.add("false");	
            	novoDado.add(infoRegiao.getText());
            	novoDado.add(infoSalario.getText());
            	novoDado.add(infoBeneficio.getText());
            	novoDado.add(infoIdadeMinima.getText());
            	if(infoPossuiClt.isSelected())
            		novoDado.add("true");
            	else
            		novoDado.add("false");
            	novoDado.add(infoExperiencia.getText());
            	
            	dados.adicionarVagaCLT(novoDado, posicao);
        	}
        	
        	// Estagio
        	if(opcao == 2)
        	{
            	
            	novoDado.add(infoCargo.getText());
            	novoDado.add(infoQuantidade.getText());
            	novoDado.add(infoEscolaridade.getText());
            	novoDado.add(infoHabilidades.getText());
            	novoDado.add(infoIdiomas.getText());
            	novoDado.add(infoJornada.getText());
            	if(infoPresencial.isSelected())
            		novoDado.add("true");
            	else
            		novoDado.add("false");
            	if(infoRemoto.isSelected())
            		novoDado.add("true");
            	else
            		novoDado.add("false");
            	novoDado.add(infoRegiao.getText());
            	novoDado.add(infoSalario.getText());
            	novoDado.add(infoBeneficio.getText());
            	novoDado.add(infoInstituicao.getText());
            	novoDado.add(infoPeriodo.getText());
            	if(infoRemuneracao.isSelected())
            		novoDado.add("true");
            	else
            		novoDado.add("false");
            	
            	
            	dados.adicionarVagaEstagio(novoDado, posicao);
        	}
        	
        	// MenorAprendiz
        	if(opcao == 1)
        	{            	
            	novoDado.add(infoCargo.getText());
            	novoDado.add(infoQuantidade.getText());
            	novoDado.add(infoEscolaridade.getText());
            	novoDado.add(infoHabilidades.getText());
            	novoDado.add(infoIdiomas.getText());
            	novoDado.add(infoJornada.getText());
            	if(infoPresencial.isSelected())
            		novoDado.add("true");
            	else
            		novoDado.add("false");
            	if(infoRemoto.isSelected())
            		novoDado.add("true");
            	else
            		novoDado.add("false");	
            	novoDado.add(infoRegiao.getText());
            	novoDado.add(infoSalario.getText());
            	novoDado.add(infoBeneficio.getText());
            	novoDado.add(infoDisponibilidadeHorario.getText());
            	novoDado.add(infoIdadeMinima.getText());
            	novoDado.add(infoIdadeMaxima.getText());
            	
            	dados.adicionarVagaMenorAprendiz(novoDado, posicao);
        	}
        	
        }       	
	}
	
}

