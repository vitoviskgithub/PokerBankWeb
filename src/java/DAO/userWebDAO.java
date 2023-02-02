package DAO;


import com.itextpdf.layout.element.Table;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.Document;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.swing.JOptionPane;

public class userWebDAO {

    public void gerarRelatorioUsuario() {

//instância do documento
//usando a classe estática PageSize para definir o tamanho da página
        Document documento = new Document(PageSize.A4);

//definindo as margens do documento
        documento.setMargins(40f, 40f, 40f, 40f);

        try {
//pegar o objeto que está em memória e gerar o arquivo físico
            PdfWriter.getInstance(documento, new FileOutputStream("relatorioUsuario.pdf"));
                 
          
//abrir o documento para editá-lo
            documento.open();

            
//primeiro parágrafom setndo o texto
            Paragraph tituloDoRelatorio = new Paragraph(new Phrase("POKER BANK APP WEB",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 18f)));            
            tituloDoRelatorio.setAlignment(tituloDoRelatorio.ALIGN_CENTER);
            
            Paragraph espacoDepoisTitulo = new Paragraph("Relatório de Usuários cadastrados");
            espacoDepoisTitulo.setAlignment(espacoDepoisTitulo.ALIGN_CENTER);
            
            Paragraph quebraLinha = new Paragraph();
            quebraLinha.setSpacingAfter(12f);
            
//colocando o parágrafo dentro do documento
            documento.add(tituloDoRelatorio);
            documento.add(espacoDepoisTitulo);
            documento.add(quebraLinha);
            

//gerando código para criar tabela no pdf
//Create Table object, Here 4 specify the no. of columns
            PdfPTable tabelaUsuarios = new PdfPTable(4);

            //Criando parágrafos para inserir dentro das células        
            Paragraph paragrafoId = new Paragraph(new Phrase("ID",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
           /* paragrafoId.setAlignment(Element.ALIGN_CENTER);*/

            Paragraph paragrafoNome = new Paragraph(new Phrase("NOME",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
          
           
            /*paragrafoNome.setAlignment(Element.ALIGN_CENTER);*/

            Paragraph paragrafoIdConta = new Paragraph(new Phrase("ID/CONTA",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /*paragrafoIdConta.setAlignment(Element.ALIGN_CENTER);*/

            Paragraph paragrafoAtivo = new Paragraph(new Phrase("ATIVO",
                    FontFactory.getFont(FontFactory.HELVETICA_BOLD, 12f)));
            /*paragrafoAtivo.setAlignment(Element.ALIGN_CENTER);*/

//criando CÉLULAS 
            //Create cells
            PdfPCell celulausuarioid = new PdfPCell(paragrafoId);
            //alinhando no centro horizontalmente
            celulausuarioid.setHorizontalAlignment(celulausuarioid.ALIGN_CENTER);

            PdfPCell celulausuarionome = new PdfPCell(paragrafoNome);
            celulausuarionome.setHorizontalAlignment(celulausuarionome.ALIGN_CENTER);
            
            PdfPCell celulausuaridconta = new PdfPCell(paragrafoIdConta);
            celulausuaridconta.setHorizontalAlignment(celulausuaridconta.ALIGN_CENTER);

            PdfPCell celulausuarioativo = new PdfPCell(paragrafoAtivo);
            celulausuarioativo.setHorizontalAlignment(celulausuarioativo.ALIGN_CENTER);

//adicionando celulas a tabela
            //Add cells to table
            tabelaUsuarios.addCell(celulausuarioid);
            tabelaUsuarios.addCell(celulausuarionome);
            tabelaUsuarios.addCell(celulausuaridconta);
            tabelaUsuarios.addCell(celulausuarioativo);

//adicionando tabela ao documento
            documento.add(tabelaUsuarios);

            String arquivopdf = "relatorioUsuario.pdf";
//abrir pdf usando o Runtime e executando no PROMPT comando CMD
            Runtime.getRuntime().exec("rundll32 SHELL32.DLL,ShellExec_RunDLL " + "cmd /c " + arquivopdf);

            documento.close();

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Erro na criação documento na classe DAO:" + e);

        } catch (DocumentException e) {

            JOptionPane.showMessageDialog(null, "Erro na criação documento na classe DAO:" + e);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro na criação documento na classe DAO:" + e);
        }

    }

}
