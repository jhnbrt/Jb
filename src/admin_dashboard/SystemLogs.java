/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_dashboard;

import config.dbconnector;
import config.session;
import java.awt.Color;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import jb.loginform;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author PC
 */
public class SystemLogs extends javax.swing.JFrame {

    /**
     * Creates new form History
     */
    public SystemLogs() {
        initComponents();
        displayLogs(); 
    }

    Color navcolor =  new Color(204,204,204);
    Color hovercolor =  new Color(0,0,0);
    
          public void displayLogs() {
    try {
        dbconnector dbc = new dbconnector();
        String query = "SELECT l.log_id, CONCAT(u.u_id, ' - ', u.account_type) AS user_info, l.log_event, l.log_timestamp " +
                       "FROM tbl_logs l " +
                       "JOIN tbl_u u ON l.u_id = u.u_id " +
                       "ORDER BY l.log_timestamp DESC";
        ResultSet rs = dbc.getData(query);
        tbl_logs.setModel(DbUtils.resultSetToTableModel(rs));

        JTableHeader th = tbl_logs.getTableHeader();
        TableColumnModel tcm = th.getColumnModel();

        TableColumn tc0 = tcm.getColumn(0); 
        TableColumn tc1 = tcm.getColumn(1); 
        TableColumn tc2 = tcm.getColumn(2); 
        TableColumn tc3 = tcm.getColumn(3); 

        tc0.setHeaderValue("Log ID");
        tc1.setHeaderValue("User");
        tc2.setHeaderValue("EVENT");
        tc3.setHeaderValue("TIME");


        tbl_logs.removeColumn(tc0);

        rs.close();
    } catch (SQLException ex) {
        System.out.println("Errors: " + ex.getMessage());
    }
}
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        p_add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_logs = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        p_add7 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        p_add2 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        p_add3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        p_add5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        p_add15 = new javax.swing.JPanel();
        jLabel61 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        adminName = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        p_add.setBackground(new java.awt.Color(0, 0, 0));
        p_add.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_addMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_addMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_addMouseExited(evt);
            }
        });
        p_add.setLayout(null);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-dashboard-24 (1).png"))); // NOI18N
        jLabel6.setText("DASHBOARD");
        p_add.add(jLabel6);
        jLabel6.setBounds(10, 0, 140, 40);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SYSTEM LOGS");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(230, 30, 180, 40);

        tbl_logs.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbl_logs);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(20, 80, 600, 402);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_add7.setBackground(new java.awt.Color(0, 0, 0));
        p_add7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add7MouseExited(evt);
            }
        });
        p_add7.setLayout(null);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-dashboard-24 (1).png"))); // NOI18N
        jLabel9.setText("DASHBOARD");
        p_add7.add(jLabel9);
        jLabel9.setBounds(0, 0, 200, 40);

        jPanel2.add(p_add7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 178, 200, 41));

        p_add2.setBackground(new java.awt.Color(0, 0, 0));
        p_add2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add2MouseExited(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-history-24.png"))); // NOI18N
        jLabel14.setText("SYSTEM LOGS");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p_add2Layout = new javax.swing.GroupLayout(p_add2);
        p_add2.setLayout(p_add2Layout);
        p_add2Layout.setHorizontalGroup(
            p_add2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        p_add2Layout.setVerticalGroup(
            p_add2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(p_add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 268, -1, -1));

        p_add3.setBackground(new java.awt.Color(0, 0, 0));
        p_add3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add3MouseExited(evt);
            }
        });
        p_add3.setLayout(null);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-ticket-26.png"))); // NOI18N
        jLabel16.setText("ISSUED TICKET");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
        });
        p_add3.add(jLabel16);
        jLabel16.setBounds(0, -10, 200, 40);

        jPanel2.add(p_add3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 326, 200, 35));

        p_add5.setBackground(new java.awt.Color(0, 0, 0));
        p_add5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add5MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add5MouseExited(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-user-24.png"))); // NOI18N
        jLabel13.setText("USERS");

        javax.swing.GroupLayout p_add5Layout = new javax.swing.GroupLayout(p_add5);
        p_add5.setLayout(p_add5Layout);
        p_add5Layout.setHorizontalGroup(
            p_add5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        p_add5Layout.setVerticalGroup(
            p_add5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(p_add5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 365, -1, -1));

        p_add15.setBackground(new java.awt.Color(0, 0, 0));
        p_add15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add15MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add15MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add15MouseExited(evt);
            }
        });

        jLabel61.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-manage-30.png"))); // NOI18N
        jLabel61.setText("MANAGE MOVIES");
        jLabel61.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel61MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout p_add15Layout = new javax.swing.GroupLayout(p_add15);
        p_add15.setLayout(p_add15Layout);
        p_add15Layout.setHorizontalGroup(
            p_add15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel61, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        p_add15Layout.setVerticalGroup(
            p_add15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(p_add15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 411, 200, -1));

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-admin-50.png"))); // NOI18N
        jLabel10.setText("admin");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 170, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 110, 200, 17));

        adminName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        adminName.setForeground(new java.awt.Color(255, 0, 0));
        adminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminName.setText("Full Name");
        jPanel2.add(adminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 130, 200, 31));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reports-24.png"))); // NOI18N
        jLabel18.setText("VIEW REPORTS");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 225, 200, 40));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-log-out-24.png"))); // NOI18N
        jLabel7.setText("Log out");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 462, 200, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(649, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(96, 96, 96)
                .addComponent(p_add, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(164, 164, 164)
                .addComponent(p_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 541, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
        admin_dashboard ads = new admin_dashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_addMouseClicked

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered
       
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited
       
    }//GEN-LAST:event_p_addMouseExited

    private void p_add7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add7MouseClicked
        admin_dashboard ads = new admin_dashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add7MouseClicked

    private void p_add7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add7MouseEntered
        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_add7MouseEntered

    private void p_add7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add7MouseExited
        p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_add7MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        SystemLogs u = new SystemLogs();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void p_add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseClicked

    }//GEN-LAST:event_p_add2MouseClicked

    private void p_add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add2MouseEntered

    private void p_add2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add2MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        Tickets u = new Tickets();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void p_add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseClicked
        Tickets u = new Tickets();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add3MouseClicked

    private void p_add3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add3MouseEntered

    private void p_add3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add3MouseExited

    private void p_add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseClicked
        user u = new user();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add5MouseClicked

    private void p_add5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add5MouseEntered

    private void p_add5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add5MouseExited

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
      ManageMovies ue = new ManageMovies();
        ue.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel61MouseClicked

    private void p_add15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add15MouseClicked
        user u = new user();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add15MouseClicked

    private void p_add15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add15MouseEntered
        p_add15.setBackground(navcolor);
    }//GEN-LAST:event_p_add15MouseEntered

    private void p_add15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add15MouseExited
        p_add15.setBackground(hovercolor);
    }//GEN-LAST:event_p_add15MouseExited

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        Reports u = new Reports();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
         session sess = session.getInstance();
        
        int userId = sess.getUid();
        
        logEvent(userId, "LOGOUT", "Admin logged out");
        
        
        loginform ads = new loginform();
        JOptionPane.showMessageDialog(null,"Logout Success!");
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel7MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        session sess = session.getInstance();

        if(sess.getUid() == 0){
            JOptionPane.showMessageDialog(null, "No Account, Log in First! ","Notice", JOptionPane.ERROR_MESSAGE);
            loginform ads = new loginform();
            ads.setVisible(true);
            this.dispose();
        }else{
            adminName.setText(sess.getFname() + " " + sess.getLname());
            try{
                dbconnector dbc = new dbconnector();
                ResultSet rs = dbc.getData("SELECT * FROM tbl_u WHERE u_id = '"+sess.getUid()+"'");

                if(rs.next()){

                }

            }catch(SQLException ex){
                System.out.println(""+ex);

            }

        }
    }//GEN-LAST:event_formWindowActivated

    /**
     * @param args the command line arguments
     */
    
     public void logEvent(int userId, String event, String description) {
   
        dbconnector dbc = new dbconnector();
        PreparedStatement pstmt = null;
        
    try {
     

        String sql = "INSERT INTO tbl_logs (log_timestamp, log_event, u_id, log_descript) VALUES (?, ?, ?, ?)";
        pstmt = dbc.connect.prepareStatement(sql);
        pstmt.setTimestamp(1, new Timestamp(new Date().getTime()));
        pstmt.setString(2, event);
        pstmt.setInt(3, userId);
        pstmt.setString(4, description);

        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
       
    }
    
 }
    
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
            java.util.logging.Logger.getLogger(SystemLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SystemLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SystemLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SystemLogs.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SystemLogs().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel p_add;
    private javax.swing.JPanel p_add15;
    private javax.swing.JPanel p_add2;
    private javax.swing.JPanel p_add3;
    private javax.swing.JPanel p_add5;
    private javax.swing.JPanel p_add7;
    private javax.swing.JTable tbl_logs;
    // End of variables declaration//GEN-END:variables
}
