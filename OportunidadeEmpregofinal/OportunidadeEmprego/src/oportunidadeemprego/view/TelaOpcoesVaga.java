package oportunidadeemprego.view;
import java.awt.Font;
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import oportunidadeemprego.controller.DadosController;

public class TelaOpcoesVaga implements ActionListener
{
	private JFrame f = new JFrame("Opcoes de vagas");
	private JButton estagio = new JButton("Estagio"); 
	private JButton menorAprendiz = new JButton("Menor Aprendiz");
	private JButton Clt = new JButton("Clt");
	private int posicaoEmpresa;
	private static DadosController dados;

	public TelaOpcoesVaga(DadosController dadoss, int pposicaoEmpresa){
		
		dados = dadoss;
		posicaoEmpresa = pposicaoEmpresa;
		
		

		
		f.setSize(400, 250);
		estagio.setBounds(140, 30, 100, 30);
		menorAprendiz.setBounds(140, 80, 100, 30);
		Clt.setBounds(140, 130, 100, 30);
		f.setLayout(null);
		f.add(Clt);
		f.add(estagio);
		f.add(menorAprendiz);
		f.setVisible(true);
		
		estagio.addActionListener(this);
		menorAprendiz.addActionListener(this);
		Clt.addActionListener(this);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object src = e.getSource();
		
		if(src == estagio){
			new TelaDetalheVaga().inserirEditar(dados, 2, posicaoEmpresa);
			f.dispose();
		}
		
		if(src == menorAprendiz){
			new TelaDetalheVaga().inserirEditar(dados, 1, posicaoEmpresa);
			f.dispose();
		}
		
		if(src == Clt) {
			new TelaDetalheVaga().inserirEditar(dados, 3, posicaoEmpresa);
			f.dispose();
		}
		
	}
}


