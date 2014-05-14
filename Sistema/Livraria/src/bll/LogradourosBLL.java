package bll;

import dao.LogradourosDAO;
import javax.swing.JOptionPane;
import modelo.Logradouros;

public class LogradourosBLL {

    private LogradourosDAO daoLog = new LogradourosDAO();
    Logradouros logradouros;

    public boolean validaCep(String cep) {
        logradouros = daoLog.procura(cep);
        if (logradouros != null) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Cep não encontrado.", "Informação", JOptionPane.WARNING_MESSAGE);
            return false;
        }
    }

    public Logradouros getLogradouros() {
        return logradouros;
    }
}
