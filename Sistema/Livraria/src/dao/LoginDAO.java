package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.TbFuncionario;
import modelo.TbLogin;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import util.NewHibernateUtil;

public class LoginDAO {

    private Session session;
    private Transaction t;
    private TbLogin result;
    private List<TbLogin> resultList;

    public LoginDAO() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.t = session.beginTransaction();
    }

    public boolean insere(TbLogin login) {
        try {
            t.begin();
            this.session.persist(login);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            System.out.println(e);
            return false;
        }
    }

    public boolean atualiza(TbLogin login) {
        try {
            t.begin();
            this.session.merge(login);
            t.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            t.rollback();
            return false;
        }
    }

    public TbLogin procura(int id) {
        result = new TbLogin();
        try {
            result = (TbLogin) this.session.load(TbLogin.class, id);
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public List<TbLogin> listaTudo() {
        resultList = new ArrayList<TbLogin>();
        try {
            resultList = this.session.createCriteria(TbLogin.class).list();
        } catch (Exception e) {
            System.out.println(e);
            resultList = null;
        }
        return resultList;
    }

    public TbLogin procura(TbLogin login) {
        result = new TbLogin();
        try {
            Query query = this.session.createQuery("from TbLogin l where usuario = :usuario and senha = :senha");
            query.setParameter("usuario", login.getUsuario());
            query.setParameter("senha", login.getSenha());
            result = (TbLogin) query.uniqueResult();
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public TbLogin procura(TbFuncionario funcionario) {
        result = new TbLogin();
        try {
            Query query = this.session.createQuery("from TbLogin l where tbFuncionario = :funcionario");
            query.setParameter("funcionario", funcionario);
            result = (TbLogin) query.uniqueResult();
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }
}
