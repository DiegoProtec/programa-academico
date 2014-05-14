package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.TbProduto;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import util.NewHibernateUtil;

public class ProdutoDAO {

    private Session session;
    private Transaction t;
    private TbProduto result;
    private List<TbProduto> listResult;

    public ProdutoDAO() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.t = session.beginTransaction();
    }

    public boolean insere(TbProduto produto) {
        try {
            t.begin();
            this.session.save(produto);
            t.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            t.rollback();
            return false;
        }
    }

    public boolean atualiza(TbProduto produto) {
        try {
            t.begin();
            this.session.merge(produto);
            t.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            t.rollback();
            return false;
        }
    }

    public TbProduto procura(String id) {
        result = new TbProduto();
        try {
            result = (TbProduto) this.session.load(TbProduto.class, id);
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public TbProduto procuraCodigo(String id) {
        result = new TbProduto();
        try {
            Query query = this.session.createQuery("from TbProduto where idProduto like :idProduto");
            query.setParameter("idProduto", id);
            result = (TbProduto) query.uniqueResult();
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public List<TbProduto> listaTudo() {
        listResult = new ArrayList<TbProduto>();
        try {
            listResult = this.session.createCriteria(TbProduto.class).list();
        } catch (Exception e) {
            System.out.println(e);
            listResult = null;
        }
        return listResult;
    }

    public List<TbProduto> procura(TbProduto produto) {
        listResult = new ArrayList<TbProduto>();
        try {
            Query query = this.session.createQuery("from TbProduto where produto like :produto");
            query.setString("produto", "%" + produto.getProduto() + "%");
            listResult = (ArrayList<TbProduto>) query.list();
        } catch (Exception e) {
            System.out.println(e);
            listResult = null;
        }
        return listResult;
    }
}