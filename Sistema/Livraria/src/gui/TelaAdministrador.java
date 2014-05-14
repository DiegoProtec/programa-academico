package gui;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JInternalFrame;

public class TelaAdministrador extends javax.swing.JFrame {

    CadastroPessoa cadPessoa;
    ConsultaPessoa consPessoa;
    private ConsultaProduto consProduto;
    private CadastroLogin cadastLogin;
    private CadastroProduto cadProduto;
    private CadastroDepartamento cadDepart;

    public TelaAdministrador() {
        initComponents();
        this.setLocation(((Toolkit.getDefaultToolkit().getScreenSize().width / 2) - (this.getWidth() / 2)),
                ((Toolkit.getDefaultToolkit().getScreenSize().height / 2) - (this.getHeight() / 2)));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu5 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        dkAdmin = new DecoratedDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        mPesquisar = new javax.swing.JMenu();
        imProdutoP = new javax.swing.JMenuItem();
        imPessoaP = new javax.swing.JMenuItem();
        mGerenciar = new javax.swing.JMenu();
        imDepartamento = new javax.swing.JMenuItem();
        imProdutoC = new javax.swing.JMenuItem();
        imPessoaG = new javax.swing.JMenuItem();
        imLogin = new javax.swing.JMenuItem();
        mOpcoes = new javax.swing.JMenu();
        imSair = new javax.swing.JMenuItem();

        jMenu4.setText("File");
        jMenuBar2.add(jMenu4);

        jMenu5.setText("Edit");
        jMenuBar2.add(jMenu5);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        dkAdmin.setBackground(new java.awt.Color(255, 255, 255));
        dkAdmin.setForeground(new java.awt.Color(255, 255, 255));
        dkAdmin.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 900, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, 709, Short.MAX_VALUE)
        );

        mPesquisar.setText("Pesquisar");

        imProdutoP.setText("Produto");
        imProdutoP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imProdutoPActionPerformed(evt);
            }
        });
        mPesquisar.add(imProdutoP);

        imPessoaP.setText("Pessoa");
        imPessoaP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imPessoaPActionPerformed(evt);
            }
        });
        mPesquisar.add(imPessoaP);

        jMenuBar1.add(mPesquisar);

        mGerenciar.setText("Gerenciar");

        imDepartamento.setText("Departamento");
        imDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imDepartamentoActionPerformed(evt);
            }
        });
        mGerenciar.add(imDepartamento);

        imProdutoC.setText("Produto");
        imProdutoC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imProdutoCActionPerformed(evt);
            }
        });
        mGerenciar.add(imProdutoC);

        imPessoaG.setText("Pessoa");
        imPessoaG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imPessoaGActionPerformed(evt);
            }
        });
        mGerenciar.add(imPessoaG);

        imLogin.setText("Login");
        imLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imLoginActionPerformed(evt);
            }
        });
        mGerenciar.add(imLogin);

        jMenuBar1.add(mGerenciar);

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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

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

    private void imPessoaGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imPessoaGActionPerformed
        verificaTelas(cadPessoa);
        try {
            if (cadPessoa == null) {
                cadPessoa = new CadastroPessoa(true);

            } else {
                cadPessoa.moveToFront();
            }
            dkAdmin.add(cadPessoa);
            cadPessoa.setVisible(true);
            centralizar(cadPessoa);
        } catch (ParseException ex) {
            Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imPessoaGActionPerformed

    private void imPessoaPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imPessoaPActionPerformed
        verificaTelas(consPessoa);
        try {
            if (consPessoa == null) {
                consPessoa = new ConsultaPessoa();
            } else {
                consPessoa.moveToFront();
            }
            dkAdmin.add(consPessoa);
            consPessoa.setVisible(true);
            centralizar(consPessoa);
        } catch (ParseException ex) {
            Logger.getLogger(TelaFuncionario.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imPessoaPActionPerformed

    private void imLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imLoginActionPerformed
        verificaTelas(cadastLogin);
        try {
            if (cadastLogin == null) {
                cadastLogin = new CadastroLogin();
            } else {
                cadastLogin.moveToFront();
            }
            dkAdmin.add(cadastLogin);
            cadastLogin.setVisible(true);
            centralizar(cadastLogin);
        } catch (Error error) {
            System.out.println("" + error);
        }
    }//GEN-LAST:event_imLoginActionPerformed

    private void imProdutoPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imProdutoPActionPerformed
        verificaTelas(consProduto);
        try {
            if (consProduto == null) {
                consProduto = new ConsultaProduto(true);
            } else {
                consProduto.moveToFront();
            }
            dkAdmin.add(consProduto);
            consProduto.setVisible(true);
            centralizar(consProduto);
        } catch (Error error) {
            System.out.println("" + error);
        }
    }//GEN-LAST:event_imProdutoPActionPerformed

    private void imProdutoCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imProdutoCActionPerformed
        verificaTelas(cadProduto);
        try {
            if (cadProduto == null) {
                cadProduto = new CadastroProduto();
            } else {
                cadProduto.moveToFront();
            }
            dkAdmin.add(cadProduto);
            cadProduto.setVisible(true);
            centralizar(cadProduto);
        } catch (Error error) {
            System.out.println("" + error);
        }
    }//GEN-LAST:event_imProdutoCActionPerformed

    private void imDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imDepartamentoActionPerformed
        verificaTelas(cadDepart);
        try {
            if (cadDepart == null) {
                cadDepart = new CadastroDepartamento();
            } else {
                cadDepart.moveToFront();
            }
            dkAdmin.add(cadDepart);
            cadDepart.setVisible(true);
            centralizar(cadDepart);
        } catch (Error error) {
            System.out.println("" + error);
        }
    }//GEN-LAST:event_imDepartamentoActionPerformed

    private void verificaTelas(JInternalFrame frame) {
        if (frame != null && frame.isVisible()) {
            dkAdmin.remove(frame);
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
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaAdministrador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane dkAdmin;
    private javax.swing.JMenuItem imDepartamento;
    private javax.swing.JMenuItem imLogin;
    private javax.swing.JMenuItem imPessoaG;
    private javax.swing.JMenuItem imPessoaP;
    private javax.swing.JMenuItem imProdutoC;
    private javax.swing.JMenuItem imProdutoP;
    private javax.swing.JMenuItem imSair;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JMenu mGerenciar;
    private javax.swing.JMenu mOpcoes;
    private javax.swing.JMenu mPesquisar;
    // End of variables declaration//GEN-END:variables
}
