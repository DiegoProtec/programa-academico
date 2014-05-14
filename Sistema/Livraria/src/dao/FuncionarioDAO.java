package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.TbFuncionario;
import modelo.TbPessoa;
import org.hibernate.Query;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import util.NewHibernateUtil;

public class FuncionarioDAO {

    private Session session;
    private Transaction t;
    private TbFuncionario result;
    private List<TbFuncionario> listResult;

    public FuncionarioDAO() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.t = session.beginTransaction();
    }

    public boolean atualiza(TbFuncionario funcionario) {
        try {
            t.begin();
            this.session.merge(funcionario);
            t.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            t.rollback();
            return false;
        }
    }

    public TbFuncionario procura(int id) {
        result = new TbFuncionario();
        try {
            result = (TbFuncionario) this.session.load(TbFuncionario.class, id);
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public List<TbFuncionario> listaTudo() {
        listResult = new ArrayList<TbFuncionario>();
        try {
            listResult = this.session.createCriteria(TbFuncionario.class).list();
        } catch (Exception e) {
            System.out.println(e);
            listResult = null;
        }
        return listResult;
    }

    public TbFuncionario procura(TbPessoa pessoa) {
        result = new TbFuncionario();
        try {
            Query query = this.session.createQuery("select f from TbFuncionario f where tbPessoa = :tbPessoa");
            query.setParameter("tbPessoa", pessoa);
            result = (TbFuncionario) query.uniqueResult();
        } catch (Exception e) {
            result = null;
        }
        return result;
    }
}
