package DAO;

import DTO.BankUserDTO;
import DTO.UsuarioDTO;
import static java.lang.System.out;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class SomasDAO {

    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<UsuarioDTO> lista = new ArrayList<>();

    public int somaSaldos;

    public String somarValoresSaldo(BankUserDTO objbankdto) throws ClassNotFoundException {

        String valor = "";

        String sql = "SELECT SUM(saldo_bank) AS Total FROM tablebankuser WHERE fk_id_user_bank = ?";
        conn = new ConexaoDAO().conectaBD();

        try {

            pstm = conn.prepareStatement(sql);

            pstm.setInt(1, objbankdto.getId_user_bank());
            JOptionPane.showMessageDialog(null, "ID user dentro da SomaDAO:" + objbankdto.getId_user_bank());
            

            rs = pstm.executeQuery();

            if (rs.next()) {

                // para pegar o valor de da variável ResultSet pegou no BD, tem que estar 
                //dentro de uma CONDICIONAL IF ou LOOP como WHILE, com o compartaivo se ela está vazia ou não rs.next()
                somaSaldos = rs.getInt(1);

                String textoSoma = String.valueOf(somaSaldos);

                valor = textoSoma;
                
                JOptionPane.showMessageDialog(null, "VALOR:" + valor );
                
                int valorPara = Integer.parseInt(valor);
                
                objbankdto.setSomaValoresSaldo(valorPara);
                JOptionPane.showMessageDialog(null, "VALOR somaVal da DTO:" + objbankdto.getSomaValoresSaldo());
               

            } else {

                JOptionPane.showMessageDialog(null, "Erro na soma dos saldos no frmPrincipal");
            }
            
            
        } catch (SQLException erro) {

            JOptionPane.showMessageDialog(null, "frmPrincipal método somarValoresSaldo: " + erro);
        }
        return valor;
      
    }
}

    

