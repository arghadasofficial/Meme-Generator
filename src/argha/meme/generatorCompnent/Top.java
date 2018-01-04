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
import javax.swing.JComponent;

public class Top extends JComponent {

    private String text = "TOP TEXT";
    private Color fColor = Color.BLACK;
    private Color bColor = Color.GREEN;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D g2d = (Graphics2D) g;
        Font font = new Font("Serif", Font.PLAIN, 50);
        g2d.setFont(font);
        g2d.drawString(text, 0, 50);
        changeText(text);
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
}
