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

import argha.meme.Utils.DesignerUtil;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import javax.swing.JPanel;

public class Designer extends JPanel {

    //DesignerUtil
    private DesignerUtil designerUtil;

    //Image Variables
    private Color color = Color.BLACK;
    private Image image = null;

    //Top Variables
    private Rectangle top = new Rectangle(10, 10, 50, 50);
    private Color topColor = Color.WHITE;
    private Color topTextColor = Color.WHITE;
    private int topTextSize = 50;
    private String topText = "TOP";

    //Bottom Variables
    private Rectangle bottom = new Rectangle(100, 10, 50, 50);
    private Color bottomColor = Color.WHITE;
    private Color bottomTextColor = Color.WHITE;
    private int bottomTextSize = 50;
    private String bottomText = "BOTTOM";

    //Helper properties
    int topWidth, topHeight;
    int bottomWidth, bottomHeight;

    public Designer() {
        designerUtil = new DesignerUtil(this);
        designerUtil.registerTop(top);
        designerUtil.registerBottom(bottom);
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D graphics = (Graphics2D) g.create();

        //Paint Image
        graphics.setColor(color);
        setBackground(color);
        graphics.drawImage(image, 0, 0, this);

        //Paint Top
        graphics.setPaint(topColor);
        graphics.draw(top);
        graphics.setPaint(topTextColor);
        Font topFont = new Font("Tahoma", Font.BOLD, topTextSize);
        graphics.setFont(topFont);
        graphics.drawString(topText, designerUtil.getRectTopX(), designerUtil.getRectTopY());

        //Paint Bottom
        graphics.setPaint(bottomColor);
        graphics.draw(bottom);
        graphics.setPaint(bottomTextColor);
        Font bottomFont = new Font("Tahoma", Font.BOLD, bottomTextSize);
        graphics.setFont(bottomFont);
        graphics.drawString(bottomText, designerUtil.getRectBottomX(), designerUtil.getRectBottomY());
    }

    public void storeImage(Image img) {
        this.image = img;
        repaint();
    }

    public void enableHelper() {
        top.height = topHeight;
        top.width = topWidth;
        bottom.height = bottomHeight;
        bottom.width = bottomWidth;

        repaint();
    }

    public void disableHelpers() {
        topWidth = top.width;
        topHeight = top.height;
        top.height = -1;
        top.width = -1;
        bottomWidth = bottom.width;
        bottomHeight = bottom.height;
        bottom.height = -1;
        bottom.width = -1;
        repaint();
    }

    public void changeTopSize(int size) {
        this.topTextSize = size;
        repaint();

    }

    public void changeTopText(String text) {
        this.topText = text;
        repaint();
    }

    public void changeTopTextColor(Color c) {
        this.topTextColor = c;
        repaint();
    }

    public void changeBottomSize(int size) {
        bottomTextSize = size;
        repaint();
    }

    public void changeBottomText(String text) {
        this.bottomText = text;
        repaint();
    }

    public void changeBottomTextColor(Color c) {
        this.bottomTextColor = c;
        repaint();
    }

}
