<%@page import="javax.swing.JOptionPane"%>
<%@page import="DAO.testeCadDAO"%>
<%@page import="DTO.TesteDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page TESTE</title>
    </head>
    <body>
        <h1>JSP TESTE</h1>

        <%
                  String convStrInt = "";
            try {
                TesteDTO objtestedto = new TesteDTO();
                objtestedto.setNome(request.getParameter("nome"));
                objtestedto.setTipo(request.getParameter("tipo"));
                convStrInt = request.getParameter("quantidade");
                
                objtestedto.setQuantidade(Integer.parseInt(convStrInt));

                testeCadDAO objtestedao = new testeCadDAO();
                objtestedao.CadastrarTeste(objtestedto);
                
                JOptionPane.showMessageDialog(null,"Cadastrou");
            } catch (Exception e) {
            
            JOptionPane.showMessageDialog(null,"Não cadastrou, erro: " + e);
            }


        %>
    </body>
</html>
