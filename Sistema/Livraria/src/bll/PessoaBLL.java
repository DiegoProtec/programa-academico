package bll;

import dao.PessoaDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TbPessoa;

public class PessoaBLL {

    private TbPessoa tbPessoa;
    private List<TbPessoa> lista;
    private PessoaDAO pessoaDao;
    private boolean retorno;

    public boolean procuraPessoaNome(TbPessoa pessoa) {
        retorno = false;
        pessoaDao = new PessoaDAO();
        lista = new ArrayList<TbPessoa>();
        lista = pessoaDao.procuraNome(pessoa.getNomePessoa());
        try {
            if (!lista.isEmpty()) {
                System.out.println("Lista encontrada.");
                retorno = true;
            }
            return retorno;
        } catch (Exception erro) {
            System.out.println(erro);
            JOptionPane.showMessageDialog(null, "Lista não encontrada.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return retorno;
        }
    }

    public boolean procuraPessoaCPF(TbPessoa pessoa) {
        retorno = false;
        pessoaDao = new PessoaDAO();
        tbPessoa = new TbPessoa();
        tbPessoa = pessoaDao.procuraCPF(pessoa.getCpf());
        try {
            if (tbPessoa != null) {
                System.out.println("Pessoa não cadastrada.");
                retorno = true;
            }
            return retorno;
        } catch (Exception erro) {
            System.out.println(erro);
            JOptionPane.showMessageDialog(null, "Pessoa encontrada.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return retorno;
        }
    }

    public boolean procuraPessoaCPF(String cpf) {
        retorno = false;
        tbPessoa = new TbPessoa();
        pessoaDao = new PessoaDAO();
        tbPessoa = pessoaDao.procuraCPF(cpf);
        try {
            if (tbPessoa == null) {
                System.out.println("Pessoa não encontrada.");
                retorno = true;
            }
        } catch (Exception erro) {
            System.out.println(erro);
            JOptionPane.showMessageDialog(null, "Pessoa encontrada.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        return retorno;
    }

    public boolean procuraPessoa() {
        retorno = false;
        lista = new ArrayList<TbPessoa>();
        pessoaDao = new PessoaDAO();
        try {
            lista = pessoaDao.listaTudo();
            if (!lista.isEmpty()) {
                retorno = true;
            }
            System.out.println("Pessoa encontrada");
        } catch (Exception erro) {
            System.out.println(erro);
            JOptionPane.showMessageDialog(null, "Pessoa não encontrada.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        return retorno;
    }

    public TbPessoa getPessoa() {
        return tbPessoa;
    }

    public List<TbPessoa> getLista() {
        return lista;
    }

    public boolean altera(TbPessoa pessoa) {
        retorno = false;
        pessoaDao = new PessoaDAO();
        try {
            if (procuraPessoa()) {
                pessoaDao.atualiza(pessoa);
                retorno = true;
            }
            System.out.println("Pessoa alterada.");
            return retorno;
        } catch (Exception erro) {
            System.out.println(erro);
            JOptionPane.showMessageDialog(null, "Pessoa não alterada.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return retorno;
        }
    }
}
