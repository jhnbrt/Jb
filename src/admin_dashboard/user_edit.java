/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package admin_dashboard;

import config.PasswordHasher;
import jb.loginform;
import config.session;
import config.dbconnector;
import java.awt.Color;
import java.awt.Window;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;

/**
 *
 * @author SCC-COLLEGE
 */
public class user_edit extends javax.swing.JFrame {

    /**
     * Creates new form admin_dashboard
     */
    public user_edit() {
        initComponents();
        
    }
    
Color navcolor =  new Color(204,204,204);
    Color hovercolor =  new Color(0,0,0);
    
      public static String email, usname;
    
    public boolean dupCheck(){
        
        dbconnector dbc = new dbconnector();
        
        try{
            
            String query = "SELECT * FROM tbl_u  WHERE user_name = '" + usn.getText() + "' OR user_emel = '" + mail.getText() + "'";
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
             
                email = resultSet.getString("user_emel");
                if(email.equals(mail.getText())){
                    JOptionPane.showMessageDialog(null,"Email is Already Used!");
                    mail.setText("");
                }
                
                usname = resultSet.getString("user_name");
                if(usname.equals(usn.getText())){
                    JOptionPane.showMessageDialog(null,"Username is Already Used!");
                    usn.setText("");
                }
                
                return true;
                
            }else{
                return false;
            }
            
        }catch(SQLException ex){
            
            System.out.println(""+ex);
            return false;
        }
    }
        
          public boolean updateCheck(){
        
        dbconnector dbc = new dbconnector();
        
        try{
            
            String query = "SELECT * FROM tbl_u WHERE (user_name = '" + usn.getText() 
                    + "' OR user_emel = '" + mail.getText() 
                    + "') AND u_id != '" + uID.getText() + "'";
    
            ResultSet resultSet = dbc.getData(query);
            
            if(resultSet.next()){
             
                email = resultSet.getString("user_emel");
                if(email.equals(mail.getText())){
                    JOptionPane.showMessageDialog(null,"Email is Already Used!");
                    mail.setText("");
                }
                
                usname = resultSet.getString("user_name");
                if(usname.equals(usn.getText())){
                    JOptionPane.showMessageDialog(null,"Username is Already Used!");
                    usn.setText("");
                }
                
                return true;
                
            }else{
                return false;
            }
            
        }catch(SQLException ex){
            
            System.out.println(""+ex);
            return false;
        }
        
    }
          
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        confirmDel = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        ACCOUNT_NAME = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        yesBT = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        fn = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ln = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        usn = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        ps = new javax.swing.JTextField();
        mail = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ut = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        addBT = new javax.swing.JButton();
        st = new javax.swing.JComboBox<>();
        jLabel13 = new javax.swing.JLabel();
        uID = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        cancel = new javax.swing.JButton();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();

        confirmDel.setBackground(new java.awt.Color(27, 55, 77));
        confirmDel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        confirmDel.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 420, 10));

        jLabel15.setFont(new java.awt.Font("Arial Black", 0, 16)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText(" NOTICE ");
        jLabel15.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(255, 255, 255)));
        confirmDel.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 420, 50));

        ACCOUNT_NAME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ACCOUNT_NAME.setForeground(new java.awt.Color(89, 182, 255));
        ACCOUNT_NAME.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ACCOUNT_NAME.setText("SAMPLE");
        confirmDel.add(ACCOUNT_NAME, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 420, 30));

        jLabel21.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Are you sure you want to delete user:");
        confirmDel.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 420, 20));

        yesBT.setBackground(new java.awt.Color(89, 182, 255));
        yesBT.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        yesBT.setForeground(new java.awt.Color(255, 255, 255));
        yesBT.setText("YES");
        yesBT.setBorderPainted(false);
        yesBT.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                yesBTMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                yesBTMouseExited(evt);
            }
        });
        yesBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yesBTActionPerformed(evt);
            }
        });
        confirmDel.add(yesBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 140, 80, -1));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(235, 235, 235)));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fn.setBackground(new java.awt.Color(245, 246, 248));
        fn.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        fn.setForeground(new java.awt.Color(100, 115, 122));
        fn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnActionPerformed(evt);
            }
        });
        jPanel3.add(fn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 120, 24));

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("First Name:");
        jPanel3.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, -1, -1));

        ln.setBackground(new java.awt.Color(245, 246, 248));
        ln.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        ln.setForeground(new java.awt.Color(100, 115, 122));
        ln.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnActionPerformed(evt);
            }
        });
        jPanel3.add(ln, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 120, 24));

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Last Name:");
        jPanel3.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, -1, 20));

        usn.setBackground(new java.awt.Color(245, 246, 248));
        usn.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        usn.setForeground(new java.awt.Color(100, 115, 122));
        usn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usnActionPerformed(evt);
            }
        });
        jPanel3.add(usn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, 120, 24));

        jLabel8.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Username:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jLabel9.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Password:");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, -1, 20));

        ps.setBackground(new java.awt.Color(245, 246, 248));
        ps.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        ps.setForeground(new java.awt.Color(100, 115, 122));
        ps.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                psActionPerformed(evt);
            }
        });
        jPanel3.add(ps, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 120, 24));

        mail.setBackground(new java.awt.Color(245, 246, 248));
        mail.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        mail.setForeground(new java.awt.Color(100, 115, 122));
        mail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mailActionPerformed(evt);
            }
        });
        jPanel3.add(mail, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 120, 24));

        jLabel10.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Email Address:");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, 20));

        ut.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        ut.setForeground(new java.awt.Color(100, 115, 122));
        ut.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Admin", "User" }));
        ut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                utActionPerformed(evt);
            }
        });
        jPanel3.add(ut, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 120, 24));

        jLabel11.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("User Type:");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, -1, 20));

        addBT.setBackground(new java.awt.Color(0, 0, 0));
        addBT.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        addBT.setForeground(new java.awt.Color(255, 255, 255));
        addBT.setText("ADD");
        addBT.setBorder(null);
        addBT.setBorderPainted(false);
        addBT.setOpaque(false);
        addBT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBTActionPerformed(evt);
            }
        });
        jPanel3.add(addBT, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 80, 30));

        st.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        st.setForeground(new java.awt.Color(100, 115, 122));
        st.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Type", "Active", "Pending" }));
        st.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stActionPerformed(evt);
            }
        });
        jPanel3.add(st, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 24));

        jLabel13.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Account Status");
        jPanel3.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, 20));

        uID.setBackground(new java.awt.Color(245, 246, 248));
        uID.setFont(new java.awt.Font("Yu Gothic UI", 0, 10)); // NOI18N
        uID.setForeground(new java.awt.Color(100, 115, 122));
        uID.setEnabled(false);
        uID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                uIDActionPerformed(evt);
            }
        });
        jPanel3.add(uID, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 20, 100, 24));

        jLabel16.setFont(new java.awt.Font("Yu Gothic UI", 1, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("User ID:");
        jPanel3.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 40, 20));

        cancel.setBackground(new java.awt.Color(0, 0, 0));
        cancel.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        cancel.setForeground(new java.awt.Color(255, 255, 255));
        cancel.setText("CANCEL");
        cancel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cancelMouseClicked(evt);
            }
        });
        cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelActionPerformed(evt);
            }
        });
        jPanel3.add(cancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 250, 90, 30));

        update.setBackground(new java.awt.Color(0, 0, 0));
        update.setFont(new java.awt.Font("Yu Gothic UI", 1, 14)); // NOI18N
        update.setForeground(new java.awt.Color(255, 255, 255));
        update.setText("UPDATE");
        update.setEnabled(false);
        update.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                updateMouseClicked(evt);
            }
        });
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel3.add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 250, 90, 30));

        delete.setBackground(new java.awt.Color(0, 0, 0));
        delete.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        delete.setForeground(new java.awt.Color(255, 255, 255));
        delete.setText("ARCHIVE");
        delete.setPreferredSize(new java.awt.Dimension(60, 30));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel3.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, 90, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        
          session sess = session.getInstance();
       
       if(sess.getUid() == 0){
            JOptionPane.showMessageDialog(null, "No Account, Log in First! ","Notice", JOptionPane.ERROR_MESSAGE);
            loginform ads = new loginform();
            ads.setVisible(true);
            this.dispose();
       }
      
        
    }//GEN-LAST:event_formWindowActivated

    private void yesBTMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesBTMouseEntered

    }//GEN-LAST:event_yesBTMouseEntered

    private void yesBTMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_yesBTMouseExited

    }//GEN-LAST:event_yesBTMouseExited

    private void yesBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yesBTActionPerformed

        dbconnector dbc = new dbconnector();

        String sql = "DELETE FROM tbl_u WHERE u_id = ?";

        try (PreparedStatement pst = dbc.connect.prepareStatement(sql)) {
            pst.setString(1, uID.getText());
            int rowsAffected = pst.executeUpdate();

            if (rowsAffected > 0) {
                Window window = SwingUtilities.getWindowAncestor(confirmDel);
                window.dispose();
                JOptionPane.showMessageDialog(null, "User deleted successfully!");
                user u = new user();
                u.setVisible(true);
                this.dispose();
            } else {
                JOptionPane.showMessageDialog(null, "No records found to delete.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_yesBTActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
     dbconnector dbc = new dbconnector();

  
    String sql = "UPDATE tbl_u SET u_staus = ? WHERE u_id = ?";

    try (PreparedStatement pst = dbc.connect.prepareStatement(sql)) {
        pst.setString(1, "Archived"); 
        pst.setString(2, uID.getText()); 
        int rowsAffected = pst.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "User data archived.");
            
     
            
            user u = new user();
            u.setVisible(true);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "No records found to archive.");
        }
    } catch (SQLException ex) {
        JOptionPane.showMessageDialog(null, "SQL Error: " + ex.getMessage());
    }
    }//GEN-LAST:event_deleteActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed

        if(fn.getText().isEmpty() || ln.getText().isEmpty() || mail.getText().isEmpty()
            || usn.getText().isEmpty() )
        {

            JOptionPane.showMessageDialog(null,"All fields are required!");

        }else if(updateCheck()){

            System.out.println("Duplicate Exist!");

        }
        else{

            dbconnector dbc = new dbconnector();

            dbc.updateData("UPDATE tbl_u SET u_fname = '" + fn.getText() + "', u_lname = '" + ln.getText()
                + "', user_emel = '" + mail.getText() + "', user_name = '" + usn.getText()
                +  "', account_type = '" + ut.getSelectedItem()
                + "', u_staus = '" + st.getSelectedItem() + "' WHERE u_id = '" + uID.getText() + "'");

            user u = new user();
            u.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_updateActionPerformed

    private void updateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateMouseClicked

    }//GEN-LAST:event_updateMouseClicked

    private void cancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelActionPerformed

        user u = new user();
        u.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelActionPerformed

    private void cancelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cancelMouseClicked

    }//GEN-LAST:event_cancelMouseClicked

    private void uIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_uIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_uIDActionPerformed

    private void stActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_stActionPerformed

    private void addBTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBTActionPerformed

        if(fn.getText().isEmpty() || ln.getText().isEmpty() || mail.getText().isEmpty()
            || usn.getText().isEmpty() || ps.getText().isEmpty())
        {

            JOptionPane.showMessageDialog(null,"All fields are required!");

        }else if(ps.getText().length() < 8){

            JOptionPane.showMessageDialog(null,"Password should be 8 above!");
            ps.setText("");

        }else if(dupCheck()){

            System.out.println("Duplicate Exist!");

        }
        else{

            PasswordHasher pH = new PasswordHasher();

            String password = pH.hashPassword(ps.getText());

            dbconnector dbc = new dbconnector();
            if(dbc.insertData("INSERT INTO tbl_u (u_fname, u_lname, user_emel, user_name, user_pass, account_type, u_staus)"
                + " VALUES ('"+fn.getText()+"','"+ln.getText()+"','"+mail.getText()+"','"+usn.getText()+"','"
                +password+"','"+ut.getSelectedItem()+"','"+st.getSelectedItem()+"')"))
        {

            JOptionPane.showMessageDialog(null,"User added successfully!");
            user rA = new user();
            rA.setVisible(true);
            this.dispose();

        }
        else
        {

            JOptionPane.showMessageDialog(null,"Connection Error!");

        }

        }
    }//GEN-LAST:event_addBTActionPerformed

    private void utActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_utActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_utActionPerformed

    private void mailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mailActionPerformed

    private void psActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_psActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_psActionPerformed

    private void usnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_usnActionPerformed

    private void lnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnActionPerformed

    private void fnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnActionPerformed

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
            java.util.logging.Logger.getLogger(user_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(user_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(user_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(user_edit.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
     

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new user_edit().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JLabel ACCOUNT_NAME;
    public javax.swing.JButton addBT;
    public javax.swing.JButton cancel;
    private javax.swing.JPanel confirmDel;
    private javax.swing.JButton delete;
    public javax.swing.JTextField fn;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JTextField ln;
    public javax.swing.JTextField mail;
    public javax.swing.JTextField ps;
    public javax.swing.JComboBox<String> st;
    public javax.swing.JTextField uID;
    public javax.swing.JButton update;
    public javax.swing.JTextField usn;
    public javax.swing.JComboBox<String> ut;
    private javax.swing.JButton yesBT;
    // End of variables declaration//GEN-END:variables
}
