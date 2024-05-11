package com.wecare.view;

public class WindowLoading extends javax.swing.JDialog {

    public WindowLoading(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        initLoader();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pgr_loader = new javax.swing.JProgressBar();
        lbl_progressStatus = new javax.swing.JLabel();
        lbl_progress = new javax.swing.JLabel();
        lbl_bgImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(null);

        pgr_loader.setBackground(new java.awt.Color(51, 51, 51));
        pgr_loader.setForeground(new java.awt.Color(242, 75, 114));
        pgr_loader.setFocusable(false);
        jPanel1.add(pgr_loader);
        pgr_loader.setBounds(-10, 406, 700, 4);

        lbl_progressStatus.setBackground(new java.awt.Color(51, 51, 51));
        lbl_progressStatus.setFont(new java.awt.Font("Segoe UI", 3, 11)); // NOI18N
        lbl_progressStatus.setForeground(new java.awt.Color(204, 204, 204));
        lbl_progressStatus.setText("Loading...");
        jPanel1.add(lbl_progressStatus);
        lbl_progressStatus.setBounds(10, 375, 210, 20);

        lbl_progress.setBackground(new java.awt.Color(255, 255, 255));
        lbl_progress.setFont(new java.awt.Font("Segoe UI", 0, 10)); // NOI18N
        lbl_progress.setForeground(new java.awt.Color(204, 204, 204));
        lbl_progress.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_progress.setText("100%");
        lbl_progress.setAlignmentX(0.5F);
        jPanel1.add(lbl_progress);
        lbl_progress.setBounds(640, 370, 40, 20);

        lbl_bgImage.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_bgImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/wecare/assets/image/logo/loading_image.png"))); // NOI18N
        lbl_bgImage.setPreferredSize(new java.awt.Dimension(750, 500));
        jPanel1.add(lbl_bgImage);
        lbl_bgImage.setBounds(0, 0, 680, 410);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 410, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setProgressBar(int _val) {
        pgr_loader.setMinimum(0);
        pgr_loader.setMaximum(100);
        pgr_loader.setValue(_val);
        lbl_progress.setText(Integer.toString(_val) + "%");
    }

    private void setProgressLabel(String _message) {
        lbl_progressStatus.setText(_message);
    }

    public final void initLoader() {
        Thread td_loader = new Thread() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    try {
                        if (i < 15) {
                            setProgressLabel("Loading components...");
                            Thread.sleep(15);
                        } else if (i < 45) {
                            if (i < 35) {
                                setProgressLabel("Loading libraries...");
                                Thread.sleep(15);
                            } else if (i % 35 == 0) {
                                Thread.sleep(200);
                            } else if (i % 36 == 0) {
                                Thread.sleep(100);
                            } else if (i % 39 == 0) {
                                Thread.sleep(200);
                            } else {
                                Thread.sleep(15);
                            }
                        } else if (i < 70) {
                            if (i < 60) {
                                setProgressLabel("Connecting to database...");
                                Thread.sleep(25);
                            } else if (i % 61 == 0) {
                                Thread.sleep(100);
                            } else if (i % 65 == 0) {
                                Thread.sleep(450);
                            } else {
                                Thread.sleep(25);
                            }
                        } else if (i < 80) {
                            if (i < 78) {
                                setProgressLabel("Loading configurations...");
                                Thread.sleep(15);
                            } else if (i % 78 == 0) {
                                Thread.sleep(100);
                            } else if (i % 79 == 0) {
                                Thread.sleep(50);
                            }
                        } else if (i < 95) {
                            if (i < 90) {
                                setProgressLabel("Setting up environment...");
                                Thread.sleep(20);
                            } else if (i % 92 == 0) {
                                Thread.sleep(200);
                            } else if (i % 94 == 0) {
                                Thread.sleep(100);
                            } else {
                                Thread.sleep(20);
                            }
                        } else {
                            if (i == 100) {
                                setProgressBar(i);
                                Thread.sleep(500);
                            } else {
                                setProgressLabel("All set...");
                                Thread.sleep(20);
                            }
                        }
                        setProgressBar(i);
                    } catch (InterruptedException e) {
                    }
                }
                dispose();
            }
        };
        td_loader.setDaemon(true);
        td_loader.start();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_bgImage;
    private javax.swing.JLabel lbl_progress;
    private javax.swing.JLabel lbl_progressStatus;
    private javax.swing.JProgressBar pgr_loader;
    // End of variables declaration//GEN-END:variables
}
