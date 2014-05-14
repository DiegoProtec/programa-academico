package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.Logradouros;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import util.NewHibernateUtil;

public class LogradourosDAO {

    private Session session;
    private Transaction t;
    private Logradouros result;
    private List<Logradouros> listResult;

    public LogradourosDAO() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.t = session.beginTransaction();
    }

    public boolean insere(Logradouros logradouros) {
        try {
            t.begin();
            this.session.save(logradouros);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            System.out.println(e);
            return false;
        }
    }

    public boolean atualiza(Logradouros logradouros) {
        try {
            t.begin();
            this.session.merge(logradouros);
            t.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            t.rollback();
            return false;
        }
    }

    public Logradouros procura(int id) {
        result = new Logradouros();
        try {
            result = (Logradouros) this.session.load(Logradouros.class, id);
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public List<Logradouros> listaTudo() {
        listResult = new ArrayList<Logradouros>();
        try {
            listResult = this.session.createCriteria(Logradouros.class).list();
        } catch (Exception e) {
            System.out.println(e);
            listResult = null;
        }
        return listResult;


    }

    public Logradouros procura(String cep) {
        result = new Logradouros();
        try {
            Query query = this.session.createQuery("from Logradouros l where noLogradouroCep = :cep");
            query.setParameter("cep", cep);
            result = (Logradouros) query.uniqueResult();
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }
}
