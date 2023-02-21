package DAO;

import static DAO.ConexaoDAO.conn;
import DTO.BankUserDTO;
import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class AutenticaUserDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<UsuarioDTO> lista = new ArrayList<>();
    //AUTENTICA com o ID e não o nome do usuário, mais a senha

    // throws ClassNotFoundException - ou seja, caso não encontre uma exceção exeuta
    public ResultSet autenticacaoUsuarioSoma(UsuarioDTO objusuariodto) throws ClassNotFoundException {
        conn = new ConexaoDAO().conectaBD();

        try {

            String sql = "SELECT * FROM tableusuario where id_usuario = ? and senha_usuario = ?";

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objusuariodto.getId_usuario());
            JOptionPane.showMessageDialog(null, "ID user dentro do Autentica:" + objusuariodto.getId_usuario());

            pstm.setString(2, objusuariodto.getSenha_usuario());

            rs = pstm.executeQuery();

  
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
        return rs;
    }

}
