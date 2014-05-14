package fabrica;

import bll.ClienteBLL;
import bll.FuncionarioBLL;
import bll.LogradourosBLL;
import bll.PessoaBLL;
import bll.ProdutoBLL;
import java.math.BigDecimal;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import modelo.Logradouros;
import modelo.TbCliente;
import modelo.TbFuncionario;
import modelo.TbPessoa;

public class Valida {

    private Pattern p;
    private PessoaBLL bllPessoa;
    private LogradourosBLL bllLogradouros;
    private Logradouros logradouro;
    private TbPessoa pessoa;
    private ClienteBLL bllCliente;
    private TbCliente cliente;
    private FuncionarioBLL bllFuncionario;
    private TbFuncionario funcionario;
    private SimpleDateFormat data;
    private SimpleDateFormat novo;
    private Date d;
    private String v;
    private ProdutoBLL bllProduto;
    private boolean retorno;

    public Valida() {
        this.p = Pattern.compile(".+@.+\\.[a-z]+");
        cliente = new TbCliente();
        funcionario = new TbFuncionario();
    }

    public boolean CPF(String strCpf) {
        if (strCpf.equals("")) {
            return false;
        }
        int d1, d2;
        int digito1, digito2, resto;
        int digitoCPF;
        String nDigResult;
        d1 = d2 = 0;
        digito1 = digito2 = resto = 0;
        for (int nCount = 1; nCount < strCpf.length() - 1; nCount++) {
            digitoCPF = Integer.valueOf(strCpf.substring(nCount - 1, nCount)).intValue();
            d1 = d1 + (11 - nCount) * digitoCPF;
            d2 = d2 + (12 - nCount) * digitoCPF;
        }
        resto = (d1 % 11);
        if (resto < 2) {
            digito1 = 0;
        } else {
            digito1 = 11 - resto;
        }
        d2 += 2 * digito1;
        resto = (d2 % 11);
        if (resto < 2) {
            digito2 = 0;
        } else {
            digito2 = 11 - resto;
        }
        String nDigVerific = strCpf.substring(strCpf.length() - 2, strCpf.length());
        nDigResult = String.valueOf(digito1) + String.valueOf(digito2);
        return nDigVerific.equals(nDigResult);
    }

    public boolean EMAIL(String valida) {
        String email = valida;
        Matcher m = p.matcher(email);
        boolean matchFound = m.matches();

        if (matchFound) {
            return true;
        } else {
            return false;
        }
    }

    public boolean pesquisaCPF(String cpf) {
        bllPessoa = new PessoaBLL();
        if (bllPessoa.procuraPessoaCPF(cpf)) {
            pessoa = bllPessoa.getPessoa();
            return true;
        } else {
            return false;
        }
    }

    public boolean pesquisaCliente(TbPessoa pessoa) {
        cliente = new TbCliente();
        bllCliente = new ClienteBLL();
        if (bllCliente.procuraClienteCPF(pessoa)) {
            cliente = bllCliente.getCliente();
            return true;
        } else {
            return false;
        }
    }

    public boolean pesquisaFuncionario(TbPessoa pessoa) {
        funcionario = new TbFuncionario();
        bllFuncionario = new FuncionarioBLL();
        if (bllFuncionario.procuraFuncionarioCPF(pessoa)) {
            funcionario = bllFuncionario.getFuncionario();
            return true;
        } else {
            return false;
        }
    }

    public boolean validaCEP(String cep) {
        bllLogradouros = new LogradourosBLL();
        if (bllLogradouros.validaCep(cep)) {
            logradouro = bllLogradouros.getLogradouros();
            return true;
        } else {
            return false;
        }
    }

    public String retiraChar(String digitado) {
        String resultado = "";
        for (int i = 0; i < digitado.length(); i++) {
            for (Integer j = 0; j < 10; j++) {
                if (("" + digitado.charAt(i)).equals(("" + j))) {
                    resultado += digitado.charAt(i);
                }
            }
        }
        return resultado;
    }

    public boolean validaCodigoProduto(String str) {
        retorno = false;
        bllProduto = new ProdutoBLL();
        if (bllProduto.procuraProduto(str)) {
            retorno = true;
        }
        return retorno;
    }

    public String toDate(String dado) {
        data = new SimpleDateFormat("dd/MM/yyyy");
        novo = new SimpleDateFormat("yyyy/MM/dd");
        try {
            d = data.parse(dado);
            v = novo.format(d);
            return v;
        } catch (ParseException e) {
            return v;
        }
    }

    public double arredonda(double num) {
        int decimalPlace = 2;
        BigDecimal bd = new BigDecimal(num);
        bd = bd.setScale(decimalPlace, BigDecimal.ROUND_HALF_UP);
        num = bd.doubleValue();
        return num;
    }

    public Logradouros getLogradouro() {
        return logradouro;
    }

    public TbPessoa getPessoa() {
        return pessoa;
    }

    public TbCliente getCliente() {
        return cliente;
    }

    public TbFuncionario getFuncionario() {
        return funcionario;
    }
}
