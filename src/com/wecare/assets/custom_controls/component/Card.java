package com.wecare.assets.custom_controls.component;

import com.wecare.assets.custom_controls.model.Model_Card;
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
import javax.swing.border.EmptyBorder;
import org.jdesktop.animation.timing.Animator;
import org.jdesktop.animation.timing.TimingTarget;
import org.jdesktop.animation.timing.TimingTargetAdapter;

public class Card extends javax.swing.JPanel {

    public int getFont_size() {
        return font_size;
    }

    public void setFont_size(int font_size) {
        this.font_size = font_size;
        this.lbl_title.setFont(new java.awt.Font("Century Gothic", 1, this.font_size)); // NOI18N
    }

    public Color getColor1() {
        return color1;
    }

    public void setColor1(Color color1) {
        this.color1 = color1;
        t = this.color1;
    }

    public Color getColor2() {
        return color2;
    }

    public void setColor2(Color color2) {
        this.color2 = color2;
        b = this.color2;
    }

    public Color getFont_color() {
        return font_color;
    }

    public void setFont_color(Color font_color) {
        this.font_color = font_color;
        lbl_title.setForeground(font_color);
    }

    public Color getEffectColor() {
        return effectColor;
    }

    public void setEffectColor(Color effectColor) {
        this.effectColor = effectColor;
    }

    public Card() {
        initComponents();
        setOpaque(false);
        color1 = Color.BLACK;
        color2 = Color.WHITE;
        effectColor = new Color(173, 173, 173);
        font_size = 14;
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
                color1 = t;
                color2 = b;
                e.consume();
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                final double factor = 0.9;
                color1 = new Color(
                        (int)(t.getRed()*factor),
                        (int)(t.getGreen()*factor), 
                        (int)(t.getBlue()*factor)
                );
                color2 = new Color(
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

    public void setData(Model_Card data) {
        lbl_title.setText(data.getTitle());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_title = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(150, 60));
        setMinimumSize(new java.awt.Dimension(150, 60));
        setPreferredSize(new java.awt.Dimension(150, 60));
        setLayout(new java.awt.CardLayout());

        lbl_title.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(51, 51, 51));
        lbl_title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_title.setText("Title");
        lbl_title.setMaximumSize(new java.awt.Dimension(30, 20));
        lbl_title.setMinimumSize(new java.awt.Dimension(0, 0));
        lbl_title.setPreferredSize(new java.awt.Dimension(30, 20));
        add(lbl_title, "card2");
    }// </editor-fold>//GEN-END:initComponents

    @Override
    protected void paintComponent(Graphics grphcs) {
        int width = getWidth();
        int height = getHeight();
        BufferedImage img = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2 = img.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, color1, 0, getHeight(), color2);
        g2.setColor(getBackground());
        g2.setPaint(g);
        g2.fillRoundRect(0, 0, getWidth(), getHeight(), 15, 15);
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
    private Color color1;
    private Color color2;
    private Color font_color;
    private int font_size;
    private Color t;
    private Color b;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_title;
    // End of variables declaration//GEN-END:variables
}
