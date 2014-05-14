package bll;

import dao.ProdutoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TbProduto;

public class ProdutoBLL {

    TbProduto tbproduto = new TbProduto();
    List<TbProduto> lista = new ArrayList<TbProduto>();
    private ProdutoDAO produtoDao;

    public boolean gravaProduto(TbProduto produto) {
        produtoDao = new ProdutoDAO();
        try {
            produtoDao.insere(produto);
            return true;
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro + " Não foi possível inserir.", "Informação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public boolean altera(TbProduto produto) {
        produtoDao = new ProdutoDAO();
        if (procuraProduto(produto) == true) {
            try {
                produtoDao.atualiza(produto);
                return true;
            } catch (Exception erro) {
                JOptionPane.showMessageDialog(null, erro + " Não foi possível alterar.", "Informação", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        } else {
            JOptionPane.showMessageDialog(null, "Produto não encontrado.", "Informação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public boolean procuraProduto() {
        lista = new ArrayList<TbProduto>();
        produtoDao = new ProdutoDAO();
        try {
            lista = produtoDao.listaTudo();
            if (!lista.isEmpty()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro + " Produto não encontrado.", "Informação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public boolean procuraProduto(TbProduto produto) {
        produtoDao = new ProdutoDAO();
        try {
            lista = produtoDao.procura(produto);
            if (!lista.isEmpty()) {
                return true;
            } else {
                return false;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro + " Produto não encontrado.", "Informação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public boolean procuraProduto(String produto) {
        produtoDao = new ProdutoDAO();
        try {
            tbproduto = produtoDao.procuraCodigo(produto);
            if (tbproduto != null) {
                return true;
            } else {
                return false;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, erro + " Produto não encontrado.", "Informação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public TbProduto getProduto() {
        return tbproduto;
    }

    public List<TbProduto> getLista() {
        return lista;
    }
}
