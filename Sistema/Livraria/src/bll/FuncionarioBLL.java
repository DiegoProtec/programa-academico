package bll;

import dao.FuncionarioDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TbFuncionario;
import modelo.TbPessoa;

public class FuncionarioBLL {

    TbFuncionario tbFuncionario;
    FuncionarioDAO funcDao = new FuncionarioDAO();
    private List<TbFuncionario> lista;
    private boolean retorno;

    public boolean busca(int id) {
        this.tbFuncionario = funcDao.procura(id);
        if (this.tbFuncionario != null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado.", "Informação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public boolean procuraFuncionarioCPF(TbPessoa pessoa) {
        retorno = false;
        tbFuncionario = new TbFuncionario();
        funcDao = new FuncionarioDAO();
        try {
            tbFuncionario = funcDao.procura(pessoa);
            if (tbFuncionario != null) {
                System.out.println("Funcionário encontrado.");
                retorno = true;
            }
            return retorno;
        } catch (Exception erro) {
            System.out.println(erro);
            JOptionPane.showMessageDialog(null, "Funcionário não encontrado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return retorno;
        }
    }

    public TbFuncionario getFuncionario() {
        return tbFuncionario;
    }

    public List<TbFuncionario> getLista() {
        return lista;
    }
}
