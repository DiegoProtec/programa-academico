package bll;

import dao.TipoFuncionarioDAO;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TbTipofuncionario;

public class TipoFuncionarioBLL {
    
    TipoFuncionarioDAO dao;
    private List<TbTipofuncionario> lista;
    
    public boolean validaTipo() {
        dao = new TipoFuncionarioDAO();
        lista = dao.listaTudo();
        if (!lista.isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de funcionário não encontrado.");
            return false;
        }
    }
    
    public List<TbTipofuncionario> getLista(){
        return lista;
    }
}
