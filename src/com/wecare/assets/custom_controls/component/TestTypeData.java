package com.wecare.assets.custom_controls.component;

import com.wecare.assets.utilities.Service;
import com.wecare.controller.TestTypeController;
import com.wecare.model.TestType;
import com.wecare.view.Frm_TestSelection;
import java.util.UUID;

public class TestTypeData extends javax.swing.JPanel {

    public TestType getTest_type() {
        return test_type;
    }
    
    public String getID() {
        return id;
    }
    
    private void setTest_type() {
        test_type = new TestType();
        test_type.setTestName(lbl_test.getText());
        TestTypeController tc = new TestTypeController(test_type);
        tc.setData();
        test_type = tc.getTestType();
        lbl_test.setText(this.test_type.getTestName());
        lbl_price.setText(this.test_type.getPrice().toString());
    }
    
    public TestTypeData() {
        initComponents();
        id = UUID.randomUUID().toString();
        Dialog_ComboBox dtest = new Dialog_ComboBox(null, true);
        dtest.setLocationRelativeTo(this);
        dtest.setData(this.lbl_test);
        TestTypeController.getTestTypes(dtest.getCmb_option());
        dtest.setVisible(true);
        setTest_type();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbl_price = new javax.swing.JLabel();
        btn_add = new javax.swing.JLabel();
        lbl_test = new javax.swing.JLabel();
        btn_remove = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(540, 70));
        setMinimumSize(new java.awt.Dimension(0, 0));
        setPreferredSize(new java.awt.Dimension(540, 70));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(600, 58));
        jPanel1.setPreferredSize(new java.awt.Dimension(540, 58));

        lbl_price.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_price.setForeground(new java.awt.Color(102, 102, 102));
        lbl_price.setText("price");

        btn_add.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/plus.png"))); // NOI18N
        btn_add.setToolTipText("add a test");
        btn_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_addMouseClicked(evt);
            }
        });

        lbl_test.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_test.setForeground(new java.awt.Color(102, 102, 102));
        lbl_test.setText("test name");

        btn_remove.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn_remove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/icon/minus.png"))); // NOI18N
        btn_remove.setToolTipText("remove this test");
        btn_remove.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_removeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(lbl_test)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 286, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_price)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btn_remove)
                        .addGap(18, 18, 18)
                        .addComponent(btn_add)))
                .addGap(58, 58, 58))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_test)
                    .addComponent(lbl_price))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_remove)
                    .addComponent(btn_add))
                .addGap(0, 6, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btn_removeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_removeMouseClicked
        if(Service.catchComponent(this, "pnl_testcontainer") instanceof Frm_TestSelection ts) {
            ts.removeTestType(this.id);
        }
        evt.consume();
    }//GEN-LAST:event_btn_removeMouseClicked

    private void btn_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_addMouseClicked
        if(Service.catchComponent(this, "pnl_testcontainer") instanceof Frm_TestSelection ts) {
            ts.addTestType(new TestTypeData());
        }
        evt.consume();
    }//GEN-LAST:event_btn_addMouseClicked

    private TestType test_type;
    private final String id;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btn_add;
    private javax.swing.JLabel btn_remove;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_price;
    private javax.swing.JLabel lbl_test;
    // End of variables declaration//GEN-END:variables
}
