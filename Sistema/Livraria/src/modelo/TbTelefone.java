package modelo;
// Generated 16/06/2013 11:05:40 by Hibernate Tools 3.2.1.GA



/**
 * TbTelefone generated by hbm2java
 */
public class TbTelefone  implements java.io.Serializable {


     private Integer idTelefone;
     private TbPessoa tbPessoa;
     private TbTipotelefone tbTipotelefone;
     private String telefone;

    public TbTelefone() {
    }

    public TbTelefone(TbPessoa tbPessoa, TbTipotelefone tbTipotelefone, String telefone) {
       this.tbPessoa = tbPessoa;
       this.tbTipotelefone = tbTipotelefone;
       this.telefone = telefone;
    }
   
    public Integer getIdTelefone() {
        return this.idTelefone;
    }
    
    public void setIdTelefone(Integer idTelefone) {
        this.idTelefone = idTelefone;
    }
    public TbPessoa getTbPessoa() {
        return this.tbPessoa;
    }
    
    public void setTbPessoa(TbPessoa tbPessoa) {
        this.tbPessoa = tbPessoa;
    }
    public TbTipotelefone getTbTipotelefone() {
        return this.tbTipotelefone;
    }
    
    public void setTbTipotelefone(TbTipotelefone tbTipotelefone) {
        this.tbTipotelefone = tbTipotelefone;
    }
    public String getTelefone() {
        return this.telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }




}

