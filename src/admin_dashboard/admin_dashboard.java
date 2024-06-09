/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_dashboard;


import config.dbconnector;
import config.session;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.Timer;
import jb.loginform;
/**
 *
 * @author Dela Cuesta
 */
public class admin_dashboard extends javax.swing.JFrame {

    /**
     * Creates new form admin_dashboard
     */
    public admin_dashboard() {
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
        date.setText(dt);
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
                time.setText(tm);
            }
        });
        
        t.start();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
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
        jLabel17 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        p_add1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        p_add4 = new javax.swing.JPanel();
        jLabel30 = new javax.swing.JLabel();
        p_add7 = new javax.swing.JPanel();
        jLabel31 = new javax.swing.JLabel();
        p_add8 = new javax.swing.JPanel();
        jLabel36 = new javax.swing.JLabel();
        p_add9 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userName1 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        cdate = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel41 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        p_add = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
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
        jPanel6 = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        date = new javax.swing.JLabel();
        time = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("...");
        jLabel17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel17MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel17);
        jLabel17.setBounds(820, 510, 24, 29);

        jPanel4.setBackground(new java.awt.Color(0, 0, 0));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(72, 149, 239));
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });

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

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-dashboard-24 (1).png"))); // NOI18N
        jLabel15.setText("DASHBOARD");
        p_add1.add(jLabel15);
        jLabel15.setBounds(10, 0, 140, 40);

        p_add4.setBackground(new java.awt.Color(0, 0, 0));
        p_add4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add4MouseExited(evt);
            }
        });
        p_add4.setLayout(null);

        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-reports-24.png"))); // NOI18N
        jLabel30.setText("VIEW REPORTS");
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        p_add4.add(jLabel30);
        jLabel30.setBounds(20, 0, 130, 40);

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

        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-history-24.png"))); // NOI18N
        jLabel31.setText("VIEW HISTORY");
        jLabel31.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel31MouseClicked(evt);
            }
        });
        p_add7.add(jLabel31);
        jLabel31.setBounds(20, 0, 140, 40);

        p_add8.setBackground(new java.awt.Color(0, 0, 0));
        p_add8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add8MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add8MouseExited(evt);
            }
        });
        p_add8.setLayout(null);

        jLabel36.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(255, 255, 255));
        jLabel36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-ticket-26.png"))); // NOI18N
        jLabel36.setText("ISSUED TICKET");
        jLabel36.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel36MouseClicked(evt);
            }
        });
        p_add8.add(jLabel36);
        jLabel36.setBounds(0, 0, 150, 40);

        p_add9.setBackground(new java.awt.Color(0, 0, 0));
        p_add9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_add9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                p_add9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                p_add9MouseExited(evt);
            }
        });
        p_add9.setLayout(null);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-admin-50.png"))); // NOI18N
        jLabel37.setText("admin");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CASHIER");

        userName1.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        userName1.setForeground(new java.awt.Color(255, 255, 255));
        userName1.setText("Name");
        userName1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                userName1MouseClicked(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-log-out-24.png"))); // NOI18N
        jLabel38.setText("Log out");
        jLabel38.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel38MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(p_add1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_add4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_add9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(p_add7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(p_add8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel37, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(userName1)
                            .addComponent(jLabel3))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(63, 63, 63))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel37)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(userName1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)))
                .addComponent(p_add1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_add4, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_add7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(p_add8, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(p_add9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(112, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel4);
        jPanel4.setBounds(0, 0, 200, 570);

        cdate.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        cdate.setForeground(new java.awt.Color(255, 255, 255));
        cdate.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cdate.setText("Month/Day/Year");
        jPanel1.add(cdate);
        cdate.setBounds(230, 10, 118, 17);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 597, -1, -1));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(null);

        jLabel41.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 51));
        jLabel41.setText("Now Showing:");
        jPanel5.add(jLabel41);
        jLabel41.setBounds(220, 70, 150, 21);

        jLabel42.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/file (9).png"))); // NOI18N
        jPanel5.add(jLabel42);
        jLabel42.setBounds(210, 60, 640, 260);

        jLabel55.setBackground(new java.awt.Color(255, 255, 255));
        jLabel55.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 0));
        jLabel55.setText("Up Next:");
        jPanel5.add(jLabel55);
        jLabel55.setBounds(220, 330, 90, 20);

        jLabel56.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/441289601_922454466237298_3129241131942974731_n (1).jpg"))); // NOI18N
        jPanel5.add(jLabel56);
        jLabel56.setBounds(220, 370, 124, 175);

        jLabel57.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/fd7423d5f07a46fcdacb5159517626e51538197757_full (1).jpg"))); // NOI18N
        jPanel5.add(jLabel57);
        jLabel57.setBounds(380, 370, 117, 175);

        jLabel58.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/371791290_2272707069785106_6322118491006261536_n (1).jpg"))); // NOI18N
        jPanel5.add(jLabel58);
        jLabel58.setBounds(530, 370, 120, 175);

        jLabel59.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/337228089_758268379024210_7449534471289416918_n (1).jpg"))); // NOI18N
        jPanel5.add(jLabel59);
        jLabel59.setBounds(680, 370, 118, 175);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        jLabel6.setBounds(0, 0, 200, 40);

        jPanel2.add(p_add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 178, 200, 41));

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
            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        p_add15Layout.setVerticalGroup(
            p_add15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel61, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        jPanel2.add(p_add15, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 411, -1, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/icons8-admin-50.png"))); // NOI18N
        jLabel10.setText("admin");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 60, 50, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("ADMIN");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 110, -1, 20));

        adminName.setFont(new java.awt.Font("Calibri", 1, 14)); // NOI18N
        adminName.setForeground(new java.awt.Color(255, 255, 255));
        adminName.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        adminName.setText("Name");
        jPanel2.add(adminName, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 120, -1, 31));

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

        jPanel5.add(jPanel2);
        jPanel2.setBounds(0, 0, 201, 590);

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.darkGray, java.awt.Color.white, java.awt.Color.black, java.awt.Color.lightGray));

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 184, Short.MAX_VALUE)
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 14, Short.MAX_VALUE)
        );

        jPanel5.add(jPanel6);
        jPanel6.setBounds(600, 10, 190, 20);

        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(255, 255, 255));
        jLabel39.setText("Search:");
        jPanel5.add(jLabel39);
        jLabel39.setBounds(550, 10, 50, 20);

        date.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        date.setForeground(new java.awt.Color(255, 255, 255));
        date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date.setText("Month/Day/Year");
        jPanel5.add(date);
        date.setBounds(220, 10, 118, 17);

        time.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        time.setForeground(new java.awt.Color(255, 255, 255));
        time.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time.setText("00:00:00");
        jPanel5.add(time);
        time.setBounds(230, 30, 100, 15);

        jLabel43.setFont(new java.awt.Font("Georgia", 1, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(255, 255, 51));
        jLabel43.setText("Now Showing:");
        jPanel5.add(jLabel43);
        jLabel43.setBounds(220, 70, 150, 21);

        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 10, 869, 591));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {   
        
        session sess = session.getInstance();
       
       if(sess.getUid() == 0){
            JOptionPane.showMessageDialog(null, "No Account, Log in First! ","Notice", JOptionPane.ERROR_MESSAGE);
            loginform ads = new loginform();
            ads.setVisible(true);
            this.dispose();
       }else{
          
           try{
           dbconnector dbc = new dbconnector();
           ResultSet rs = dbc.getData("SELECT * FROM tbl_u WHERE u_id = '"+sess.getUid()+"'");
           
           
           
           if(rs.next()){
               
           }
           
           }catch(SQLException ex){
                 System.out.println(""+ex);
         
        }
              
       }
       
    }        
    
    
    
    private void jLabel17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel17MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel17MouseClicked

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel12MouseClicked

    private void p_add1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseClicked
        admin_dashboard ads = new admin_dashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add1MouseClicked

    private void p_add1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseEntered
        
    }//GEN-LAST:event_p_add1MouseEntered

    private void p_add1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add1MouseExited
        
    }//GEN-LAST:event_p_add1MouseExited

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseClicked

    private void p_add4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add4MouseClicked

    private void p_add4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add4MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add4MouseEntered

    private void p_add4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add4MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add4MouseExited

    private void jLabel31MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel31MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel31MouseClicked

    private void p_add7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add7MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add7MouseClicked

    private void p_add7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add7MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add7MouseEntered

    private void p_add7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add7MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add7MouseExited

    private void jLabel36MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel36MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel36MouseClicked

    private void p_add8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add8MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add8MouseClicked

    private void p_add8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add8MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add8MouseEntered

    private void p_add8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add8MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add8MouseExited

    private void p_add9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add9MouseClicked
        loginform ads = new loginform();
        JOptionPane.showMessageDialog(null,"Logout Success!");
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add9MouseClicked

    private void p_add9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add9MouseEntered
       
    }//GEN-LAST:event_p_add9MouseEntered

    private void p_add9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add9MouseExited
       
    }//GEN-LAST:event_p_add9MouseExited

    private void userName1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_userName1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_userName1MouseClicked

    private void jLabel38MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel38MouseClicked
        loginform ads = new loginform();
        JOptionPane.showMessageDialog(null,"Logout Success!");
        ads.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_jLabel38MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        Reports u = new Reports();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel18MouseClicked

    private void p_add3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add3MouseExited

    private void p_add3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add3MouseEntered

    private void p_add3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add3MouseClicked
        IssuedTicket u = new IssuedTicket();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add3MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        IssuedTicket u = new IssuedTicket();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel14MouseClicked
        SystemLogs u = new SystemLogs();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel14MouseClicked

    private void p_addMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseExited
        p_add.setBackground(hovercolor);
    }//GEN-LAST:event_p_addMouseExited

    private void p_addMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseEntered
        p_add.setBackground(navcolor);
    }//GEN-LAST:event_p_addMouseEntered

    private void p_addMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_addMouseClicked
        admin_dashboard ads = new admin_dashboard();
        ads.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_addMouseClicked

    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
        loginform ads = new loginform();
        JOptionPane.showMessageDialog(null,"Logout Success!");
        ads.setVisible(true);
        this.dispose();        
    }//GEN-LAST:event_jLabel7MouseClicked

    private void jLabel61MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel61MouseClicked
        ManageMovies u = new ManageMovies();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLabel61MouseClicked

    private void p_add5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add5MouseExited

    private void p_add5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add5MouseEntered

    private void p_add5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add5MouseClicked
        user u = new user();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add5MouseClicked

    private void p_add15MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add15MouseExited
        p_add1.setBackground(hovercolor);
    }//GEN-LAST:event_p_add15MouseExited

    private void p_add15MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add15MouseEntered
        p_add1.setBackground(navcolor);
    }//GEN-LAST:event_p_add15MouseEntered

    private void p_add15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add15MouseClicked
        user u = new user();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_p_add15MouseClicked

    private void p_add2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add2MouseExited

    private void p_add2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_p_add2MouseEntered

    private void p_add2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_add2MouseClicked

    }//GEN-LAST:event_p_add2MouseClicked

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
            java.util.logging.Logger.getLogger(admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(admin_dashboard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new admin_dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel adminName;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel cdate;
    private javax.swing.JLabel ctime;
    private javax.swing.JLabel date;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
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
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel p_add;
    private javax.swing.JPanel p_add1;
    private javax.swing.JPanel p_add15;
    private javax.swing.JPanel p_add2;
    private javax.swing.JPanel p_add3;
    private javax.swing.JPanel p_add4;
    private javax.swing.JPanel p_add5;
    private javax.swing.JPanel p_add7;
    private javax.swing.JPanel p_add8;
    private javax.swing.JPanel p_add9;
    private javax.swing.JLabel time;
    private javax.swing.JLabel userName1;
    // End of variables declaration//GEN-END:variables
}
