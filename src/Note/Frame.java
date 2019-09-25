//********************
//*DovgaNik 2018-2019*
//********************
package Note;

import File_operations.*;
import encrypt.AES;
import org.ini4j.*;
import java.io.*;

public class Frame extends javax.swing.JFrame {
    
    int posX=0,posY=0;
    // <editor-fold defaultstate="collapsed" desc="File operations objects">
    file_read reader = new file_read();
    file_write writer = new file_write();
    file_print printer = new file_print();
    AES encrypter = new AES();
    // </editor-fold> 
    // <editor-fold defaultstate="collapsed" desc="Configuration variables">
    String config_file = // <editor-fold defaultstate="collapsed" desc="Default config file">        
            "[My_Note]\n" +
"\tfile_name = note\n" +
"\tauto_read = true\n" + 
"\tencrypt = false";
    // </editor-fold>
    String config_file_name = "config"; //config file name
    String note_file_name; 
    boolean auto_read;
    boolean encrypt;
    boolean checked;
    String password;
    // </editor-fold>
    
public Frame() {
        initComponents();
        sets();
        if(encrypt){
            checkPass();
        }
        if(auto_read){
            read(false);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jL_Out = new javax.swing.JLabel();
        jL_Search = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Note = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jT_Find = new javax.swing.JTextArea();
        jMB = new javax.swing.JMenuBar();
        jM_File = new javax.swing.JMenu();
        jMI_Read = new javax.swing.JMenuItem();
        jMI_Write = new javax.swing.JMenuItem();
        jM_Edit = new javax.swing.JMenu();
        jMI_Clean = new javax.swing.JMenuItem();
        jMI_Find = new javax.swing.JMenuItem();
        jMI_Print = new javax.swing.JMenuItem();
        jM_Tools = new javax.swing.JMenu();
        jMI_Open_Config = new javax.swing.JMenuItem();
        jMI_Save_Config = new javax.swing.JMenuItem();
        jMI_Check_Password = new javax.swing.JMenuItem();
        jM_Help = new javax.swing.JMenu();
        jMI_ReadMe = new javax.swing.JMenuItem();
        jMI_Info = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Note");
        setLocationByPlatform(true);
        setName("Note"); // NOI18N

        jL_Out.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico/Notepad.png"))); // NOI18N

        jL_Search.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jL_Search.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jL_Search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico/Find.png"))); // NOI18N
        jL_Search.setText("Search and config area");
        jL_Search.setName(""); // NOI18N

        jT_Note.setColumns(20);
        jT_Note.setRows(5);
        jScrollPane1.setViewportView(jT_Note);

        jT_Find.setColumns(5);
        jT_Find.setRows(5);
        jScrollPane2.setViewportView(jT_Find);

        jM_File.setText("File");

        jMI_Read.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        jMI_Read.setText("Read");
        jMI_Read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_ReadActionPerformed(evt);
            }
        });
        jM_File.add(jMI_Read);

        jMI_Write.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMI_Write.setText("Write");
        jMI_Write.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_WriteActionPerformed(evt);
            }
        });
        jM_File.add(jMI_Write);

        jMB.add(jM_File);

        jM_Edit.setText("Edit");

        jMI_Clean.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jMI_Clean.setText("Clean");
        jMI_Clean.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_CleanActionPerformed(evt);
            }
        });
        jM_Edit.add(jMI_Clean);

        jMI_Find.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F, java.awt.event.InputEvent.CTRL_MASK));
        jMI_Find.setText("Find");
        jMI_Find.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_FindActionPerformed(evt);
            }
        });
        jM_Edit.add(jMI_Find);

        jMI_Print.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMI_Print.setText("Print");
        jMI_Print.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_PrintActionPerformed(evt);
            }
        });
        jM_Edit.add(jMI_Print);

        jMB.add(jM_Edit);

        jM_Tools.setText("Tools");

        jMI_Open_Config.setText("Open config");
        jMI_Open_Config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Open_ConfigActionPerformed(evt);
            }
        });
        jM_Tools.add(jMI_Open_Config);

        jMI_Save_Config.setText("Save config");
        jMI_Save_Config.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Save_ConfigActionPerformed(evt);
            }
        });
        jM_Tools.add(jMI_Save_Config);

        jMI_Check_Password.setText("Check password");
        jMI_Check_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_Check_PasswordActionPerformed(evt);
            }
        });
        jM_Tools.add(jMI_Check_Password);

        jMB.add(jM_Tools);

        jM_Help.setText("Help");

        jMI_ReadMe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F1, 0));
        jMI_ReadMe.setText("ReadMe");
        jMI_ReadMe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_ReadMeActionPerformed(evt);
            }
        });
        jM_Help.add(jMI_ReadMe);

        jMI_Info.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F2, 0));
        jMI_Info.setText("Info");
        jMI_Info.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMI_InfoActionPerformed(evt);
            }
        });
        jM_Help.add(jMI_Info);

        jMB.add(jM_Help);

        setJMenuBar(jMB);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 811, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addComponent(jScrollPane2)))
            .addComponent(jL_Out, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jL_Search)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jL_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    void checkPass(){
        jT_Find.setText("Plese enter your password\nin next line:\n");
        jMI_Write.setEnabled(false);
        jMI_Read.setEnabled(false);
        auto_read = false;
    }
    
    void sets(){
        if(reader.read(config_file_name) != "1"){
            if(reader.read(config_file_name) != "2"){
                config_file = reader.read(config_file_name);       
            }else{
                writer.write(config_file, config_file_name);
            }
        }else{
                writer.write(config_file, config_file_name);
        }
        try{
            Wini config = new Wini(new File(config_file_name)); //config file name
            note_file_name = config.get("My_Note", "file_name", String.class);
            auto_read = config.get("My_Note", "auto_read", boolean.class);
            encrypt = config.get("My_Note", "encrypt", boolean.class);
        }catch(IOException ex){
            jL_Out.setText("Config reading error!!!! (IOException) :-(");
        }
    }
    
    private void read(boolean message){
        if(message){
            jL_Out.setText("Reading from file...");
        }
        if(encrypt){
            if(reader.read(note_file_name) == "1"){
                jL_Out.setText("Reading error!!!! (File not found) :-(");
            }else{if(reader.read(note_file_name) == "2"){
                jL_Out.setText("Reading error!!!! (IOException) :-(");
            }else{
                jT_Note.setText(AES.decrypt(reader.read(note_file_name), password));
            }}
        }else{
            if(reader.read(note_file_name) == "1"){
                jL_Out.setText("Reading error!!!! (File not found) :-(");
            }else{if(reader.read(note_file_name) == "2"){
                jL_Out.setText("Reading error!!!! (IOException) :-(");
            }else{
                jT_Note.setText(reader.read(note_file_name));
            }}
        }
    }
    
    private void jMI_ReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_ReadActionPerformed
        //Reading from the file
        read(true);
    }//GEN-LAST:event_jMI_ReadActionPerformed

    private void jMI_CleanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_CleanActionPerformed
        //Cleaning the text fild
        jL_Out.setText("Cleaning...");
        jT_Note.setText(null);
    }//GEN-LAST:event_jMI_CleanActionPerformed

    private void jMI_WriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_WriteActionPerformed
        //Wiriting to file
        jL_Out.setText("Writing to file...");
        if(!encrypt){
            if(writer.write(jT_Note.getText(), note_file_name) == "1"){
                jL_Out.setText("Writing error!!!! (IOException) :-(");
            }
        }else{
            if(writer.write(AES.encrypt(jT_Note.getText(), password), note_file_name) == "1"){
                jL_Out.setText("Writing error!!!! (IOException) :-(");
            }
        }
    }//GEN-LAST:event_jMI_WriteActionPerformed

    private void jMI_FindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_FindActionPerformed
        //Search
        int i = 0;
        String search_phrase = jT_Find.getText();
        String [] lines = jT_Note.getText().split("\n", 10000);
        boolean [] lines_contains;
        jT_Find.setText(null);
        while(i < 10000){
            if(lines [i].contains(search_phrase)){
                jT_Find.setText(jT_Find.getText() + search_phrase + " is on " + i + "\n");    
            }
            i++;
        }
    }//GEN-LAST:event_jMI_FindActionPerformed

    private void jMI_PrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_PrintActionPerformed
        if(printer.print(jT_Note.getText()) == 1){
            jL_Out.setText("Printing error!!!!! (PrinterException) :-(");
        }else{
            jL_Out.setText("Printing text...");
        }
    }//GEN-LAST:event_jMI_PrintActionPerformed

    private void jMI_InfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_InfoActionPerformed
        //Info
        jL_Out.setText("Loading information...");
        jT_Note.setText(// <editor-fold defaultstate="collapsed" desc="Information">
                "\t\tCopyright DovgaNik 2018-2019© GitHub:https://github.com/DovgaNik/My-Notes\n\n\t\t\t        Version:2.0.3.1\n" 
                + "Changelog: \n\n" + "1.0.0.1:\n Added info button;\n\n1.0.1.1:\nFixed bug with 'null';\nFixed bug with lines;\n\n1.0.1.2:\nAdded changelog;\n\n1.0.2.2:\nAdd autoreading;\n\n1.1.0.0:\nWrite and read functions branched into different files in another package;\n\n1.1.0.1:\nAdded printing function;\n\n2.0.0.0:\n" + 
                "Changed GUI;\n" + "Added text search;\n" + "Added config file;\n" + "Added menu bar;\n\n" + "2.0.0.1:\n" + "Added ReadMe file;\n" + 
                "Added project to the GitHub;\n\n" + "2.0.2.0:\n" + "Added advanced serch;" + "\n\n2.0.3.0:\nAdded resizing of the window;\nAdded location by platform;" + "\n\n2.0.3.1:\nFixed bug with Ctrl-C buttons combination;");
        //</editor-fold>
    }//GEN-LAST:event_jMI_InfoActionPerformed

    private void jMI_Open_ConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Open_ConfigActionPerformed
        jT_Find.setText(reader.read(config_file_name));
    }//GEN-LAST:event_jMI_Open_ConfigActionPerformed

    private void jMI_Save_ConfigActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Save_ConfigActionPerformed
        writer.write(jT_Find.getText(), config_file_name);
        jT_Find.setText(null);
        sets();
    }//GEN-LAST:event_jMI_Save_ConfigActionPerformed

    private void jMI_ReadMeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_ReadMeActionPerformed
        jL_Out.setText("Loading ReadMe...");
        jT_Note.setText(// <editor-fold defaultstate="collapsed" desc="ReadMe">                
    "You can view the whole ReadMe file on https://github.com/DovgaNik/My-Notes\n\n" + "What is this programm for ?\n" +
    "---\n" +
    "This program is a simple and lightweight note taking app written on Java.\n" +
    "\n" +
    "How can I use it?\n" +
    "---\n" +
    "There are:\n" +
    "\n" +
    "1. Text areas\n" +
    "\n" +
    "    * Text area with your note\n" +
    "    * Seach area (config file will appear here)\n" +
    "\n" +
    "2. Labels\n" +
    "\n" +
    "    * Big one in the bottom of the window (errors and information about file operations will appear here)\n" +
    "    * Small one \n" +
    "\n" +
    "3. Menu (It contains some submenus)\n" +
    "\n" +
    "    * File\n" +
    "        * Read (Ctrl-O)\n" +
    "        * Write (Ctrl-S)\n" +
    "    * Edit\n" +
    "        * Clean (Ctrl-B)\n" +
    "        * Find (Ctrl-F)\n" +
    "        * Print (Ctrl-P)\n" +
    "    * Tools\n" +
    "        * Open config\n" +
    "        * Save config\n" +
    "    * Help\n" +
    "        * Readme (F1)\n" +
    "        * Info (F2)\n" +
    "\n" +
    "To use this app you need Java Runtime Environment installed. You can download it on the [official site](https://java.com/ru/download/) or if you're using Ubuntu \n" +
    "\n" +
    "`sudo apt-get install default-jre`\n" +
    "\n" +
    "This project depends ini4j You can download it on [their SourceForge](http://ini4j.sourceforge.net/)\n" +
    "\n" +
    "Some feathures:\n" +
    "---\n" +
    "\n" +
    "* Search (to use search enter search phrase into search text area and go to Edit --> Find or Ctrl-F)\n" +
    "* Print (to print text go to Edit --> Print Ctrl-P)\n" +
    "    \n" +
    "" );
