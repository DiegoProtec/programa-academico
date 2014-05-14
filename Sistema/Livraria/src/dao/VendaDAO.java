package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.TbVenda;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import util.NewHibernateUtil;

public class VendaDAO {

    private Session session;
    private Transaction t;
    private TbVenda result;
    private List<TbVenda> listResul;

    public VendaDAO() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.t = session.beginTransaction();
    }

    public boolean insere(TbVenda venda) {
        try {
            t.begin();
            this.session.save(venda);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            System.out.println(e);
            return false;
        }
    }

    public boolean atualiza(TbVenda venda) {
        try {
            t.begin();
            this.session.merge(venda);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            System.out.println(e);
            return false;
        }
    }

    public TbVenda procura(int id) {
        result = new TbVenda();
        try {
            result = (TbVenda) this.session.load(TbVenda.class, id);
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public List<TbVenda> listaTudo() {
        listResul = new ArrayList<TbVenda>();
        try {
            listResul = this.session.createCriteria(TbVenda.class).list();
        } catch (Exception e) {
            System.out.println(e);
            listResul = null;
        }
        return listResul;
    }
}
