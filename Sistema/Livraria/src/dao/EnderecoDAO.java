package dao;

import java.util.ArrayList;
import java.util.List;
import modelo.TbCliente;
import modelo.TbEndereco;
import modelo.TbFuncionario;
import modelo.TbPessoa;
import modelo.TbTipofuncionario;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import util.NewHibernateUtil;

public class EnderecoDAO {

    private Session session;
    private Transaction t;
    private TbEndereco result;
    private List<TbEndereco> listResul;
    private TbCliente cliente;
    private TbFuncionario funcionario;
    private TbEndereco endereco;
    private TbPessoa pessoa;

    public EnderecoDAO() {
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
        this.t = session.beginTransaction();
    }

    public boolean insere(TbEndereco end, TbPessoa pes) {
        endereco = new TbEndereco();
        cliente = new TbCliente();
        pessoa = new TbPessoa();
        endereco = end;
        pessoa = pes;
        try {
            t.begin();
            this.session.persist(endereco);
            pessoa.setTbEndereco(endereco);
            this.session.persist(pessoa);
            cliente.setTbPessoa(pessoa);
            this.session.persist(cliente);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            System.out.println(e);
            return false;
        }
    }

    public boolean insere(TbEndereco end, TbPessoa pes, TbTipofuncionario tipo) {
        funcionario = new TbFuncionario();
        endereco = new TbEndereco();
        pessoa = new TbPessoa();
        endereco = end;
        pessoa = pes;
        funcionario.setTbTipofuncionario(tipo);
        try {
            t.begin();
            this.session.persist(endereco);
            pessoa.setTbEndereco(endereco);
            this.session.persist(pessoa);
            funcionario.setTbPessoa(pessoa);
            this.session.persist(funcionario);
            t.commit();
            return true;
        } catch (Exception e) {
            t.rollback();
            System.out.println(e);
            return false;
        }
    }

    public boolean atualiza(TbEndereco endereco) {
        try {
            t.begin();
            this.session.merge(endereco);
            t.commit();
            return true;
        } catch (Exception e) {
            System.out.println(e);
            t.rollback();
            return false;
        }
    }

    public TbEndereco procura(int id) {
        result = new TbEndereco();
        try {
            result = (TbEndereco) this.session.load(TbEndereco.class, id);
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public List<TbEndereco> listaTudo() {
        listResul = new ArrayList<TbEndereco>();
        try {
            listResul = this.session.createCriteria(TbEndereco.class).list();
        } catch (Exception e) {
            System.out.println(e);
            listResul = null;
        }
        return listResul;
    }

    public TbEndereco procura(TbEndereco endereco) {
        result = new TbEndereco();
        Query query = this.session.createQuery("select e from TbEndereco e where logradouros = :logradouros and numero = :numero");
        query.setParameter("logradouros", endereco.getLogradouros());
        query.setParameter("numero", endereco.getNumero());
        try {
            result = (TbEndereco) query.uniqueResult();
        } catch (Exception e) {
            System.out.println(e);
            result = null;
        }
        return result;
    }

    public TbEndereco getEndereco() {
        return result;
    }

    public List<TbEndereco> getLista() {
        return listResul;
    }
}
