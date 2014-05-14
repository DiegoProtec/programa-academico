package gui;

import bll.ProdutoBLL;
import fabrica.CriaComponent;
import fabrica.DecimalFormatedField;
import fabrica.MyInputVerifier;
import fabrica.Valida;
import java.text.DecimalFormat;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.AbstractDocument;
import modelo.TbDepartamento;
import modelo.TbProduto;

public class CadastroProduto extends javax.swing.JInternalFrame {
    
    private boolean rsCodigo;
    private boolean rsDescricao;
    private boolean rsQuantidade;
    private boolean rsPreco;
    private boolean rsDepartamento;
    private boolean retorno;
    private int quantidade;
    private double preco;
    private String total;
    private String descricao;
    private String codigo;
    private StringBuilder mensagem;
    private ProdutoBLL bllProduto;
    private TbProduto produto;
    private ConsultaDepartamentoDialog dialog;
    private Valida valida;
    private CriaComponent criaCampo;
    private TbDepartamento departamento;
    
    public CadastroProduto() {
        iniciaVariaveis();
        initComponents();
        limparTela();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tCodigo = criaCampo.criaTextFieldProduto(12, "Codigo");
        tCodigo.getDocument().addDocumentListener(new CadastroProduto.TextEvent());
        tDescricao = new javax.swing.JTextField();
        ((AbstractDocument) tDescricao.getDocument()).setDocumentFilter(new fabrica.ValorAceito(45, true, false, true, true));
        tQuantidade = new javax.swing.JTextField();
        ((AbstractDocument) tQuantidade.getDocument()).setDocumentFilter(new fabrica.ValorAceito(5, true, false, false, false));
        tPreco = new DecimalFormatedField(new DecimalFormat("R$ 0.00")) {    
            {   
                setLimit(9);    
            }    
        };
        tDepartamento = new javax.swing.JTextField();
        bPesquisar = new javax.swing.JButton();
        okCodigo = new javax.swing.JLabel();
        okDescricao = new javax.swing.JLabel();
        okQuantidade = new javax.swing.JLabel();
        okPreco = new javax.swing.JLabel();
        okDepartamento = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bSalvar = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro Produto");

        jLabel7.setForeground(new java.awt.Color(255, 0, 0));
        jLabel7.setText("Os campos com * são obrigatórios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(331, 331, 331)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jLabel7)))
                .addContainerGap(340, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jLabel7)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Código de barras:");

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Descrição:");

        jLabel4.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel4.setText("Quantidade:");

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Preço:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel6.setText("Departamento:");

        tDescricao.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tDescricaoFocusLost(evt);
            }
        });

        tQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tQuantidadeFocusLost(evt);
            }
        });

        tPreco.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tPrecoFocusLost(evt);
            }
        });

        tDepartamento.setEditable(false);

        bPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/procurar.png"))); // NOI18N
        bPesquisar.setToolTipText("Pesquisar departamento");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        okCodigo.setForeground(new java.awt.Color(255, 0, 0));
        okCodigo.setText("*");

        okDescricao.setForeground(new java.awt.Color(255, 0, 0));
        okDescricao.setText("*");

        okQuantidade.setForeground(new java.awt.Color(255, 0, 0));
        okQuantidade.setText("*");

        okPreco.setForeground(new java.awt.Color(255, 0, 0));
        okPreco.setText("*");

        okDepartamento.setForeground(new java.awt.Color(255, 0, 0));
        okDepartamento.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 322, Short.MAX_VALUE)
                    .addComponent(tDescricao)
                    .addComponent(tQuantidade)
                    .addComponent(tPreco)
                    .addComponent(tDepartamento))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(okDepartamento))
                    .addComponent(okCodigo)
                    .addComponent(okDescricao)
                    .addComponent(okQuantidade)
                    .addComponent(okPreco))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okCodigo))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okDescricao))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okQuantidade))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(tPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okPreco))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(tDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(bPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(101, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(okDepartamento)
                        .addGap(110, 110, 110))))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/recicle.png"))); // NOI18N
        bSalvar.setToolTipText("Inserir produto");
        bSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bSalvarActionPerformed(evt);
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
                .addComponent(bLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(bLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bSalvarActionPerformed
        if (validaDados()) {
            codigo = tCodigo.getText();
            descricao = tDescricao.getText();
            quantidade = Integer.parseInt(tQuantidade.getText());
            total = tPreco.getText();
            preco = Double.parseDouble(total.replaceAll("R|\\$| ", "").replaceAll(",", "."));
            bllProduto = new ProdutoBLL();
            produto = new TbProduto();
            produto.setIdProduto(codigo);
            produto.setProduto(descricao);
            produto.setQuantidade(quantidade);
            produto.setValor(preco);
            produto.setTbDepartamento(departamento);
            if (bllProduto.gravaProduto(produto)) {
                JOptionPane.showMessageDialog(null, "Cadastro efetuado com sucesso do \n"
                        + "Produto: " + produto.getProduto() + "\n"
                        + "Código: " + produto.getIdProduto());
            } else {
                JOptionPane.showMessageDialog(null, "Produto não cadastrado.");
            }
            limparTela();
        } else {
            JOptionPane.showMessageDialog(null, mensagem);
            if (!rsCodigo) {
                tCodigo.setText("");
                tCodigo.requestFocus();
            } else if (!rsDescricao) {
                tDescricao.setText("");
                tDescricao.requestFocus();
            } else if (!rsQuantidade) {
                tQuantidade.setText("");
                tQuantidade.requestFocus();
            } else if (!rsPreco) {
                tPreco.setText("");
                tPreco.requestFocus();
            }
        }
    }//GEN-LAST:event_bSalvarActionPerformed
    
    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        limparTela();
    }//GEN-LAST:event_bLimparActionPerformed
    
    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        dialog = new ConsultaDepartamentoDialog();
        departamento = dialog.getDepart();
        tDepartamento.setText(departamento.getDepartamento());
        if (dialog.getRetorno()) {
            rsDepartamento = true;
            formatoOK(okDepartamento);
        } else {
            tDepartamento.setText("");
            rsDepartamento = false;
            formatoNO(okDepartamento);
        }
    }//GEN-LAST:event_bPesquisarActionPerformed
    
    private void tDescricaoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tDescricaoFocusLost
        if (tDescricao.getText().isEmpty()) {
            rsDescricao = false;
            formatoNO(okDescricao);
        } else {
            rsDescricao = true;
            formatoOK(okDescricao);
        }
    }//GEN-LAST:event_tDescricaoFocusLost
    
    private void tQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tQuantidadeFocusLost
        if (tQuantidade.getText().isEmpty()) {
            rsQuantidade = false;
            formatoNO(okQuantidade);
        } else {
            rsQuantidade = true;
            formatoOK(okQuantidade);
        }
    }//GEN-LAST:event_tQuantidadeFocusLost
    
    private void tPrecoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tPrecoFocusLost
        if (tPreco.getText().isEmpty()) {
            rsPreco = false;
            formatoNO(okPreco);
        } else {
            rsPreco = true;
            formatoOK(okPreco);
        }
    }//GEN-LAST:event_tPrecoFocusLost
    
    private void iniciaVariaveis() {
        criaCampo = new CriaComponent();
        valida = new Valida();
        produto = new TbProduto();
        bllProduto = new ProdutoBLL();
        departamento = new TbDepartamento();
    }
    
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
                str = tCodigo.getText().trim();
                formatoNO(okCodigo);
                rsCodigo = false;
                if (e.getDocument().getProperty("name").equals("Codigo")) {
                    if (str.length() == 12) {
                        tCodigo.setInputVerifier(new MyInputVerifier(false));
                        if (!valida.validaCodigoProduto(str)) {
                            tCodigo.setInputVerifier(new MyInputVerifier(true));
                            formatoOK(okCodigo);
                            rsCodigo = true;
                        }
                    }
                }
            } catch (Error erro) {
                System.out.println("Código inválido." + erro);
            }
        }
    }
    
    private boolean validaDados() {
        mensagem = new StringBuilder("");
        retorno = true;
        if (rsCodigo == false) {
            mensagem.append("O campo código é obrigatório \n");
            retorno = false;
        }
        if (rsDescricao == false) {
            mensagem.append("O campo descrição é obrigatório \n");
            retorno = false;
        }
        if (rsQuantidade == false) {
            mensagem.append("O campo quantidade é obrigatório \n");
            retorno = false;
        }
        if (rsPreco == false) {
            mensagem.append("O campo preço é obrigatório \n");
            retorno = false;
        }
        if (rsDepartamento == false) {
            mensagem.append("O campo departamento é obrigatório \n");
            retorno = false;
        }
        return retorno;
    }
    
    private void limparTela() {
        rsCodigo = false;
        rsDescricao = false;
        rsQuantidade = false;
        rsPreco = false;
        rsDepartamento = false;
        tCodigo.setText("");
        tDescricao.setText("");
        tQuantidade.setText("");
        tPreco.setText("");
        tDepartamento.setText("");
        formatoNO(okCodigo);
        formatoNO(okDescricao);
        formatoNO(okQuantidade);
        formatoNO(okPreco);
        formatoNO(okDepartamento);
        tCodigo.requestFocus();
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
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel okCodigo;
    private javax.swing.JLabel okDepartamento;
    private javax.swing.JLabel okDescricao;
    private javax.swing.JLabel okPreco;
    private javax.swing.JLabel okQuantidade;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tDepartamento;
    private javax.swing.JTextField tDescricao;
    private javax.swing.JTextField tPreco;
    private javax.swing.JTextField tQuantidade;
    // End of variables declaration//GEN-END:variables
}
