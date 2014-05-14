package bll;

import dao.RlItemVendaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.RlItemVenda;

public class ItemVendaBLL {

    RlItemVenda item;
    RlItemVendaDAO itemDAO;
    List<RlItemVenda> lista = new ArrayList<RlItemVenda>();

    public boolean insere(RlItemVenda item) {
        itemDAO = new RlItemVendaDAO();
        if (itemDAO.insere(item)) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Item não inserido.", "Informação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    public boolean altera(RlItemVenda item) {
        itemDAO = new RlItemVendaDAO();
        if (busca(item) == true) {
            try {
                itemDAO.atualiza(item);
                return true;
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, erro+" Não foi possível alterar.", "Informação", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Item não encontrado.", "Informação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
    
    public RlItemVenda getItemVenda() {
        return item;
    }

    public List<RlItemVenda> getLista() {
        return lista;
    }

    public boolean busca(RlItemVenda item) {
        itemDAO = new RlItemVendaDAO();
        try {
            item = itemDAO.procura(item.getIdItemVenda());
            if (item != null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro+" Item não encontrado.", "Informação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public boolean busca() {
        lista = new ArrayList<RlItemVenda>();
        itemDAO = new RlItemVendaDAO();
        try {
            lista = itemDAO.listaTudo();
            if (item != null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro+" Item não encontrado.", "Informação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }
}
