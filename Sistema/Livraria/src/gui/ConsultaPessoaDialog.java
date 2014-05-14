package gui;

import bll.ClienteBLL;
import bll.FuncionarioBLL;
import bll.PessoaBLL;
import fabrica.Valida;
import fabrica.CriaComponent;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import modelo.TbCliente;
import modelo.TbFuncionario;
import modelo.TbPessoa;

public class ConsultaPessoaDialog extends javax.swing.JDialog {

    public ConsultaPessoaDialog(boolean b) {
        this.sim = b;
        inicia();
        initComponents();
        this.setLocation(((Toolkit.getDefaultToolkit().getScreenSize().width / 2) - (this.getWidth() / 2)),
                ((Toolkit.getDefaultToolkit().getScreenSize().height / 2) - (this.getHeight() / 2)));
        tFormatado.requestFocus();
        rbNome.setSelected(true);
        pesquisaNome();
        setModal(true);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        grupoBotoes = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        tFormatado = criaCampo.criaFormattedTextField(90);
        rbNome = new javax.swing.JRadioButton();
        rbCPF = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaPessoa = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Consulta Pessoa");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(jLabel1)
                .addContainerGap(369, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel1)
                .addContainerGap(31, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        grupoBotoes.add(rbNome);
        rbNome.setText("Nome");
        rbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeActionPerformed(evt);
            }
        });

        grupoBotoes.add(rbCPF);
        rbCPF.setText("CPF");
        rbCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbCPFActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rbNome)
                .addGap(18, 18, 18)
                .addComponent(rbCPF)
                .addGap(18, 18, 18)
                .addComponent(tFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbNome)
                    .addComponent(rbCPF)
                    .addComponent(tFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tabelaPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome"
            }
        ));
        tabelaPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPessoaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaPessoa);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 468, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabelaPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPessoaMouseClicked
        try {
            if (evt.getClickCount() == 2) {
                int row = tabelaPessoa.getSelectedRow();
                if (sim) {
                    funcionario = listaFuncionario.get(row);
                } else {
                    cliente = listaCliente.get(row);
                }
                retorno = true;
                dispose();
            }
        } catch (Exception erro) {
            System.out.println("Erro:" + erro);
            dispose();
        }
    }//GEN-LAST:event_tabelaPessoaMouseClicked

    private void rbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeActionPerformed
        formatoNome();
        pesquisaNome();
    }//GEN-LAST:event_rbNomeActionPerformed

    private void rbCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCPFActionPerformed
        defaultTabela();
        formatoCPF();
    }//GEN-LAST:event_rbCPFActionPerformed

    private void tFormatadoKeyReleased(KeyEvent evt) {
        pesquisaNome();
    }

    private void formatoNome() {
        jPanel2.remove(tFormatado);
        tFormatado = criaCampo.criaFormattedTextField(90);
        tFormatado.setSize(583, 28);
        tFormatado.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tFormatadoKeyReleased(evt);
            }
        });
        jPanel2.add(tFormatado);
        formatoPainel(583);
        tFormatado.requestFocus();
    }

    private void formatoCPF() {
        jPanel2.remove(tFormatado);
        tFormatado = criaCampo.criaFormattedTextField(11, "CPF");
        tFormatado.setSize(322, 28);
        tFormatado.getDocument().addDocumentListener(new ConsultaPessoaDialog.TextEvent());
        jPanel2.add(tFormatado);
        formatoPainel(322);
        tFormatado.requestFocus();
    }

    private void formatoPainel(int size) {
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(rbNome)
                .addGap(18, 18, 18)
                .addComponent(rbCPF)
                .addGap(18, 18, 18)
                .addComponent(tFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, size, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(rbNome)
                .addComponent(rbCPF)
                .addComponent(tFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(34, Short.MAX_VALUE)));
    }

    class TextEvent implements DocumentListener {

        public void insertUpdate(DocumentEvent e) {
            updateLog();
        }

        public void removeUpdate(DocumentEvent e) {
            updateLog();
        }

        public void changedUpdate(DocumentEvent e) {
        }

        public void updateLog() {
            try {
                campo = tFormatado.getText();
                campo = valida.retiraChar(campo);
                if (campo.length() == 11) {
                    if (valida.CPF(campo)) {
                        try {
                            if (sim) {
                                pesquisaCPFFuncionario(campo);
                                setTabelaFuncionario(listaFuncionario);
                            } else {
                                pesquisaCPFCliente(campo);
                                setTabelaCliente(listaCliente);
                            }
                        } catch (Error error) {
                            defaultTabela();
                        }
                    }
                }
            } catch (Error erro) {
                System.out.println("Erro na consulta." + erro);
                defaultTabela();
            }
        }
    }

    private void pesquisaNome() {
        inicia();
        campo = tFormatado.getText();
        pessoa.setNomePessoa(campo);
        try {
            bllPessoa.procuraPessoaNome(pessoa);
            listaPessoa = bllPessoa.getLista();
            Iterator<TbPessoa> iterator = listaPessoa.iterator();
            while (iterator.hasNext()) {
                TbPessoa elemento = iterator.next();
                if (sim) {
                    bllFuncionario.procuraFuncionarioCPF(elemento);
                    if (bllFuncionario.getFuncionario() != null) {
                        funcionario = bllFuncionario.getFuncionario();
                        listaFuncionario.add(funcionario);
                    }
                } else {
                    bllCliente.procuraClienteCPF(elemento);
                    if (bllCliente.getCliente() != null) {
                        cliente = bllCliente.getCliente();
                        listaCliente.add(cliente);
                    }
                }
            }
            if (sim) {
                if (!listaFuncionario.isEmpty()) {
                    setTabelaFuncionario(listaFuncionario);
                }
            } else {
                if (!listaCliente.isEmpty()) {
                    setTabelaCliente(listaCliente);
                }
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro na consulta." + erro);
            defaultTabela();
        }
    }

    private void pesquisaCPFCliente(String cpf) {
        inicia();
        try {
            bllPessoa.procuraPessoaCPF(cpf);
            pessoa = bllPessoa.getPessoa();
            if (valida.pesquisaCliente(pessoa)) {
                cliente = valida.getCliente();
                listaCliente.add(cliente);
            }
        } catch (Exception erro) {
            System.out.println("Erro na consulta." + erro);
        }
    }

    private void pesquisaCPFFuncionario(String cpf) {
        inicia();
        try {
            bllPessoa.procuraPessoaCPF(cpf);
            pessoa = bllPessoa.getPessoa();
            if (valida.pesquisaFuncionario(pessoa)) {
                funcionario = valida.getFuncionario();
                listaFuncionario.add(funcionario);
            }
        } catch (Exception erro) {
            System.out.println("Erro na consulta." + erro);
        }
    }

    private void setTabelaFuncionario(List<TbFuncionario> lista) {
        try {
            tabelaPessoa.setModel(new TabelaFuncionario(lista));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar os dados." + erro);
        }
    }

    private void setTabelaCliente(List<TbCliente> lista) {
        try {
            tabelaPessoa.setModel(new TabelaCliente(lista));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar os dados." + erro);
        }
    }

    private void defaultTabela() {
        tFormatado.setText(campo);
        tabelaPessoa.setModel(new TabelaCliente());
    }

    public TbCliente getCliente() {
        return cliente;
    }

    public boolean getRetono() {
        return retorno;
    }

    public TbFuncionario getFuncionario() {
        return funcionario;
    }

    private void inicia() {
        pessoa = new TbPessoa();
        bllPessoa = new PessoaBLL();
        listaPessoa = new ArrayList<TbPessoa>();
        retorno = false;
        valida = new Valida();
        criaCampo = new CriaComponent();
        cliente = new TbCliente();
        bllCliente = new ClienteBLL();
        listaCliente = new ArrayList<TbCliente>();
        funcionario = new TbFuncionario();
        bllFuncionario = new FuncionarioBLL();
        listaFuncionario = new ArrayList<TbFuncionario>();
    }
    private Valida valida;
    private TbCliente cliente;
    private TbPessoa pessoa;
    private ClienteBLL bllCliente;
    private PessoaBLL bllPessoa;
    private List<TbCliente> listaCliente;
    private List<TbPessoa> listaPessoa;
    private boolean retorno;
    private CriaComponent criaCampo;
    private String campo;
    private final boolean sim;
    private TbFuncionario funcionario;
    private ArrayList<TbFuncionario> listaFuncionario;
    private FuncionarioBLL bllFuncionario;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup grupoBotoes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JRadioButton rbCPF;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JFormattedTextField tFormatado;
    private javax.swing.JTable tabelaPessoa;
    // End of variables declaration//GEN-END:variables
}
