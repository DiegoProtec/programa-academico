package gui;

import bll.ProdutoBLL;
import fabrica.ValorAceito;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import modelo.TbProduto;

public class ConsultaProduto extends javax.swing.JInternalFrame {

    public ConsultaProduto(boolean vis) {
        initComponents();
        modelo = new TabelaProduto(true);
        tabelaProduto.setModel(modelo);
        bAlterar.setVisible(vis);
        preencheTabela(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaProduto = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        tProduto = new javax.swing.JTextField();
        ((AbstractDocument) tProduto.getDocument()).setDocumentFilter(new fabrica.ValorAceito(45, true, false, true, true));
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bAlterar = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Consulta Produtos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel1)
                .addContainerGap(324, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addContainerGap(45, Short.MAX_VALUE))
        );

        tabelaProduto.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Quantidade", "Departamento"
            }
        ));
        jScrollPane1.setViewportView(tabelaProduto);

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tProduto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tProdutoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tProdutoFocusLost(evt);
            }
        });
        tProduto.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tProdutoKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Produto:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tProduto)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/recicle.png"))); // NOI18N
        bAlterar.setToolTipText("Alterar produto");
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        bLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar2.png"))); // NOI18N
        bLimpar.setToolTipText("Limpar tela");
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
                .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
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
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 864, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 361, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tProdutoFocusGained
        if (!tProduto.getText().equals("")) {
            tProduto.setText("");
        }
    }//GEN-LAST:event_tProdutoFocusGained

    private void tProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tProdutoFocusLost
        if (tProduto.getText().equals("")) {
            tProduto.setText(descricao);
        }
    }//GEN-LAST:event_tProdutoFocusLost

    private void preencheTabela(boolean chave) {
        lista = new ArrayList<TbProduto>();
        bllProduto = new ProdutoBLL();
        produto = new TbProduto();
        descricao = tProduto.getText();
        if (chave) {
            try {
                if (bllProduto.procuraProduto(descricao)) {
                    produto = bllProduto.getProduto();
                    lista.add(produto);
                    modelo = new TabelaProduto(lista, true);
                    tabelaProduto.setModel(modelo);
                } else {
                    modelo = new TabelaProduto();
                    tabelaProduto.setModel(modelo);
                }
            } catch (Error erro) {
                JOptionPane.showMessageDialog(this, erro + " Produto não encontrado.");
            }
        } else {
            produto.setProduto(descricao);
            bllProduto.procuraProduto(produto);
            lista = bllProduto.getLista();
            modelo = new TabelaProduto(lista, true);
            tabelaProduto.setModel(modelo);
        }
        tProduto.requestFocus();
    }

    private void tProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tProdutoKeyReleased
        lista = new ArrayList<TbProduto>();
        bllProduto = new ProdutoBLL();
        produto = new TbProduto();
        descricao = tProduto.getText();
        if (descricao.length() == 12) {
            preencheTabela(true);
        } else {
            preencheTabela(false);
        }
    }//GEN-LAST:event_tProdutoKeyReleased

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        tProduto.setText("");
        descricao = "";
        preencheTabela(false);
    }//GEN-LAST:event_bLimparActionPerformed

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_bAlterarActionPerformed

    private boolean alterar() {
        int selecionados[] = tabelaProduto.getSelectedRows();
        if (selecionados.length > -1) {
            ArrayList<TbProduto> itens = new ArrayList<TbProduto>();
            for (int i = 0; i < selecionados.length; i++) {
                itens.add(modelo.getItem(selecionados[i]));
            }
            Iterator<TbProduto> iterator = itens.iterator();
            while (iterator.hasNext()) {
                TbProduto produto = iterator.next();
                int result = JOptionPane.showConfirmDialog(null, "Deseja alterar " + produto.getProduto() + "?", "Não", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    modelo.alterar(produto);
                } else {
                    preencheTabela(false);
                }
            }
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item.");
            return false;
        }
    }
    private TabelaProduto modelo;
    private String descricao;
    private ProdutoBLL bllProduto;
    private TbProduto produto;
    private List<TbProduto> lista;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField tProduto;
    private javax.swing.JTable tabelaProduto;
    // End of variables declaration//GEN-END:variables
}
