/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.sql.PreparedStatement;
import javax.swing.JOptionPane;
import java.sql.*;
//import projectlibrary.ConnectionProvider;
/**
 *
 * @author Ankita
 */
public class NewStudent extends javax.swing.JFrame {

    /**
     * Creates new form NewStudent
     */
    public NewStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    public boolean checkDuplicateUser(){
        boolean isExist =false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                        String sql="select * from add_student where name='"+txtname.getText()+"'";
                        PreparedStatement pst= con.prepareStatement(sql);
                        ResultSet rs= pst.executeQuery();
                        if(rs.next()){
                            isExist = true;
                        }else{
                            isExist= false;
                        }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isExist;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lblnewstudentinternal = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblbranch = new javax.swing.JLabel();
        lblsection = new javax.swing.JLabel();
        lblpass = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        cmbbranch = new javax.swing.JComboBox<>();
        cmbsection = new javax.swing.JComboBox<>();
        txtpass = new javax.swing.JTextField();
        btnsearchid = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        btnnew = new javax.swing.JButton();
        btnsave = new javax.swing.JButton();
        btnupdate = new javax.swing.JButton();
        btndelete = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 260));
        setUndecorated(true);

        jPanel1.setMinimumSize(new java.awt.Dimension(750, 500));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblnewstudentinternal.setBackground(new java.awt.Color(255, 255, 204));
        lblnewstudentinternal.setFont(new java.awt.Font("Tw Cen MT", 1, 36)); // NOI18N
        lblnewstudentinternal.setForeground(new java.awt.Color(255, 145, 26));
        lblnewstudentinternal.setText(" New Student");
        lblnewstudentinternal.setToolTipText("");
        lblnewstudentinternal.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 0, 0)));
        jPanel1.add(lblnewstudentinternal, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 0, 210, -1));

        lblid.setBackground(new java.awt.Color(255, 255, 204));
        lblid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblid.setForeground(new java.awt.Color(255, 255, 255));
        lblid.setText("Student Id");
        jPanel1.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 100, -1));

        lblname.setBackground(new java.awt.Color(255, 255, 204));
        lblname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Student Name");
        jPanel1.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 120, -1));

        lblbranch.setBackground(new java.awt.Color(255, 255, 204));
        lblbranch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblbranch.setForeground(new java.awt.Color(255, 255, 255));
        lblbranch.setText("Student Branch");
        jPanel1.add(lblbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, 130, -1));

        lblsection.setBackground(new java.awt.Color(255, 255, 204));
        lblsection.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblsection.setForeground(new java.awt.Color(255, 255, 255));
        lblsection.setText("Student Section");
        jPanel1.add(lblsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 130, -1));

        lblpass.setBackground(new java.awt.Color(255, 255, 204));
        lblpass.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblpass.setForeground(new java.awt.Color(255, 255, 255));
        lblpass.setText("Password");
        jPanel1.add(lblpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 110, -1));

        txtid.setBackground(new java.awt.Color(255, 255, 204));
        txtid.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        jPanel1.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 100, -1));

        txtname.setBackground(new java.awt.Color(255, 255, 204));
        txtname.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txtname.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtnameFocusLost(evt);
            }
        });
        txtname.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtnameKeyPressed(evt);
            }
        });
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 110, 240, -1));

        cmbbranch.setBackground(new java.awt.Color(255, 255, 153));
        cmbbranch.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbbranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Electrical Engineering", "Computer Science", "IT Engineering", "Mechanical Engineering", " " }));
        jPanel1.add(cmbbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 240, -1));

        cmbsection.setBackground(new java.awt.Color(255, 255, 153));
        cmbsection.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        cmbsection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Section A", "Section B", "Section C", "Section D", " " }));
        cmbsection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsectionActionPerformed(evt);
            }
        });
        jPanel1.add(cmbsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 210, 240, -1));

        txtpass.setBackground(new java.awt.Color(255, 255, 204));
        txtpass.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jPanel1.add(txtpass, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 260, 240, -1));

        btnsearchid.setBackground(new java.awt.Color(255, 255, 204));
        btnsearchid.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        btnsearchid.setIcon(new javax.swing.ImageIcon("D:\\image\\Icon 1\\search.png")); // NOI18N
        btnsearchid.setText("Search");
        btnsearchid.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsearchid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsearchidActionPerformed(evt);
            }
        });
        jPanel1.add(btnsearchid, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 80, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 0));
        jLabel4.setIcon(new javax.swing.ImageIcon("D:\\image\\Icon 1\\red-x-mark-transparent-background-3.png")); // NOI18N
        jLabel4.setText("Close");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 0, 80, 20));

        btnnew.setBackground(new java.awt.Color(255, 255, 204));
        btnnew.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnnew.setIcon(new javax.swing.ImageIcon("D:\\image\\Icon 1\\newicon1.jpg")); // NOI18N
        btnnew.setText("New");
        btnnew.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnnew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewActionPerformed(evt);
            }
        });
        jPanel1.add(btnnew, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, 80, -1));

        btnsave.setBackground(new java.awt.Color(255, 255, 204));
        btnsave.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnsave.setIcon(new javax.swing.ImageIcon("D:\\image\\Icon 1\\save-icon--1.png")); // NOI18N
        btnsave.setText("Save");
        btnsave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnsave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 360, 70, -1));

        btnupdate.setBackground(new java.awt.Color(255, 255, 204));
        btnupdate.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnupdate.setIcon(new javax.swing.ImageIcon("D:\\image\\Icon 1\\updateicon1.jpg")); // NOI18N
        btnupdate.setText("Update");
        btnupdate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnupdateActionPerformed(evt);
            }
        });
        jPanel1.add(btnupdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, -1, -1));

        btndelete.setBackground(new java.awt.Color(255, 255, 204));
        btndelete.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btndelete.setIcon(new javax.swing.ImageIcon("D:\\image\\Icon 1\\deleteicon1.jpg")); // NOI18N
        btndelete.setText("Delete");
        btndelete.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 360, -1, 30));

        btnclose.setBackground(new java.awt.Color(255, 255, 204));
        btnclose.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        btnclose.setIcon(new javax.swing.ImageIcon("D:\\image\\clear2020.jpg")); // NOI18N
        btnclose.setText("Clear");
        btnclose.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnclose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btncloseActionPerformed(evt);
            }
        });
        jPanel1.add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 360, 70, 30));

        jLabel1.setBackground(new java.awt.Color(255, 255, 204));
        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\image\\background page.jpg")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void cmbsectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsectionActionPerformed

    private void btnsearchidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchidActionPerformed
        try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                        String sql="select * from add_student where id='"+txtid.getText()+"'";
                        PreparedStatement pst= con.prepareStatement(sql);
                        ResultSet rs= pst.executeQuery();
                        int flag=0;
                        while(rs.next())
                        {
                            flag=1;
                            String Name= rs.getString("name");
                            String Branch=rs.getString("branch");
                            String Section=rs.getString("section");
                            String Pass=rs.getString("password");
                            
                            cmbbranch.setSelectedItem(Branch);
                            cmbsection.setSelectedItem(Section);
                            txtname.setText(Name);
                            txtpass.setText(Pass);
                        }
                        if(flag==0)
                        JOptionPane.showMessageDialog(null, "Record Not Found");
                            con.close(); rs.close(); pst.close();
                  }
                  catch(Exception ex){
                      JOptionPane.showMessageDialog(null, ""+ex.getMessage());
                  }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsearchidActionPerformed

    private void btnupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnupdateActionPerformed
        if((txtid.getText().equals(""))||txtname.getText().equals("")||txtpass.getText().equals("")||cmbbranch.getSelectedItem().equals("")||cmbsection.getSelectedItem().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please fill Student Full Information!!!");
            }
            else
            {
        try{
                Class.forName("com.mysql.jdbc.Driver");
                Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                String sql=" update add_student set name='"+txtname.getText()+"',branch='"+cmbbranch.getSelectedItem()+"',section='"+cmbsection.getSelectedItem()+"',password='"+txtpass.getText()+"'";
                PreparedStatement pst=con.prepareStatement(sql);
                int i=pst.executeUpdate();
                if(i>0)
                {
                  JOptionPane.showMessageDialog(null, "Record Update Succesfully");  
                }
            }
            catch(Exception ex)
            {
               JOptionPane.showMessageDialog(null, ""+ex.getMessage());
            }}clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btnupdateActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        //setVisible(false);
        clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btncloseActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed
            /*try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                 String sql= "insert into add_student(studentid,name,branch,section,password)value('"+txtid.getText()+"',"+txtname.getText()+"','"+cmbbranch.getSelectedItem()+"','"+cmbsection.getSelectedItem()+"','"+txtpass.getText()+"')";
                 PreparedStatement pst= con.prepareStatement(sql);
                 int i= pst.executeUpdate();
                 if(i>0)
                 {
                     JOptionPane.showMessageDialog(null, "Record Saved");
                     setVisible(false);
                     new  NewStudent().setVisible(true);
                 }
            }catch(Exception e){
                    JOptionPane.showMessageDialog(null, "Student id already exist");
                     setVisible(false);
                     new  NewStudent().setVisible(true); 
               }*/
            if((txtid.getText().equals(""))||txtname.getText().equals("")||txtpass.getText().equals("")||cmbbranch.getSelectedItem().equals("")||cmbsection.getSelectedItem().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please fill Student Full Information!!!");
            }
            else
            {
            try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                 String sql= "insert into add_student(id,name,branch,section,password)value('"+txtid.getText()+"','"+txtname.getText()+"','"+cmbbranch.getSelectedItem()+"','"+cmbsection.getSelectedItem()+"','"+txtpass.getText()+"')";
                 PreparedStatement pst= con.prepareStatement(sql);
                 int i= pst.executeUpdate();
                 if(i>0)
                 {
                     JOptionPane.showMessageDialog(null, "Record Saved");
                     setVisible(false);
                     new  NewStudent().setVisible(true);
                 }
                }
                catch(Exception ex){
                     //JOptionPane.showMessageDialog(null, ""+ex.getMessage());
                     JOptionPane.showMessageDialog(null, "Student id already exist");
                     setVisible(false);
                     new  NewStudent().setVisible(true);
                }}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnsaveActionPerformed

    private void btnnewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewActionPerformed
              clear();
        try{
                        Class.forName("com.mysql.jdbc.Driver");
                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                        String sql="select max(id) from add_student ";
                        PreparedStatement pst= con.prepareStatement(sql);
                        ResultSet rs= pst.executeQuery();
                        while(rs.next())
                        {
                            int id = rs.getInt(1);
                            id=id+1;
                            txtid.setText(""+id);
                        }
                }
                catch(Exception ex)
                {
                    System.out.println(""+ex.getMessage());
                }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnnewActionPerformed

    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
        int i = JOptionPane.showConfirmDialog(null, "Are you sure to Delete Record??");
                if(i==JOptionPane.YES_OPTION)
                {
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                 String sql= "delete from add_student where id='"+txtid.getText()+"'";
                 PreparedStatement pst= con.prepareStatement(sql);
                 int j= pst.executeUpdate();
                 if(j>0)
                 {
                     JOptionPane.showMessageDialog(null, "Record Deleted");
                     
                 }
                }
                catch(Exception ex){
                     JOptionPane.showMessageDialog(null, ""+ex.getMessage());
                }
                }
                else
                if(i==JOptionPane.CANCEL_OPTION)
                {

                }
                else
               {
                   
               }
                clear();
        // TODO add your handling code here:
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtnameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnameKeyPressed
//        try{
//                        Class.forName("com.mysql.jdbc.Driver");
//                        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
//                        String sql="select * from add_student where name LIKE '"+txtname.getText()+"%'";
//                        PreparedStatement pst= con.prepareStatement(sql);
//                        ResultSet rs= pst.executeQuery();
//                        int flag=0;
//                        while(rs.next())
//                        {
//                            flag=1;
//                            String Id= rs.getString("id");
//                            String Branch=rs.getString("branch");
//                            String Section=rs.getString("section");
//                            String Pass=rs.getString("password");
//                            
//                            cmbbranch.setSelectedItem(Branch);
//                            cmbsection.setSelectedItem(Section);
//                            txtid.setText(Id);
//                            txtpass.setText(Pass);
//                        }
//                        if(flag==0)
//                        JOptionPane.showMessageDialog(null, "Record Not Found");
//                            con.close(); rs.close(); pst.close();
                  
//                  catch(Exception ex){
//                      JOptionPane.showMessageDialog(null, ""+ex.getMessage());
//                  }

        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameKeyPressed

    private void txtnameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtnameFocusLost
        if(checkDuplicateUser()== true){
            JOptionPane.showMessageDialog(this, "usre name already exist");
        }
        //if(checkDuplicateUser9)
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameFocusLost

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked
    public void clear(){
        txtid.setText("");
        txtname.setText("");
        txtpass.setText("");
        cmbbranch.setSelectedItem(null);
        cmbsection.setSelectedItem(null);
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
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton btnnew;
    private javax.swing.JButton btnsave;
    private javax.swing.JButton btnsearchid;
    private javax.swing.JButton btnupdate;
    private javax.swing.JComboBox<String> cmbbranch;
    private javax.swing.JComboBox<String> cmbsection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblbranch;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblnewstudentinternal;
    private javax.swing.JLabel lblpass;
    private javax.swing.JLabel lblsection;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtpass;
    // End of variables declaration//GEN-END:variables
}
