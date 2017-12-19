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

import java.awt.Component;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

/**
 * This class simply takes Output File Name and The Component which needed to be
 * converted to a Png file through setters and generates a Png file which
 * contains the Components in Image format.
 *
 * @author Argha Das
 */
public class Save {

    //
    private Component component;
    private String fileName;

    /**
     *
     * @param component
     */
    public void setComponent(Component component) {
        this.component = component;
    }

    /**
     *
     * @param fileName
     */
    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    /**
     *
     */
    public void saveComponent() {
        BufferedImage img = getCompoment(component);
        try {
            ImageIO.write(img, "png", new File(fileName + ".png"));
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    /**
     *
     * @param c
     * @return
     */
    private BufferedImage getCompoment(Component c) {
        if (c != null) {
            BufferedImage bufferedImage = new BufferedImage(c.getWidth(), c.getHeight(), BufferedImage.TYPE_INT_ARGB);
            c.paint(bufferedImage.getGraphics());
            return bufferedImage;
        }
        return null;
    }
}
