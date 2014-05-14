package bll;

import dao.LoginDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TbFuncionario;
import modelo.TbLogin;

public class LoginBLL {

    private LoginDAO dao = new LoginDAO();
    private TbLogin login = new TbLogin();
    private boolean retorno;
    private List<TbLogin> lista;

    public boolean insere(TbLogin log) {
        retorno = false;
        if (!procuraUsario(log)) {
            try {
                dao = new LoginDAO();
                login = new TbLogin();
                if (dao.insere(log)) {
                    System.out.println("Login cadastrado.");
                    retorno = true;
                }
            } catch (Exception erro) {
                System.out.println("" + erro);
                JOptionPane.showMessageDialog(null, "Login não cadastrado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Login já está cadastrado.", "Informação", JOptionPane.WARNING_MESSAGE);

        }
        return retorno;
    }

    public boolean altera(TbLogin login) {
        retorno = false;
        try {
            dao = new LoginDAO();
            login = new TbLogin();
            if (dao.atualiza(login)) {
                System.out.println("Login alterado.");
                retorno = true;
            }
        } catch (Exception erro) {
            System.out.println("" + erro);
            JOptionPane.showMessageDialog(null, "Login não alterado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        return retorno;
    }

    public boolean procuraUsario(TbLogin log) {
        retorno = false;
        try {
            dao = new LoginDAO();
            login = new TbLogin();
            login = dao.procura(log);
            if (login != null) {
                System.out.println("Usuário encontrado.");
                retorno = true;
            }
        } catch (Exception erro) {
            System.out.println(erro);
            JOptionPane.showMessageDialog(null, "Usuário não encontrado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        return retorno;
    }

    public boolean procuraLogin(TbFuncionario funcionario) {
        retorno = false;
        try {
            dao = new LoginDAO();
            login = new TbLogin();
            login = dao.procura(funcionario);
            if (login != null) {
                System.out.println("Login encontrado.");
                retorno = true;
            }
        } catch (Exception erro) {
            System.out.println(erro);
            JOptionPane.showMessageDialog(null, "Login não encontrado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
        }
        return retorno;
    }

    public TbLogin getLogin() {
        return login;
    }

    public List<TbLogin> getLista() {
        return lista;
    }
}
