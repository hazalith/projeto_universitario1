/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author hyago
 */
@Entity
@Table(name = "cadastro", catalog = "bjj", schema = "")
@NamedQueries({
    @NamedQuery(name = "Cadastro.findAll", query = "SELECT c FROM Cadastro c")
    , @NamedQuery(name = "Cadastro.findByIdCadastro", query = "SELECT c FROM Cadastro c WHERE c.idCadastro = :idCadastro")
    , @NamedQuery(name = "Cadastro.findByNomedoEvento", query = "SELECT c FROM Cadastro c WHERE c.nomedoEvento = :nomedoEvento")
    , @NamedQuery(name = "Cadastro.findByLocalEvento", query = "SELECT c FROM Cadastro c WHERE c.localEvento = :localEvento")
    , @NamedQuery(name = "Cadastro.findByOrganizador", query = "SELECT c FROM Cadastro c WHERE c.organizador = :organizador")
    , @NamedQuery(name = "Cadastro.findByLogotipofoto", query = "SELECT c FROM Cadastro c WHERE c.logotipofoto = :logotipofoto")
    , @NamedQuery(name = "Cadastro.findByDataTermino", query = "SELECT c FROM Cadastro c WHERE c.dataTermino = :dataTermino")
    , @NamedQuery(name = "Cadastro.findByDataInicio", query = "SELECT c FROM Cadastro c WHERE c.dataInicio = :dataInicio")})
public class Cadastro implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id_Cadastro")
    private Integer idCadastro;
    @Basic(optional = false)
    @Column(name = "Nome_do_Evento")
    private String nomedoEvento;
    @Basic(optional = false)
    @Column(name = "Local_Evento")
    private String localEvento;
    @Basic(optional = false)
    @Column(name = "Organizador")
    private String organizador;
    @Basic(optional = false)
    @Column(name = "Logotipo_foto")
    private String logotipofoto;
    @Column(name = "Data_Termino")
    private String dataTermino;
    @Column(name = "Data_Inicio")
    private String dataInicio;

    public Cadastro() {
    }

    public Cadastro(Integer idCadastro) {
        this.idCadastro = idCadastro;
    }

    public Cadastro(Integer idCadastro, String nomedoEvento, String localEvento, String organizador, String logotipofoto) {
        this.idCadastro = idCadastro;
        this.nomedoEvento = nomedoEvento;
        this.localEvento = localEvento;
        this.organizador = organizador;
        this.logotipofoto = logotipofoto;
    }

    public Integer getIdCadastro() {
        return idCadastro;
    }

    public void setIdCadastro(Integer idCadastro) {
        Integer oldIdCadastro = this.idCadastro;
        this.idCadastro = idCadastro;
        changeSupport.firePropertyChange("idCadastro", oldIdCadastro, idCadastro);
    }

    public String getNomedoEvento() {
        return nomedoEvento;
    }

    public void setNomedoEvento(String nomedoEvento) {
        String oldNomedoEvento = this.nomedoEvento;
        this.nomedoEvento = nomedoEvento;
        changeSupport.firePropertyChange("nomedoEvento", oldNomedoEvento, nomedoEvento);
    }

    public String getLocalEvento() {
        return localEvento;
    }

    public void setLocalEvento(String localEvento) {
        String oldLocalEvento = this.localEvento;
        this.localEvento = localEvento;
        changeSupport.firePropertyChange("localEvento", oldLocalEvento, localEvento);
    }

    public String getOrganizador() {
        return organizador;
    }

    public void setOrganizador(String organizador) {
        String oldOrganizador = this.organizador;
        this.organizador = organizador;
        changeSupport.firePropertyChange("organizador", oldOrganizador, organizador);
    }

    public String getLogotipofoto() {
        return logotipofoto;
    }

    public void setLogotipofoto(String logotipofoto) {
        String oldLogotipofoto = this.logotipofoto;
        this.logotipofoto = logotipofoto;
        changeSupport.firePropertyChange("logotipofoto", oldLogotipofoto, logotipofoto);
    }

    public String getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(String dataTermino) {
        String oldDataTermino = this.dataTermino;
        this.dataTermino = dataTermino;
        changeSupport.firePropertyChange("dataTermino", oldDataTermino, dataTermino);
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        String oldDataInicio = this.dataInicio;
        this.dataInicio = dataInicio;
        changeSupport.firePropertyChange("dataInicio", oldDataInicio, dataInicio);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCadastro != null ? idCadastro.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Cadastro)) {
            return false;
        }
        Cadastro other = (Cadastro) object;
        if ((this.idCadastro == null && other.idCadastro != null) || (this.idCadastro != null && !this.idCadastro.equals(other.idCadastro))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Cadastro[ idCadastro=" + idCadastro + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
