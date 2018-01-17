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
package argha.meme.Utils;

import java.awt.Component;
import java.awt.image.BufferedImage;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;

public class Save {

    private Component component;
    private String fileName;
    private String location;
    private File file;
    private Boolean saved;
    private BufferedImage image;
    private String format = ".png";

    public Boolean isSaved() {
        return saved;
    }

    public String getLocation() {
        return location;
    }

    public String getFileName() {
        return fileName;
    }

    public String getFormat() {
        return format;
    }

    public void setOuputData(Component component, String fileName) {
        this.component = component;
        this.fileName = fileName;
    }

    public void saveComponent() {
        image = resgisterComponent(component);
        checkLocation();
        try {
            ImageIO.write(image, format.replace(".", ""), file);
            checkExistence();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
    }

    private BufferedImage resgisterComponent(Component c) {
        if (c != null) {
            BufferedImage bufferedImage = new BufferedImage(c.getWidth(), c.getHeight(), BufferedImage.TYPE_INT_ARGB);
            c.paint(bufferedImage.getGraphics());
            return bufferedImage;
        }
        return null;
    }

    private void checkLocation() {
        if (location == null) {
            file = new File(fileName + format);
        } else if (location != null) {
            file = new File(location + fileName + format);
        } else {
            System.out.println("Error encountered while processing image");
        }
    }

    private void checkExistence() {
        if (file.exists()) {
            saved = true;
            location = file.getAbsolutePath();
        } else {
            saved = false;
        }
    }
}
