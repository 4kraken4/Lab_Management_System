package com.wecare.assets.custom_controls.component;

import com.wecare.assets.custom_controls.model.CustomButton;
import javax.swing.JPanel;

public class UpdateDialog extends javax.swing.JDialog {

    public UpdateDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public void addForm(JPanel pnl) {
        addForm1.addForm(pnl);
    }
    
    @Override
    public void setTitle (String title) {
        super.setTitle(title);
        addForm1.setTitle(title);
    }
    
    public CustomButton getBtn_Back() {
        return addForm1.getBtn_back();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addForm1 = new com.wecare.assets.custom_controls.component.AddScrollForm();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Update data");
        setName("update_dialog"); // NOI18N
        getContentPane().add(addForm1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.component.AddScrollForm addForm1;
    // End of variables declaration//GEN-END:variables
}
