/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package course.work.view;

/**
 *
 * @author ASUS
 */
public class AdminHomeView extends javax.swing.JFrame {

    /**
     * Creates new form HomeView
     */
    public AdminHomeView() {
        initComponents();
        setLocationRelativeTo(null);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblHome = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnCheckIn = new javax.swing.JButton();
        btnCheckOut = new javax.swing.JButton();
        btnRoomBooking = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnRooms = new javax.swing.JButton();
        btnGuests = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 255, 255));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        lblHome.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lblHome.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHome.setText("Hotel Management");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblHome, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(null);

        btnCheckIn.setBackground(new java.awt.Color(204, 255, 204));
        btnCheckIn.setForeground(new java.awt.Color(0, 0, 0));
        btnCheckIn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-check-in-50 (2).png"))); // NOI18N
        btnCheckIn.setText("CHECK IN");
        btnCheckIn.setMaximumSize(new java.awt.Dimension(86, 27));
        btnCheckIn.setMinimumSize(new java.awt.Dimension(86, 27));
        btnCheckIn.setPreferredSize(new java.awt.Dimension(86, 27));
        btnCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckInActionPerformed(evt);
            }
        });
        jPanel2.add(btnCheckIn);
        btnCheckIn.setBounds(0, 50, 221, 132);

        btnCheckOut.setBackground(new java.awt.Color(204, 255, 204));
        btnCheckOut.setForeground(new java.awt.Color(0, 0, 0));
        btnCheckOut.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-check-out-50.png"))); // NOI18N
        btnCheckOut.setText("CHECK OUT");
        btnCheckOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCheckOutActionPerformed(evt);
            }
        });
        jPanel2.add(btnCheckOut);
        btnCheckOut.setBounds(0, 220, 219, 121);

        btnRoomBooking.setBackground(new java.awt.Color(204, 255, 204));
        btnRoomBooking.setForeground(new java.awt.Color(0, 0, 0));
        btnRoomBooking.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-room-64.png"))); // NOI18N
        btnRoomBooking.setText("ROOM CATEGORIES & Packages");
        btnRoomBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomBookingActionPerformed(evt);
            }
        });
        jPanel2.add(btnRoomBooking);
        btnRoomBooking.setBounds(280, 50, 225, 132);

        btnCancel.setBackground(new java.awt.Color(204, 255, 204));
        btnCancel.setForeground(new java.awt.Color(0, 0, 0));
        btnCancel.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons8-cancel-50.png")); // NOI18N
        btnCancel.setText("CANCEL BOOKING");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel2.add(btnCancel);
        btnCancel.setBounds(280, 220, 225, 121);

        btnRooms.setBackground(new java.awt.Color(204, 255, 204));
        btnRooms.setForeground(new java.awt.Color(0, 0, 0));
        btnRooms.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/icons8-room-50.png"))); // NOI18N
        btnRooms.setText("ROOMS");
        btnRooms.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomsActionPerformed(evt);
            }
        });
        jPanel2.add(btnRooms);
        btnRooms.setBounds(550, 50, 232, 132);

        btnGuests.setBackground(new java.awt.Color(204, 255, 204));
        btnGuests.setForeground(new java.awt.Color(0, 0, 0));
        btnGuests.setIcon(new javax.swing.ImageIcon("D:\\Downloads\\icons8-reception-50.png")); // NOI18N
        btnGuests.setText("CUSTOMER MANAGE");
        btnGuests.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuestsActionPerformed(evt);
            }
        });
        jPanel2.add(btnGuests);
        btnGuests.setBounds(550, 220, 232, 121);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pexels-hi-room-17158644.jpg"))); // NOI18N
        jPanel2.add(jLabel1);
        jLabel1.setBounds(0, -10, 800, 400);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 797, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 399, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        new CancelBookingView().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCheckInActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCheckInActionPerformed
        new CheckInView().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btnCheckInActionPerformed

    private void btnCheckOutActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnCheckOutActionPerformed
        new CheckOutView().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btnCheckOutActionPerformed

    private void btnRoomsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRoomsActionPerformed
        new ManageRoomView().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btnRoomsActionPerformed

    private void btnRoomBookingActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnRoomBookingActionPerformed
        new RoomCategoriesView().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btnRoomBookingActionPerformed

    private void btnGuestsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnGuestsActionPerformed
        new CustomerView().setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btnGuestsActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                    .getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AdminHomeView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminHomeView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminHomeView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminHomeView.class.getName()).log(java.util.logging.Level.SEVERE,
                    null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminHomeView().setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCheckIn;
    private javax.swing.JButton btnCheckOut;
    private javax.swing.JButton btnGuests;
    private javax.swing.JButton btnRoomBooking;
    private javax.swing.JButton btnRooms;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblHome;
    // End of variables declaration//GEN-END:variables
}
