package gui;

import bll.ProdutoBLL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.TbProduto;

public class TabelaProduto extends AbstractTableModel {

    private static final int COL_NOMEPRODUTO = 0;
    private static final int COL_VALOR = 1;
    private static final int COL_QUANTIDADE = 2;
    private List<TbProduto> lista;
    private ProdutoBLL produtoBll;
    private boolean edit;

    public TabelaProduto() {
        lista = new ArrayList<TbProduto>();
    }

    public TabelaProduto(List<TbProduto> item) {
        this();
        lista.addAll(item);
    }

    public TabelaProduto(boolean edit) {
        this.edit = edit;
    }
    
    public TabelaProduto(List<TbProduto> produto, boolean edit) {
        this.lista = new ArrayList<TbProduto>();
        lista.addAll(produto);
        this.edit = edit;
    }

    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        if (column == COL_NOMEPRODUTO) {
            return "Produto";
        }
        if (column == COL_VALOR) {
            return "Valor";
        }
        if (column == COL_QUANTIDADE) {
            return "Quantidade";
        }
        return "";
    }

    public Object getValueAt(int row, int column) {
        TbProduto produto = lista.get(row);
        if (column == COL_NOMEPRODUTO) {
            return produto.getProduto();
        } else if (column == COL_VALOR) {
            return produto.getValor();
        } else if (column == COL_QUANTIDADE) {
            return produto.getQuantidade();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        TbProduto produto = lista.get(rowIndex);
        if (columnIndex == COL_NOMEPRODUTO) {
            produto.setProduto(aValue.toString());
        } else if (columnIndex == COL_VALOR) {
            produto.setValor(Double.parseDouble(aValue.toString()));
        } else if (columnIndex == COL_QUANTIDADE) {
            produto.setQuantidade(Integer.parseInt(aValue.toString()));
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return edit;
    }

    public void excluir(int pos) {
        lista.remove(pos);
        fireTableDataChanged();
    }

    public TbProduto getItem(int row) {
        return lista.get(row);
    }

    public List<TbProduto> getLista() {
        return lista;
    }

    void alterar(TbProduto produto) {
        produtoBll = new ProdutoBLL();
        produtoBll.altera(produto);
    }
}
