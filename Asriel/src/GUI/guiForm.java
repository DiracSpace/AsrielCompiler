package GUI;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JFileChooser;
import Compile.compiler;
import java.awt.Color;
import java.awt.HeadlessException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;
/**
 *
 * @author DiracSpace & Flambo
 */

public class guiForm extends javax.swing.JFrame {
    
    public compiler c;   
    public String asm;
    
    public guiForm() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        terminal = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        code = new javax.swing.JTextArea();
        Run = new javax.swing.JButton();
        Compile = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        openFile = new javax.swing.JMenuItem();
        saveFile = new javax.swing.JMenuItem();
        sysExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        copyAll = new javax.swing.JMenuItem();
        Paste = new javax.swing.JMenuItem();
        Cut = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        genASM = new javax.swing.JMenuItem();
        genIntermediate = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(129, 141, 166));
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(129, 141, 166));

        jScrollPane2.setBackground(new java.awt.Color(10, 25, 38));
        jScrollPane2.setBorder(null);
        jScrollPane2.setOpaque(false);

        terminal.setEditable(false);
        terminal.setBackground(new java.awt.Color(20, 18, 89));
        terminal.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        terminal.setForeground(new java.awt.Color(185, 183, 243));
        terminal.setBorder(null);
        terminal.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        terminal.setSelectionColor(new java.awt.Color(255, 255, 255));
        terminal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                terminalActionPerformed(evt);
            }
        });
        jScrollPane2.setViewportView(terminal);

        jScrollPane1.setBackground(new java.awt.Color(10, 25, 38));
        jScrollPane1.setBorder(null);
        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jScrollPane1.setOpaque(false);

        code.setBackground(new java.awt.Color(0, 0, 0));
        code.setColumns(20);
        code.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        code.setForeground(new java.awt.Color(0, 255, 0));
        code.setLineWrap(true);
        code.setRows(5);
        code.setWrapStyleWord(true);
        code.setBorder(null);
        jScrollPane1.setViewportView(code);

        Run.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ejecutar(100).png"))); // NOI18N
        Run.setBorderPainted(false);
        Run.setContentAreaFilled(false);
        Run.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Run.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RunActionPerformed(evt);
            }
        });

        Compile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/compilar(100).png"))); // NOI18N
        Compile.setBorderPainted(false);
        Compile.setContentAreaFilled(false);
        Compile.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Compile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CompileActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Compile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Run, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 703, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 440, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Compile, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Run, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jMenuBar1.setBackground(new java.awt.Color(134, 166, 20));
        jMenuBar1.setBorder(null);
        jMenuBar1.setBorderPainted(false);
        jMenuBar1.setFont(new java.awt.Font("Consolas", 0, 20)); // NOI18N
        jMenuBar1.setPreferredSize(new java.awt.Dimension(143, 35));

        jMenu1.setBackground(new java.awt.Color(20, 18, 89));
        jMenu1.setBorder(null);
        jMenu1.setForeground(new java.awt.Color(200, 199, 236));
        jMenu1.setText(" File  ");
        jMenu1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu1.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jMenu1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jMenu1.setOpaque(true);
        jMenu1.setPreferredSize(new java.awt.Dimension(85, 35));

        openFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        openFile.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        openFile.setForeground(new java.awt.Color(20, 18, 89));
        openFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/abrir.png"))); // NOI18N
        openFile.setText("Open file");
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });
        jMenu1.add(openFile);

        saveFile.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        saveFile.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        saveFile.setForeground(new java.awt.Color(20, 18, 89));
        saveFile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/guardar.png"))); // NOI18N
        saveFile.setText("Save file");
        saveFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveFileActionPerformed(evt);
            }
        });
        jMenu1.add(saveFile);

        sysExit.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
        sysExit.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        sysExit.setForeground(new java.awt.Color(20, 18, 89));
        sysExit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/salir.png"))); // NOI18N
        sysExit.setText("Exit");
        sysExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sysExitActionPerformed(evt);
            }
        });
        jMenu1.add(sysExit);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(27, 60, 89));
        jMenu2.setForeground(new java.awt.Color(192, 202, 211));
        jMenu2.setText(" Options ");
        jMenu2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu2.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jMenu2.setOpaque(true);
        jMenu2.setPreferredSize(new java.awt.Dimension(85, 35));

        copyAll.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        copyAll.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        copyAll.setForeground(new java.awt.Color(27, 60, 89));
        copyAll.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/copiar.png"))); // NOI18N
        copyAll.setText("Copy all");
        copyAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                copyAllActionPerformed(evt);
            }
        });
        jMenu2.add(copyAll);

        Paste.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        Paste.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Paste.setForeground(new java.awt.Color(27, 60, 89));
        Paste.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pegar.png"))); // NOI18N
        Paste.setText("Paste");
        Paste.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasteActionPerformed(evt);
            }
        });
        jMenu2.add(Paste);

        Cut.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.CTRL_MASK));
        Cut.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        Cut.setForeground(new java.awt.Color(27, 60, 89));
        Cut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/cortar.png"))); // NOI18N
        Cut.setText("Cut");
        Cut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CutActionPerformed(evt);
            }
        });
        jMenu2.add(Cut);

        jMenuBar1.add(jMenu2);

        jMenu5.setBackground(new java.awt.Color(41, 52, 157));
        jMenu5.setForeground(new java.awt.Color(224, 225, 239));
        jMenu5.setText(" Compiler ");
        jMenu5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenu5.setFont(new java.awt.Font("Consolas", 0, 15)); // NOI18N
        jMenu5.setOpaque(true);
        jMenu5.setPreferredSize(new java.awt.Dimension(85, 35));

        genASM.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        genASM.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        genASM.setForeground(new java.awt.Color(41, 52, 157));
        genASM.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ensamblador.png"))); // NOI18N
        genASM.setText("Generate Assembly");
        genASM.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genASMActionPerformed(evt);
            }
        });
        jMenu5.add(genASM);

        genIntermediate.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        genIntermediate.setFont(new java.awt.Font("Consolas", 0, 14)); // NOI18N
        genIntermediate.setForeground(new java.awt.Color(41, 52, 157));
        genIntermediate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/intermedio.png"))); // NOI18N
        genIntermediate.setText("Generate Intermediate");
        genIntermediate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genIntermediateActionPerformed(evt);
            }
        });
        jMenu5.add(genIntermediate);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed

        // codigo para abrir archivo y mostrar texto
        try {
            JFileChooser file = new JFileChooser("f:");
            int r = file.showOpenDialog(null);
            if (r == JFileChooser.APPROVE_OPTION) {
                File path = new File(file.getSelectedFile().getAbsolutePath());
                c = new compiler(path.toString());
                try {
                    String s1, sl;
                    FileReader fr = new FileReader(path);
                    BufferedReader br = new BufferedReader(fr);
                    sl = br.readLine();
                    while ((s1 = br.readLine()) != null) {
                        sl = sl + "\n" + s1;
                    }
                    code.setText(sl);
                } catch (FileNotFoundException fileExp) {
                    JOptionPane.showMessageDialog(null, "Error en -> " + fileExp.getMessage());
                }
            } else {
                System.out.println("Operation cancelled");
            }
        } catch (IOException expTwo) {
            JOptionPane.showMessageDialog(null, "Error en -> " + expTwo.getMessage());
        }
    }//GEN-LAST:event_openFileActionPerformed

    private void saveFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveFileActionPerformed

        // Codigo para guardar el texto en archivo con extension
        try {
            JFileChooser file = new JFileChooser("f:");
            int r = file.showSaveDialog(null);
            if (r == JFileChooser.APPROVE_OPTION) {
                File path = new File(file.getSelectedFile().getAbsolutePath());
                try {
                    FileWriter fr = new FileWriter(path, false);
                    try (BufferedWriter br = new BufferedWriter(fr)) {
                        br.write(code.getText());
                        br.flush();
                    }
                } catch (FileNotFoundException fileExp) {
                    JOptionPane.showMessageDialog(null, "Error en -> " + fileExp.getMessage());
                }
            } else {
                System.out.println("Operation cancelled");
            }
        } catch (IOException ioExp) {
            JOptionPane.showMessageDialog(null, "Error en -> " + ioExp.getMessage());
        }
    }//GEN-LAST:event_saveFileActionPerformed

    private void PasteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasteActionPerformed
        
        // Codigo para pegar
        try {
            code.paste();
        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null, "Error en -> " + exp.getMessage());
        }
    }//GEN-LAST:event_PasteActionPerformed

    private void copyAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_copyAllActionPerformed
        
        // Codigo para copiar
        try {
            code.copy();
        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null, "Error en -> " + exp.getMessage());
        }
    }//GEN-LAST:event_copyAllActionPerformed

    private void CompileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CompileActionPerformed
        // TODO add your handling code here:
        try {
            String filepath = c.Compile();
            File file = new File(filepath);
            String path = file.getPath();
            String newpath = path.substring(0, path.lastIndexOf(File.separator));
            String name = file.getName();
            String nameexe = file.getName().substring(0, file.getName().lastIndexOf("."));
            String folder = newpath+"\\";
            System.out.println(folder + "run.bat");
            String exe = folder+nameexe+".exe";

            ProcessBuilder pb;
            try {
                pb = new ProcessBuilder("cmd", "/C", "g++ " + "\"" + newpath + "\\" + name + "\"" + " -o \"" + nameexe+"\"");
                pb.directory(new File(newpath));

                Process p = pb.start();
                p.waitFor();
                int x = p.exitValue();

                if (x == 0) {
                    terminal.setForeground(Color.GREEN);
                    terminal.setText("            == 0 error.. Compilation Finished");
                } else {
                    BufferedReader r = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                    String out;
                    terminal.setText("");
                    while ((out = r.readLine()) != null) {
                        terminal.setForeground(Color.RED);
                        terminal.setText(out + System.getProperty("line.separator"));
                    }
                }
            } catch (IOException | InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "Error en -> " + ex.getMessage());
            }
        } catch (HeadlessException exp) {
            JOptionPane.showMessageDialog(null, "Error en -> " + exp.getMessage());
        }
    }//GEN-LAST:event_CompileActionPerformed

    private void RunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RunActionPerformed
        // TODO add your handling code here:
        try {
            String filepath = c.Compile();
            File file = new File(filepath);
            String path = file.getPath();
            String newpath = path.substring(0, path.lastIndexOf(File.separator));
            System.out.println(newpath);
            String name = file.getName();
            String nameexe = file.getName().substring(0, file.getName().lastIndexOf("."));
            String folder = newpath+"\\";
            
            ProcessBuilder pb;
            try {
                pb = new ProcessBuilder("cmd", "/C", "g++ " + "\"" + newpath + "\\" + name + "\"" + " -o \"" + nameexe+"\"");
                pb.directory(new File(newpath));
                Process p = pb.start();
                p.waitFor();
                int x = p.exitValue();
                int z = p.exitValue();
                if ( x == 0) {
                    //Runtime rt = Runtime.getRuntime();
                    try {
                        String co = "@echo off\n" + "\"" +
                                    newpath + "\\" + nameexe + ".exe\"\n" + "echo.\n" + "echo.\n" + "echo Process Terminated\n" +
                                    "pause\n" +
                                    "exit";
                        File dir = new File(newpath + "\\CodeEditor");
                        dir.mkdir();
                        try {
                            File file2 = new File(folder + "\\codeEditor" + "\\run.bat");
                            file2.createNewFile();
                            try (PrintWriter writer = new PrintWriter(file2)) {
                                writer.append(co);
                            }
                            Process p2 = Runtime.getRuntime().exec("cmd /c start run.bat", null, new File(newpath + "\\CodeEditor"));
                        } catch (IOException exxx) {
                        JOptionPane.showMessageDialog(null, "Error en -> " + exxx.getMessage());
                    }
                    } catch (HeadlessException exx) {
                        JOptionPane.showMessageDialog(null, "Error en -> " + exx.getMessage());
                    }
                }
            } catch (IOException | InterruptedException ex) {
                JOptionPane.showMessageDialog(null, "Error en -> " + ex.getMessage());
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error en -> " + e.getMessage());
        }
    }//GEN-LAST:event_RunActionPerformed

    private void genASMActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genASMActionPerformed
        // TODO add your handling code here:
        try {

            String data = code.getText(), filepath = c.Compile();
            File file = new File(filepath);
            String path = file.getPath();
            String name = file.getName().substring(0, file.getName().lastIndexOf("."));
            String newpath = path.substring(0, path.lastIndexOf(File.separator)) + "\\CodeEditor";
            String save_ASM = newpath + "\\" + name + ".asm";
            asm = save_ASM;
            
            if (data != null) {
                ProcessBuilder pb;
                try {
                    pb = new ProcessBuilder("cmd", "/C", "g++ " + "-S" + " -o " + save_ASM + " " + filepath);
                    pb.directory(new File(newpath));

                    Process p = pb.start();
                    p.waitFor();
                    int x = p.exitValue();

                    if (x == 0) {
                        terminal.setForeground(Color.GREEN);
                        terminal.setText("Assembly generated in -> " + save_ASM);
                    } else {
                        BufferedReader r = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                        String out;
                        terminal.setText("");
                        while ((out = r.readLine()) != null) {
                            terminal.setForeground(Color.RED);
                            terminal.setText(out + System.getProperty("line.separator"));
                        }
                    }
                } catch (IOException | InterruptedException exp) {
                    JOptionPane.showMessageDialog(null, "Error en -> " + exp.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "No contiene código");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error en -> " + e.getMessage());
        }
    }//GEN-LAST:event_genASMActionPerformed

    private void sysExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sysExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_sysExitActionPerformed

    private void genIntermediateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genIntermediateActionPerformed
        // TODO add your handling code here:
        try {

            String data = code.getText(), filepath = c.Compile();
            File file = new File(filepath);
            String path = file.getPath();
            String name = file.getName().substring(0, file.getName().lastIndexOf("."));
            String newpath = path.substring(0, path.lastIndexOf(File.separator)) + "\\CodeEditor";
            String save_ASM = newpath + "\\" + name + ".i";

            if (data != null) {
                ProcessBuilder pb;
                try {
                    pb = new ProcessBuilder("cmd", "/C", "g++ " + "-S -save-temps" + " -o " + save_ASM + " " + filepath);
                    pb.directory(new File(newpath));

                    Process p = pb.start();
                    p.waitFor();
                    int x = p.exitValue();

                    if (x == 0) {
                        terminal.setForeground(Color.GREEN);          
                        //terminal.setForeground(new Color(193,232,60));
                        terminal.setText("Intermediate Code generated in -> " + save_ASM);
                    } else {
                        BufferedReader r = new BufferedReader(new InputStreamReader(p.getErrorStream()));
                        String out;
                        terminal.setText("");
                        while ((out = r.readLine()) != null) {
                            terminal.setForeground(Color.RED);
                            // terminal.setForeground(new Color(222,240,254));
                            terminal.setText(out + System.getProperty("line.separator"));
                        }
                    }
                } catch (IOException | InterruptedException exp) {
                    JOptionPane.showMessageDialog(null, "Error en -> " + exp.getMessage());
                }
            } else {
                JOptionPane.showMessageDialog(null, "No contiene código");
            }
        } catch (HeadlessException e) {
            JOptionPane.showMessageDialog(null, "Error en -> " + e.getMessage());
        }
    }//GEN-LAST:event_genIntermediateActionPerformed

    private void CutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CutActionPerformed

        // Codigo para cortar
        try {
            code.cut();
        } catch (Exception exp) {
            JOptionPane.showMessageDialog(null, "Error en -> " + exp.getMessage());
        }
    }//GEN-LAST:event_CutActionPerformed

    private void terminalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_terminalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_terminalActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(guiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(guiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(guiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(guiForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {           
            new guiForm().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Compile;
    private javax.swing.JMenuItem Cut;
    private javax.swing.JMenuItem Paste;
    private javax.swing.JButton Run;
    private javax.swing.JTextArea code;
    private javax.swing.JMenuItem copyAll;
    private javax.swing.JMenuItem genASM;
    private javax.swing.JMenuItem genIntermediate;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenuItem openFile;
    private javax.swing.JMenuItem saveFile;
    private javax.swing.JMenuItem sysExit;
    private javax.swing.JTextField terminal;
    // End of variables declaration//GEN-END:variables
}
