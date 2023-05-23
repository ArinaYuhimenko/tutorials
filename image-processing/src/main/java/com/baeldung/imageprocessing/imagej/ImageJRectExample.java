package com.baeldung.imageprocessing.imagej;

import ij.IJ;
import ij.ImagePlus;
import ij.process.ImageProcessor;

import java.awt.*;

public class Rect {
    public static void main(String[] args) {
        ImagePlus imp = IJ.openImage(ImageJRectExample.class.getClassLoader().getResource("lena.jpg").getPath());
        drawRect(imp);
        imp.show();
    }

    private static void drawRect(ImagePlus imp) {
        Scanner in = new Scanner(System.in);
        int x = in.nextLine();
        int y = in.nextLine();
        int width = in.nextLine();
        int height = in.nextLine();
        ImageProcessor ip = imp.getProcessor();
        ip.setColor(Color.BLUE);
        ip.setLineWidth(4);
        ip.drawRect(x, y, imp.getWidth() - width, imp.getHeight() - height);
    }
}
