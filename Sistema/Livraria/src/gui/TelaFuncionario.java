package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;
import modelo.TbFuncionario;

public class TelaFuncionario extends javax.swing.JFrame {
    
    static TelaVenda telaVenda;
    private CadastroPessoa cadCliente;
    private ConsultaProduto produtoPesquisa;
    private static TbFuncionario funcionario;
    
    public TelaFuncionario(TbFuncionario funcionario) {
        TelaFuncionario.funcionario = new TbFuncionario();
        initComponents();
        this.setLocation(((Toolkit.getDefaultToolkit().getScreenSize().width / 2) - (this.getWidth() / 2)),
                ((Toolkit.getDefaultToolkit().getScreenSize().height / 2) - (this.getHeight() / 2)));
        TelaFuncionario.funcionario = funcionario;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        dkFunc = new DecoratedDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mVendas = new javax.swing.JMenu();
        imVenda = new javax.swing.JMenuItem();
        mPesquisar = new javax.swing.JMenu();
        imProdutoP = new javax.swing.JMenuItem();
        imClienteP = new javax.swing.JMenuItem();
        mCadastrar = new javax.swing.JMenu();
        imClienteC = new javax.swing.JMenuItem();
        mOpcoes = new javax.swing.JMenu();
        imSair = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(920, 740));

        jPanel1.setPreferredSize(new java.awt.Dimension(920, 740));

        dkFunc.setBackground(new java.awt.Color(255, 255, 255));
        dkFunc.setForeground(new java.awt.Color(255, 255, 255));
        dkFunc.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkFunc, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );

        mVendas.setText("Vendas");

        imVenda.setText("Vendas");
        imVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imVendaActionPerformed(evt);
            }
        });
        mVendas.add(imVenda);

        jMenuBar1.add(mVendas);

        mPesquisar.setText("Pesquisar");

        imProdutoP.setText("Produto");
        imProdutoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imProdutoPActionPerformed(evt);
            }
        });
        mPesquisar.add(imProdutoP);

        imClienteP.setText("Cliente");
        imClienteP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imClientePActionPerformed(evt);
            }
        });
        mPesquisar.add(imClienteP);

        jMenuBar1.add(mPesquisar);

        mCadastrar.setText("Cadastrar");

        imClienteC.setText("Cliente");
        imClienteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imClienteCActionPerformed(evt);
            }
        });
        mCadastrar.add(imClienteC);

        jMenuBar1.add(mCadastrar);

        mOpcoes.setText("Opções");

        imSair.setText("Sair");
        imSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imSairActionPerformed(evt);
            }
        });
        mOpcoes.add(imSair);

        jMenuBar1.add(mOpcoes);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 910, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );

        getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void imSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imSairActionPerformed
        this.dispose();
        TelaLogin login = new TelaLogin();
        login.setVisible(true);
    }//GEN-LAST:event_imSairActionPerformed
    
    public static void centralizar(JInternalFrame fr) {
        Dimension d = fr.getDesktopPane().getSize();
        fr.setLocation((d.width - fr.getSize().width) / 2, (d.height - fr.getSize().height) / 2);
    }
    
    private void imClienteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imClienteCActionPerformed
        verificaTelas(produtoPesquisa);
        if (cadCliente == null) {
            try {
                cadCliente = new CadastroPessoa(false);
            } catch (ParseException ex) {
                Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else {
            cadCliente.moveToFront();
        }
        dkFunc.add(cadCliente);
        cadCliente.setVisible(true);
        centralizar(cadCliente);
    }//GEN-LAST:event_imClienteCActionPerformed
    
    private void imVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imVendaActionPerformed
        if (telaVenda == null) {
            telaVenda = new TelaVenda(funcionario);
            telaVenda.setVisible(true);
            dkFunc.add(telaVenda);
            telaVenda.pack();
            dkFunc.getDesktopManager().maximizeFrame(telaVenda);
        } else {
            telaVenda.setVisible(true);
        }
        try {
            telaVenda.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }//GEN-LAST:event_imVendaActionPerformed
    
    private void imClientePActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imClientePActionPerformed
        ConsultaPessoaDialog consultaClienteDialog;
        consultaClienteDialog = new ConsultaPessoaDialog(false);
    }//GEN-LAST:event_imClientePActionPerformed
    
    private void imProdutoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imProdutoPActionPerformed
        verificaTelas(produtoPesquisa);
        if (produtoPesquisa == null) {
            produtoPesquisa = new ConsultaProduto(false);
        } else {
            produtoPesquisa.moveToFront();
        }
        dkFunc.add(produtoPesquisa);
        produtoPesquisa.setVisible(true);
        centralizar(produtoPesquisa);
    }//GEN-LAST:event_imProdutoPActionPerformed
    
    private void verificaTelas(JInternalFrame frame) {
        if (frame != null && frame.isVisible()) {
            dkFunc.remove(frame);
            frame.dispose();
        }
    }
    
    public static void main(String args[]) {

        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaFuncionario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaFuncionario(funcionario).setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dkFunc;
    private javax.swing.JMenuItem imClienteC;
    private javax.swing.JMenuItem imClienteP;
    private javax.swing.JMenuItem imProdutoP;
    private javax.swing.JMenuItem imSair;
    private javax.swing.JMenuItem imVenda;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mCadastrar;
    private javax.swing.JMenu mOpcoes;
    private javax.swing.JMenu mPesquisar;
    private javax.swing.JMenu mVendas;
    // End of variables declaration//GEN-END:variables
}
