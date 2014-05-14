
package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.TbFuncionario;

public class TabelaFuncionario extends AbstractTableModel{
    private static final int COL_NOME = 0;
    private List<TbFuncionario> linha;

    public TabelaFuncionario(List<TbFuncionario> funcionario) {
        this.linha = new ArrayList<TbFuncionario>(funcionario);
    }
    
    public TabelaFuncionario() {
        this.linha = new ArrayList<TbFuncionario>();
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
        TbFuncionario funcionario = linha.get(row);
        if (column == COL_NOME) {
            return funcionario.getTbPessoa().getNomePessoa();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        TbFuncionario funcionario = linha.get(rowIndex);
        if (columnIndex == COL_NOME) {
            funcionario.getTbPessoa().setNomePessoa(aValue.toString());
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

    public TbFuncionario get(int row) {
        return linha.get(row);
    }
}
