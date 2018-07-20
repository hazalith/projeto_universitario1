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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "atleta", catalog = "bjj", schema = "")
@NamedQueries({
    @NamedQuery(name = "Atleta.findAll", query = "SELECT a FROM Atleta a")
    , @NamedQuery(name = "Atleta.findByIdAtleta", query = "SELECT a FROM Atleta a WHERE a.idAtleta = :idAtleta")
    , @NamedQuery(name = "Atleta.findByNome", query = "SELECT a FROM Atleta a WHERE a.nome = :nome")
    , @NamedQuery(name = "Atleta.findByEntidade", query = "SELECT a FROM Atleta a WHERE a.entidade = :entidade")
    , @NamedQuery(name = "Atleta.findByClasse", query = "SELECT a FROM Atleta a WHERE a.classe = :classe")
    , @NamedQuery(name = "Atleta.findBySexo", query = "SELECT a FROM Atleta a WHERE a.sexo = :sexo")
    , @NamedQuery(name = "Atleta.findByFaixa", query = "SELECT a FROM Atleta a WHERE a.faixa = :faixa")
    , @NamedQuery(name = "Atleta.findByDivis\u00e3o", query = "SELECT a FROM Atleta a WHERE a.divis\u00e3o = :divis\u00e3o")})
public class Atleta implements Serializable {

    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Id_Atleta")
    private Integer idAtleta;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @Basic(optional = false)
    @Column(name = "Entidade")
    private String entidade;
    @Basic(optional = false)
    @Column(name = "Classe")
    private String classe;
    @Basic(optional = false)
    @Column(name = "Sexo")
    private String sexo;
    @Column(name = "Faixa")
    private String faixa;
    @Column(name = "Divis\u00e3o")
    private String divisão;

    public Atleta() {
    }

    public Atleta(Integer idAtleta) {
        this.idAtleta = idAtleta;
    }

    public Atleta(Integer idAtleta, String nome, String entidade, String classe, String sexo) {
        this.idAtleta = idAtleta;
        this.nome = nome;
        this.entidade = entidade;
        this.classe = classe;
        this.sexo = sexo;
    }

    public Integer getIdAtleta() {
        return idAtleta;
    }

    public void setIdAtleta(Integer idAtleta) {
        Integer oldIdAtleta = this.idAtleta;
        this.idAtleta = idAtleta;
        changeSupport.firePropertyChange("idAtleta", oldIdAtleta, idAtleta);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getEntidade() {
        return entidade;
    }

    public void setEntidade(String entidade) {
        String oldEntidade = this.entidade;
        this.entidade = entidade;
        changeSupport.firePropertyChange("entidade", oldEntidade, entidade);
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        String oldClasse = this.classe;
        this.classe = classe;
        changeSupport.firePropertyChange("classe", oldClasse, classe);
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        String oldSexo = this.sexo;
        this.sexo = sexo;
        changeSupport.firePropertyChange("sexo", oldSexo, sexo);
    }

    public String getFaixa() {
        return faixa;
    }

    public void setFaixa(String faixa) {
        String oldFaixa = this.faixa;
        this.faixa = faixa;
        changeSupport.firePropertyChange("faixa", oldFaixa, faixa);
    }

    public String getDivisão() {
        return divisão;
    }

    public void setDivisão(String divisão) {
        String oldDivisão = this.divisão;
        this.divisão = divisão;
        changeSupport.firePropertyChange("divis\u00e3o", oldDivisão, divisão);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idAtleta != null ? idAtleta.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Atleta)) {
            return false;
        }
        Atleta other = (Atleta) object;
        if ((this.idAtleta == null && other.idAtleta != null) || (this.idAtleta != null && !this.idAtleta.equals(other.idAtleta))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "View.Atleta[ idAtleta=" + idAtleta + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
