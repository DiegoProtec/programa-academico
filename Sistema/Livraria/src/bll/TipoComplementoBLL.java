package bll;

import dao.TipoComplementoDAO;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TbTipocomplemento;

public class TipoComplementoBLL {

    TipoComplementoDAO dao;
    private List<TbTipocomplemento> lista;

    public boolean validaTipo() {
        dao = new TipoComplementoDAO();
        lista = dao.listaTudo();
        if (!lista.isEmpty()) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Tipo de complemento não encontrado.");
            return false;
        }
    }
    
    public List<TbTipocomplemento> getLista(){
        return lista;
    }
}
