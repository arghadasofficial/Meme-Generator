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
package argha.meme;

import argha.meme.Utils.ImageUtil;
import argha.meme.Utils.Save;
import argha.meme.generatorCompnent.Designer;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class UI_Controller {

    private JFrame frame;
    private ImageUtil imageUtil;
    private Save save;
    private Properties propWindow;
    private About aboutWindow;
    private Designer designer;

    public UI_Controller() {
        imageUtil = new ImageUtil();
        save = new Save();
        propWindow = new Properties(true);
        aboutWindow = new About(true);
        propWindow.register(designer);
    }

    public void registerDesigner(Designer designer) {
        this.designer = designer;
    }

    public void registerFrame(JFrame frame) {
        this.frame = frame;
    }

    public void pickImage() {
        designer.storeImage(imageUtil.scaleIt(designer.getWidth(), designer.getHeight()));
    }

    public void saveImage() {
        designer.disableHelpers();
        String name = getName();
        if (name != null) {
            save.setOuputData(designer, name);
            save.saveComponent();
            if (save.isSaved()) {
                String output_name = save.getFileName() + save.getFormat();
                String output_location = save.getLocation();
                JOptionPane.showMessageDialog(frame, " Name : " + output_name + "\n" + "Location : " + output_location, "File is saved", 0);
            }
        } else {
            System.out.println("Its Null");
        }
    }

    private String getName() {
        String name = JOptionPane.showInputDialog(frame, "Enter File Name :", "File name", 1);
        if (name == null || name.isEmpty()) {
            return null;
        }
        return name;
    }

    void saveAs() {
        
    }
}
