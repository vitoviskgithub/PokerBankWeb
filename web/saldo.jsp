<%@page import="java.sql.SQLException"%>
<%@page import="DAO.SomasDAO"%>
<%@page import="DTO.BankUserDTO"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="DTO.UsuarioDTO"%>
<%@page import="DAO.AutenticaUserDAO"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>SALDOS</title>
        <link rel="stylesheet" href="saldos.css">
    </head>

    <body>
        <section class="acima">
            <p>Os saldos são postados e atualizados sempre, na
                página principal você encontra na seção Poker
                os links para verificar as informações.
                Os saldos postados são de investidores que já
                pertecem ao grupo de investidores do POKER BANK.
                Como se tornar um investidor? Na seção Usuários
                existem mais informações.<br>
            </p>
            <center><a href="usuarios.html" target="_self">SAIBA MAIS</a></center>

            <!--BOTÃO PARA FORMULÁRIO-->
            <button class="btn1" onclick="abrirModal()">FORMULÁRIO</button>

            <!--a div janelaModal é para o overlay(fundo
                do site mais escuro)-->
            <div class="janelaModal" id="janelaModalID">
                <!--a div modal é justamente a janelinha-->
                <div class="modal"><!--PODE SE ADICIONAR O CONTEÚDO QUE QUISER DENTRO DO MODAL-->
                    <button class="fechar" id="fecharID">X</button>
                    <!--CONTEÚDO DA JANELA MODAL-->
                    <h1>Saldo por usuário</h1><br>
                    <form action="saldo.jsp">
                        <button>VEJA SEU SALDO (ID)</button><br>
                        <p id="txtForm1">Resultado</p>
                        <input type="text" id="saldoUser" name="" value="">

                    </form>
                </div>
            </div>
            <script src="script.js"></script>
        </section>

        <section class="abaixo">

            <h1>APRENDA POKER ONLINE GRATUITAMENTE</h1>
            <p>
                Os conceitos básicos do poker ensinados por mim
                de forma prática e didática.
                Eu criei um mini-curso com aulas explicativas
                para que você aprenda o básico desse maravilhoso
                jogo.
                Esses vídeos se encontram no meu TWICH, basta clicar
                no link abaixo e acessar meu twich.<br><br>
            <center><a href="#" target="_blank">(Curta e siga a minha página TWICH)</a></center>
        </p>
    </section>
    <!--Na seção Usuários além do formulário janela Modal
teremos uma aba para comentar sobre o Poker e alguns
dos seus eventos
ESCOLHER OUTRA ABA PARA POSTAR RESULTADOS MEUS-->

    <!--JSP CÓDIGO DE ACESSO AOS ARQUIVOS JAVA-->

    <%
        JOptionPane.showMessageDialog(null, "JSP SALDO funcionando");
        String idUser = JOptionPane.showInputDialog("Insira o id do usuário");
        String passUser = JOptionPane.showInputDialog("Insira a senha do usuário");

        JOptionPane.showMessageDialog(null, "id:" + idUser + "senha:" + passUser);

        if (idUser.equals("") || passUser.equals("")) {
            JOptionPane.showMessageDialog(null, "Você não inseriu a senha ou ID do usuário");
        } else {
            int idUserDto = 0;

            idUserDto = Integer.parseInt(idUser);

            UsuarioDTO objuserdto = new UsuarioDTO();
            objuserdto.setId_usuario(idUserDto);
            objuserdto.setSenha_usuario(passUser);

            JOptionPane.showMessageDialog(null, "USER DA DTO:" + objuserdto.getId_usuario());
            JOptionPane.showMessageDialog(null, "SENHA DA DTO:" + objuserdto.getSenha_usuario());

            BankUserDTO objbankuserdto = new BankUserDTO();
            objbankuserdto.setId_user_bank(idUserDto);

            JOptionPane.showMessageDialog(null, "USER DA DTO BANK:" + objbankuserdto.getId_user_bank());

            AutenticaUserDAO objautent = new AutenticaUserDAO();
            ResultSet teste = objautent.autenticacaoUsuarioSoma(objuserdto);

            JOptionPane.showMessageDialog(null, "retorno:" + teste);
            try {
                if (teste.next()) {
                    objbankuserdto.setId_user_bank(objuserdto.getId_usuario());

                    SomasDAO objsomas = new SomasDAO();

                    String valorSoma = objsomas.somarValoresSaldo(objbankuserdto);
                    JOptionPane.showMessageDialog(null, "VALOR SOMA NO JSP:" + valorSoma);

                    out.println("VALOR SOMA:" + valorSoma);

                } else {

                    JOptionPane.showMessageDialog(null, "Algo deu errado ao executar a soma");

                }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Algo deu errado na busca ao BD:" + e);
            }

            /* out.println("VALOR SOMA:" + objbankuserdto.getSomaValoresSaldo());*/
        }


    %>
</body>
</html>
