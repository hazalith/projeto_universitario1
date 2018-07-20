/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author hyago
 */

public class ConexaoBD {
    
    public Statement stm;
    public ResultSet rs;
    public String driver = "com.mysql.jdbc.Driver";
    public String caminho = "jdbc:mysql://localhost:3306/bjj";
    public String usuario = "root";
    public String senha = "";
    public Connection con;    

 public void conexao(){   
        try {
            System.setProperty("jdbc.Drivers", driver);
            con = DriverManager.getConnection(caminho, usuario, senha);
            JOptionPane.showMessageDialog(null," Conexão  efetuada com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao se conectar com o banco de dados:\n"+ex);
        }  
 }
 
 public void executasql (String sql){
        try {
            stm = con.createStatement(rs.TYPE_SCROLL_INSENSITIVE, rs.CONCUR_READ_ONLY);
            rs = stm.executeQuery(sql);
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ExecutaSql:\n"+ex.getMessage());
        }
 }
 
 public void desconecta(){
        try {
            con.close();
            JOptionPane.showMessageDialog(null,"BD desconectado com sucesso!");
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Erro ao fechar conexão ao BD:\n"+ex.getMessage());
        }
 }
 
}
