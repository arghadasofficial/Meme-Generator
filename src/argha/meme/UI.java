/*
 * Copyright (C) 2017 Argha Das
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

import argha.util.Fullscreen;
import javax.swing.JRootPane;

public class UI extends javax.swing.JFrame {

    Fullscreen screen;
    Save save;

    public UI() {
        save = new Save();
        initComponents();
        screen = new Fullscreen(this, false);
        //screen.DoTheWorkFor();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        canvas1 = new argha.meme.generatorCompnent.Canvas();
        top1 = new argha.meme.generatorCompnent.Top();
        memeImage1 = new argha.meme.generatorCompnent.MemeImage();
        menuBar = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        pickImage = new javax.swing.JMenuItem();
        saveImage = new javax.swing.JMenuItem();
        seperator = new javax.swing.JPopupMenu.Separator();
        exitApplication = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        updateTool = new javax.swing.JMenuItem();
        aboutDeveloper = new javax.swing.JMenuItem();

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Meme Generator");

        canvas1.setLayout(null);
        canvas1.add(top1);
        top1.setBounds(6, 0, 420, 70);
        canvas1.add(memeImage1);
        memeImage1.setBounds(0, 0, 430, 370);

        fileMenu.setText("File");

        pickImage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        pickImage.setText("Pick Image");
        fileMenu.add(pickImage);

        saveImage.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveImage.setText("Save");
        saveImage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveImageActionPerformed(evt);
            }
        });
        fileMenu.add(saveImage);
        fileMenu.add(seperator);

        exitApplication.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_X, java.awt.event.InputEvent.CTRL_MASK));
        exitApplication.setText("Exit");
        fileMenu.add(exitApplication);

        menuBar.add(fileMenu);

        helpMenu.setText("Help");

        updateTool.setText("Update");
        helpMenu.add(updateTool);

        aboutDeveloper.setText("About");
        helpMenu.add(aboutDeveloper);

        menuBar.add(helpMenu);

        setJMenuBar(menuBar);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 429, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(canvas1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveImageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveImageActionPerformed
        save.setFileName("output");
        save.setComponent(canvas1);
        save.saveComponent();
    }//GEN-LAST:event_saveImageActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Metal".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }

        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new UI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem aboutDeveloper;
    private argha.meme.generatorCompnent.Canvas canvas1;
    private javax.swing.JMenuItem exitApplication;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JPanel jPanel7;
    private argha.meme.generatorCompnent.MemeImage memeImage1;
    private javax.swing.JMenuBar menuBar;
    private javax.swing.JMenuItem pickImage;
    private javax.swing.JMenuItem saveImage;
    private javax.swing.JPopupMenu.Separator seperator;
    private argha.meme.generatorCompnent.Top top1;
    private javax.swing.JMenuItem updateTool;
    // End of variables declaration//GEN-END:variables
}
