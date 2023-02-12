<%@page import="CONTROL.MoverArquivos"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="DAO.GerarGraphicDAO"%>
<%@page import="DTO.PesquisaDateDTO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GRAPHIC USER JSP</title>
    </head>
    <body>
        <h1>GERANDO GRÁFICO</h1>
        <%
            int teste = 0;
            String teste3 = "";
            String convStrInt = "";

            try {
                PesquisaDateDTO objdatedto = new PesquisaDateDTO();
                convStrInt = request.getParameter("idGra");
                objdatedto.setIduser(Integer.parseInt(convStrInt));

                int pimp = objdatedto.getIduser();

                JOptionPane.showMessageDialog(null, pimp);

                GerarGraphicDAO objgraphicdao = new GerarGraphicDAO();
                objgraphicdao.gerandoGraphicLoopCalcUser(objdatedto);

                JOptionPane.showMessageDialog(null, "JSP criou gráfico");
                
                MoverArquivos objmoverarq = new MoverArquivos();       
                objmoverarq.moveArqPng();
                
                 JOptionPane.showMessageDialog(null, "Arquivo PNG movido para o repositório do GitHub LINKS");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao criar grádico na JSP: " + e);
            }


        %>
    </body>
</html>
