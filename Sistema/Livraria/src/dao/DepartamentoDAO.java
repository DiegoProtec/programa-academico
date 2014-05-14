package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.TbDepartamento;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import util.NewHibernateUtil;

public class DepartamentoDAO {

    private Session session;
    private Transaction t;
    private TbDepartamento result;
    private List<TbDepartamento> listResult;

    public DepartamentoDAO() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.t = session.beginTransaction();
    }

    public boolean insere(TbDepartamento departamento) {
        try {
            t.begin();
            this.session.save(departamento);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            System.out.println(e);
            return false;
        }
    }

    public boolean atualiza(TbDepartamento departamento) {
        try {
            t.begin();
            this.session.merge(departamento);
            t.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            t.rollback();
            return false;
        }
    }

    public TbDepartamento procura(int id) {
        result = new TbDepartamento();
        try {
            result = (TbDepartamento) this.session.load(TbDepartamento.class, id);
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public List<TbDepartamento> listaTudo() {
        listResult = new ArrayList<TbDepartamento>();
        try {
            listResult = this.session.createCriteria(TbDepartamento.class).list();
        } catch (Exception e) {
            System.out.println(e);
            listResult = null;
        }
        return listResult;
    }

    public TbDepartamento procuraCPF(String dep) {
        result = new TbDepartamento();
        try {
            Query query = this.session.createQuery("from TbDepartamento d where departamento like :departamento");
            query.setParameter("departamento", dep);
            result = (TbDepartamento) query.uniqueResult();
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }
}
