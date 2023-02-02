package DAO;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;

import javax.swing.JOptionPane;
import DTO.TesteDTO;

public class ConexaoDAO {

    public static Connection conn = null;// a variável acessível a todo código

    public Connection conectaBD() throws ClassNotFoundException {

        try {
            Class.forName("com.mysql.jdbc.Driver"); /* Aqui registra */
           conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/pokerbank","web","12345678");
           JOptionPane.showMessageDialog(null, "Conectou");

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
        }
        return conn;
    }

    public Connection ConectarWeb() {

        try {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

               /** JOptionPane.showMessageDialog(null, "Passou o primeiro");*/

            } catch (ClassNotFoundException erro) {
                JOptionPane.showMessageDialog(null, "Conectar com a WEB o BD erro 1: " + erro);
            }

            conn = DriverManager.getConnection("jdbc:mysql://us-east.connect.psdb.cloud/", "j0xowov0pnbkcr9t2u2j", "pscale_pw_PJu1lRdWsoUub8kkNpa1OMP3zRWBTpYyfxuKUgmmWpL");

            /**JOptionPane.showMessageDialog(null, "Conectou");*/

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO ao conectar na WEB com BD erro 2: " + e);
            JOptionPane.showMessageDialog(null, "Banco de Dados OFFLINE\nVerifique se digitou seus dados corretamente e tente novamente");
            
            throw new RuntimeException(e);
        }

        return conn;
    }

//CONECTA AO BANCO DE DADOS DA INTERNET, MAS O MÉTODO NÃO É TIPO CONNECTION
//ELE É VOID, NÃO RETORNA NADA
    public static void ConectarWebNoReturn() {
        
        try {

            try {
                Class.forName("com.mysql.cj.jdbc.Driver");

                JOptionPane.showMessageDialog(null, "CONECTANDO COM O BD PASSO 1");

            } catch (ClassNotFoundException erro) {
                JOptionPane.showMessageDialog(null, "Conectar com a WEB o BD erro 1: " + erro);
            }

            conn = DriverManager.getConnection("jdbc:mysql://us-east.connect.psdb.cloud/",
                    "j0xowov0pnbkcr9t2u2j",
                    "pscale_pw_PJu1lRdWsoUub8kkNpa1OMP3zRWBTpYyfxuKUgmmWpL");

            JOptionPane.showMessageDialog(null, "CONECTOU COM O BD(BANCO DE DADOS)");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "ConexaoDAO ao conectar na WEB com BD erro 2: " + e);
            throw new RuntimeException(e);
        }

    }

}
