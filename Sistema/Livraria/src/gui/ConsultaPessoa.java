package gui;

import bll.FuncionarioBLL;
import bll.PessoaBLL;
import fabrica.Valida;
import fabrica.CriaComponent;
import java.awt.event.KeyEvent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import modelo.TbPessoa;

public class ConsultaPessoa extends javax.swing.JInternalFrame {

    private Valida valida;
    private PessoaBLL bllPessoa;
    private TbPessoa pessoa;
    private List<TbPessoa> lista;
    private TabelaPessoa modelo;
    private CriaComponent criaCampo;
    private String campo;

    public ConsultaPessoa() throws ParseException {
        criaCampo = new CriaComponent();
        valida = new Valida();
        initComponents();
        modelo = new TabelaPessoa();
        tabelaPessoa.setModel(modelo);
        rbNome.setSelected(true);
        formatoNome();
        pesquisaNome();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupBotao = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        rbNome = new javax.swing.JRadioButton();
        rbCPF = new javax.swing.JRadioButton();
        tFormatado = criaCampo.criaFormattedTextField(90);
        scroll = new javax.swing.JScrollPane();
        tabelaPessoa = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        bAlterar = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Consulta de Pessoas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(317, 317, 317)
                    .addComponent(jLabel1)
                    .addContainerGap(315, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 82, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(jLabel1)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        groupBotao.add(rbNome);
        rbNome.setText("Nome");
        rbNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbNomeActionPerformed(evt);
            }
        });

        groupBotao.add(rbCPF);
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
                .addGap(22, 22, 22)
                .addComponent(rbNome)
                .addGap(18, 18, 18)
                .addComponent(rbCPF)
                .addGap(18, 18, 18)
                .addComponent(tFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(121, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbCPF)
                    .addComponent(rbNome))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        scroll.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabelaPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Email"
            }
        ));
        tabelaPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaPessoaMouseClicked(evt);
            }
        });
        scroll.setViewportView(tabelaPessoa);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/recicle.png"))); // NOI18N
        bAlterar.setToolTipText("Alterar dados");
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        bLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar2.png"))); // NOI18N
        bLimpar.setToolTipText("Limpar campos");
        bLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAlterar))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(scroll, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(scroll, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        limpaTela();
    }//GEN-LAST:event_bLimparActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_bAlterarActionPerformed

    private void rbNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbNomeActionPerformed
        formatoNome();
        pesquisaNome();
    }//GEN-LAST:event_rbNomeActionPerformed

    private void rbCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbCPFActionPerformed
        defaultTabela();
        formatoCPF();
    }//GEN-LAST:event_rbCPFActionPerformed

    private void tabelaPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaPessoaMouseClicked
    }//GEN-LAST:event_tabelaPessoaMouseClicked

    private void setTabela(List<TbPessoa> lista) {
        try {
            tabelaPessoa.setModel(new TabelaPessoa(lista));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar os dados." + erro);
        }
    }

    private void limpaTela() {
        rbNome.setSelected(true);
        formatoNome();
        tFormatado.setText(null);
        pesquisaNome();
        tFormatado.requestFocus();
    }

    private boolean alterar() {
        pessoa = new TbPessoa();
        int selecionados[] = tabelaPessoa.getSelectedRows();
        if (selecionados.length == 1) {
            int row = tabelaPessoa.getSelectedRow();
            pessoa = lista.get(row);
            int result = JOptionPane.showConfirmDialog(null, "Deseja alterar " + pessoa.getNomePessoa() + "?", "Não", JOptionPane.YES_NO_OPTION);
            if (result == JOptionPane.YES_OPTION) {
                modelo.aletrar(pessoa);
            }
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item.");
            return false;
        }
    }

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
        tFormatado.getDocument().addDocumentListener(new ConsultaPessoa.TextEvent());
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
                .addGap(17, 17, 17)
                .addComponent(rbNome)
                .addGap(18, 18, 18)
                .addComponent(rbCPF)
                .addGap(18, 18, 18)
                .addComponent(tFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, size, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(tFormatado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(rbCPF)
                .addComponent(rbNome))
                .addContainerGap(28, Short.MAX_VALUE)));
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
                        pesquisaCPF(campo);
                    }
                }
            } catch (Error erro) {
                System.out.println("Erro na consulta." + erro);
                defaultTabela();
            }
        }
    }

    private void pesquisaNome() {
        lista = new ArrayList<TbPessoa>();
        bllPessoa = new PessoaBLL();
        pessoa = new TbPessoa();
        campo = tFormatado.getText();
        pessoa.setNomePessoa(campo);
        try {
            bllPessoa.procuraPessoaNome(pessoa);
            lista = bllPessoa.getLista();
            if (!lista.isEmpty()) {
                setTabela(lista);
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro na consulta." + erro);
            defaultTabela();
        }
    }

    private void pesquisaCPF(String cpf) {
        bllPessoa = new PessoaBLL();
        valida = new Valida();
        pessoa = new TbPessoa();
        try {
            bllPessoa.procuraPessoaCPF(cpf);
            pessoa = bllPessoa.getPessoa();
            lista.add(pessoa);
            setTabela(lista);
        } catch (Exception erro) {
            System.out.println("Erro na consulta." + erro);
            defaultTabela();
        }
    }

    private void defaultTabela() {
        tFormatado.setText(campo);
        tabelaPessoa.setModel(new TabelaCliente());
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bLimpar;
    private javax.swing.ButtonGroup groupBotao;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JRadioButton rbCPF;
    private javax.swing.JRadioButton rbNome;
    private javax.swing.JScrollPane scroll;
    private javax.swing.JFormattedTextField tFormatado;
    private javax.swing.JTable tabelaPessoa;
    // End of variables declaration//GEN-END:variables
}
