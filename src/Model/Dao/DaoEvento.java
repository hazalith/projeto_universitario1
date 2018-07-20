/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.Dao;
import java.sql.*;
import Connection.ConexaoBD;
import javax.swing.JOptionPane;
import Model.Bean.BeanEvento;


/**
 *
 * @author hyago
 */
public class DaoEvento {
    ConexaoBD conectar = new ConexaoBD();
    BeanEvento mod = new BeanEvento();
    PreparedStatement pst = null;
    Connection cxt = null;
    ResultSet rs = null;
    
    /*   public void salvar(BeanEvento mod){
    conectar.conexao();
    try {
    PreparedStatement pst = conectar.con.prepareStatement("insert into cadastro(Id_Cadastro,Nome_do_Evento,Data_Inicio,Data_Termino,Local_Evento,Organizador,Logotipo_Foto) values (?,?,?,?,?,?,?)");
    pst.setInt(1,mod.getIdeve());
    pst.setString(2,mod.getEvento());
    pst.setString(3,mod.getData_inicio());
    pst.setString(4,mod.getData_termino());
    pst.setString(5,mod.getLocal());
    pst.setString(6,mod.getOrganizador());
    pst.setString(7,mod.getLogotipo_Foto());
    pst.execute();
    JOptionPane.showMessageDialog(null,"Dados inseridos com sucesso!");
    } catch (SQLException ex) {
    JOptionPane.showMessageDialog(null," Erro ao inserir dados:\nErro:"+ex);
    }
    conectar.desconecta();
    }
    
    public void excluir (BeanEvento mod){
    
    conectar.conexao();
    try {
    PreparedStatement pst = conectar.con.prepareStatement("delete from cadastro where Id_cadastro=?");
    pst.setInt(1,mod.set
    pst.execute();
    
    } catch (SQLException ex) {
    Logger.getLogger(DaoEvento.class.getName()).log(Level.SEVERE, null, ex);
    }
    
    
    conectar.desconecta();
    
    }*/
    
    public void preencher (BeanEvento mod){
       String sql = "select Id_Cadastro, Nome_do_Evento , Data_Inicio, Data_Termino, Organizador  from cadastro";
        try {
            pst = cxt.prepareStatement(sql);
            rs = pst.executeQuery();
            
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "erro");
        }
        
   }
    
     
    
          
       
}

