package com.wecare.assets.custom_controls.model;

import java.awt.Color;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Insets;
import java.awt.RenderingHints;
import javax.swing.JPasswordField;

public class CustomPasswordField extends JPasswordField {

    public CustomPasswordField() {
        this.hint = "Password";
    }
    
    public final void setHint(String hint) {
        this.hint = hint;
    }

    @Override
    public void paint(Graphics grp) {
        super.paint(grp);
        if (getPassword().length == 0) {
            int h = getHeight();
            ((Graphics2D) grp).setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
            Insets ins = getInsets();
            FontMetrics fm = grp.getFontMetrics();
            int c0 = getBackground().getRGB();
            int c1 = getForeground().getRGB();
            int m = 0xfefefefe;
            int c2 = ((c0 & m) >>> 1) + ((c1 & m) >>> 1);
            grp.setColor(new Color(c2, true));
            grp.drawString(hint, ins.left, h / 2 + fm.getAscent() / 2 - 2);
        }
    }
    
    private String hint;
}
