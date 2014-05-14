package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.RlItemVenda;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

public class RlItemVendaDAO {

    private Session session;
    private Transaction t;
    private RlItemVenda result;
    private List<RlItemVenda> listResult;

    public RlItemVendaDAO() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.t = session.beginTransaction();
    }

    public boolean insere(RlItemVenda item) {
        try {
            t.begin();
            this.session.save(item);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            System.out.println(e);
            return false;
        }
    }

    public boolean atualiza(RlItemVenda item) {
        try {
            t.begin();
            this.session.merge(item);
            t.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            t.rollback();
            return false;
        }
    }

    public RlItemVenda procura(int id) {
        result = new RlItemVenda();
        try {
            result = (RlItemVenda) this.session.load(RlItemVenda.class, id);
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public List<RlItemVenda> listaTudo() {
        listResult = new ArrayList<RlItemVenda>();
        try {
            listResult = this.session.createCriteria(RlItemVenda.class).list();
        } catch (Exception e) {
            System.out.println(e);
            listResult = null;
        }
        return listResult;
    }
}
