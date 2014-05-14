package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.TbTipocomplemento;
import org.hibernate.Transaction;
import org.hibernate.classic.Session;
import util.NewHibernateUtil;

public class TipoComplementoDAO {

    private Session session;
    private Transaction t;
    private List<TbTipocomplemento> result;

    public TipoComplementoDAO() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.t = session.beginTransaction();
    }

    public List<TbTipocomplemento> listaTudo() {
        result = new ArrayList<TbTipocomplemento>();
        try {
            result = this.session.createCriteria(TbTipocomplemento.class).list();
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }
}
