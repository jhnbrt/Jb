/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user_dashboard;

import config.session;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import jb.loginform;

/**
 *
 * @author PC
 */
public class user_dashboard extends javax.swing.JFrame {

    
    public user_dashboard() {
        initComponents();
        date();
        time();
    }
    Color navcolor =  new Color(204,204,204);
    Color hovercolor =  new Color(0,0,0);
    
    
    private void date() {
       
        Date d = new Date();
    
        SimpleDateFormat sdf = new SimpleDateFormat("MMMM dd,yyyy");
        String dt = sdf.format(d);
        cdate.setText(dt);
    }

    
        Timer t;
        SimpleDateFormat st;
    
    private void time(){

        t = new Timer(0, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                
                Date dt = new Date();
                st = new SimpleDateFormat("hh:mm:ss a");
                
                String tm = st.format(dt);
                ctime.setText(tm);
            }
        });
        
        t.start();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        ctime = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        cdate = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        p_add1 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        p_add2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cashierName = new javax.swing.JLabel();
        adminName = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        p_add7 = new javax.swing.JPanel();
        p_add5 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setLayout(null);

        ctime.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        ctime.setForeground(new java.awt.Color(255, 255, 255));
        ctime.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ctime.setText("00:00:00");
        jPanel1.add(ctime);
        ctime.setBounds(240, 40, 100, 15);

        jLabel2.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SEARCH:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(520, 30, 50, 17);

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 192, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jPanel1.add(jPanel3);
        jPanel3.setBounds(580, 20, 198, 27);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Now Showing:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 70, 109, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/441877926_762629292362510_8601897996805564709_n (4).jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(220, 100, 114, 175);

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/417076299_1712406199586238_3163263231560289225_n (1).jpg"))); // NOI18N
        jPanel1.add(jLabel9);
        jLabel9.setBounds(370, 100, 124, 175);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/345247350_210772321711135_6682477347780063946_n (1).jpg"))); // NOI18N
        jPanel1.add(jLabel11);
        jLabel11.setBounds(520, 100, 119, 175);

        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/441366260_1596625851192457_6791872998839692218_n (1).jpg"))); // NOI18N
        jPanel1.add(jLabel19);
        jLabel19.setBounds(670, 100, 140, 175);

        jLabel27.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("Theatre 4");
        jPanel1.add(jLabel27);
        jLabel27.setBounds(260, 280, 45, 14);

        jLabel5.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("(3:00 PM - 4:30 PM)");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(240, 290, 89, 14);

        jLabel28.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("Theatre 3");
        jPanel1.add(jLabel28);
        jLabel28.setBounds(410, 280, 45, 14);

        jLabel29.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("(1:00 PM - 2:230 PM)");
        jPanel1.add(jLabel29);
        jLabel29.setBounds(390, 290, 95, 14);

        jLabel32.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("Theatre 2");
        jPanel1.add(jLabel32);
        jLabel32.setBounds(560, 280, 45, 14);

        jLabel33.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setText("(10:00 AM - 12:00 PM)");
        jPanel1.add(jLabel33);
        jLabel33.setBounds(530, 290, 101, 14);

        jLabel34.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setText("Theatre 1");
        jPanel1.add(jLabel34);
        jLabel34.setBounds(710, 280, 45, 14);

        jLabel35.setFont(new java.awt.Font("Calibri", 0, 11)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setText("(8:00 AM- 9:30 AM)");
        jPanel1.add(jLabel35);
        jLabel35.setBounds(690, 290, 87, 14);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("Upcoming Movies:");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(230, 330, 142, 23);

        jLabel20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/441289601_922454466237298_3129241131942974731_n (1).jpg"))); // NOI18N
        jPanel1.add(jLabel20);
        jLabel20.setBounds(220, 360, 124, 175);

        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fd7423d5f07a46fcdacb5159517626e51538197757_full (1).jpg"))); // NOI18N
        jPanel1.add(jLabel22);
        jLabel22.setBounds(380, 360, 117, 175);

        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/371791290_2272707069785106_6322118491006261536_n (1).jpg"))); // NOI18N
        jPanel1.add(jLabel21);
        jLabel21.setBounds(530, 360, 117, 175);

        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/337228089_758268379024210_7449534471289416918_n (1).jpg"))); // NOI18N
        jPanel1.add(jLabel23);
        jLabel23.setBounds(680, 360, 118, 175);

        cdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cdate.setForeground(new java.awt.Color(255, 255, 255));
        cdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cdate.setText("Month/Day/Year");
        jPanel1.add(cdate);
        cdate.setBounds(230, 10, 118, 17);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        p_add1.setBackground(new java.awt.Color(0, 0, 0));
        p_add1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add1MouseExited(evt);
            }
        });
        p_add1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-dashboard-24 (1).png"))); // NOI18N
        jLabel12.setText("DASHBOARD");
        p_add1.add(jLabel12);
        jLabel12.setBounds(-10, 0, 190, 40);

        jPanel2.add(p_add1, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 178, 176, 41));

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

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reports-24.png"))); // NOI18N
        jLabel13.setText("VIEW REPORTS");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel13MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel13MouseExited(evt);
            }
        });

        javax.swing.GroupLayout p_add2Layout = new javax.swing.GroupLayout(p_add2);
        p_add2.setLayout(p_add2Layout);
        p_add2Layout.setHorizontalGroup(
            p_add2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        p_add2Layout.setVerticalGroup(
            p_add2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(p_add2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 225, 196, 41));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-admin-50.png"))); // NOI18N
        jLabel7.setText("admin");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 52, -1));

        cashierName.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        cashierName.setForeground(new java.awt.Color(255, 255, 255));
        cashierName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cashierName.setText("CASHIER");
        jPanel2.add(cashierName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, -1, 17));

        adminName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        adminName.setForeground(new java.awt.Color(255, 255, 255));
        adminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminName.setText("Name");
        jPanel2.add(adminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 100, -1, 31));

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-log-out-24.png"))); // NOI18N
        jLabel18.setText("Log out");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 350, 186, 40));

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
        p_add5.setLayout(null);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-ticket-purchase-30.png"))); // NOI18N
        jLabel30.setText("RESERVATION");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        p_add5.add(jLabel30);
        jLabel30.setBounds(0, 0, 180, 40);

        javax.swing.GroupLayout p_add7Layout = new javax.swing.GroupLayout(p_add7);
        p_add7.setLayout(p_add7Layout);
        p_add7Layout.setHorizontalGroup(
            p_add7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_add5, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        p_add7Layout.setVerticalGroup(
            p_add7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_add5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(p_add7, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 313, 176, 40));

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
        jPanel2.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 270, 190, 40));

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 197, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 815, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 545, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        user_IssuedTicket ads = new user_IssuedTicket();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void p_add7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add7MouseExited

    private void p_add7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add7MouseEntered

    private void p_add7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add7MouseClicked

    private void p_add5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add5MouseExited

    private void p_add5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add5MouseEntered

    private void p_add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseClicked

        user_IssuedTicket ads = new user_IssuedTicket();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add5MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        user_reservation ads = new user_reservation();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        loginform ads = new loginform();
        JOptionPane.showMessageDialog(null,"Logout Success!");
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void p_add2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add2MouseExited

    private void p_add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add2MouseEntered

    private void p_add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add2MouseClicked

    private void jLabel13MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseExited

    }//GEN-LAST:event_jLabel13MouseExited

    private void jLabel13MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseEntered

    }//GEN-LAST:event_jLabel13MouseEntered

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        user_Reports ads = new user_Reports();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel13MouseClicked

    private void p_add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseExited
        p_add1.setBackground(hovercolor);
    }//GEN-LAST:event_p_add1MouseExited

    private void p_add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseEntered
        p_add1.setBackground(navcolor);
    }//GEN-LAST:event_p_add1MouseEntered

    private void p_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseClicked
        user_dashboard ads = new user_dashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add1MouseClicked

     private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        session sess = session.getInstance();
        
        if (sess.getUid() == 0){
            JOptionPane.showMessageDialog(null,"No account, Login First!");
            loginform ads = new loginform();
            ads.setVisible(true);
            this.dispose();
        }else{
            cashierName.setText(""+sess.getFname());
            
        
        } 
    }        
    
    
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
            java.util.logging.Logger.getLogger(user_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminName;
    private javax.swing.JLabel cashierName;
    private javax.swing.JLabel cdate;
    private javax.swing.JLabel ctime;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel p_add1;
    private javax.swing.JPanel p_add2;
    private javax.swing.JPanel p_add5;
    private javax.swing.JPanel p_add7;
    // End of variables declaration//GEN-END:variables
}
