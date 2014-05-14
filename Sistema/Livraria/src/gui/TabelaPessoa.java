package gui;

import bll.PessoaBLL;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.TbPessoa;

public class TabelaPessoa extends AbstractTableModel {

    private static final int COL_NOME = 0;
    private static final int COL_CPF = 1;
    private static final int COL_EMAIL = 2;
    private List<TbPessoa> linha;
    private PessoaBLL pessoaBll;

    public TabelaPessoa(List<TbPessoa> pessoa) {
        this.linha = new ArrayList<TbPessoa>(pessoa);
    }
    
    public TabelaPessoa() {
        this.linha = new ArrayList<TbPessoa>();
    }

    public int getRowCount() {
        return linha.size();
    }

    public int getColumnCount() {
        return 3;
    }

    @Override
    public String getColumnName(int column) {
        if (column == COL_NOME) {
            return "Nome";
        }
        if (column == COL_CPF) {
            return "CPF";
        }
        if (column == COL_EMAIL) {
            return "E-mail";
        }
        return "";
    }

    public Object getValueAt(int row, int column) {
        TbPessoa pessoa = linha.get(row);
        if (column == COL_NOME) {
            return pessoa.getNomePessoa();
        } else if (column == COL_CPF) {
            return pessoa.getCpf();
        } else if (column == COL_EMAIL) {
            return pessoa.getEmail();
        }
        return "";
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        TbPessoa pessoa = linha.get(rowIndex);
        if (columnIndex == COL_NOME) {
            pessoa.setNomePessoa(aValue.toString());
        } else if (columnIndex == COL_CPF) {
            pessoa.setCpf(aValue.toString());
        } else if (columnIndex == COL_EMAIL) {
            pessoa.setEmail(aValue.toString());
        }
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    public TbPessoa get(int row) {
        return linha.get(row);
    }

    void aletrar(TbPessoa pessoa) {
        pessoaBll = new PessoaBLL();
        pessoaBll.altera(pessoa);
    }
}
