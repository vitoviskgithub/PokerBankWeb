<%@page import="javax.swing.JOptionPane"%>
<%@page import="DAO.GerarGraphicDAO"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>VER GRÁFICO</title>
    </head>
    <body>
        <h1>VISUALIZAR GRÁFICO</h1>
        
        <%
            GerarGraphicDAO objgraphdao = new GerarGraphicDAO();
            objgraphdao.janelaNovaURL();
            
            JOptionPane.showMessageDialog(null, "Visualizando gráfico");

            %>
    </body>
</html>
