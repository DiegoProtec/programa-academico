package modelo;
// Generated 16/06/2013 11:05:40 by Hibernate Tools 3.2.1.GA


import java.util.HashSet;
import java.util.Set;

/**
 * TbTipotelefone generated by hbm2java
 */
public class TbTipotelefone  implements java.io.Serializable {


     private Integer idTipoTelefone;
     private String tipoTelefone;
     private Set tbTelefones = new HashSet(0);

    public TbTipotelefone() {
    }

	
    public TbTipotelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }
    public TbTipotelefone(String tipoTelefone, Set tbTelefones) {
       this.tipoTelefone = tipoTelefone;
       this.tbTelefones = tbTelefones;
    }
   
    public Integer getIdTipoTelefone() {
        return this.idTipoTelefone;
    }
    
    public void setIdTipoTelefone(Integer idTipoTelefone) {
        this.idTipoTelefone = idTipoTelefone;
    }
    public String getTipoTelefone() {
        return this.tipoTelefone;
    }
    
    public void setTipoTelefone(String tipoTelefone) {
        this.tipoTelefone = tipoTelefone;
    }
    public Set getTbTelefones() {
        return this.tbTelefones;
    }
    
    public void setTbTelefones(Set tbTelefones) {
        this.tbTelefones = tbTelefones;
    }




}

