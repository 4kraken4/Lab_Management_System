package com.wecare.view;

import com.wecare.assets.custom_controls.model.TestType;
import com.wecare.assets.utilities.Service;
import com.wecare.controller.ResultController;
import com.wecare.controller.TestController;
import com.wecare.model.CBC_Result;
import com.wecare.model.Test;
import java.text.DecimalFormat;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;

public class Frm_Add_CBC_Result extends javax.swing.JPanel {

    public Frm_Add_CBC_Result(Test test, CBC_Result rlt) {
        initComponents();
        initForm();
        this.test_name = TestType.CBC;
        this.test = test;
        this.rlt = rlt;
    }

    private final TestType test_name;
    private final Test test;
    private final CBC_Result rlt;

    public TestType getTest_name() {
        return test_name;
    }

    private void dispopse() {
        if (Service.catchComponent(this, "MainWindow") instanceof javax.swing.JFrame fr) {
            ((Dashboard) fr).setUi_to_manaage();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        btn_cancel = new com.wecare.assets.custom_controls.model.CustomButton();
        btn_save = new com.wecare.assets.custom_controls.model.CustomButton();
        panelBorder1 = new com.wecare.assets.custom_controls.component.PanelBorder();
        jPanel13 = new javax.swing.JPanel();
        sp_dlc_neutrophils = new javax.swing.JSpinner();
        jLabel18 = new javax.swing.JLabel();
        jSeparator14 = new javax.swing.JSeparator();
        jPanel17 = new javax.swing.JPanel();
        sp_dlc_basophils = new javax.swing.JSpinner();
        jLabel22 = new javax.swing.JLabel();
        jSeparator18 = new javax.swing.JSeparator();
        jPanel16 = new javax.swing.JPanel();
        sp_dlc_eosinophils = new javax.swing.JSpinner();
        jLabel21 = new javax.swing.JLabel();
        jSeparator17 = new javax.swing.JSeparator();
        jPanel15 = new javax.swing.JPanel();
        sp_dlc_monocytes = new javax.swing.JSpinner();
        jLabel20 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        jPanel14 = new javax.swing.JPanel();
        sp_dlc_lymphocytes = new javax.swing.JSpinner();
        jLabel19 = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        jLabel17 = new javax.swing.JLabel();
        panelBorder2 = new com.wecare.assets.custom_controls.component.PanelBorder();
        jPanel24 = new javax.swing.JPanel();
        sp_platelet_count = new javax.swing.JSpinner();
        jLabel29 = new javax.swing.JLabel();
        jSeparator25 = new javax.swing.JSeparator();
        jPanel23 = new javax.swing.JPanel();
        sp_alc_basophils = new javax.swing.JSpinner();
        jLabel28 = new javax.swing.JLabel();
        jSeparator24 = new javax.swing.JSeparator();
        jPanel22 = new javax.swing.JPanel();
        sp_alc_eosinophils = new javax.swing.JSpinner();
        jLabel27 = new javax.swing.JLabel();
        jSeparator23 = new javax.swing.JSeparator();
        jPanel21 = new javax.swing.JPanel();
        sp_alc_monocytes = new javax.swing.JSpinner();
        jLabel26 = new javax.swing.JLabel();
        jSeparator22 = new javax.swing.JSeparator();
        jPanel20 = new javax.swing.JPanel();
        sp_alc_lymphocytes = new javax.swing.JSpinner();
        jLabel25 = new javax.swing.JLabel();
        jSeparator21 = new javax.swing.JSeparator();
        jPanel19 = new javax.swing.JPanel();
        sp_alc_neutrophils = new javax.swing.JSpinner();
        jLabel24 = new javax.swing.JLabel();
        jSeparator20 = new javax.swing.JSeparator();
        jLabel23 = new javax.swing.JLabel();
        panelBorder3 = new com.wecare.assets.custom_controls.component.PanelBorder();
        jPanel5 = new javax.swing.JPanel();
        jSeparator4 = new javax.swing.JSeparator();
        sp_mcv = new javax.swing.JSpinner();
        jLabel3 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        sp_total_leucocyte_count = new javax.swing.JSpinner();
        jLabel16 = new javax.swing.JLabel();
        jSeparator11 = new javax.swing.JSeparator();
        jPanel10 = new javax.swing.JPanel();
        sp_nrbc = new javax.swing.JSpinner();
        jLabel13 = new javax.swing.JLabel();
        jSeparator10 = new javax.swing.JSeparator();
        jPanel8 = new javax.swing.JPanel();
        sp_rdw = new javax.swing.JSpinner();
        jLabel12 = new javax.swing.JLabel();
        jSeparator9 = new javax.swing.JSeparator();
        jPanel7 = new javax.swing.JPanel();
        sp_mchc = new javax.swing.JSpinner();
        jLabel11 = new javax.swing.JLabel();
        jSeparator8 = new javax.swing.JSeparator();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator7 = new javax.swing.JSeparator();
        sp_rbc_count = new javax.swing.JSpinner();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        sp_mch = new javax.swing.JSpinner();
        jSeparator2 = new javax.swing.JSeparator();
        jPanel3 = new javax.swing.JPanel();
        sp_packed_cell_volume = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jSeparator6 = new javax.swing.JSeparator();
        jPanel2 = new javax.swing.JPanel();
        sp_hemoglobin = new javax.swing.JSpinner();
        jLabel1 = new javax.swing.JLabel();
        jSeparator5 = new javax.swing.JSeparator();

        setBackground(new java.awt.Color(255, 255, 255));
        setLayout(new java.awt.GridBagLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        btn_cancel.setBackground(new java.awt.Color(153, 153, 153));
        btn_cancel.setForeground(new java.awt.Color(255, 255, 255));
        btn_cancel.setText("Cancel");
        btn_cancel.setFocusPainted(false);
        btn_cancel.setRoundness(40);

        btn_save.setBackground(new java.awt.Color(51, 153, 255));
        btn_save.setForeground(new java.awt.Color(255, 255, 255));
        btn_save.setText("Save");
        btn_save.setFocusPainted(false);
        btn_save.setRoundness(40);
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });

        panelBorder1.setBackground(new java.awt.Color(65, 169, 238));

        jPanel13.setBackground(new java.awt.Color(65, 169, 238));
        jPanel13.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_dlc_neutrophils.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_dlc_neutrophils.setName("dlc_neutrophils"); // NOI18N
        sp_dlc_neutrophils.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel18.setForeground(new java.awt.Color(51, 51, 51));
        jLabel18.setText("NEUTROPHILS");

        jSeparator14.setBackground(new java.awt.Color(65, 169, 238));
        jSeparator14.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator14, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sp_dlc_neutrophils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_dlc_neutrophils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel17.setBackground(new java.awt.Color(65, 169, 238));
        jPanel17.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_dlc_basophils.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_dlc_basophils.setName("dlc_basophils"); // NOI18N
        sp_dlc_basophils.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel22.setForeground(new java.awt.Color(51, 51, 51));
        jLabel22.setText("BASOPHILS");

        jSeparator18.setBackground(new java.awt.Color(65, 169, 238));
        jSeparator18.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel17Layout = new javax.swing.GroupLayout(jPanel17);
        jPanel17.setLayout(jPanel17Layout);
        jPanel17Layout.setHorizontalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator18, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel17Layout.createSequentialGroup()
                        .addComponent(jLabel22)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sp_dlc_basophils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel17Layout.setVerticalGroup(
            jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel17Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_dlc_basophils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator18, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel16.setBackground(new java.awt.Color(65, 169, 238));
        jPanel16.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_dlc_eosinophils.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_dlc_eosinophils.setName("dlc_ecsinophils"); // NOI18N
        sp_dlc_eosinophils.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel21.setForeground(new java.awt.Color(51, 51, 51));
        jLabel21.setText("ECSINOPHILS");

        jSeparator17.setBackground(new java.awt.Color(65, 169, 238));
        jSeparator17.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator17, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(sp_dlc_eosinophils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(sp_dlc_eosinophils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator17, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel15.setBackground(new java.awt.Color(65, 169, 238));
        jPanel15.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_dlc_monocytes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_dlc_monocytes.setName("dlc_monocytes"); // NOI18N
        sp_dlc_monocytes.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel20.setForeground(new java.awt.Color(51, 51, 51));
        jLabel20.setText("MONOCYTES");

        jSeparator16.setBackground(new java.awt.Color(65, 169, 238));
        jSeparator16.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator16, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sp_dlc_monocytes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_dlc_monocytes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel14.setBackground(new java.awt.Color(65, 169, 238));
        jPanel14.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_dlc_lymphocytes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_dlc_lymphocytes.setName("dlc_lymphocytes"); // NOI18N
        sp_dlc_lymphocytes.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel19.setForeground(new java.awt.Color(51, 51, 51));
        jLabel19.setText("LYMPHOCYTES");

        jSeparator15.setBackground(new java.awt.Color(65, 169, 238));
        jSeparator15.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator15, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(sp_dlc_lymphocytes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_dlc_lymphocytes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel17.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("DIFERENTIAL LEUCOCYTE count  (DLC)");

        javax.swing.GroupLayout panelBorder1Layout = new javax.swing.GroupLayout(panelBorder1);
        panelBorder1.setLayout(panelBorder1Layout);
        panelBorder1Layout.setHorizontalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(panelBorder1Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addGroup(panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(97, Short.MAX_VALUE))
        );
        panelBorder1Layout.setVerticalGroup(
            panelBorder1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        panelBorder2.setBackground(new java.awt.Color(35, 196, 174));

        jPanel24.setBackground(new java.awt.Color(35, 196, 174));
        jPanel24.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_platelet_count.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_platelet_count.setName("platelet_count"); // NOI18N
        sp_platelet_count.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel29.setForeground(new java.awt.Color(51, 51, 51));
        jLabel29.setText("PLATELET count");

        jSeparator25.setBackground(new java.awt.Color(35, 196, 174));
        jSeparator25.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel24Layout = new javax.swing.GroupLayout(jPanel24);
        jPanel24.setLayout(jPanel24Layout);
        jPanel24Layout.setHorizontalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel24Layout.createSequentialGroup()
                        .addComponent(jLabel29)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addComponent(sp_platelet_count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator25, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel24Layout.setVerticalGroup(
            jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel24Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_platelet_count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jSeparator25, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel23.setBackground(new java.awt.Color(35, 196, 174));
        jPanel23.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_alc_basophils.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_alc_basophils.setName("alc_basophils"); // NOI18N
        sp_alc_basophils.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel28.setForeground(new java.awt.Color(51, 51, 51));
        jLabel28.setText("BASOPHILS");

        jSeparator24.setBackground(new java.awt.Color(35, 196, 174));
        jSeparator24.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel23Layout = new javax.swing.GroupLayout(jPanel23);
        jPanel23.setLayout(jPanel23Layout);
        jPanel23Layout.setHorizontalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator24, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel23Layout.createSequentialGroup()
                        .addComponent(jLabel28)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                        .addComponent(sp_alc_basophils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel23Layout.setVerticalGroup(
            jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel23Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_alc_basophils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator24, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel22.setBackground(new java.awt.Color(35, 196, 174));
        jPanel22.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_alc_eosinophils.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_alc_eosinophils.setName("alc_ecsinophils"); // NOI18N
        sp_alc_eosinophils.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel27.setForeground(new java.awt.Color(51, 51, 51));
        jLabel27.setText("ECSINOPHILS");

        jSeparator23.setBackground(new java.awt.Color(35, 196, 174));
        jSeparator23.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel22Layout = new javax.swing.GroupLayout(jPanel22);
        jPanel22.setLayout(jPanel22Layout);
        jPanel22Layout.setHorizontalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator23, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel22Layout.createSequentialGroup()
                        .addComponent(jLabel27)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                        .addComponent(sp_alc_eosinophils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel22Layout.setVerticalGroup(
            jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel22Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_alc_eosinophils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator23, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel21.setBackground(new java.awt.Color(35, 196, 174));
        jPanel21.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_alc_monocytes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_alc_monocytes.setName("alc_monocytes"); // NOI18N
        sp_alc_monocytes.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel26.setForeground(new java.awt.Color(51, 51, 51));
        jLabel26.setText("MONOCYTE");

        jSeparator22.setBackground(new java.awt.Color(35, 196, 174));
        jSeparator22.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel21Layout = new javax.swing.GroupLayout(jPanel21);
        jPanel21.setLayout(jPanel21Layout);
        jPanel21Layout.setHorizontalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator22, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel21Layout.createSequentialGroup()
                        .addComponent(jLabel26)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(sp_alc_monocytes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel21Layout.setVerticalGroup(
            jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel21Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel26, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_alc_monocytes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator22, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel20.setBackground(new java.awt.Color(35, 196, 174));
        jPanel20.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_alc_lymphocytes.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_alc_lymphocytes.setName("alc_lymphocytes"); // NOI18N
        sp_alc_lymphocytes.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel25.setForeground(new java.awt.Color(51, 51, 51));
        jLabel25.setText("LYMPHOCYTE");

        jSeparator21.setBackground(new java.awt.Color(35, 196, 174));
        jSeparator21.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel20Layout = new javax.swing.GroupLayout(jPanel20);
        jPanel20.setLayout(jPanel20Layout);
        jPanel20Layout.setHorizontalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator21, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel20Layout.createSequentialGroup()
                        .addComponent(jLabel25)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(sp_alc_lymphocytes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel20Layout.setVerticalGroup(
            jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel20Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_alc_lymphocytes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator21, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel19.setBackground(new java.awt.Color(35, 196, 174));
        jPanel19.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_alc_neutrophils.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_alc_neutrophils.setName("alc_neutrophils"); // NOI18N
        sp_alc_neutrophils.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel24.setForeground(new java.awt.Color(51, 51, 51));
        jLabel24.setText("NEUTROPHILS");

        jSeparator20.setBackground(new java.awt.Color(35, 196, 174));
        jSeparator20.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel19Layout = new javax.swing.GroupLayout(jPanel19);
        jPanel19.setLayout(jPanel19Layout);
        jPanel19Layout.setHorizontalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator20, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel19Layout.createSequentialGroup()
                        .addComponent(jLabel24)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                        .addComponent(sp_alc_neutrophils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel19Layout.setVerticalGroup(
            jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel19Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_alc_neutrophils, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator20, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("ABSOLUTE LEUCOCYTE count");

        javax.swing.GroupLayout panelBorder2Layout = new javax.swing.GroupLayout(panelBorder2);
        panelBorder2.setLayout(panelBorder2Layout);
        panelBorder2Layout.setHorizontalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(panelBorder2Layout.createSequentialGroup()
                        .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panelBorder2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 6, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelBorder2Layout.setVerticalGroup(
            panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(panelBorder2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        panelBorder3.setBackground(new java.awt.Color(252, 113, 173));

        jPanel5.setBackground(new java.awt.Color(252, 113, 173));
        jPanel5.setPreferredSize(new java.awt.Dimension(220, 46));

        jSeparator4.setBackground(new java.awt.Color(252, 113, 173));
        jSeparator4.setPreferredSize(new java.awt.Dimension(450, 30));

        sp_mcv.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_mcv.setName("mcv"); // NOI18N
        sp_mcv.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("MCV");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(sp_mcv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addComponent(sp_mcv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel11.setBackground(new java.awt.Color(252, 113, 173));
        jPanel11.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_total_leucocyte_count.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_total_leucocyte_count.setName("total_leucocyte_count"); // NOI18N
        sp_total_leucocyte_count.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel16.setForeground(new java.awt.Color(51, 51, 51));
        jLabel16.setText("TOTAL LEUCOCYTE count");

        jSeparator11.setBackground(new java.awt.Color(252, 113, 173));
        jSeparator11.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator11, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel16)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sp_total_leucocyte_count, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_total_leucocyte_count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel10.setBackground(new java.awt.Color(252, 113, 173));
        jPanel10.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_nrbc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_nrbc.setName("nrbc"); // NOI18N
        sp_nrbc.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel13.setForeground(new java.awt.Color(51, 51, 51));
        jLabel13.setText("nRBC");

        jSeparator10.setBackground(new java.awt.Color(252, 113, 173));
        jSeparator10.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator10, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                        .addComponent(sp_nrbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_nrbc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel8.setBackground(new java.awt.Color(252, 113, 173));
        jPanel8.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_rdw.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_rdw.setName("rdw"); // NOI18N
        sp_rdw.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("RDW");

        jSeparator9.setBackground(new java.awt.Color(252, 113, 173));
        jSeparator9.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator9, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 108, Short.MAX_VALUE)
                        .addComponent(sp_rdw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_rdw, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel7.setBackground(new java.awt.Color(252, 113, 173));
        jPanel7.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_mchc.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_mchc.setName("mchc"); // NOI18N
        sp_mchc.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("MCHC");

        jSeparator8.setBackground(new java.awt.Color(252, 113, 173));
        jSeparator8.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator8, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
                        .addComponent(sp_mchc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_mchc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(252, 113, 173));
        jPanel4.setPreferredSize(new java.awt.Dimension(220, 46));

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("R.B.C count");

        jSeparator7.setBackground(new java.awt.Color(252, 113, 173));
        jSeparator7.setPreferredSize(new java.awt.Dimension(450, 30));

        sp_rbc_count.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_rbc_count.setName("rbc_count"); // NOI18N
        sp_rbc_count.setPreferredSize(new java.awt.Dimension(80, 28));

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addComponent(sp_rbc_count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jSeparator7, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(sp_rbc_count, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(252, 113, 173));
        jPanel6.setPreferredSize(new java.awt.Dimension(220, 46));

        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("MCH");

        sp_mch.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_mch.setName("mch"); // NOI18N
        sp_mch.setPreferredSize(new java.awt.Dimension(80, 28));

        jSeparator2.setBackground(new java.awt.Color(252, 113, 173));
        jSeparator2.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addComponent(sp_mch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_mch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(252, 113, 173));
        jPanel3.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_packed_cell_volume.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_packed_cell_volume.setName("packed_cell_volume"); // NOI18N
        sp_packed_cell_volume.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("PACKED CELL volume");

        jSeparator6.setBackground(new java.awt.Color(252, 113, 173));
        jSeparator6.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator6, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(sp_packed_cell_volume, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 15, Short.MAX_VALUE))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_packed_cell_volume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(0, 0, 0)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(252, 113, 173));
        jPanel2.setPreferredSize(new java.awt.Dimension(220, 46));

        sp_hemoglobin.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        sp_hemoglobin.setName("hemoglobin"); // NOI18N
        sp_hemoglobin.setPreferredSize(new java.awt.Dimension(80, 28));

        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("HEMOGLOBIN");

        jSeparator5.setBackground(new java.awt.Color(252, 113, 173));
        jSeparator5.setPreferredSize(new java.awt.Dimension(450, 30));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator5, javax.swing.GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(sp_hemoglobin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(sp_hemoglobin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout panelBorder3Layout = new javax.swing.GroupLayout(panelBorder3);
        panelBorder3.setLayout(panelBorder3Layout);
        panelBorder3Layout.setHorizontalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelBorder3Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelBorder3Layout.createSequentialGroup()
                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelBorder3Layout.createSequentialGroup()
                        .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(89, 89, 89)
                        .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(55, 55, 55))
        );
        panelBorder3Layout.setVerticalGroup(
            panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelBorder3Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jPanel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(panelBorder3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(46, 46, 46))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, 921, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(panelBorder1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(panelBorder2, javax.swing.GroupLayout.PREFERRED_SIZE, 470, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panelBorder3, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(panelBorder1, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE)
                    .addComponent(panelBorder2, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_cancel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_save, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        add(jPanel1, gridBagConstraints);

        getAccessibleContext().setAccessibleParent(this);
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        saveSpinnerValues();
        CBC_Result cbc = new CBC_Result();
        cbc.setId(this.rlt.getId());
        cbc.setMcv((int) sp_mcv.getValue());
        cbc.setMchc((Double) sp_mchc.getValue());
        cbc.setNrbc((int) sp_nrbc.getValue());
        cbc.setRdw((Double) sp_rdw.getValue());
        cbc.setMch((Double) sp_mch.getValue());
        cbc.setRbc_count((Double) sp_rbc_count.getValue());
        cbc.setPacked_cell_volume((Double) sp_packed_cell_volume.getValue());
        cbc.setTotal_leucocyte_count((Double) sp_total_leucocyte_count.getValue());
        cbc.setHemoglobin((int) sp_hemoglobin.getValue());

        cbc.setAlc_neutrophils((Double) sp_alc_neutrophils.getValue());
        cbc.setAlc_basophils((Double) sp_alc_basophils.getValue());
        cbc.setAlc_eosinophils((Double) sp_alc_eosinophils.getValue());
        cbc.setAlc_monocytes((Double) sp_alc_monocytes.getValue());
        cbc.setAlc_lymphocytes((Double) sp_alc_lymphocytes.getValue());

        cbc.setDlc_neutrophils((int) sp_dlc_neutrophils.getValue());
        cbc.setDlc_basophils((Double) sp_dlc_basophils.getValue());
        cbc.setDlc_eosinophils((int) sp_dlc_eosinophils.getValue());
        cbc.setDlc_monocytes((int) sp_dlc_monocytes.getValue());
        cbc.setDlc_lymphocytes((int) sp_dlc_lymphocytes.getValue());
        cbc.setPlatelet_count((int) sp_platelet_count.getValue());

        ResultController r_con = new ResultController(cbc);
        if (!r_con.save_CBC_Result()) {
            JOptionPane.showMessageDialog(this,
                    "You have input invalid data in the field.",
                    "Input error.",
                    JOptionPane.ERROR_MESSAGE);
        } else {
            TestController t_con = new TestController(this.test);
            this.test.setStatus(true);
            if (t_con.updateTestDetails()) {
                JOptionPane.showMessageDialog(this,
                        "Result has been saved.",
                        "Success.",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void print() {
        System.out.println(this.sp_mcv.getName() + ": " + (Double) this.sp_mcv.getValue());
        System.out.println(this.sp_rdw + ": " + (Double) this.sp_rdw.getValue());
        System.out.println(this.sp_nrbc + ": " + (Double) this.sp_nrbc.getValue());
        System.out.println(this.sp_mchc + ": " + (Double) this.sp_mchc.getValue());
        System.out.println(this.sp_mch + ": " + (Double) this.sp_mch.getValue());
        System.out.println(this.sp_total_leucocyte_count + ": " + (Double) this.sp_total_leucocyte_count.getValue());
        System.out.println(this.sp_packed_cell_volume + ": " + (Double) this.sp_packed_cell_volume.getValue());
        System.out.println(this.sp_rbc_count + ": " + (Double) this.sp_rbc_count.getValue());
        System.out.println(this.sp_hemoglobin + ": " + (Double) this.sp_hemoglobin.getValue());
        System.out.println(this.sp_dlc_neutrophils + ": " + (Double) this.sp_dlc_neutrophils.getValue());
        System.out.println(this.sp_dlc_basophils + ": " + (Double) this.sp_dlc_basophils.getValue());
        System.out.println(this.sp_dlc_eosinophils + ": " + (Double) this.sp_dlc_eosinophils.getValue());
        System.out.println(this.sp_dlc_monocytes + ": " + (Double) this.sp_dlc_monocytes.getValue());
        System.out.println(this.sp_dlc_lymphocytes + ": " + (Double) this.sp_dlc_lymphocytes.getValue());
        System.out.println(this.sp_alc_neutrophils + ": " + (Double) this.sp_alc_neutrophils.getValue());
        System.out.println(this.sp_alc_basophils + ": " + (Double) this.sp_alc_basophils.getValue());
        System.out.println(this.sp_alc_eosinophils + ": " + (Double) this.sp_alc_eosinophils.getValue());
        System.out.println(this.sp_alc_monocytes + ": " + (Double) this.sp_alc_monocytes.getValue());
        System.out.println(this.sp_alc_lymphocytes + ": " + (Double) this.sp_alc_lymphocytes.getValue());
        System.out.println(this.sp_platelet_count + ": " + (Double) this.sp_platelet_count.getValue());
    }

    private void saveSpinnerValues() {
        try {
            this.sp_mcv.commitEdit();
            this.sp_rdw.commitEdit();
            this.sp_nrbc.commitEdit();
            this.sp_mchc.commitEdit();
            this.sp_mch.commitEdit();
            this.sp_total_leucocyte_count.commitEdit();
            this.sp_packed_cell_volume.commitEdit();
            this.sp_rbc_count.commitEdit();
            this.sp_hemoglobin.commitEdit();

            this.sp_dlc_neutrophils.commitEdit();
            this.sp_dlc_basophils.commitEdit();
            this.sp_dlc_eosinophils.commitEdit();
            this.sp_dlc_monocytes.commitEdit();
            this.sp_dlc_lymphocytes.commitEdit();

            this.sp_alc_neutrophils.commitEdit();
            this.sp_alc_basophils.commitEdit();
            this.sp_alc_eosinophils.commitEdit();
            this.sp_alc_monocytes.commitEdit();
            this.sp_alc_lymphocytes.commitEdit();
            this.sp_platelet_count.commitEdit();
        } catch (ParseException ex) {
            JOptionPane.showConfirmDialog(this,
                    "Could not save result..",
                    "Database issue.",
                    JOptionPane.ERROR_MESSAGE);
        }
    }

    private void setupSpinners(JSpinner sp, double min, double max, boolean decimal) {
        if (decimal) {
            sp.setModel(new SpinnerNumberModel(min, min, max, 0.1D));
            JSpinner.NumberEditor ed = (JSpinner.NumberEditor) sp.getEditor();
            DecimalFormat fmt = ed.getFormat();
            fmt.format(0.0);
        } else {
            sp.setModel(new SpinnerNumberModel((int) min, (int) min, (int) max, 1));
        }
    }

    private void initForm() {
        this.setupSpinners(sp_mcv, 60.0D, 120.0D, false);
        this.setupSpinners(sp_mch, 15.0D, 45.D, true);
        this.setupSpinners(sp_mchc, 250.0D, 400.0D, true);
        this.setupSpinners(sp_nrbc, 0.0D, 20.0D, false);
        this.setupSpinners(sp_hemoglobin, 100.0, 200.0, false);
        this.setupSpinners(sp_rdw, 5.0D, 20.0D, true);
        this.setupSpinners(sp_rbc_count, 3.0D, 8.0D, true);
        this.setupSpinners(sp_packed_cell_volume, 30.0D, 60.0D, true);
        this.setupSpinners(sp_total_leucocyte_count, 9.0D, 20.0D, true);

        this.setupSpinners(sp_dlc_basophils, 0.0D, 2.0D, true);
        this.setupSpinners(sp_dlc_eosinophils, 0.0D, 10.0D, false);
        this.setupSpinners(sp_dlc_lymphocytes, 20.0D, 60.0D, false);
        this.setupSpinners(sp_dlc_monocytes, 2.0D, 10.0D, false);
        this.setupSpinners(sp_dlc_neutrophils, 25.0D, 80.0D, false);

        this.setupSpinners(sp_alc_basophils, 0.0D, 1.0D, true);
        this.setupSpinners(sp_alc_eosinophils, 0.0D, 1.5D, true);
        this.setupSpinners(sp_alc_lymphocytes, 6.0D, 9.0D, true);
        this.setupSpinners(sp_alc_monocytes, 0.0D, 1.5D, true);
        this.setupSpinners(sp_alc_neutrophils, 1.0D, 10.0D, true);
        this.setupSpinners(sp_platelet_count, 100.0D, 500.0D, false);
    }

    public JButton getBtn_cancel() {
        return btn_cancel;
    }

    public JButton getBtn_save() {
        return btn_save;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.wecare.assets.custom_controls.model.CustomButton btn_cancel;
    private com.wecare.assets.custom_controls.model.CustomButton btn_save;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel21;
    private javax.swing.JPanel jPanel22;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JPanel jPanel24;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator17;
    private javax.swing.JSeparator jSeparator18;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator20;
    private javax.swing.JSeparator jSeparator21;
    private javax.swing.JSeparator jSeparator22;
    private javax.swing.JSeparator jSeparator23;
    private javax.swing.JSeparator jSeparator24;
    private javax.swing.JSeparator jSeparator25;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private com.wecare.assets.custom_controls.component.PanelBorder panelBorder1;
    private com.wecare.assets.custom_controls.component.PanelBorder panelBorder2;
    private com.wecare.assets.custom_controls.component.PanelBorder panelBorder3;
    private javax.swing.JSpinner sp_alc_basophils;
    private javax.swing.JSpinner sp_alc_eosinophils;
    private javax.swing.JSpinner sp_alc_lymphocytes;
    private javax.swing.JSpinner sp_alc_monocytes;
    private javax.swing.JSpinner sp_alc_neutrophils;
    private javax.swing.JSpinner sp_dlc_basophils;
    private javax.swing.JSpinner sp_dlc_eosinophils;
    private javax.swing.JSpinner sp_dlc_lymphocytes;
    private javax.swing.JSpinner sp_dlc_monocytes;
    private javax.swing.JSpinner sp_dlc_neutrophils;
    private javax.swing.JSpinner sp_hemoglobin;
    private javax.swing.JSpinner sp_mch;
    private javax.swing.JSpinner sp_mchc;
    private javax.swing.JSpinner sp_mcv;
    private javax.swing.JSpinner sp_nrbc;
    private javax.swing.JSpinner sp_packed_cell_volume;
    private javax.swing.JSpinner sp_platelet_count;
    private javax.swing.JSpinner sp_rbc_count;
    private javax.swing.JSpinner sp_rdw;
    private javax.swing.JSpinner sp_total_leucocyte_count;
    // End of variables declaration//GEN-END:variables
}
