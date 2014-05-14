package gui;

import fabrica.DecimalFormatedField;
import bll.ProdutoBLL;
import bll.VendaBLL;
import fabrica.Valida;
import java.awt.event.ActionEvent;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.KeyStroke;
import javax.swing.text.AbstractDocument;
import modelo.RlItemVenda;
import modelo.TbCliente;
import modelo.TbFuncionario;
import modelo.TbProduto;
import modelo.TbVenda;

public class TelaVenda extends javax.swing.JInternalFrame {

    public TelaVenda(TbFuncionario func) {
        iniciaVariaveis(func);
        initComponents();
        tFuncionario.setText(funcionario.getTbPessoa().getNomePessoa());
        tData.setText(data.format(Calendar.getInstance().getTime()));
        vendaDefault(1);
        limpaDados(true);
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        bCancelar.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke("ESCAPE"), "cancelar");
        bCancelar.getActionMap().put("cancelar", new AbstractAction("cancelar") {
            public void actionPerformed(ActionEvent evt) {
                int result = JOptionPane.showConfirmDialog(null, "Deseja cancelar a venda,\nCódigo: " + venda.getIdVenda() + " ?", "Cancelar venda!", JOptionPane.YES_NO_OPTION);
                if (result == JOptionPane.YES_OPTION) {
                    cancela();
                    vendaDefault(3);
                    dispose();
                    TelaFuncionario.telaVenda = null;
                } else {
                    setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
                }
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        bPesquisaCliente = new javax.swing.JButton();
        lCliente = new javax.swing.JLabel();
        tCliente = new javax.swing.JTextField();
        ((AbstractDocument) tCliente.getDocument()).setDocumentFilter(new fabrica.ValorAceito(45, false, false, true, true));
        jLabel5 = new javax.swing.JLabel();
        tFuncionario = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tData = new javax.swing.JTextField();
        lCodigoVenda = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        tProduto = new javax.swing.JTextField();
        ((AbstractDocument) tProduto.getDocument()).setDocumentFilter(new fabrica.ValorAceito(45, true, false, true, true));
        jLabel7 = new javax.swing.JLabel();
        tQuantidade = new javax.swing.JTextField();
        ((AbstractDocument) tQuantidade.getDocument()).setDocumentFilter(new fabrica.ValorAceito(2, true, false, false, false));
        jLabel8 = new javax.swing.JLabel();
        tDesconto = new javax.swing.JTextField();
        ((AbstractDocument) tDesconto.getDocument()).setDocumentFilter(new fabrica.ValorAceito(2, true, false, false, false));
        bRemove = new javax.swing.JButton();
        bAdicionar = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        tTotal = new DecimalFormatedField(new DecimalFormat("R$ 0.00")) {    
            {   
                setLimit(9);    
            }    
        };
        jLabel2 = new javax.swing.JLabel();
        tValor = new DecimalFormatedField(new DecimalFormat("R$ 0.00")) {    
            {   
                setLimit(9);    
            }    
        };
        lEstoque = new javax.swing.JLabel();
        tEstoque = new javax.swing.JTextField();
        ((AbstractDocument) tEstoque.getDocument()).setDocumentFilter(new fabrica.ValorAceito(5, true, false, false, false));
        bPesquisar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaItens = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        tTotalVenda = new DecimalFormatedField(new DecimalFormat("R$ 0.00")) {    
            {   
                setLimit(9);    
            }    
        };
        jLabel11 = new javax.swing.JLabel();
        bConcluir = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(900, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setText("Venda");

        bPesquisaCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/procurar.png"))); // NOI18N
        bPesquisaCliente.setToolTipText("PesquisarCliente");
        bPesquisaCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisaClienteActionPerformed(evt);
            }
        });

        lCliente.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lCliente.setText("Cliente:");

        tCliente.setEditable(false);

        jLabel5.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel5.setText("Funcionário:");

        tFuncionario.setEditable(false);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel3.setText("Data:");

        tData.setEditable(false);

        lCodigoVenda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lCodigoVenda, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(lCliente))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bPesquisaCliente))
                    .addComponent(tFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(tData, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                        .addComponent(tFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(tData, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(bPesquisaCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCliente)
                    .addComponent(lCodigoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel4.setText("Produto:");

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

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Quantidade:");

        tQuantidade.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tQuantidadeFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tQuantidadeFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel8.setText("Desconto:");

        tDesconto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                tDescontoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                tDescontoFocusLost(evt);
            }
        });

        bRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/up.png"))); // NOI18N
        bRemove.setToolTipText("Remove produto");
        bRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRemoveActionPerformed(evt);
            }
        });

        bAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/add.png"))); // NOI18N
        bAdicionar.setToolTipText("Adicionar produto");
        bAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionarActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 0, 0));
        jLabel9.setText("Menor ou igual estoque no máx. 20");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 0, 0));
        jLabel6.setText("Máx. 15%");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Total:");

        jLabel2.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        jLabel2.setText("Valor:");

        tValor.setEditable(false);

        lEstoque.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        lEstoque.setText("Estoque:");

        tEstoque.setEditable(false);

        bPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/procurar.png"))); // NOI18N
        bPesquisar.setToolTipText("Pesquisar produto");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(lEstoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(tEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(tQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel9)))
                    .addComponent(tProduto))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bPesquisar)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(tDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(bAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19)
                        .addComponent(bRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(tTotal)
                    .addComponent(tValor))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(tProduto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(tValor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(bPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(tTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tEstoque, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lEstoque))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bRemove)
                    .addComponent(bAdicionar)
                    .addComponent(jLabel6)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tabelaItens.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Produto", "Valor", "Quantidade", "Total"
            }
        ));
        jScrollPane1.setViewportView(tabelaItens);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        tTotalVenda.setEditable(false);

        jLabel11.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel11.setText("TOTAL:");

        bConcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/concluir.png"))); // NOI18N
        bConcluir.setToolTipText("Concluir venda");
        bConcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bConcluirActionPerformed(evt);
            }
        });

        bCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cacenlar.png"))); // NOI18N
        bCancelar.setToolTipText("Cancelar venda");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Limpar2.png"))); // NOI18N
        bLimpar.setToolTipText("Limpar dados");
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
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel11)
                        .addGap(18, 18, 18))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(bLimpar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bConcluir, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel11)
                    .addComponent(tTotalVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(bLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bConcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bPesquisaClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisaClienteActionPerformed
        dialogo = new ConsultaPessoaDialog(false);
        cliente = new TbCliente();
        cliente = dialogo.getCliente();
        if (dialogo.getRetono()) {
            vendaDefault(2);
        }
        dialogo.dispose();
    }//GEN-LAST:event_bPesquisaClienteActionPerformed

    private void tDescontoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tDescontoFocusLost
        valor = produto.getValor();
        if (pesquisa) {
            if (!tQuantidade.getText().equals("")) {
                quantidade = Integer.parseInt(tQuantidade.getText());
                valor = produto.getValor();
                calculaTotal(quantidade, valor);
            } else {
                quantidade = 0;
            }
        } else {
            tProduto.requestFocus();
        }
    }//GEN-LAST:event_tDescontoFocusLost

    private void bAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionarActionPerformed
        if (pesquisa) {
            if (rsQuantidade) {
                try {
                    addItem();
                    atualizaTelaPesquisa();
                } catch (Exception erro) {
                    JOptionPane.showMessageDialog(null, "Erro ao adicionar produto " + erro);
                    tabelaItens.setModel(new TabelaItemVenda());
                }
            } else {
                tQuantidade.requestFocus();
            }
        } else {
            atualizaTelaPesquisa();
        }
    }//GEN-LAST:event_bAdicionarActionPerformed

    private void addItem() {
        int quant;
        quant = quantidade;
        encontrado = false;
        listaItens = new ArrayList<RlItemVenda>();
        listaItens = modelo.getLista();
        totalVenda = 0;
        item = new RlItemVenda();
        item.setTbVenda(venda);
        item.setTbProduto(produto);
        item.setQuantidade(quantidade);
        item.setPrecoTotal(total);
        for (RlItemVenda itemLista : listaItens) {
            if (itemLista.getTbProduto().getIdProduto().equals(item.getTbProduto().getIdProduto())) {
                linha = listaItens.indexOf(itemLista);
                quantidade = item.getQuantidade() + itemLista.getQuantidade();
                itemLista.setQuantidade(quantidade);
                calculaTotal(quantidade, valor);
                itemLista.setPrecoTotal(total);
                listaItens.set(linha, listaItens.get(linha));
                encontrado = true;
            }
        }
        if (encontrado) {
            modelo.atualiza(linha, listaItens, quant);
            modelo = new TabelaItemVenda(listaItens);
            tabelaItens.setModel(modelo);
        } else {
            modelo.inserir(item, quant);
        }
        Iterator<RlItemVenda> iterator = modelo.getLista().iterator();
        while (iterator.hasNext()) {
            RlItemVenda elemento = iterator.next();
            totalVenda += elemento.getPrecoTotal();
        }
        totalVendaString = Double.toString(totalVenda);
        tTotalVenda.setText(totalVendaString);
    }

    private void tProdutoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tProdutoKeyReleased
        bllProduto = new ProdutoBLL();
        descricao = tProduto.getText();
        if (descricao.length() == 12 && !pesquisa) {
            if (procuraProduto(true)) {
                estoque = produto.getQuantidade();
                if (estoque > 0) {
                    setDados();
                    pesquisa = true;
                } else {
                    JOptionPane.showMessageDialog(null, "Estoque zerado.");
                    atualizaTelaPesquisa();
                    pesquisa = false;
                }
            } else {
                atualizaTelaPesquisa();
            }
        }
    }//GEN-LAST:event_tProdutoKeyReleased

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        pesquisa = false;
        descricao = tProduto.getText();
        if (procuraProduto()) {
            estoque = dialog.getProduto().getQuantidade();
            if (estoque > 0) {
                setDados();
                pesquisa = true;
            } else {
                JOptionPane.showMessageDialog(null, "Estoque zerado.");
                atualizaTelaPesquisa();
                pesquisa = false;
            }
        } else {
            atualizaTelaPesquisa();
        }
    }//GEN-LAST:event_bPesquisarActionPerformed

    private boolean procuraProduto(boolean pesquisa) {
        try {
            pesquisaCod = pesquisa;
            if (bllProduto.procuraProduto(descricao)) {
                produto = bllProduto.getProduto();
                return true;
            } else {
                return false;
            }
        } catch (Exception erro) {
            return false;
        }
    }

    public boolean procuraProduto() {
        produto = new TbProduto();
        produto.setProduto(descricao);
        if (!pesquisaCod) {
            try {
                dialog = new ConsultaProdutoDialog(produto, false);
                if (dialog.getSelecionado()) {
                    produto = dialog.getProduto();
                    return true;
                } else {
                    return false;
                }
            } catch (Exception erro) {
                return false;
            }
        } else {
            return false;
        }
    }

    private void setDados() {
        descricao = dialog.getProduto().getProduto();
        preco = dialog.getProduto().getValor();
        precoString = Double.toString(preco);
        estoqueString = Integer.toString(estoque);
        tProduto.setText(descricao);
        tEstoque.setText(estoqueString);
        tValor.setText(precoString);
        tDesconto.setText("");
        tTotal.setText("");
        tQuantidade.setText("1");
        tQuantidade.requestFocus();
        bPesquisar.setVisible(false);
    }

    private void tQuantidadeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tQuantidadeFocusLost
        if (pesquisa) {
            rsQuantidade = false;
            if (tQuantidade.getText().equals("")) {
                quantidade = 0;
                tQuantidade.requestFocus();
            } else {
                quantidade = Integer.parseInt(tQuantidade.getText());
                valor = produto.getValor();
                calculaTotal(quantidade, valor);
            }
        } else {
            tProduto.requestFocus();
        }
    }//GEN-LAST:event_tQuantidadeFocusLost

    private void calculaTotal(int quant, double val) {
        quantidade = quant;
        valor = val;
        if (quantidade <= produto.getQuantidade()) {
            if (quantidade > 0 && quantidade <= 20) {
                vDesconto = 0;
                if (!tDesconto.getText().equals("")) {
                    if (desconto < 16) {
                        desconto = Integer.parseInt(tDesconto.getText());
                        valor = produto.getValor();
                        total = valor * quantidade;
                        vDesconto = total * desconto / 100;
                        vDesconto = valida.arredonda(vDesconto);
                        total = total - vDesconto;
                    } else {
                        tDesconto.setText("");
                        desconto = Integer.parseInt(tDesconto.getText());
                        tDesconto.requestFocus();
                        JOptionPane.showMessageDialog(null, "Desconto máximo de 15%.");
                    }
                }
                total = valor * quantidade;
                total = valida.arredonda(total);
                total = total - vDesconto;
                tTotal.setText("" + total);
                rsQuantidade = true;
            } else {
                JOptionPane.showMessageDialog(null, "Quantidade tem que está entre 1 e 20.");
                quantidade = 0;
                tTotal.setText("");
                tQuantidade.setText("");
                tQuantidade.requestFocus();
            }
        } else {
            JOptionPane.showMessageDialog(null, "Quantidade maior que a do estoque.");
            quantidade = 0;
            tTotal.setText("");
            tQuantidade.setText("");
            tQuantidade.requestFocus();
        }
    }

    private void tProdutoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tProdutoFocusGained
        bPesquisar.setVisible(true);
    }//GEN-LAST:event_tProdutoFocusGained

    private void tProdutoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tProdutoFocusLost
        bPesquisar.setVisible(false);
    }//GEN-LAST:event_tProdutoFocusLost

    private void bLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bLimparActionPerformed
        tCliente.setText("");
        bPesquisaCliente.setVisible(true);
        limpaDados(true);
    }//GEN-LAST:event_bLimparActionPerformed

    private void bRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRemoveActionPerformed
        if (removeItem()) {
            tProduto.requestFocus();
        } else {
            JOptionPane.showMessageDialog(this, "Não foi possível a remoção.");
        }
    }//GEN-LAST:event_bRemoveActionPerformed

    private boolean removeItem() {
        totalVendaString = tTotalVenda.getText();
        totalVenda = Double.parseDouble(totalVendaString.replaceAll("R|\\$| ", "").replaceAll(",", "."));
        int selecionados[] = tabelaItens.getSelectedRows();
        if (selecionados.length > -1) {
            listaItens = new ArrayList<RlItemVenda>();
            for (int i = 0; i < selecionados.length; i++) {
                listaItens.add(modelo.getItem(selecionados[i]));
            }
            Iterator<RlItemVenda> iterator = listaItens.iterator();
            while (iterator.hasNext()) {
                item = new RlItemVenda();
                item = iterator.next();
                totalVenda -= item.getPrecoTotal();
                modelo.excluir(item);
            }
            totalVendaString = Double.toString(totalVenda);
            tTotalVenda.setText(totalVendaString);
            return true;
        } else {
            JOptionPane.showMessageDialog(this, "Selecione um item.");
            return false;
        }
    }

    private void bConcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bConcluirActionPerformed
        if (!listaItens.isEmpty()) {
            bllVenda = new VendaBLL();
            venda.setValorVenda(totalVenda);
            if (bllVenda.altera(venda)) {
                dado = tData.getText();
                if (venda.getTbCliente() != null) {
                    JOptionPane.showMessageDialog(null, "Código venda: " + venda.getIdVenda()
                            + "\nValor total: " + venda.getValorVenda()
                            + "\nCliente: " + venda.getTbCliente().getTbPessoa().getNomePessoa()
                            + "\nData: " + dado);
                } else {
                    JOptionPane.showMessageDialog(null, "Código venda: " + venda.getIdVenda()
                            + "\nValor total: " + venda.getValorVenda()
                            + "\nData: " + dado);
                }
                vendaDefault(1);
                limpaDados(false);
            } else {
                JOptionPane.showMessageDialog(null, "Não foi possível realizar a venda.");
                limpaDados(true);
            }
        } else {
            limpaDados(true);
        }
    }//GEN-LAST:event_bConcluirActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        int result = JOptionPane.showConfirmDialog(null, "Deseja cancelar a venda,\nCódigo: " + venda.getIdVenda() + " ?", "Cancelar venda!", JOptionPane.YES_NO_OPTION);
        if (result == JOptionPane.YES_OPTION) {
            cancela();
            vendaDefault(3);
            dispose();
            TelaFuncionario.telaVenda = null;
        } else {
            setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
        }
    }//GEN-LAST:event_bCancelarActionPerformed

    private void tQuantidadeFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tQuantidadeFocusGained
        if (pesquisa) {
            String temporario = tQuantidade.getText();
            if (!tQuantidade.getText().equals("")) {
                tQuantidade.setText(temporario);
                quantidade = Integer.parseInt(tQuantidade.getText());
            } else {
                tQuantidade.setText("");
                quantidade = 0;
            }
        } else {
            tProduto.requestFocus();
        }
    }//GEN-LAST:event_tQuantidadeFocusGained

    private void tDescontoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_tDescontoFocusGained
        if (pesquisa) {
            String temporario = tDesconto.getText();
            if (!temporario.equals("")) {
                tDesconto.setText(temporario);
                desconto = Integer.parseInt(tDesconto.getText());
            } else {
                tDesconto.setText("");
                desconto = 0;
            }
        } else {
            tProduto.requestFocus();
        }
    }//GEN-LAST:event_tDescontoFocusGained

    private void cancela() {
        bllProduto = new ProdutoBLL();
        Iterator<RlItemVenda> iterator = modelo.getLista().iterator();
        while (iterator.hasNext()) {
            item = new RlItemVenda();
            item = iterator.next();
            item.getTbProduto().setQuantidade(item.getTbProduto().getQuantidade() + item.getQuantidade());
            if (bllProduto.altera(item.getTbProduto())) {
                System.out.println("Itens de vendas alterados.");
            } else {
                System.out.println("Itens de vendas não alterados.");
            }
        }
    }

    private void atualizaTelaPesquisa() {
        preco = 0;
        total = 0;
        estoque = 0;
        desconto = 0;
        vDesconto = 0;
        quantidade = 0;
        descricao = "";
        tProduto.setText("");
        tEstoque.setText("");
        tValor.setText("");
        tTotal.setText("");
        tQuantidade.setText("");
        tDesconto.setText("");
        tProduto.requestFocus();
        pesquisaCod = false;
        pesquisa = false;
        rsQuantidade = false;
        bPesquisar.setVisible(false);
    }

    private void iniciaVariaveis(TbFuncionario func) {
        bllProduto = new ProdutoBLL();
        item = new RlItemVenda();
        funcionario = new TbFuncionario();
        cliente = new TbCliente();
        produto = new TbProduto();
        listaItens = new ArrayList<RlItemVenda>();
        modelo = new TabelaItemVenda();
        tabelaItens = new JTable();
        data = new SimpleDateFormat("dd/MM/yyyy");
        valida = new Valida();
        funcionario = func;
        vendaInserida = false;
    }

    private void vendaDefault(int caso) {
        switch (caso) {
            case 1:
                tCliente.setText("");
                bPesquisaCliente.setVisible(true);
                vendaInserida = false;
                if (!vendaInserida) {
                    if (insereVenda()) {
                        System.out.println("Venda iniciada com sucesso!");
                    } else {
                        dispose();
                        TelaFuncionario.telaVenda = null;
                    }
                }
                ;
                break;
            case 2:
                tCliente.setText(cliente.getTbPessoa().getNomePessoa());
                bPesquisaCliente.setVisible(false);
                venda.setTbCliente(cliente);
                if (!tProduto.getText().equals("")) {
                    tQuantidade.requestFocus();
                } else {
                    tProduto.requestFocus();
                }
                if (!vendaInserida) {
                    if (insereVenda()) {
                        System.out.println("Venda iniciada com sucesso!");
                    } else {
                        dispose();
                        TelaFuncionario.telaVenda = null;
                    }
                }
                ;
                break;
            case 3:
                tCliente.setText("");
                bPesquisaCliente.setVisible(true);
                vendaInserida = false;
                ;
                break;
        }
    }

    private boolean insereVenda() {
        bllVenda = new VendaBLL();
        venda = new TbVenda();
        dado = tData.getText();
        dado = valida.toDate(dado);
        dado = valida.retiraChar(dado);
        venda.setDataVenda(dado);
        venda.setTbFuncionario(funcionario);
        try {
            if (bllVenda.insere(venda)) {
                if (bllVenda.busca(venda)) {
                    venda = bllVenda.getVenda();
                    codigo = Integer.toString(venda.getIdVenda());
                    lCodigoVenda.setText(codigo);
                    vendaInserida = true;
                }
            }
        } catch (Error error) {
            System.out.println("Erro: " + error);
            vendaInserida = false;
        }
        return vendaInserida;
    }

    private void limpaDados(boolean caso) {
        if (caso) {
            cancela();
        }
        preco = 0;
        total = 0;
        estoque = 0;
        desconto = 0;
        vDesconto = 0;
        quantidade = 0;
        descricao = "";
        precoString = "";
        estoqueString = "";
        tValor.setText("");
        tTotal.setText("");
        tProduto.setText("");
        tEstoque.setText("");
        tDesconto.setText("");
        tTotalVenda.setText("");
        tQuantidade.setText("");
        pesquisa = false;
        pesquisaCod = false;
        rsQuantidade = false;
        listaItens = new ArrayList<RlItemVenda>();
        modelo = new TabelaItemVenda();
        tabelaItens.setModel(modelo);
        tProduto.requestFocus();
    }
    private boolean pesquisa;
    private boolean encontrado;
    private boolean pesquisaCod;
    private boolean rsQuantidade;
    private boolean vendaInserida;
    private String totalVendaString;
    private String precoString;
    private String estoqueString;
    private String descricao;
    private String dado;
    private String codigo;
    private int desconto;
    private int quantidade;
    private int linha;
    private int estoque;
    private double vDesconto;
    private double totalVenda = 0;
    private double valor;
    private double total;
    private double preco;
    private SimpleDateFormat data;
    private ProdutoBLL bllProduto;
    private VendaBLL bllVenda;
    private ConsultaProdutoDialog dialog;
    private TbCliente cliente;
    private TbFuncionario funcionario;
    private TbProduto produto;
    private TbVenda venda;
    private RlItemVenda item;
    private List<RlItemVenda> listaItens;
    private ConsultaPessoaDialog dialogo;
    private TabelaItemVenda modelo;
    private Valida valida;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdicionar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bConcluir;
    private javax.swing.JButton bLimpar;
    private javax.swing.JButton bPesquisaCliente;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bRemove;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lCliente;
    private javax.swing.JLabel lCodigoVenda;
    private javax.swing.JLabel lEstoque;
    private javax.swing.JTextField tCliente;
    private javax.swing.JTextField tData;
    private javax.swing.JTextField tDesconto;
    private javax.swing.JTextField tEstoque;
    private javax.swing.JTextField tFuncionario;
    private javax.swing.JTextField tProduto;
    private javax.swing.JTextField tQuantidade;
    private javax.swing.JTextField tTotal;
    private javax.swing.JTextField tTotalVenda;
    private javax.swing.JTextField tValor;
    private javax.swing.JTable tabelaItens;
    // End of variables declaration//GEN-END:variables
}
