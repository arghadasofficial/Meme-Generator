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

import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFileChooser;

/**
 *
 * @author Argha Das
 */
public class ImageUtil {

    private Image img;

    public Image scaleIt(int width, int height) {
        String file = loadImage();
        if (file != null) {
            Toolkit kit = Toolkit.getDefaultToolkit();
            img = kit.getImage(file);
            img = img.getScaledInstance(width, height, Image.SCALE_SMOOTH);
        } else {
            return null;
        }
        return img;
    }

    private String loadImage() {
        JFileChooser fc = new JFileChooser();
        fc.setFileFilter(new ImageFilter());
        int result = fc.showOpenDialog(null);
        File file = null;
        if (result == JFileChooser.APPROVE_OPTION) {
            file = fc.getSelectedFile();
            return file.getPath();
        } else {
            return null;
        }
    }

}
