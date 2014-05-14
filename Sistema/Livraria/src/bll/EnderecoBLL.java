package bll;

import dao.EnderecoDAO;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.TbEndereco;
import modelo.TbPessoa;
import modelo.TbTipofuncionario;

public class EnderecoBLL {

    public boolean gravaEndereco(TbEndereco endereco, TbPessoa pessoa) {
        enderecoDao = new EnderecoDAO();
        try {
            if (enderecoDao.insere(endereco, pessoa)) {
                JOptionPane.showMessageDialog(null, "Cliente: " + pessoa.getNomePessoa() + " \n Cadastrado!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                retorno = true;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Cliente não cadastrado. \n" + erro, "Informação", JOptionPane.WARNING_MESSAGE);
        }
        return retorno;
    }

    public boolean gravaEndereco(TbEndereco endereco, TbPessoa pessoa, TbTipofuncionario tipo) {
        enderecoDao = new EnderecoDAO();
        try {
            if (enderecoDao.insere(endereco, pessoa, tipo)) {
                JOptionPane.showMessageDialog(null, "Funcionário: " + pessoa.getNomePessoa() + " \n Cadastrado!", "Informação", JOptionPane.INFORMATION_MESSAGE);
                retorno = true;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Funcionário não cadastrado. \n" + erro, "Informação", JOptionPane.WARNING_MESSAGE);
        }
        return retorno;
    }

    public boolean listaCEP() {
        enderecoDao = new EnderecoDAO();
        lista = new ArrayList<TbEndereco>();
        try {
            lista = enderecoDao.listaTudo();
            if (!lista.isEmpty()) {
                System.out.println("Lista de endereços encontrada.");
                retorno = true;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Lista de endereços não encontrada. \n" + erro, "Informação", JOptionPane.WARNING_MESSAGE);
        }
        return retorno;
    }

    public boolean validaCep(TbEndereco endereco) {
        enderecoDao = new EnderecoDAO();
        this.endereco = new TbEndereco();
        try {
            this.endereco = enderecoDao.procura(endereco);
            if (this.endereco != null) {
                System.out.println("Endereço encontrado.");
                retorno = true;
            }
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Endereço não encontrado. \n" + erro, "Informação", JOptionPane.WARNING_MESSAGE);
        }
        return retorno;
    }

    public TbEndereco getEndereco() {
        return endereco;

    }

    public List<TbEndereco> getLista() {
        return lista;
    }
    private List<TbEndereco> lista;
    private TbEndereco endereco;
    private EnderecoDAO enderecoDao;
    private boolean retorno = false;
}
