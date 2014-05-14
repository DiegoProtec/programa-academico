package gui;

import bll.LoginBLL;
import javax.swing.JOptionPane;
import javax.swing.text.AbstractDocument;
import modelo.TbFuncionario;
import modelo.TbLogin;

public class CadastroLogin extends javax.swing.JInternalFrame {

    private boolean rsSenha;
    private boolean rsConfirma;
    private boolean valida;

    public CadastroLogin() {
        initComponents();
        funcionario = new TbFuncionario();
        bllLogin = new LoginBLL();
        vis(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lAviso = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        tFuncionario = new javax.swing.JTextField();
        lUsuario = new javax.swing.JLabel();
        tUsuario = new javax.swing.JTextField();
        ((AbstractDocument) tUsuario.getDocument()).setDocumentFilter(new fabrica.ValorAceito(16, true, false, true, true));
        lSenha = new javax.swing.JLabel();
        bPesquisar = new javax.swing.JButton();
        tSenha = new javax.swing.JPasswordField();
        ((AbstractDocument) tSenha.getDocument()).setDocumentFilter(new fabrica.ValorAceito(16, true, false, true, true));
        lConfirma = new javax.swing.JLabel();
        tConfirma = new javax.swing.JPasswordField();
        ((AbstractDocument) tSenha.getDocument()).setDocumentFilter(new fabrica.ValorAceito(16, true, false, true, true));
        okUsuario = new javax.swing.JLabel();
        okSenha = new javax.swing.JLabel();
        okConfirma = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        bAlterar = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro de Login");

        lAviso.setForeground(new java.awt.Color(255, 0, 0));
        lAviso.setText("Os campos com \" são obrigatório");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(313, 313, 313)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lAviso)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addComponent(lAviso)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Funcionário:");

        tFuncionario.setEditable(false);

        lUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lUsuario.setText("Usuário:");

        lSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lSenha.setText("Senha:");

        bPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/procurar.png"))); // NOI18N
        bPesquisar.setToolTipText("Pesquisar funcionário");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        tSenha.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tSenhaFocusLost(evt);
            }
        });

        lConfirma.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lConfirma.setText("Confirma:");

        tConfirma.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                tConfirmaFocusLost(evt);
            }
        });

        okUsuario.setForeground(new java.awt.Color(255, 0, 0));
        okUsuario.setText("*");

        okSenha.setForeground(new java.awt.Color(255, 0, 0));
        okSenha.setText("*");

        okConfirma.setForeground(new java.awt.Color(255, 0, 0));
        okConfirma.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lConfirma)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(lUsuario)
                            .addComponent(lSenha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tSenha)
                                    .addComponent(tUsuario)
                                    .addComponent(tConfirma, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(okUsuario)
                                    .addComponent(okSenha)
                                    .addComponent(okConfirma)))
                            .addComponent(tFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(bPesquisar)))
                .addContainerGap(269, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lUsuario)
                    .addComponent(tUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okUsuario))
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lSenha)
                    .addComponent(tSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okSenha))
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lConfirma)
                    .addComponent(tConfirma, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(okConfirma))
                .addContainerGap(199, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bAlterar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/recicle.png"))); // NOI18N
        bAlterar.setToolTipText("Inserir login");
        bAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAlterarActionPerformed(evt);
            }
        });

        bLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar2.png"))); // NOI18N
        bLimpar.setToolTipText("Limpar campos");
        bLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bAlterar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bAlterar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
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
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAlterarActionPerformed
        if (validaDados()) {
            alterar();
        } else {
            JOptionPane.showMessageDialog(null, mensagem);
        }
    }//GEN-LAST:event_bAlterarActionPerformed

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        retornoLogin = false;
        dialog = new ConsultaPessoaDialog(true);
        if (dialog.getRetono()) {
            funcionario = new TbFuncionario();
            bllLogin = new LoginBLL();
            funcionario = dialog.getFuncionario();
            tFuncionario.setText(funcionario.getTbPessoa().getNomePessoa());
            if (bllLogin.procuraLogin(funcionario)) {
                login = new TbLogin();
                login = bllLogin.getLogin();
                retornoLogin = true;
            }
            alteraTela();
        } else {
            tFuncionario.setText("");
            vis(false);
        }
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        limpar();
    }//GEN-LAST:event_bLimparActionPerformed

    private void tSenhaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tSenhaFocusLost
        if (tSenha.getPassword().toString().isEmpty()) {
            rsSenha = false;
        } else {
            rsSenha = true;
        }
    }//GEN-LAST:event_tSenhaFocusLost

    private void tConfirmaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tConfirmaFocusLost
        if (tConfirma.getPassword().toString().isEmpty()) {
            rsConfirma = false;
        } else {
            rsConfirma = true;
        }
    }//GEN-LAST:event_tConfirmaFocusLost

    private void alteraTela() {
        vis(true);
        if (retornoLogin) {
            lConfirma.setText("Nova:");
            tUsuario.setText(login.getUsuario());
            tUsuario.setEditable(false);
            okUsuario.setVisible(false);
            tSenha.requestFocus();
        } else {
            lConfirma.setText("Confirma:");
            tUsuario.setText("");
            tUsuario.setEditable(true);
            okUsuario.setVisible(true);
            tUsuario.requestFocus();
        }
    }

    private void vis(boolean is) {
        okUsuario.setVisible(is);
        okSenha.setVisible(is);
        okConfirma.setVisible(is);
        lUsuario.setVisible(is);
        tUsuario.setVisible(is);
        lSenha.setVisible(is);
        tSenha.setVisible(is);
        lConfirma.setVisible(is);
        tConfirma.setVisible(is);
        bAlterar.setVisible(is);
    }

    private void limpa() {
        funcionario = new TbFuncionario();
        bllLogin = new LoginBLL();
        tFuncionario.setText("");
        tUsuario.setText("");
        tSenha.setText("");
        tConfirma.setText("");
    }

    private void alterar() {
        senha = new String(tSenha.getPassword());
        confirma = new String(tConfirma.getPassword());
        usuario = tUsuario.getText();
        if (retornoLogin) {
            login.setTbFuncionario(funcionario);
            login.setUsuario(usuario);
            login.setSenha(senha);
            if (bllLogin.procuraUsario(login)) {
                if (!senha.equals(confirma)) {
                    login.setSenha(confirma);
                    if (bllLogin.altera(login)) {
                        JOptionPane.showMessageDialog(null, "Senha alterada.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Senha não alterada.");
                    }
                    limpa();
                    vis(false);
                } else {
                    tConfirma.setText(null);
                    tConfirma.requestFocus();
                    JOptionPane.showMessageDialog(null, "Senha já cadastrada.");
                }
            } else {
                tSenha.setText("");
                tConfirma.setText("");
                tSenha.requestFocus();
                JOptionPane.showMessageDialog(null, "Senha atual do usuário incorreta.");
            }
        } else {
            if (senha.equals(confirma)) {
                login.setTbFuncionario(funcionario);
                login.setUsuario(usuario);
                login.setSenha(senha);
                if (validaDados()) {
                    if (bllLogin.insere(login)) {
                        JOptionPane.showMessageDialog(null, "Login cadastrado.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Login não cadastrado.");
                    }
                    limpa();
                    vis(false);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Senha e confirmação diferem.");
            }
        }
    }

    private boolean validaDados() {
        mensagem = new StringBuilder("");
        valida = true;
        if (!retornoLogin) {
            if (usuario.equals("") && usuario.length() < 6) {
                mensagem.append("O campo usuário é obrigatório e no mínimo 6 caracteres.\n");
                valida = false;
            }
        }
        if (!rsSenha) {
            mensagem.append("O campo senha é obrigatório e no mínimo 6 caracteres.\n");
            valida = false;
        }
        if (!rsConfirma) {
            mensagem.append("O campo confirma é obrigatório e no mínimo 6 caracteres.\n");
            valida = false;
        }
        return valida;
    }
    private TbFuncionario funcionario;
    private ConsultaPessoaDialog dialog;
    private StringBuilder mensagem;
    private LoginBLL bllLogin;
    private TbLogin login;
    private String usuario;
    private String senha;
    private String confirma;
    private boolean retornoLogin;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAlterar;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JLabel lAviso;
    private javax.swing.JLabel lConfirma;
    private javax.swing.JLabel lSenha;
    private javax.swing.JLabel lUsuario;
    private javax.swing.JLabel okConfirma;
    private javax.swing.JLabel okSenha;
    private javax.swing.JLabel okUsuario;
    private javax.swing.JPasswordField tConfirma;
    private javax.swing.JTextField tFuncionario;
    private javax.swing.JPasswordField tSenha;
    private javax.swing.JTextField tUsuario;
    // End of variables declaration//GEN-END:variables

    private void limpar() {
        limpa();
        vis(false);
    }
}
