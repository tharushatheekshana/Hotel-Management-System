/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package course.work.view;

import course.work.controller.CustomerController;
import course.work.controller.ReservationController;
import course.work.controller.RoomController;
import course.work.dto.CustomerDto;
import course.work.dto.ReservationDto;
import course.work.dto.RoomDto;
import course.work.entity.ReservationEntity;
import course.work.entity.RoomEntity;
import java.awt.event.ActionEvent;
import util.SessionFactoryConfiguration;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;

import org.hibernate.Session;

/**
 *
 * @author ASUS
 */
public class CustomerCancelBookingView extends javax.swing.JFrame {

    private RoomController roomController;
    private CustomerController customerController;
    private ReservationController reservationController;
    private SessionFactoryConfiguration sessionFactoryConfiguration = SessionFactoryConfiguration.getInstance();
    private String username;

    private List<RoomDto> roomDtos = new ArrayList<>();

    /**
     * Creates new form CheckOutView
     */
    public CustomerCancelBookingView() {
        customerController = new CustomerController();
        roomController = new RoomController();
        reservationController = new ReservationController();
        initComponents();
        setLocationRelativeTo(null);
        loadTable();
    }

    public CustomerCancelBookingView(String username) {
        this();
        this.username = username;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnRoomBooking = new javax.swing.JButton();
        btnRoomsCategory = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBookingId = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        lblPhone = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtCity = new javax.swing.JTextField();
        txtIDNo = new javax.swing.JTextField();
        txtPhone = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtCheckInDate = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtNationality = new javax.swing.JTextField();
        txtCheckOutDate = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        txtCheckInTime = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtCheckOutTime = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCancel = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("CANCEL BOOKING");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(332, 332, 332)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        btnRoomBooking.setText("ROOM BOOKING");
        btnRoomBooking.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomBookingActionPerformed(evt);
            }
        });

        btnRoomsCategory.setText("ROOMS CATEGORY");
        btnRoomsCategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRoomsCategoryActionPerformed(evt);
            }
        });

        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnBack.setText("< Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRoomBooking)
                    .addComponent(btnRoomsCategory)
                    .addComponent(btnCancel))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(btnRoomBooking)
                .addGap(18, 18, 18)
                .addComponent(btnRoomsCategory)
                .addGap(18, 18, 18)
                .addComponent(btnCancel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack)
                .addContainerGap())
        );

        jPanel4.setBackground(new java.awt.Color(153, 153, 153));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setText("Booking ID :");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 7, -1, 24));
        jPanel4.add(txtBookingId, new org.netbeans.lib.awtextra.AbsoluteConstraints(283, 6, 104, -1));

        lblName.setText("Name -");
        jPanel4.add(lblName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, -1, 26));

        jLabel4.setText("City - ");
        jPanel4.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 67, 26));

        jLabel5.setText("Address  -");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 80, 60, 26));

        jLabel6.setText("Nationality -");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 80, 26));

        jLabel7.setText("Email -");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 67, 26));

        lblPhone.setText("Phone No. -");
        jPanel4.add(lblPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 70, 26));

        jLabel9.setText("ID No. -");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 140, 64, 26));

        jLabel10.setText("Check In Date - ");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 90, 26));

        jLabel11.setText("Check Out Date - ");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 140, 105, 26));

        txtName.setEditable(false);
        jPanel4.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 50, 150, -1));

        txtCity.setEditable(false);
        jPanel4.add(txtCity, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 150, -1));

        txtIDNo.setEditable(false);
        jPanel4.add(txtIDNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 140, 140, -1));

        txtPhone.setEditable(false);
        jPanel4.add(txtPhone, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, 152, -1));

        txtAddress.setEditable(false);
        jPanel4.add(txtAddress, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 80, 140, -1));

        txtCheckInDate.setEditable(false);
        jPanel4.add(txtCheckInDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 80, 120, -1));

        txtEmail.setEditable(false);
        jPanel4.add(txtEmail, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 150, -1));

        txtNationality.setEditable(false);
        jPanel4.add(txtNationality, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 200, 140, -1));

        txtCheckOutDate.setEditable(false);
        jPanel4.add(txtCheckOutDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 140, 121, -1));

        jButton1.setText("CANCEL BOOKING");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(703, 365, 153, -1));

        jLabel12.setText("Check In Time - ");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        txtCheckInTime.setEditable(false);
        jPanel4.add(txtCheckInTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 40, 121, -1));

        jLabel13.setText("Check Out  Time -");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 186, 105, 20));

        txtCheckOutTime.setEditable(false);
        jPanel4.add(txtCheckOutTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 180, 121, -1));

        btnSearch.setText("Search");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel4.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(399, 6, -1, -1));

        tblCancel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblCancel);

        jScrollPane1.setViewportView(jScrollPane2);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 259, 850, 100));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(12, 12, 12)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    protected void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {

    }

    protected void btnRoomsCategoryActionPerformed(java.awt.event.ActionEvent evt) {
        new CustomerRoomCategoryView(username).setVisible(true);
        this.dispose();
    }

    protected void btnRoomBookingActionPerformed(java.awt.event.ActionEvent evt) {
        new CustomerRoomBookingView(username).setVisible(true);
        this.dispose();
    }

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnBackActionPerformed
        new CustomerHomeView(username).setVisible(true);
        this.dispose();
    }// GEN-LAST:event_btnBackActionPerformed

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_btnSearchActionPerformed
        search(); // TODO add your handling code here:
    }// GEN-LAST:event_btnSearchActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1ActionPerformed
        cancelBooking();
    }// GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerCancelBookingView.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerCancelBookingView.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerCancelBookingView.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerCancelBookingView.class.getName()).log(
                    java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerCancelBookingView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnRoomBooking;
    private javax.swing.JButton btnRoomsCategory;
    private javax.swing.JButton btnSearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblPhone;
    private javax.swing.JTable tblCancel;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBookingId;
    private javax.swing.JTextField txtCheckInDate;
    private javax.swing.JTextField txtCheckInTime;
    private javax.swing.JTextField txtCheckOutDate;
    private javax.swing.JTextField txtCheckOutTime;
    private javax.swing.JTextField txtCity;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtIDNo;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtNationality;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

    private void search() {
        Integer BookingID = Integer.parseInt(txtBookingId.getText());

        Session session = SessionFactoryConfiguration.getInstance().getSession();
        ReservationEntity entity = session.get(ReservationEntity.class, BookingID);
        int roomNo = entity.getRoom();

        try {
            CustomerDto customer = customerController.getCustomer(roomNo);

            if (customer != null) {
                txtName.setText(customer.getName());
                txtPhone.setText(Integer.toString(customer.getPhone()));
                txtEmail.setText(customer.getEmail());
                txtAddress.setText(customer.getAddress());
                txtCity.setText(customer.getCity());
                txtNationality.setText(customer.getNationality());
                txtIDNo.setText(Integer.toString(customer.getIdNo()));

                SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
                txtCheckInDate.setText(dateFormat.format(customer.getCheckInDate()));
                txtCheckOutDate.setText(dateFormat.format(customer.getCheckOutDate()));

                txtCheckInTime.setText(customer.getCheckInTime().toString());
                txtCheckOutTime.setText(customer.getCheckOutTime().toString());

            } else {
                JOptionPane.showMessageDialog(this, "Customer Not Found");
            }
        } catch (Exception ex) {
            Logger.getLogger(CustomerCancelBookingView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void cancelBooking() {

        try {

            Integer ID = Integer.parseInt(txtBookingId.getText());
            Session session = SessionFactoryConfiguration.getInstance().getSession();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");

            ReservationEntity entity = session.get(ReservationEntity.class, ID);
            if (entity == null) {
                JOptionPane.showMessageDialog(this, "Booking with ID " + ID + " not found.");
                return;
            }
            Date reservationTime = sdf.parse(entity.getDate());
            Integer id = entity.getRoom();

            // Calculate the time difference in milliseconds
            long timeDifference = System.currentTimeMillis() - reservationTime.getTime();
            long hoursDifference = timeDifference / (60 * 60 * 1000);

            // Check if 24 hours have passed
            if (hoursDifference <= 24) {
                int result = JOptionPane.showConfirmDialog(this, "Unfortunately, since more than 24 hours have passed since your booking, we are unable to process refunds.\nIf you still wish to cancel, please let us know how you would like to proceed.", "Confirm", JOptionPane.YES_NO_CANCEL_OPTION);

                if (result == JOptionPane.YES_OPTION) {
                    String resp2 = reservationController.deleteReservation(ID);
                    String resp = customerController.deleteCustomer(id);
                    JOptionPane.showMessageDialog(this, resp2);
                    clear();
                }
            } else {
                String resp2 = reservationController.deleteReservation(ID);
                String resp = customerController.deleteCustomer(id);
                JOptionPane.showMessageDialog(this, resp2);
                clear();
            }

        } catch (Exception ex) {
            Logger.getLogger(CustomerCancelBookingView.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }

    public void clear() {
        txtBookingId.setText("");
        txtName.setText("");
        txtPhone.setText("");
        txtEmail.setText("");
        txtAddress.setText("");
        txtCity.setText("");
        txtNationality.setText("");
        txtIDNo.setText("");
        txtCheckInDate.setText("");
        txtCheckOutDate.setText("");
        txtCheckInTime.setText("");
        txtCheckOutTime.setText("");
    }
    
        private void loadTable() {
           try {
               String[] columns = { "Name", "Phone", "Email", "Address", "City", "Country", "ID" };
               DefaultTableModel dtm = new DefaultTableModel(columns, 0) {
                   @Override
                   public boolean isCellEditable(int row, int column) {
                       return false;
                   }
               };
               tblCancel.setModel(dtm);

               List<RoomDto> roomList = roomController.getAll();
               for (RoomDto roomDto : roomList) {
                   Object[] rowData = { roomDto.getCustName(), roomDto.getRoomNo(), roomDto.getRoomType(),
                           roomDto.getRoomPackage(), roomDto.getStatus() };
                   dtm.addRow(rowData);
               }
           } catch (Exception ex) {
               Logger.getLogger(ManageRoomView.class.getName()).log(Level.SEVERE, null, ex);
           }
       }

}
