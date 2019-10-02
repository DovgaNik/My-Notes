package Note;

public class ModernGUI extends javax.swing.JFrame {

    public ModernGUI() {
        initComponents();
    }

    //<editor-fold defaultstate="collapsed" desc="Variables">
        int posX, posY;
    //</editor-fold>
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        backGroundPanel = new javax.swing.JPanel();
        titlePanel = new javax.swing.JPanel();
        jToolBar1 = new javax.swing.JToolBar();
        closeButton = new javax.swing.JButton();
        iconLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("My Notes");
        setName("modernFrame"); // NOI18N
        setUndecorated(true);

        backGroundPanel.setBackground(new java.awt.Color(255, 255, 255));

        titlePanel.setBackground(new java.awt.Color(102, 0, 204));
        titlePanel.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                titlePanelMouseDragged(evt);
            }
        });
        titlePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                titlePanelMousePressed(evt);
            }
        });

        jToolBar1.setBackground(new java.awt.Color(102, 0, 204));
        jToolBar1.setFloatable(false);

        closeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico/closeButton30x30.png"))); // NOI18N
        closeButton.setBorder(null);
        closeButton.setBorderPainted(false);
        closeButton.setContentAreaFilled(false);
        closeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeButtonActionPerformed(evt);
            }
        });

        iconLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/ico/Notepad30x30.png"))); // NOI18N

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addComponent(iconLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 929, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(closeButton))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addComponent(iconLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(closeButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout backGroundPanelLayout = new javax.swing.GroupLayout(backGroundPanel);
        backGroundPanel.setLayout(backGroundPanelLayout);
        backGroundPanelLayout.setHorizontalGroup(
            backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        backGroundPanelLayout.setVerticalGroup(
            backGroundPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backGroundPanelLayout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(570, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(backGroundPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeButtonActionPerformed
        System.exit(0);
    }//GEN-LAST:event_closeButtonActionPerformed

    private void titlePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlePanelMousePressed
       posX=evt.getX();
       posY=evt.getY(); 
    }//GEN-LAST:event_titlePanelMousePressed

    private void titlePanelMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_titlePanelMouseDragged
       int x=evt.getXOnScreen();
       int y=evt.getYOnScreen();
       this.setLocation(x-posX, y-posY);
    }//GEN-LAST:event_titlePanelMouseDragged

    public static void main(String args[]) {
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ModernGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ModernGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ModernGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ModernGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ModernGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backGroundPanel;
    private javax.swing.JButton closeButton;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JPanel titlePanel;
    // End of variables declaration//GEN-END:variables
}
