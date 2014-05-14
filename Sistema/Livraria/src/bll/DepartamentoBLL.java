package bll;

import dao.DepartamentoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TbDepartamento;

public class DepartamentoBLL {

    private List<TbDepartamento> lista;
    private TbDepartamento departamento;
    private DepartamentoDAO departamentoDAO;
    private boolean retorno;

    public boolean procura() {
        retorno = false;
        lista = new ArrayList<TbDepartamento>();
        departamentoDAO = new DepartamentoDAO();
        try {
            lista = departamentoDAO.listaTudo();
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

    public boolean procura(String str) {
        retorno = false;
        departamentoDAO = new DepartamentoDAO();
        departamento = new TbDepartamento();
        try {
            departamento = departamentoDAO.procuraCPF(str);
            if (departamento != null) {
                JOptionPane.showMessageDialog(null, "Departamento já cadastrado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
                retorno = true;
            }
            return retorno;
        } catch (Exception erro) {
            System.out.println(erro);
            return retorno;
        }
    }

    public boolean insere(TbDepartamento depart) {
        departamentoDAO = new DepartamentoDAO();
        try {
            if (departamentoDAO.insere(depart)) {
                JOptionPane.showMessageDialog(null, "Departamento: " + depart.getDepartamento() + " \n Cadastrado!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                retorno = true;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Departamento não cadastrado. \n" + erro, "Informação", JOptionPane.WARNING_MESSAGE);
        }
        return retorno;
    }

    public boolean altera(TbDepartamento depart) {
        departamentoDAO = new DepartamentoDAO();
        try {
            if (departamentoDAO.atualiza(depart)) {
                JOptionPane.showMessageDialog(null, "Departamento: " + depart.getDepartamento() + " \n alterado!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                retorno = true;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Departamento não alterado. \n" + erro, "Informação", JOptionPane.WARNING_MESSAGE);
        }
        return retorno;
    }

    public List<TbDepartamento> getList() {
        return lista;
    }

    public TbDepartamento getDepartamento() {
        return departamento;
    }
}