// </editor-fold>
    }//GEN-LAST:event_jMI_ReadMeActionPerformed

    private void jMI_Check_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMI_Check_PasswordActionPerformed
        String [] passLines = jT_Find.getText().split("\n");
        password = passLines[2];
        
        jMI_Write.setEnabled(false);
        jMI_Read.setEnabled(false);
        
        read(false);
    }//GEN-LAST:event_jMI_Check_PasswordActionPerformed
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
 


        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jL_Out;
    private javax.swing.JLabel jL_Search;
    private javax.swing.JMenuBar jMB;
    private javax.swing.JMenuItem jMI_Check_Password;
    private javax.swing.JMenuItem jMI_Clean;
    private javax.swing.JMenuItem jMI_Find;
    private javax.swing.JMenuItem jMI_Info;
    private javax.swing.JMenuItem jMI_Open_Config;
    private javax.swing.JMenuItem jMI_Print;
    private javax.swing.JMenuItem jMI_Read;
    private javax.swing.JMenuItem jMI_ReadMe;
    private javax.swing.JMenuItem jMI_Save_Config;
    private javax.swing.JMenuItem jMI_Write;
    private javax.swing.JMenu jM_Edit;
    private javax.swing.JMenu jM_File;
    private javax.swing.JMenu jM_Help;
    private javax.swing.JMenu jM_Tools;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jT_Find;
    private javax.swing.JTextArea jT_Note;
    // End of variables declaration//GEN-END:variables
}
