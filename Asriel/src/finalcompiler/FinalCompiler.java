package finalcompiler;

import javax.swing.*;
//import splashScreen.splash;
import GUI.guiForm;
import java.awt.Dimension;
import java.awt.Toolkit;

/**
 *
 * @author DiracSpace & Flambo
 */

public class FinalCompiler {
    
    public static void main(String[] args) {
        
        ImageIcon img = new ImageIcon("C:\\Users\\Mooncake\\Desktop\\FinalCompilerBueno\\FinalCompiler\\src\\img\\asriel2.ico");
        // codigo para ventana
        SwingUtilities.invokeLater(() -> {
            /*splash s = new splash();
            s.setVisible(true);*/
            
            guiForm gui = new guiForm();
            JOptionPane.showMessageDialog(gui, "Asegúrese de tener GCC.exe como Variable de Entorno");
            if (JOptionPane.OK_OPTION == 0) {
                Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
                gui.setVisible(true);
                gui.setResizable(false); 
                gui.setLocation(dim.width / 2 - gui.getSize().width / 2, dim.height / 2 - gui.getSize().height / 2);
                gui.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Mooncake\\Desktop\\FinalCompilerBueno\\FinalCompiler\\src\\img\\asriel.png"));                
            }
        });
    }
}