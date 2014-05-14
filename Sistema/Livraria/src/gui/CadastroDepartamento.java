package gui;

import bll.DepartamentoBLL;
import fabrica.MyInputVerifier;
import fabrica.CriaComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import modelo.TbDepartamento;

public class CadastroDepartamento extends javax.swing.JInternalFrame {

    public CadastroDepartamento() {
        departamento = new TbDepartamento();
        bllDepartamento = new DepartamentoBLL();
        criaCampo = new CriaComponent();
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tDepartamento = criaCampo.criaTextField(90, "semespeciais");
        okDepartamento = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        bInserir = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();

        setClosable(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Cadastro Departamento");

        jLabel2.setForeground(new java.awt.Color(255, 0, 0));
        jLabel2.setText("Campos com * são obrigatórios");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(295, 295, 295))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 34, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setText("Departamento:");

        tDepartamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tDepartamentoKeyReleased(evt);
            }
        });

        okDepartamento.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        okDepartamento.setForeground(new java.awt.Color(255, 0, 0));
        okDepartamento.setText("*");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(okDepartamento)
                .addContainerGap(205, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(okDepartamento)
                    .addComponent(tDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(333, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        bInserir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/recicle.png"))); // NOI18N
        bInserir.setToolTipText("Gravar departamento");
        bInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bInserirActionPerformed(evt);
            }
        });

        bLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/Limpar2.png"))); // NOI18N
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
                .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bInserir)
                    .addComponent(bLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        limpa(false);
    }//GEN-LAST:event_bLimparActionPerformed

    private void bInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bInserirActionPerformed
        bllDepartamento = new DepartamentoBLL();
        if (validaDados()) {
            bllDepartamento.insere(departamento);
        } else {
            JOptionPane.showMessageDialog(null, mensagem);
        }
        limpa(false);
    }//GEN-LAST:event_bInserirActionPerformed

    private void tDepartamentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tDepartamentoKeyReleased
        procuraDep();
    }//GEN-LAST:event_tDepartamentoKeyReleased

    private boolean validaDados() {
        mensagem = new StringBuilder("");
        retorno = true;
        if (rsDepartamento == false) {
            mensagem.append("O campo departamento é obrigatório \n");
            retorno = false;
        }
        return retorno;
    }

    private void procuraDep() {
        bllDepartamento = new DepartamentoBLL();
        try {
            str = tDepartamento.getText();
            if (str.equals("")) {
                valida(false, "");
            } else {
                if (!bllDepartamento.procura(str)) {
                    valida(true, str);
                } else {
                    valida(false, "");
                }
            }
        } catch (Error error) {
            System.out.println("Error: " + error);
        }
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

    private void valida(boolean val, String str) {
        departamento = new TbDepartamento();
        if (val) {
            tDepartamento.setInputVerifier(new MyInputVerifier(val));
            formatoOK(okDepartamento);
            rsDepartamento = val;
            departamento.setDepartamento(str);
        } else {
            formatoNO(okDepartamento);
            departamento.setDepartamento(str);
            tDepartamento.requestFocus();
            tDepartamento.setInputVerifier(new MyInputVerifier(val));
            rsDepartamento = val;
        }
    }

    private void limpa(boolean val) {
        formatoNO(okDepartamento);
        departamento.setDepartamento(str);
        tDepartamento.setText("");
        tDepartamento.requestFocus();
        tDepartamento.setInputVerifier(new MyInputVerifier(val));
        rsDepartamento = val;
    }
    private CriaComponent criaCampo;
    private StringBuilder mensagem;
    private boolean retorno;
    private boolean rsDepartamento = false;
    private DepartamentoBLL bllDepartamento;
    private TbDepartamento departamento;
    private String str;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bInserir;
    private javax.swing.JButton bLimpar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel okDepartamento;
    private javax.swing.JTextField tDepartamento;
    // End of variables declaration//GEN-END:variables
}
