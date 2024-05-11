package com.wecare.assets.custom_controls.model;

import java.awt.AlphaComposite;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import javax.swing.JButton;
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class CustomCardButton extends JButton {

    public int getRoundness() {
        return roundness;
    }
    
    public void setRoundness(int roundness) {
        this.roundness = roundness;
    }

    public Color getEffectColor() {
        return effectColor;
    }

    public void setEffectColor(Color effectColor) {
        this.effectColor = effectColor;
    }
    
    public Color getColor_top() {
        return color_top;
    }

    public void setColor_top(Color color_top) {
        this.color_top = color_top;
        t = this.color_top;
    }

    public Color getColor_bottom() {
        return color_bottom;
    }

    public void setColor_bottom(Color color_bottom) {
        this.color_bottom = color_bottom;
        b = this.color_bottom;
    }

    public CustomCardButton() {
        this.effectColor = new Color(173, 173, 173);
        roundness = 5;
        color_top = Color.decode("#ffffff");
        color_bottom = Color.decode("#505050");
        setContentAreaFilled(false);
        setBorder(new EmptyBorder(5, 0, 5, 0));
        setBackground(Color.WHITE);
        setCursor(new Cursor(Cursor.HAND_CURSOR));
        addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                targetSize = Math.max(getWidth(), getHeight()) * 2;
                animatSize = 0;
                pressedPoint = me.getPoint();
                alpha = 0.5f;
                if (animator.isRunning()) {
                    animator.stop();
                }
                animator.start();
            }

            @Override
            public void mouseExited(MouseEvent e) {
                color_top = t;
                color_bottom = b;
                e.consume();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                final double factor = 0.9;
                color_top = new Color(
                        (int)(t.getRed()*factor),
                        (int)(t.getGreen()*factor), 
                        (int)(t.getBlue()*factor)
                );
                color_bottom = new Color(
                        (int)(b.getRed()*factor),
                        (int)(b.getGreen()*factor), 
                        (int)(b.getBlue()*factor)
                );
                e.consume();
            }
            
            
        });
        TimingTarget target = new TimingTargetAdapter() {
            @Override
            public void timingEvent(float fraction) {
                if (fraction > 0.5f) {
                    alpha = 1 - fraction;
                }
                animatSize = fraction * targetSize;
                repaint();
            }
        };
        animator = new Animator(400, target);
    }
    
    @Override
    protected void paintComponent(Graphics grphcs) {
        int width = getWidth();
        int height = getHeight();
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color_top, 0, getHeight(), color_bottom);
        g2.setColor(getBackground());
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, width, height, roundness, roundness);
        g2.setColor(new Color(255, 255, 255, 50));
        g2.fillOval(getWidth() - (getHeight() / 2), 10, getHeight(), getHeight());
        g2.fillOval(getWidth() - (getHeight() / 2) - 20, getHeight() / 2 + 20, getHeight(), getHeight());
        if (pressedPoint != null) {
            g2.setColor(effectColor);
            g2.setComposite(AlphaComposite.getInstance(AlphaComposite.SRC_ATOP, alpha));
            g2.fillOval((int) (pressedPoint.x - animatSize / 2), (int) (pressedPoint.y - animatSize / 2), (int) animatSize, (int) animatSize);
        }
        g2.dispose();
        grphcs.drawImage(img, 0, 0, null);
        super.paintComponent(grphcs);
    }
    
    private Animator animator;
    private int targetSize;
    private float animatSize;
    private Point pressedPoint;
    private float alpha;
    private Color effectColor;
    private Color color_top;
    private Color color_bottom;
    private int roundness;
    private Color t;
    private Color b;
}
