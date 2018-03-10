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
package argha.meme.Utils;

import java.awt.Rectangle;
import java.awt.event.*;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DesignerUtil implements MouseListener, MouseMotionListener, MouseWheelListener {

    private int xTopMouse;
    private int yTopMouse;
    private int xBottomMouse;
    private int yBottomMouse;
    private JPanel component;
    private Rectangle rectTop, rectBottom;
    private int rectTopX = 172, rectTopY = 56, rectBottomX = 157, rectBottomY = 447;

    public int getRectTopX() {
        return rectTopX;
    }

    public int getRectTopY() {
        return rectTopY;
    }

    public int getRectBottomX() {
        return rectBottomX;
    }

    public int getRectBottomY() {
        return rectBottomY;
    }

    public void registerTop(Rectangle rectTop) {
        this.rectTop = rectTop;
    }

    public void registerBottom(Rectangle rectBottom) {
        this.rectBottom = rectBottom;
    }

    public DesignerUtil(JPanel component) {
        this.component = component;
        component.addMouseListener(this);
        component.addMouseMotionListener(this);
        component.addMouseWheelListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        
    }

    @Override
    public void mousePressed(MouseEvent e) {
        xTopMouse = rectTop.x - e.getX();
        yTopMouse = rectTop.y - e.getY();

        xBottomMouse = rectBottom.x - e.getX();
        yBottomMouse = rectBottom.y - e.getY();
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
    public void mouseWheelMoved(MouseWheelEvent e) {

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        if (rectTop.contains(e.getX(), e.getY())) {
            rectTop.setLocation(xTopMouse + e.getX(), yTopMouse + e.getY());
            this.rectTopX = xTopMouse + e.getX();
            this.rectTopY = yTopMouse + e.getY();
        }
        if (rectBottom.contains(e.getX(), e.getY())) {
            rectBottom.setLocation(xBottomMouse + e.getX(), yBottomMouse + e.getY());
            this.rectBottomX = xBottomMouse + e.getX();
            this.rectBottomY = yBottomMouse + e.getY();
        }
        component.repaint();
    }

    @Override
    public void mouseMoved(MouseEvent e) {

    }
}
