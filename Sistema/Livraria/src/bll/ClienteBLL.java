package bll;

import dao.ClienteDAO;
import javax.swing.JOptionPane;
import modelo.TbCliente;
import modelo.TbPessoa;

public class ClienteBLL {

    private TbCliente tbCliente;
    private ClienteDAO daoCliente;
    private boolean retorno;

    public ClienteBLL() {
        retorno = false;
        tbCliente = new TbCliente();
        daoCliente = new ClienteDAO();
    }

    public boolean procuraClienteCPF(TbPessoa pessoa) {
        tbCliente = daoCliente.procura(pessoa);
        try {
            if (tbCliente != null) {
                System.out.println("Cliente encontrado.");
                retorno = true;
            }
            return retorno;
        } catch (Exception erro) {
            System.out.println(erro);
            JOptionPane.showMessageDialog(null, "Cliente não encontrado.", "Informação", JOptionPane.INFORMATION_MESSAGE);
            return retorno;
        }
    }

    public TbCliente getCliente() {
        return tbCliente;
    }
}
