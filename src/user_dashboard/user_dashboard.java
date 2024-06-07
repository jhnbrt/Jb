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
        jLabel25 = new javax.swing.JLabel();
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
        jLabel26 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        p_add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        p_add2 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        p_add3 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        p_add5 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        p_add6 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        cdate = new javax.swing.JLabel();

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

        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("________________________________________________________________________________________________________________");
        jPanel1.add(jLabel25);
        jLabel25.setBounds(212, 50, 650, 20);

        jLabel4.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Now Showing:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(220, 70, 109, 23);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/441877926_762629292362510_8601897996805564709_n (4).jpg"))); // NOI18N
        jPanel1.add(jLabel8);
        jLabel8.setBounds(230, 100, 114, 175);

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

        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setText("________________________________________________________________________________________________________________");
        jPanel1.add(jLabel26);
        jLabel26.setBounds(212, 310, 650, 14);

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

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(72, 149, 239));
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
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
        p_add2.setLayout(null);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reports-24.png"))); // NOI18N
        jLabel13.setText("VIEW REPORTS");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        p_add2.add(jLabel13);
        jLabel13.setBounds(20, 0, 130, 40);

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

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-history-24.png"))); // NOI18N
        jLabel14.setText("VIEW HISTORY");
        jLabel14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel14MouseClicked(evt);
            }
        });
        p_add3.add(jLabel14);
        jLabel14.setBounds(20, 0, 140, 40);

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
        p_add5.add(jLabel16);
        jLabel16.setBounds(0, 0, 150, 40);

        p_add6.setBackground(new java.awt.Color(0, 0, 0));
        p_add6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add6MouseExited(evt);
            }
        });
        p_add6.setLayout(null);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-admin-50.png"))); // NOI18N
        jLabel7.setText("admin");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CASHIER");

        userName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        userName.setForeground(new java.awt.Color(255, 255, 255));
        userName.setText("Name");
        userName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userNameMouseClicked(evt);
            }
        });

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

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_add, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_add2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_add6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_add3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p_add5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userName)
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)))
                .addComponent(p_add, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_add2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_add3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_add5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(p_add6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(0, 0, 200, 570);

        cdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cdate.setForeground(new java.awt.Color(255, 255, 255));
        cdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cdate.setText("Month/Day/Year");
        jPanel1.add(cdate);
        cdate.setBounds(230, 10, 118, 17);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 854, Short.MAX_VALUE)
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

     private void formWindowActivated(java.awt.event.WindowEvent evt) {                                     
        session sess = session.getInstance();
        
        if (sess.getUid() == 0){
            JOptionPane.showMessageDialog(null,"No account, Login First!");
            loginform ads = new loginform();
            ads.setVisible(true);
            this.dispose();
        }else{
            userName.setText(""+sess.getFname());
            
        
        } 
    }        
    
    
    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
        user_dashboard ads = new user_dashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_addMouseClicked

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered
        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited
        p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_addMouseExited

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel13MouseClicked

    private void p_add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add2MouseClicked

    private void p_add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add2MouseEntered

    private void p_add2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add2MouseExited

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel14MouseClicked

    private void p_add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add3MouseClicked

    private void p_add3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add3MouseEntered

    private void p_add3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add3MouseExited

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel16MouseClicked

    private void p_add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add5MouseClicked

    private void p_add5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add5MouseEntered

    private void p_add5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add5MouseExited

    private void p_add6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add6MouseClicked
        loginform ads = new loginform();
        JOptionPane.showMessageDialog(null,"Logout Success!");
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add6MouseClicked

    private void p_add6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add6MouseEntered
        p_add6.setBackground(navcolor);
    }//GEN-LAST:event_p_add6MouseEntered

    private void p_add6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add6MouseExited
        p_add6.setBackground(hovercolor);
    }//GEN-LAST:event_p_add6MouseExited

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        loginform ads = new loginform();
        JOptionPane.showMessageDialog(null,"Logout Success!");
        ads.setVisible(true);
        this.dispose();
        

        
    }//GEN-LAST:event_jLabel18MouseClicked

    private void userNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userNameMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userNameMouseClicked

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
    private javax.swing.JLabel cdate;
    private javax.swing.JLabel ctime;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
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
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel p_add;
    private javax.swing.JPanel p_add2;
    private javax.swing.JPanel p_add3;
    private javax.swing.JPanel p_add5;
    private javax.swing.JPanel p_add6;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
