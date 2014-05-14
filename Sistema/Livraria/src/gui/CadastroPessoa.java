package gui;

import bll.EnderecoBLL;
import bll.TipoComplementoBLL;
import bll.TipoFuncionarioBLL;
import fabrica.Valida;
import fabrica.MyInputVerifier;
import fabrica.CriaComponent;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import modelo.Logradouros;
import modelo.TbEndereco;
import modelo.TbPessoa;
import modelo.TbTipocomplemento;
import modelo.TbTipofuncionario;

public class CadastroPessoa extends JInternalFrame {
    
    public CadastroPessoa(boolean vis) throws ParseException {
        criaCampo = new CriaComponent();
        listaTipoFuncionario = new ArrayList<TbTipofuncionario>();
        pessoa = new TbPessoa();
        endereco = new TbEndereco();
        tipoComplemento = new TbTipocomplemento();
        logradouro = new Logradouros();
        valida = new Valida();
        preencherCombos(vis);
        initComponents();
        cbPessoa.setVisible(vis);
        cbPessoa.setSelectedIndex(0);
        cbComplemento.setSelectedIndex(1);
        setBoolean(false, 1);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel22 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        tNomeCliente = criaCampo.criaTextField(90, "semespeciais");
        tBairro = new javax.swing.JTextField();
        tCidade = new javax.swing.JTextField();
        tEstado = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        tNumero = criaCampo.criaTextField(5, "numeros");
        jLabel16 = new javax.swing.JLabel();
        tEmail = criaCampo.criaTextField(30, "email");
        lNome = new javax.swing.JLabel();
        lEmail = new javax.swing.JLabel();
        lCPF = new javax.swing.JLabel();
        lCEP = new javax.swing.JLabel();
        lNumero = new javax.swing.JLabel();
        cbComplemento = new javax.swing.JComboBox();
        for (TbTipocomplemento tipo : listaTipoComplemento) {  
            cbComplemento.addItem(tipo.getComplemento());  
        }
        tCPF = criaCampo.criaFormattedTextField(11, "CPF");
        tCPF.getDocument().addDocumentListener(new CadastroPessoa.TextEvent());
        tCEP = criaCampo.criaFormattedTextField(8, "CEP");
        tCEP.getDocument().addDocumentListener(new CadastroPessoa.TextEvent());
        cbPessoa = new JComboBox(lista);
        bPesquisarCEP = criaCampo.criaButton();
        bRemoverCPF = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        tRua = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        bCadastrar = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();

        jLabel22.setForeground(new java.awt.Color(255, 0, 0));
        jLabel22.setText("*");

        setClosable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Pessoas");

        jLabel12.setForeground(new java.awt.Color(255, 0, 0));
        jLabel12.setText("Campos com * são obrigatórios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(21, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Nome:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("CPF:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("CEP:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Bairro:");

        jLabel7.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel7.setText("Cidade:");

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Estado:");

        tNomeCliente.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tNomeClienteFocusLost(evt);
            }
        });

        tBairro.setEditable(false);

        tCidade.setEditable(false);

        tEstado.setEditable(false);

        jLabel13.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel13.setText("Nº:");

        tNumero.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tNumeroFocusLost(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel16.setText("E-mail:");

        tEmail.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tEmailFocusLost(evt);
            }
        });

        lNome.setBackground(new java.awt.Color(255, 255, 255));
        lNome.setForeground(new java.awt.Color(255, 0, 0));
        lNome.setText("*");

        lEmail.setForeground(new java.awt.Color(255, 0, 0));
        lEmail.setText("*");

        lCPF.setForeground(new java.awt.Color(255, 0, 0));
        lCPF.setText("*");

        lCEP.setForeground(new java.awt.Color(255, 0, 0));
        lCEP.setText("*");

        lNumero.setForeground(new java.awt.Color(255, 0, 0));
        lNumero.setText("*");

        cbComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbComplementoActionPerformed(evt);
            }
        });

        tCPF.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tCPFFocusGained(evt);
            }
        });

        tCEP.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tCEPFocusGained(evt);
            }
        });

        cbPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPessoaActionPerformed(evt);
            }
        });

        bPesquisarCEP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        bPesquisarCEP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarCEPActionPerformed(evt);
            }
        });

        bRemoverCPF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/remover.png"))); // NOI18N
        bRemoverCPF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoverCPFActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Rua:");

        tRua.setEditable(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(17, 17, 17)
                                .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel6))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(tRua, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(lNumero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tEmail))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lEmail)
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(tCEP, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(tCPF, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lCPF)
                                        .addGap(18, 18, 18)
                                        .addComponent(bRemoverCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 245, Short.MAX_VALUE)
                                        .addComponent(cbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(lCEP)
                                        .addGap(18, 18, 18)
                                        .addComponent(bPesquisarCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addComponent(tNomeCliente))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lNome, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(lNome)
                    .addComponent(tNomeCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bRemoverCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCPF)
                    .addComponent(tCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(cbPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(10, 10, 10)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bPesquisarCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCEP)
                    .addComponent(tCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tRua, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(lNumero)
                    .addComponent(cbComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(lEmail))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        tNomeCliente.getAccessibleContext().setAccessibleName("");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bCadastrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/novo.png"))); // NOI18N
        bCadastrar.setToolTipText("Cadastrar cliente");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
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
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCadastrar)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        limpaTela(1);
    }//GEN-LAST:event_bLimparActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        bllEndereco = new EnderecoBLL();
        if (validaDados()) {
            try {
                insereEndereco();
            } catch (Exception erro) {
                System.out.println("Erro na inserção de dados!\n" + erro);
            }
        } else {
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_bCadastrarActionPerformed

    private void cbPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPessoaActionPerformed
        indexPessoa = cbPessoa.getSelectedIndex();
    }//GEN-LAST:event_cbPessoaActionPerformed

    private void cbComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbComplementoActionPerformed
        indexComp = cbComplemento.getSelectedIndex();
    }//GEN-LAST:event_cbComplementoActionPerformed

    private void tEmailFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tEmailFocusLost
        if (valida.EMAIL(tEmail.getText())) {
            formatoOK(lEmail);
            rsEmail = true;
        } else {
            formatoNO(lEmail);
            rsEmail = false;
        }
    }//GEN-LAST:event_tEmailFocusLost

    private void tNumeroFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tNumeroFocusLost
        if (!tNumero.getText().isEmpty()) {
            formatoOK(lNumero);
            rsNumero = true;
        } else {
            rsNumero = false;
            formatoNO(lNumero);
        }
    }//GEN-LAST:event_tNumeroFocusLost

    private void tNomeClienteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tNomeClienteFocusLost
        if (!tNomeCliente.getText().isEmpty()) {
            formatoOK(lNome);
            rsNome = true;
        } else {
            rsNome = false;
            formatoNO(lNome);
        }
    }//GEN-LAST:event_tNomeClienteFocusLost

    private void bPesquisarCEPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarCEPActionPerformed
        limpaTela(3);
        tNumero.requestFocus();
    }//GEN-LAST:event_bPesquisarCEPActionPerformed

    private void tCEPFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tCEPFocusGained
        bPesquisarCEP.setVisible(true);
    }//GEN-LAST:event_tCEPFocusGained

    private void bRemoverCPFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoverCPFActionPerformed
        limpaTela(2);
    }//GEN-LAST:event_bRemoverCPFActionPerformed

    private void tCPFFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tCPFFocusGained
        bRemoverCPF.setVisible(true);
    }//GEN-LAST:event_tCPFFocusGained

    class TextEvent implements DocumentListener {

        private String str;

        public void insertUpdate(DocumentEvent e) {
            updateLog(e);
        }

        public void removeUpdate(DocumentEvent e) {
            updateLog(e);
        }

        public void changedUpdate(DocumentEvent e) {
        }

        public void updateLog(DocumentEvent e) {
            try {
                str = e.getDocument().getText(0, e.getDocument().getLength());
                str = valida.retiraChar(str);
                if (e.getDocument().getProperty("name").equals("CPF")) {
                    if (str.length() == 11) {
                        tCPF.setInputVerifier(new MyInputVerifier(false));
                        if (valida.CPF(str)) {
                            if (valida.pesquisaCPF(str)) {
                                tCPF.setInputVerifier(new MyInputVerifier(true));
                                eventoCPF(str);
                            } else {
                                tCPFFocusGained(null);
                            }
                        }
                    }
                } else if (e.getDocument().getProperty("name").equals("CEP")) {
                    if (str.length() == 8) {
                        tCEP.setInputVerifier(new MyInputVerifier(false));
                        if (valida.validaCEP(str)) {
                            tCEP.setInputVerifier(new MyInputVerifier(true));
                            logradouro = valida.getLogradouro();
                            eventoCEP(logradouro);
                            bPesquisarCEP.setVisible(false);
                            rsCEP = true;
                        } else {
                            tCEPFocusGained(null);
                        }
                    }
                }
            } catch (BadLocationException ex) {
                Logger.getLogger(CadastroPessoa.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void eventoCPF(String cpf) {
        this.cpf = cpf;
        rsCPF = true;
        formatoOK(lCPF);
        bRemoverCPF.setVisible(false);
        tCEP.requestFocus();
    }

    public void eventoCEP(Logradouros log) {
        tRua.setText(log.getDsLogradouroNome());
        tBairro.setText(log.getBairros().getDsBairroNome());
        tCidade.setText(log.getBairros().getCidades().getDsCidadeNome());
        tEstado.setText(log.getBairros().getCidades().getUf().getDsUfNome());
        formatoOK(lCEP);
        bPesquisarCEP.setVisible(false);
        tNumero.requestFocus();
    }

    protected void formatoOK(JLabel lb) {
        lb.setText("");
        lb.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/ok.png")));
        jPanel2.repaint();
    }

    protected void formatoNO(JLabel lb) {
        lb.setForeground(new java.awt.Color(255, 0, 0));
        lb.setIcon(null);
        lb.setText("*");
        jPanel2.repaint();
    }

    protected void formatoDefault() {
        formatoNO(lNome);
        formatoNO(lCPF);
        formatoNO(lCEP);
        formatoNO(lNumero);
        formatoNO(lEmail);
    }

    protected void limpaTela(int valor) {
        switch (valor) {
            case 1:
                setBoolean(false, valor);
                formatoDefault();
                tRua.setText("");
                tEmail.setText("");
                tBairro.setText("");
                tCidade.setText("");
                tEstado.setText("");
                tNumero.setText("");
                tNomeCliente.setText("");
                tCPF.setText(null);
                tCEP.setText(null);
                tCPF.setInputVerifier(new MyInputVerifier(true));
                tCEP.setInputVerifier(new MyInputVerifier(true));
                cbComplemento.setSelectedIndex(1);
                cbPessoa.setSelectedIndex(0);
                logradouro = new Logradouros();
                ;
                break;
            case 2:
                setBoolean(false, valor);
                tCPF.setText(null);
                tCPF.setInputVerifier(new MyInputVerifier(true));
                formatoNO(lCPF);
                ;
                break;
            case 3:
                setBoolean(false, valor);
                tRua.setText("");
                tBairro.setText("");
                tCidade.setText("");
                tEstado.setText("");
                tCEP.setText(null);
                tCEP.setInputVerifier(new MyInputVerifier(true));
                formatoNO(lCEP);
                logradouro = new Logradouros();
                ;
                break;
            default:
                ;
                break;
        }
    }

    private boolean insereEndereco() {
        retorno = false;
        tipoComplemento = listaTipoComplemento.get(indexComp);
        endereco.setNumero(tNumero.getText());
        endereco.setTbTipocomplemento(tipoComplemento);
        endereco.setLogradouros(logradouro);
        pessoa.setCpf(cpf);
        pessoa.setEmail(tEmail.getText());
        pessoa.setNomePessoa(tNomeCliente.getText());
        if (indexPessoa < 1) {
            if (bllEndereco.gravaEndereco(endereco, pessoa)) {
                limpaTela(1);
                retorno = true;
            }
        } else {
            tipoFuncionario = listaTipoFuncionario.get(indexPessoa - 1);
            if (bllEndereco.gravaEndereco(endereco, pessoa, tipoFuncionario)) {
                limpaTela(1);
                retorno = true;
            }
        }
        return retorno;
    }

    private boolean validaDados() {
        mensagem = new StringBuilder("");
        retorno = true;
        if (rsNome == false) {
            mensagem.append("O campo nome é obrigatório \n");
            retorno = false;
        }
        if (rsCPF == false) {
            mensagem.append("O campo CPF é obrigatório \n");
            retorno = false;
        }
        if (rsEmail == false) {
            mensagem.append("O campo e-mail é obrigatório \n");
            retorno = false;
        }
        if (rsCEP == false) {
            mensagem.append("O campo CEP é obrigatório \n");
            retorno = false;
        }
        if (rsNumero == false) {
            mensagem.append("O campo número é obrigatório \n");
            retorno = false;
        }
        return retorno;
    }

    private void setBoolean(boolean is, int caso) {
        switch (caso) {
            case 1:
                rsNome = is;
                rsNumero = is;
                rsCEP = is;
                rsCPF = is;
                rsEmail = is;
                bRemoverCPF.setVisible(is);
                bPesquisarCEP.setVisible(is);
                tNomeCliente.requestFocus();
                ;
                break;
            case 2:
                bRemoverCPF.setVisible(is);
                rsCPF = is;
                tNomeCliente.requestFocus();
                ;
                break;
            case 3:
                bPesquisarCEP.setVisible(is);
                rsCEP = is;
                tNomeCliente.requestFocus();
                ;
                break;
        }
    }

    private void preencherCombos(boolean vis) {
        if (vis) {
            lista = new String[3];
            lista[0] = "Cliente";
            lista[1] = "Administrador";
            lista[2] = "Funcionario";
        } else {
            lista = new String[1];
            lista[0] = "Cliente";
        }
        bllTipoFuncionario = new TipoFuncionarioBLL();
        bllTipoComp = new TipoComplementoBLL();
        if (bllTipoComp.validaTipo()) {
            listaTipoComplemento = bllTipoComp.getLista();
        }
        if (bllTipoFuncionario.validaTipo()) {
            listaTipoFuncionario = bllTipoFuncionario.getLista();
        }
    }
    private boolean rsNome;
    private boolean rsCPF;
    private boolean rsEmail;
    private boolean rsCEP;
    private boolean rsNumero;
    private boolean retorno;
    private int indexComp;
    private int indexPessoa;
    private StringBuilder mensagem;
    private String[] lista;
    private String cpf;
    private EnderecoBLL bllEndereco;
    private TipoComplementoBLL bllTipoComp;
    private TipoFuncionarioBLL bllTipoFuncionario;
    private List<TbTipocomplemento> listaTipoComplemento;
    private List<TbTipofuncionario> listaTipoFuncionario;
    private TbPessoa pessoa;
    private TbTipofuncionario tipoFuncionario;
    private TbEndereco endereco;
    private TbTipocomplemento tipoComplemento;
    private Logradouros logradouro;
    private Valida valida;
    private CriaComponent criaCampo;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bPesquisarCEP;
    private javax.swing.JButton bRemoverCPF;
    private javax.swing.JComboBox cbComplemento;
    private javax.swing.JComboBox cbPessoa;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lCEP;
    private javax.swing.JLabel lCPF;
    private javax.swing.JLabel lEmail;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNumero;
    private javax.swing.JTextField tBairro;
    private javax.swing.JFormattedTextField tCEP;
    private javax.swing.JFormattedTextField tCPF;
    private javax.swing.JTextField tCidade;
    private javax.swing.JTextField tEmail;
    private javax.swing.JTextField tEstado;
    private javax.swing.JTextField tNomeCliente;
    private javax.swing.JTextField tNumero;
    private javax.swing.JTextField tRua;
    // End of variables declaration//GEN-END:variables
}
