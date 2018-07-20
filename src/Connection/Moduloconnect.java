/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Connection;

import java.sql.*;

/**
 *
 * @author hyago
 */
public class Moduloconnect {

    //metodo responsavel de coneção com banco
    public static Connection conector() {
        java.sql.Connection conexao = null;
        // chama o driver de importão da biblioteca
        String driver = "com.mysql.jdbc.Driver";
        // armazenando informação do BD
        String url = "jdbc:mysql://localhost:3306/bjj";
        String user = "root";
        String password = "";
        //estabecendo conexão com o BD
        try {
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
        } catch (ClassNotFoundException | SQLException e) {
            // linha a baixo serve de apoio para esclarecer o erro
            //System.out.println(e);
            return null;
        }
    }

}
