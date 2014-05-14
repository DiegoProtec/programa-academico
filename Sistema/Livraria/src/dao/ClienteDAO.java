package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.TbCliente;
import modelo.TbPessoa;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import util.NewHibernateUtil;

public class ClienteDAO {

    private Session session;
    private Transaction t;
    private TbCliente result;
    private List<TbCliente> listResult;

    public ClienteDAO() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.t = session.beginTransaction();
    }

    public boolean atualiza(TbCliente cliente) {
        try {
            t.begin();
            this.session.merge(cliente);
            t.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            t.rollback();
            return false;
        }
    }

    public TbCliente procura(int id) {
        result = new TbCliente();
        try {
            result = (TbCliente) this.session.load(TbCliente.class, id);
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public List<TbCliente> listaTudo() {
        listResult = new ArrayList<TbCliente>();
        try {
            listResult = this.session.createCriteria(TbCliente.class).list();
        } catch (Exception e) {
            System.out.println(e);
            listResult = null;
        }
        return listResult;
    }

    public TbCliente procura(TbPessoa pessoa) {
        result = new TbCliente();
        Query query = this.session.createQuery("select p from TbCliente p where tbPessoa = :pessoa");
        query.setParameter("pessoa", pessoa);
        try {
            result = (TbCliente) query.uniqueResult();
            return result;
        } catch (Exception e) {
            return null;
        }
    }
}