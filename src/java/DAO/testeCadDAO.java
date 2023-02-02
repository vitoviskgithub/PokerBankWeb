
package DAO;

import DTO.TesteDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class testeCadDAO {
    
    
Connection conn;
PreparedStatement pstm;


public void CadastrarTeste(TesteDTO objtestedto) throws ClassNotFoundException{

String sql="INSERT INTO tableteste (nome_teste, tipo_teste, quantidade_teste) VALUES (?,?,?)";

conn = new ConexaoDAO().conectaBD();

try{

pstm = conn.prepareStatement(sql);

pstm.setString(1, objtestedto.getNome());
pstm.setString(2, objtestedto.getTipo());
pstm.setInt(3, objtestedto.getQuantidade());

pstm.execute();
pstm.close();


}catch(SQLException erro){
JOptionPane.showMessageDialog(null, "Erro no teste:" + erro);
}

}
    
}
