package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.TbTipofuncionario;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

public class TipoFuncionarioDAO {

    private Session session;
    private Transaction t;
    private List<TbTipofuncionario> result;

    public TipoFuncionarioDAO() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.t = session.beginTransaction();
    }

    public List<TbTipofuncionario> listaTudo() {
        result = new ArrayList<TbTipofuncionario>();
        try {
            result = this.session.createCriteria(TbTipofuncionario.class).list();
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }
}
