/*
 * Copyright (C) 2018 Argha Das
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package argha.meme;

public class UI extends javax.swing.JFrame {
    
    UI_Controller controller;
    
    public UI() {
        controller = new UI_Controller();
        initComponents();
        controller.registerFrame(this);
        controller.registerDesigner(designer);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jEditorPane1 = new javax.swing.JEditorPane();
        designer = new argha.meme.generatorCompnent.Designer();
        jMenuBar1 = new javax.swing.JMenuBar();
        saveAs = new javax.swing.JMenu();
        pickImg = new javax.swing.JMenuItem();
        saveImg = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        exit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        enableHelper = new javax.swing.JMenuItem();
        disableHelper = new javax.swing.JMenuItem();
        properties = new javax.swing.JMenuItem();
        about = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        jScrollPane1.setViewportView(jEditorPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meme Maker v1.0");
        setResizable(false);

        javax.swing.GroupLayout designerLayout = new javax.swing.GroupLayout(designer);
        designer.setLayout(designerLayout);
        designerLayout.setHorizontalGroup(
            designerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        designerLayout.setVerticalGroup(
            designerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );

        saveAs.setText("File");

        pickImg.setText("Pick Image");
        pickImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pickImgActionPerformed(evt);
            }
        });
        saveAs.add(pickImg);

        saveImg.setText("Save Image");
        saveImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveImgActionPerformed(evt);
            }
        });
        saveAs.add(saveImg);

        jMenuItem2.setText("Save As");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        saveAs.add(jMenuItem2);

        exit.setText("Exit");
        exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitActionPerformed(evt);
            }
        });
        saveAs.add(exit);

        jMenuBar1.add(saveAs);

        jMenu2.setText("Tools");

        jMenu4.setText("Helper");

        enableHelper.setText("Enable");
        enableHelper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enableHelperActionPerformed(evt);
            }
        });
        jMenu4.add(enableHelper);

        disableHelper.setText("Disable");
        disableHelper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                disableHelperActionPerformed(evt);
            }
        });
        jMenu4.add(disableHelper);

        jMenu2.add(jMenu4);

        properties.setText("Properties");
        properties.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                propertiesActionPerformed(evt);
            }
        });
        jMenu2.add(properties);

        jMenuBar1.add(jMenu2);

        about.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        about.add(jMenuItem1);

        jMenuBar1.add(about);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(designer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(designer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pickImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pickImgActionPerformed
        controller.pickImage();
    }//GEN-LAST:event_pickImgActionPerformed

    private void saveImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImgActionPerformed
        controller.saveImage();
    }//GEN-LAST:event_saveImgActionPerformed

    private void exitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_exitActionPerformed

    private void enableHelperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enableHelperActionPerformed
        designer.enableHelper();
    }//GEN-LAST:event_enableHelperActionPerformed

    private void disableHelperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_disableHelperActionPerformed
        designer.disableHelpers();
    }//GEN-LAST:event_disableHelperActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        //aboutWindow.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void propertiesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_propertiesActionPerformed
        //propWindow.show();
    }//GEN-LAST:event_propertiesActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        controller.saveAs();
    }//GEN-LAST:event_jMenuItem2ActionPerformed
    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                    
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu about;
    private argha.meme.generatorCompnent.Designer designer;
    private javax.swing.JMenuItem disableHelper;
    private javax.swing.JMenuItem enableHelper;
    private javax.swing.JMenuItem exit;
    private javax.swing.JEditorPane jEditorPane1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem pickImg;
    private javax.swing.JMenuItem properties;
    private javax.swing.JMenu saveAs;
    private javax.swing.JMenuItem saveImg;
    // End of variables declaration//GEN-END:variables
}
