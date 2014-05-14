
package gui;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.TbDepartamento;

public class TabelaDepartamento extends AbstractTableModel {

    private static final int COL_NOME = 0;
    private List<TbDepartamento> linha;

    public TabelaDepartamento(List<TbDepartamento> departamento) {
        this.linha = new ArrayList<TbDepartamento>(departamento);
    }
    
    public TabelaDepartamento() {
        this.linha = new ArrayList<TbDepartamento>();
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
            return "Departamento";
        }
        return "";
    }

    public Object getValueAt(int row, int column) {
        TbDepartamento departamento = linha.get(row);
        if (column == COL_NOME) {
            return departamento.getDepartamento();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        TbDepartamento departamento = linha.get(rowIndex);
        if (columnIndex == COL_NOME) {
            departamento.setDepartamento(aValue.toString());
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

    public TbDepartamento get(int row) {
        return linha.get(row);
    }
}
