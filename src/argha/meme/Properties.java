/*
 * Copyright (C) 2018 shadestreak
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

import argha.meme.generatorCompnent.Designer;
import java.awt.Color;
import javax.swing.JColorChooser;

/**
 *
 * @author shadestreak
 */
public class Properties extends javax.swing.JDialog {

    private Designer designer;

    /**
     * Creates new form Properties
     */
    public Properties(boolean modal) {
        initComponents();
    }
    
    public void register(Designer designer){
        this.designer = designer;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        topText = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bottomText = new javax.swing.JTextField();
        topSize = new javax.swing.JSlider();
        botttomSize = new javax.swing.JSlider();
        topColor = new javax.swing.JButton();
        bottomColor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Properties");

        jLabel1.setText("Top");

        topText.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                topTextCaretUpdate(evt);
            }
        });

        jLabel2.setText("Bottom");

        bottomText.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                bottomTextCaretUpdate(evt);
            }
        });

        topSize.setMaximum(50);
        topSize.setMinimum(4);
        topSize.setMinorTickSpacing(5);
        topSize.setPaintLabels(true);
        topSize.setPaintTicks(true);
        topSize.setSnapToTicks(true);
        topSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                topSizeStateChanged(evt);
            }
        });

        botttomSize.setMaximum(50);
        botttomSize.setMinimum(4);
        botttomSize.setMinorTickSpacing(5);
        botttomSize.setPaintLabels(true);
        botttomSize.setPaintTicks(true);
        botttomSize.setSnapToTicks(true);
        botttomSize.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                botttomSizeStateChanged(evt);
            }
        });

        topColor.setText("Top Color");
        topColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                topColorActionPerformed(evt);
            }
        });

        bottomColor.setText("Bottom Color");
        bottomColor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bottomColorActionPerformed(evt);
            }
        });

        jLabel3.setText("Top Size");

        jLabel4.setText("Bottom Size");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bottomText)
                    .addComponent(topText, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(topSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(botttomSize, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(bottomColor, javax.swing.GroupLayout.Alignment.TRAILING)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(topColor)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {botttomSize, topSize});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(3, 3, 3)
                .addComponent(topSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(topColor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addGap(3, 3, 3)
                .addComponent(botttomSize, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bottomColor)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void topTextCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_topTextCaretUpdate
        designer.changeTopText(topText.getText());
    }//GEN-LAST:event_topTextCaretUpdate

    private void bottomTextCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_bottomTextCaretUpdate
        designer.changeBottomText(bottomText.getText());
    }//GEN-LAST:event_bottomTextCaretUpdate

    private void botttomSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_botttomSizeStateChanged
        designer.changeBottomSize(botttomSize.getValue());
    }//GEN-LAST:event_botttomSizeStateChanged

    private void topSizeStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_topSizeStateChanged
        designer.changeTopSize(topSize.getValue());
    }//GEN-LAST:event_topSizeStateChanged

    private void topColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_topColorActionPerformed
        Color color =  JColorChooser.showDialog(this, "Pick Color", Color.WHITE);
        designer.changeTopTextColor(color);
    }//GEN-LAST:event_topColorActionPerformed

    private void bottomColorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bottomColorActionPerformed
        Color color =  JColorChooser.showDialog(this, "Pick Color", Color.WHITE);
        designer.changeBottomTextColor(color);
    }//GEN-LAST:event_bottomColorActionPerformed

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
            java.util.logging.Logger.getLogger(Properties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Properties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Properties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Properties.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Properties dialog = new Properties(true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bottomColor;
    private javax.swing.JTextField bottomText;
    private javax.swing.JSlider botttomSize;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JButton topColor;
    private javax.swing.JSlider topSize;
    private javax.swing.JTextField topText;
    // End of variables declaration//GEN-END:variables
}
