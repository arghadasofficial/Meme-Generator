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

import argha.meme.generatorCompnent.Designer;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.File;
import javax.swing.JFileChooser;

public class ImageUtil {

    private Image img;
    private Save save = new Save();

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

    public void saveAs(Designer designer) {
        File file = saveImage();
        save.setOuputData(designer, file.getAbsolutePath());
        save.saveComponent();
    }

    private File saveImage() {
        File file = null;
        File f = new File(getCurrentDir());
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setCurrentDirectory(f);
        int result = fileChooser.showSaveDialog(null);
        if (result == JFileChooser.APPROVE_OPTION) {
            file = fileChooser.getSelectedFile();
            return file;
        }
        return file;
    }

    public String getCurrentDir() {
        String currentDir = System.getProperty("user.dir");
        System.out.println(currentDir);
        return currentDir;
    }
}
