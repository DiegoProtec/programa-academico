package modelo;
// Generated 16/06/2013 11:05:40 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * TbTipocomplemento generated by hbm2java
 */
public class TbTipocomplemento  implements java.io.Serializable {


     private Integer idTipoComplemento;
     private String complemento;
     private Set tbEnderecos = new HashSet(0);

    public TbTipocomplemento() {
    }

	
    public TbTipocomplemento(String complemento) {
        this.complemento = complemento;
    }
    public TbTipocomplemento(String complemento, Set tbEnderecos) {
       this.complemento = complemento;
       this.tbEnderecos = tbEnderecos;
    }
   
    public Integer getIdTipoComplemento() {
        return this.idTipoComplemento;
    }
    
    public void setIdTipoComplemento(Integer idTipoComplemento) {
        this.idTipoComplemento = idTipoComplemento;
    }
    public String getComplemento() {
        return this.complemento;
    }
    
    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }
    public Set getTbEnderecos() {
        return this.tbEnderecos;
    }
    
    public void setTbEnderecos(Set tbEnderecos) {
        this.tbEnderecos = tbEnderecos;
    }




}


