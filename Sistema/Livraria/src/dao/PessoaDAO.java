package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.TbPessoa;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

public class PessoaDAO {

    private Session session;
    private Transaction t;
    private TbPessoa result;
    private List<TbPessoa> listResult;

    public PessoaDAO() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.t = session.beginTransaction();
    }

    public boolean atualiza(TbPessoa pessoa) {
        try {
            t.begin();
            this.session.merge(pessoa);
            t.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            t.rollback();
            return false;
        }
    }

    public TbPessoa procura(int id) {
        result = new TbPessoa();
        try {
            result = (TbPessoa) this.session.load(TbPessoa.class, id);
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public List<TbPessoa> listaTudo() {
        listResult = new ArrayList<TbPessoa>();
        try {
            listResult = this.session.createCriteria(TbPessoa.class).list();
        } catch (Exception e) {
            System.out.println(e);
            listResult = null;
        }
        return listResult;
    }

    public TbPessoa procuraCPF(String pessoa) {
        result = new TbPessoa();
        try {
            Query query = this.session.createQuery("select p from TbPessoa p where cpf = :cpf");
            query.setParameter("cpf", pessoa);
            result = (TbPessoa) query.uniqueResult();
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public List<TbPessoa> procuraNome(String pessoa) {
        listResult = new ArrayList<TbPessoa>();
        try {
            Query query = this.session.createQuery("from TbPessoa where nomePessoa like :nome");
            query.setString("nome", "%" + pessoa + "%");
            listResult = (ArrayList<TbPessoa>) query.list();
        } catch (Exception e) {
            System.out.println(e);
            listResult = null;
        }
        return listResult;
    }
}
