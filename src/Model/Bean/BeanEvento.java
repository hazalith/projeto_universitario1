/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Bean;


/**
 *
 * @author hyago
 */
public class BeanEvento {

    /**
     * @return the local
     */
    public String getLocal() {
        return local;
    }

    /**
     * @param local the local to set
     */
    public void setLocal(String local) {
        this.local = local;
    }

    /**
     * @return the Logotipo_Foto
     */
    public String getLogotipo_Foto() {
        return Logotipo_Foto;
    }

    /**
     * @param Logotipo_Foto the Logotipo_Foto to set
     */
    public void setLogotipo_Foto(String Logotipo_Foto) {
        this.Logotipo_Foto = Logotipo_Foto;
    }

   private String local;
   private String Logotipo_Foto;
    /**
     * @return the ideve
     */
    public int getIdeve() {     
        return ideve;
    }

    /**
     * @param ideve the ideve to set
     */
    public void setIdeve(int ideve) {
        this.ideve = ideve;
    }

    /**
     * @return the evento
     */
    public String getEvento() {
        return evento;
    }

    /**
     * @param evento the evento to set
     */
    public void setEvento(String evento) {
        this.evento = evento;
    }

    /**
     * @return the data_inicio
     */
    public String getData_inicio() {
        return data_inicio;
    }

    /**
     * @param data_inicio the data_inicio to set
     */
    public void setData_inicio(String data_inicio) {
        this.data_inicio = data_inicio;
    }

    /**
     * @return the data_termino
     */
    public String getData_termino() {
        return data_termino;
    }

    /**
     * @param data_termino the data_termino to set
     */
    public void setData_termino(String data_termino) {
        this.data_termino = data_termino;
    }

    /**
     * @return the organizador
     */
    public String getOrganizador() {
        return organizador;
    }

    /**
     * @param organizador the organizador to set
     */
    public void setOrganizador(String organizador) {
        this.organizador = organizador;
    }
    private int ideve;
    private String evento;
    private String data_inicio;
    private String data_termino;
    private String organizador;     

    public void getEvento(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
