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
package argha.meme.generatorCompnent;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.BorderFactory;
import javax.swing.JComponent;

public class Top extends JComponent implements MouseListener, MouseMotionListener {

    private String text = "TOP TEXT";
    private Color fColor = Color.BLACK;
    private Color bColor = Color.GREEN;

    private int x;
    private int y;

    public Top() {
        addMouseListener(this);
        addMouseMotionListener(this);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Font font = new Font("Serif", Font.PLAIN, 50);
        g2d.setFont(font);
        g2d.setPaint(fColor);
        g2d.drawString(text, 0, 50);
    }

    public void changeText(String text) {
        this.text = text;
        repaint();
    }

    public void changeForeground(Color c) {
        fColor = c;
        repaint();
    }

    public void changeBackground(Color c) {
        bColor = c;
        repaint();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {
        x = e.getX();
        y = e.getY();
        setBorder(BorderFactory.createLineBorder(Color.MAGENTA, 3));
    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println(e.getX() + " " + e.getY());
        e.getComponent().setLocation(e.getXOnScreen() - x, e.getYOnScreen() - y);
        repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {
        
    }
}
