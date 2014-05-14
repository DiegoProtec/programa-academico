
package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.TbCliente;

public class TabelaCliente extends AbstractTableModel {

    private static final int COL_NOME = 0;
    private List<TbCliente> linha;

    public TabelaCliente(List<TbCliente> cliente) {
        this.linha = new ArrayList<TbCliente>(cliente);
    }
    
    public TabelaCliente() {
        this.linha = new ArrayList<TbCliente>();
    }

    public int getRowCount() {
        return linha.size();
    }

    public int getColumnCount() {
        return 1;
    }

    @Override
    public String getColumnName(int column) {
        if (column == COL_NOME) {
            return "Nome";
        }
        return "";
    }

    public Object getValueAt(int row, int column) {
        TbCliente cliente = linha.get(row);
        if (column == COL_NOME) {
            return cliente.getTbPessoa().getNomePessoa();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        TbCliente cliente = linha.get(rowIndex);
        if (columnIndex == COL_NOME) {
            cliente.getTbPessoa().setNomePessoa(aValue.toString());
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

    public TbCliente get(int row) {
        return linha.get(row);
    }
}