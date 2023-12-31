/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package examples;

import java.awt.List;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ranjit Bisai
 */
public class Body extends javax.swing.JFrame {

    /**
     * Creates new form Body
     */
    private DefaultTableModel model;
    
    public Body() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        preview = new javax.swing.JButton();
        add = new javax.swing.JButton();
        del = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableone = new javax.swing.JTable();
        edit = new javax.swing.JButton();
        phone = new javax.swing.JTextField();
        id = new javax.swing.JTextField();
        lastname = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        firstname = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(1130, 745));
        setMinimumSize(new java.awt.Dimension(1130, 735));
        setPreferredSize(new java.awt.Dimension(1118, 745));
        setSize(new java.awt.Dimension(1130, 745));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        preview.setBackground(new java.awt.Color(153, 204, 0));
        preview.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        preview.setForeground(new java.awt.Color(0, 51, 204));
        preview.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/users.png"))); // NOI18N
        preview.setText("Preview");
        preview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                previewActionPerformed(evt);
            }
        });
        jPanel1.add(preview);
        preview.setBounds(400, 80, 154, 60);

        add.setBackground(new java.awt.Color(0, 102, 0));
        add.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        add.setForeground(new java.awt.Color(255, 255, 255));
        add.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/users.png"))); // NOI18N
        add.setText("Add");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        jPanel1.add(add);
        add.setBounds(10, 80, 120, 60);

        del.setBackground(new java.awt.Color(204, 0, 51));
        del.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        del.setForeground(new java.awt.Color(255, 255, 255));
        del.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/users.png"))); // NOI18N
        del.setText("Del");
        del.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delActionPerformed(evt);
            }
        });
        jPanel1.add(del);
        del.setBounds(140, 80, 120, 60);

        tableone.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tableone.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        tableone.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Customer-ID", "First Name", "Last Name", "Phone"
            }
        ));
        tableone.setGridColor(new java.awt.Color(51, 153, 0));
        tableone.setRowHeight(35);
        tableone.setSelectionBackground(new java.awt.Color(204, 102, 0));
        tableone.setSelectionForeground(new java.awt.Color(255, 255, 255));
        tableone.setShowGrid(true);
        tableone.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableoneMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableone);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(0, 150, 560, 550);

        edit.setBackground(new java.awt.Color(153, 204, 255));
        edit.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        edit.setForeground(new java.awt.Color(0, 51, 204));
        edit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/users.png"))); // NOI18N
        edit.setText("Edit");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel1.add(edit);
        edit.setBounds(270, 80, 120, 60);

        phone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                phoneActionPerformed(evt);
            }
        });
        jPanel1.add(phone);
        phone.setBounds(410, 30, 130, 40);

        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });
        jPanel1.add(id);
        id.setBounds(10, 30, 70, 40);

        lastname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lastnameActionPerformed(evt);
            }
        });
        jPanel1.add(lastname);
        lastname.setBounds(270, 30, 130, 40);

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 0, 51));
        jLabel2.setText("Last Name");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(280, 0, 110, 24);

        jLabel4.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 0, 51));
        jLabel4.setText("Phone");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(450, 0, 110, 24);

        jLabel5.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 0, 51));
        jLabel5.setText("id");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 0, 110, 24);

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 0, 51));
        jLabel6.setText("First Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(90, 0, 110, 24);

        firstname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                firstnameActionPerformed(evt);
            }
        });
        jPanel1.add(firstname);
        firstname.setBounds(90, 30, 170, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/pink-blue-and-white-abstract-art-2560x1600.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 560, 700);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 560, 700);

        jPanel2.setLayout(null);

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane2.setViewportView(jTable2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 546, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 576, Short.MAX_VALUE)
        );

        jPanel2.add(jPanel3);
        jPanel3.setBounds(0, 120, 550, 580);

        jLabel3.setFont(new java.awt.Font("Eras Bold ITC", 1, 45)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 102, 255));
        jLabel3.setText("Customer Information");
        jPanel2.add(jLabel3);
        jLabel3.setBounds(10, 0, 540, 53);

        jButton4.setBackground(new java.awt.Color(255, 255, 153));
        jButton4.setFont(new java.awt.Font("sansserif", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Resources/matt-icons_printer-printing.png"))); // NOI18N
        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton4);
        jButton4.setBounds(390, 60, 150, 50);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(560, 0, 560, 700);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton4ActionPerformed

    private void phoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_phoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_phoneActionPerformed

    private void delActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_delActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    private void previewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_previewActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_previewActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        try {

            //  final String User_name = "sql6631826";
            //   final String password = "1XIiA7vhxM";
            //String url = "sql6.freemysqlhosting.net";
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6631826", "sql6631826", "1XIiA7vhxM");
            //String query = "INSERT INTO customer(id,first_name,last_name,phone) VALUES(?, ?, ?, ?)";
            // PreparedStatement statement = con.prepareStatement(query);
            //statement.setInt(1, 3);
            //statement.setString(2, "mouse");
            //statement.setString(3, "keyboard");
            //statement.setString(4, "9383898398");

            // statement.executeUpdate();     
            // fetching mysql data
            int id_number = Integer.parseInt(id.getText());
            String first_name = firstname.getText();
            String last_name = lastname.getText();
            String phone_number = phone.getText();
            String sql = "INSERT INTO customer (id,first_name,last_name,phone)VALUES(?, ?, ?, ?)";
            PreparedStatement statement = con.prepareStatement(sql);
            statement.setInt(1, id_number);
            statement.setString(2, first_name);
            statement.setString(3, last_name);
            statement.setString(4, phone_number);
            int b = statement.executeUpdate();

            if (b > 0) {

                JOptionPane.showMessageDialog(null, "Data Saved Sucessfully", "Message Dialog", HEIGHT);
                String showtabledata = "SELECT * FROM customer";
                ResultSet resultSet = statement.executeQuery(showtabledata);
                while (resultSet.next()) {
                    int column1Value = resultSet.getInt("id");
                    String column2Value = resultSet.getString("first_name");
                    String column3Value = resultSet.getString("last_name");
                    String column4Value = resultSet.getString("phone");
                    System.out.println(column1Value);
                    System.out.println(column2Value);
                    System.out.println(column3Value);
                    System.out.println(column4Value);
                   model = (DefaultTableModel) tableone.getModel();
                 //  model.setRowCount(0);
                  model.addRow(new Object[]{column1Value,column2Value,column3Value,column4Value});
                  

                }
            } else {
                JOptionPane.showMessageDialog(null, "Internal Error", "Message Dialog", HEIGHT);
            }

            statement.close();
            con.close();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_addActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void lastnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lastnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lastnameActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
       try{   
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://sql6.freemysqlhosting.net:3306/sql6631826", "sql6631826", "1XIiA7vhxM");
           String showtabledata = "SELECT * FROM customer";
           PreparedStatement statement = con.prepareStatement(showtabledata);
                ResultSet resultSet = statement.executeQuery(showtabledata);
                while (resultSet.next()) {
                    int column1Value = resultSet.getInt("id");
                    String column2Value = resultSet.getString("first_name");
                    String column3Value = resultSet.getString("last_name");
                    String column4Value = resultSet.getString("phone");
                    System.out.println(column1Value);
                    System.out.println(column2Value);
                    System.out.println(column3Value);
                    System.out.println(column4Value);
                   model = (DefaultTableModel) tableone.getModel();
                  // model.setRowCount(1);
                  model.addRow(new Object[]{column1Value,column2Value,column3Value,column4Value});
                  

                }}catch(Exception e){
           e.printStackTrace();
       }


    }//GEN-LAST:event_formWindowOpened

    private void firstnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_firstnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_firstnameActionPerformed

    private void tableoneMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableoneMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tableoneMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Body.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Body.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Body.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Body.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Body().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add;
    private javax.swing.JButton del;
    private javax.swing.JButton edit;
    private javax.swing.JTextField firstname;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField lastname;
    private javax.swing.JTextField phone;
    private javax.swing.JButton preview;
    private javax.swing.JTable tableone;
    // End of variables declaration//GEN-END:variables
}
