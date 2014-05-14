package bll;

import dao.VendaDAO;
import java.util.ArrayList;
import java.util.List;
import modelo.TbVenda;

public class VendaBLL {

    public boolean buscaTudo() {
        vendaDAO = new VendaDAO();
        lista = new ArrayList<TbVenda>();
        try {
            lista = vendaDAO.listaTudo();
            if (!lista.isEmpty()) {
                System.out.println("Lista de vendas encontrada.");
                retorno = true;
            }
        } catch (Exception erro) {
            System.out.println("Lista de vendas não encontrada. \n" + erro);
            retorno = false;
        }
        return retorno;
    }

    public boolean busca(TbVenda ven) {
        vendaDAO = new VendaDAO();
        venda = new TbVenda();
        try {
            venda = vendaDAO.procura(ven.getIdVenda());
            if (venda != null) {
                System.out.println("Venda encontrada.");
                retorno = true;
            }
        } catch (Exception erro) {
            System.out.println("Venda não encontrada. \n" + erro);
            retorno = false;
        }
        return retorno;
    }

    public boolean insere(TbVenda venda) {
        vendaDAO = new VendaDAO();
        try {
            vendaDAO.insere(venda);
            retorno = true;
            System.out.println("Venda cadastrada.");
        } catch (Exception erro) {
            retorno = false;
            System.out.println("Venda não cadastrada. \n" + erro);
        }
        return retorno;
    }

    public boolean altera(TbVenda venda) {
        vendaDAO = new VendaDAO();
        try {
            vendaDAO.atualiza(venda);
            retorno = true;
            System.out.println("Venda alterada com sucesso.");
        } catch (Exception erro) {
            retorno = false;
            System.out.println("Venda não alterada. \n" + erro);
        }
        return retorno;
    }

    public TbVenda getVenda() {
        return venda;
    }

    public List<TbVenda> getLista() {
        return lista;
    }
    private TbVenda venda = new TbVenda();
    private VendaDAO vendaDAO = new VendaDAO();
    private List<TbVenda> lista = new ArrayList<TbVenda>();
    private boolean retorno;
}
