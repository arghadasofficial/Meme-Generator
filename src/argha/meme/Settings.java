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

import argha.meme.generatorCompnent.Canvas;
import java.awt.Color;

/**
 * This class will be accepting all the components such as Canvas, MemeImage,
 * Bottom Text, Top Text for making the Meme.
 *
 * @author Argha Das
 */
public class Settings {

    /**
     * NOTE : We are not going to use canvas variable to access the Canvas class
     * instead we will be calling methods from the canvasSettings class to apply
     * the settings to Canvas.
     */
    //Variables
    private CanvasSettings canvasSettings;
    private Canvas canvas;

    /**
     *
     * @param canvas
     */
    public Settings(Canvas canvas) {
        canvasSettings = new CanvasSettings();
        this.canvas = canvas;
    }

    /**
     *
     * @param width
     * @param height
     */
    public void setCanvasSize(float width, float height) {
        canvasSettings.applySize(canvas, width, height);
    }

    /**
     *
     * @param color
     */
    public void setCanvasBackground(Color color) {
        canvasSettings.applyColour(canvas, color);
    }
}
