package com.wecare.assets.custom_controls.component;

import com.wecare.assets.custom_controls.model.EventMenuSelected;
import com.wecare.assets.custom_controls.model.Model_Menu;
import java.awt.Color;
import java.awt.GradientPaint;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;
import javax.swing.JFrame;

public class Menu extends javax.swing.JPanel {

    public Menu() {
        initComponents();
        setOpaque(false);
        pnl_menu.setOpaque(false);
        init();
    }
    
    private void init() {
                                 //      icon,   name,      menu type
        pnl_menu.addItem(new Model_Menu("home", "Home", Model_Menu.MenuType.MENU));
        pnl_menu.addItem(new Model_Menu("manage", "Manage", Model_Menu.MenuType.MENU));
        pnl_menu.addItem(new Model_Menu("user", "User", Model_Menu.MenuType.MENU));
        pnl_menu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        
        pnl_menu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
        pnl_menu.addItem(new Model_Menu("logout", "Logout", Model_Menu.MenuType.MENU));
        pnl_menu.addItem(new Model_Menu("help", "Help", Model_Menu.MenuType.MENU));
        pnl_menu.addItem(new Model_Menu("aboutus", "About us", Model_Menu.MenuType.MENU));
        pnl_menu.addItem(new Model_Menu("", "", Model_Menu.MenuType.EMPTY));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnl_moving = new javax.swing.JPanel();
        lbl_logo = new javax.swing.JLabel();
        pnl_menu = new com.wecare.assets.custom_controls.model.ListMenu<>();

        pnl_moving.setOpaque(false);

        lbl_logo.setFont(new java.awt.Font("Century Gothic", 0, 14)); // NOI18N
        lbl_logo.setForeground(new java.awt.Color(0, 255, 255));
        lbl_logo.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_logo.setText("We-Care");

        javax.swing.GroupLayout pnl_movingLayout = new javax.swing.GroupLayout(pnl_moving);
        pnl_moving.setLayout(pnl_movingLayout);
        pnl_movingLayout.setHorizontalGroup(
            pnl_movingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnl_movingLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        pnl_movingLayout.setVerticalGroup(
            pnl_movingLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnl_movingLayout.createSequentialGroup()
                .addComponent(lbl_logo, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 32, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnl_moving, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnl_menu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnl_moving, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnl_menu, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    
    @Override
    protected void paintChildren(Graphics gr) {
        Graphics2D g2 = (Graphics2D) gr;
        g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        GradientPaint g = new GradientPaint(0, 0, Color.decode("#191919"), 0, getHeight(), Color.decode("#303944"));
        g2.setPaint(g);
        g2.fillRect(0, 0, getWidth(), getHeight());
        g2.fillRect(getWidth() - 20, 0, getWidth(), getHeight());
        super.paintChildren(gr);
    }
    
    public void setFrame(JFrame frm) {
        this.frm = frm;
    }
    
    public void initMoving() {
        lbl_logo.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent me) {
                x = me.getX();
                y = me.getY();
            }

        });
        lbl_logo.addMouseMotionListener(new MouseMotionAdapter() {
            @Override
            public void mouseDragged(MouseEvent me) {
                frm.setLocation(me.getXOnScreen() - x, me.getYOnScreen() - y);
            }
        });
    }

    public void addEventMenuSelected(EventMenuSelected event) {
        this.event = event;
        pnl_menu.addEventMenuSelected(this.event);
    }
   
    private JFrame frm;
    private int x;
    private int y;
    private EventMenuSelected event;
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lbl_logo;
    private com.wecare.assets.custom_controls.model.ListMenu<String> pnl_menu;
    private javax.swing.JPanel pnl_moving;
    // End of variables declaration//GEN-END:variables
}
