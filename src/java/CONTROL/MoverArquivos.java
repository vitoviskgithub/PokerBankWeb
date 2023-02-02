package CONTROL;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import javax.swing.JOptionPane;

public class MoverArquivos {

    public void moveArqTxt() {
        Path sourcePath = Paths.get("c:/movendo/teste1.txt");
        Path destinationPath = Paths.get("c:/movendo/para/teste1.txt");

        try {
            Files.move(sourcePath, destinationPath,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
    }
    
   public void moveArqPng(){
             Path sourcePath = Paths.get("C:/Users/Meu Computador/workspace/JavaWeb/apache-tomcat-10.0.27/bin/Graphic_user.png");
        Path destinationPath = Paths.get("C:/Users/Meu Computador/Documents/GitHub/links/src/images/Graphic_user.png");

        try {
            Files.move(sourcePath, destinationPath,
                    StandardCopyOption.REPLACE_EXISTING);
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e);
        }
   }
}
