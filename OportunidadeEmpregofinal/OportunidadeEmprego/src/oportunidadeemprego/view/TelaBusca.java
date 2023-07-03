package oportunidadeemprego.view;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class TelaBusca implements ActionListener, ListSelectionListener {
    private JFrame janela;
    private JButton buscar;
    private JTextField texto;
    private JScrollPane scroll;
    private JList<String> listaEmpresasCadastradas;
    private DefaultListModel<String> model;

    public TelaBusca(JList<String> listaEmpresasCadastradas) {
        this.listaEmpresasCadastradas = listaEmpresasCadastradas;
        model = new DefaultListModel<>();
        JList<String> resultado = new JList<>(model);
        scroll = new JScrollPane(resultado);
        buscar = new JButton("Buscar");
        texto = new JTextField(50);
        janela = new JFrame("Busca");
        buscar.setBounds(360, 20, 100, 30);
        texto.setBounds(20, 20, 340, 30);
        scroll.setBounds(20, 60, 440, 240);
        janela.add(buscar);
        janela.add(texto);
        janela.add(scroll);
        janela.setLayout(null);
        janela.setSize(500, 350);
        janela.setVisible(true);
        buscar.addActionListener(this);
    }

    private void realizarBusca() {
        String parametroBusca = texto.getText().trim();
        DefaultListModel<String> modelJList = (DefaultListModel<String>) listaEmpresasCadastradas.getModel();
        model.clear();

        if (parametroBusca.isEmpty()) {
            JOptionPane.showMessageDialog(janela, "Digite um valor para realizar a busca.", "Busca",
                    JOptionPane.INFORMATION_MESSAGE);
            return;
        }

        boolean encontrada = false;

        try {
            String regex = ".*" + Pattern.quote(parametroBusca) + ".*";

            for (int i = 0; i < modelJList.getSize(); i++) {
                String item = modelJList.getElementAt(i);
                if (item.matches(regex)) {
                    model.addElement(item); // Adiciona o item encontrado ao modelo da lista
                    encontrada = true;
                }
            }
        } catch (PatternSyntaxException ex) {
            JOptionPane.showMessageDialog(janela, "O valor de busca contém caracteres inválidos.", "Busca",
                    JOptionPane.ERROR_MESSAGE);
        }

        if (!encontrada) {
            JOptionPane.showMessageDialog(janela, "Nenhuma empresa encontrada.", "Busca",
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    @Override
    public void valueChanged(ListSelectionEvent e) {
        // Não é necessário implementar neste exemplo
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buscar) {
            realizarBusca();
        }
    }

    public void exibirTela() {
        janela.setVisible(true);
    }
}