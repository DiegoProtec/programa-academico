package gui;

import bll.DepartamentoBLL;
import java.awt.Toolkit;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TbDepartamento;

public class ConsultaDepartamentoDialog extends javax.swing.JDialog {

    private boolean retorno;

    public ConsultaDepartamentoDialog() {
        super();
        initComponents();
        this.setLocation(((Toolkit.getDefaultToolkit().getScreenSize().width / 2) - (this.getWidth() / 2)),
                ((Toolkit.getDefaultToolkit().getScreenSize().height / 2) - (this.getHeight() / 2)));
        tabela();
        setModal(true);
        setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaDepartamento = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel1.setText("Consulta Departamento");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(287, 287, 287)
                .addComponent(jLabel1)
                .addContainerGap(334, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addComponent(jLabel1)
                .addContainerGap(62, Short.MAX_VALUE))
        );

        jScrollPane1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tabelaDepartamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Departamento"
            }
        ));
        tabelaDepartamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaDepartamento);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 525, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabela() {
        listaDepart = new ArrayList<TbDepartamento>();
        bllDepart = new DepartamentoBLL();
        try {
            bllDepart.procura();
            listaDepart = bllDepart.getList();
            setTabela(listaDepart);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro na consulta." + erro);
        }
    }

    private void setTabela(List<TbDepartamento> lista) {
        try {
            tabelaDepartamento.setModel(new TabelaDepartamento(lista));
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro ao adicionar os dados." + erro);
        }
    }

    private void clicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clicked
        try {
            if (evt.getClickCount() == 2) {
                int row = tabelaDepartamento.getSelectedRow();
                departamento = listaDepart.get(row);
                retorno = true;
                dispose();
            } else {
                retorno = false;
            }
        } catch (Exception erro) {
            System.out.println("Erro:" + erro);
            dispose();
        }
    }//GEN-LAST:event_clicked

    public TbDepartamento getDepart() {
        return departamento;
    }

    public List<TbDepartamento> getLista() {
        return listaDepart;
    }

    public boolean getRetorno() {
        return retorno;
    }
    private DepartamentoBLL bllDepart;
    private List<TbDepartamento> listaDepart = new ArrayList<TbDepartamento>();
    private TbDepartamento departamento = new TbDepartamento();
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaDepartamento;
    // End of variables declaration//GEN-END:variables
}
