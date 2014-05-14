package gui;

import bll.ItemVendaBLL;
import bll.ProdutoBLL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.RlItemVenda;

public class TabelaItemVenda extends AbstractTableModel {

    public TabelaItemVenda() {
        lista = new ArrayList<RlItemVenda>();
    }

    public TabelaItemVenda(List<RlItemVenda> item) {
        this();
        lista.addAll(item);
    }

    public int getRowCount() {
        return lista.size();
    }

    public int getColumnCount() {
        return 4;
    }

    @Override
    public String getColumnName(int column) {
        if (column == COL_IDVENDA) {
            return "Produto";
        }
        if (column == COL_IDPRODUTO) {
            return "Valor";
        }
        if (column == COL_QUANTIDADE) {
            return "Quantidade";
        }
        if (column == COL_TOTAL) {
            return "Total";
        }
        return "";
    }

    public Object getValueAt(int row, int column) {
        RlItemVenda item = lista.get(row);
        if (column == COL_IDVENDA) {
            return item.getTbProduto().getProduto();
        } else if (column == COL_IDPRODUTO) {
            return item.getTbProduto().getValor();
        } else if (column == COL_QUANTIDADE) {
            return item.getQuantidade();
        } else if (column == COL_TOTAL) {
            return item.getPrecoTotal();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        RlItemVenda item = lista.get(rowIndex);
        if (columnIndex == COL_IDVENDA) {
            item.getTbVenda().setIdVenda(Integer.parseInt(aValue.toString()));
        } else if (columnIndex == COL_IDPRODUTO) {
            item.getTbProduto().setIdProduto(aValue.toString());
        } else if (columnIndex == COL_QUANTIDADE) {
            item.setQuantidade(Integer.parseInt(aValue.toString()));
        } else if (columnIndex == COL_TOTAL) {
            item.setPrecoTotal(Double.parseDouble(aValue.toString()));
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    public void inserir(RlItemVenda item, int quantidade) {
        bllItemVenda = new ItemVendaBLL();
        bllProduto = new ProdutoBLL();
        bllItemVenda.insere(item);
        if (item.getTbProduto().getQuantidade() >= quantidade) {
            item.getTbProduto().setQuantidade(item.getTbProduto().getQuantidade() - quantidade);
            bllProduto.altera(item.getTbProduto());
        }
        lista.add(item);
        fireTableDataChanged();
    }

    public void atualiza(int linha, List<RlItemVenda> lista, int quantidade) {
        bllItemVenda = new ItemVendaBLL();
        bllProduto = new ProdutoBLL();
        bllItemVenda.altera(lista.get(linha));
        if (lista.get(linha).getTbProduto().getQuantidade() >= quantidade) {
            lista.get(linha).getTbProduto().setQuantidade(lista.get(linha).getTbProduto().getQuantidade() - quantidade);
            bllProduto.altera(lista.get(linha).getTbProduto());
        }
        this.lista.set(linha, lista.get(linha));
        fireTableRowsUpdated(linha, linha);
    }

    public void excluir(RlItemVenda item) {
        bllProduto = new ProdutoBLL();
        bllItemVenda = new ItemVendaBLL();
        item.getTbProduto().setQuantidade(item.getTbProduto().getQuantidade() + item.getQuantidade());
        bllProduto.altera(item.getTbProduto());
        lista.remove(item);
        fireTableDataChanged();
    }

    public RlItemVenda getItem(int row) {
        return lista.get(row);
    }

    public List<RlItemVenda> getLista() {
        return lista;
    }
    private static final int COL_IDVENDA = 0;
    private static final int COL_IDPRODUTO = 1;
    private static final int COL_QUANTIDADE = 2;
    private static final int COL_TOTAL = 3;
    private List<RlItemVenda> lista;
    private ItemVendaBLL bllItemVenda;
    private ProdutoBLL bllProduto;
}
