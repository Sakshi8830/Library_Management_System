/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package librarymanagement;

import java.sql.Connection;
import java.util.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author Ankita
 */
public class IssueBook extends javax.swing.JFrame {

    /**
     * Creates new form IssueBook
     */
    public IssueBook() {
        initComponents();
    }
    
        /*public boolean issueBook(){
         boolean isIssued = false;
         int status = 1;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                String sql="insert into issuebook(id,bookid,bookname,name,issuedate,duedate,status)values('"+txtid.getText()+"','"+txtbookid.getText()+"','"+txtbookname.getText()+"','"+txtname.getText()+"','"+txtissue.getText()+"','"+txtdue.getText()+"','"+status+"')";
                PreparedStatement pst= con.prepareStatement(sql);
                int i= pst.executeUpdate();
                 if(i>0)
                 {
                     isIssued = true;
                 }else{
                     isIssued = false;
                 }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, ""+e.getMessage());
            }
            return isIssued ;
        }*/
    //to fetch the book details from the database and display it to book details panel
    public void getBookDetails(){
       //int bookId = Integer.parseInt(txtbookid1.getText());
        try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                String sql="select * from add_book1 where bookid ='"+txtbookid1.getText()+"'";
                 PreparedStatement pst= con.prepareStatement(sql);
                 ResultSet rs=pst.executeQuery();
                 int flag=0;
                 if(rs.next())
                  {
                     flag=1;
                     txtbookid.setText(rs.getString("bookid"));
                     txtbookname.setText(rs.getString("bookname"));
                     cmbedition.setSelectedItem(rs.getString("edition"));
                     txtauthor.setText(rs.getString("authorname"));
                     txtquantity1.setText(rs.getString("quantity"));
                 }
                 else{
                     txtbookerror1.setText("Invalid Book Id..!!");
                 }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, ""+e.getMessage());
        }
    }
    
    
    //to fetch the book details from the database and display it to book details panel
    public void getStudentDetails(){
       //int bookId = Integer.parseInt(txtbookid1.getText());
        try {
                Class.forName("com.mysql.jdbc.Driver");
                Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                String sql="select * from add_student where id ='"+txtstudentid1.getText()+"'";
                 PreparedStatement pst= con.prepareStatement(sql);
                 ResultSet rs=pst.executeQuery();
                 int flag=0;
                 if(rs.next())
                  {
                     flag=1;
                     txtid.setText(rs.getString("id"));
                     txtname.setText(rs.getString("name"));
                     cmbbranch.setSelectedItem(rs.getString("branch"));
                     cmbsection.setSelectedItem(rs.getString("section"));
                 }
                 else{
                     txtstudenterror.setText("Invalid Student Id..!!");
                 }
        } catch (Exception e) {
           JOptionPane.showMessageDialog(null, ""+e.getMessage());
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

        panelmain = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtbookid = new javax.swing.JTextField();
        txtbookname = new javax.swing.JTextField();
        txtauthor = new javax.swing.JTextField();
        cmbedition = new javax.swing.JComboBox<>();
        txtstudenterror = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        lblid = new javax.swing.JLabel();
        lblname = new javax.swing.JLabel();
        lblbranch = new javax.swing.JLabel();
        lblsection = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        cmbbranch = new javax.swing.JComboBox<>();
        cmbsection = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtbookid1 = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtdue = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        btnissuebook = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        txtbookerror1 = new javax.swing.JTextField();
        txtstudentid1 = new javax.swing.JTextField();
        txtissue = new javax.swing.JTextField();
        txtquantity1 = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(325, 260));
        setUndecorated(true);

        panelmain.setBackground(new java.awt.Color(255, 255, 255));
        panelmain.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 204));
        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Book_id");
        panelmain.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 110, 20));

        jLabel3.setBackground(new java.awt.Color(255, 255, 204));
        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Book Name");
        panelmain.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 100, 20));

        jLabel8.setBackground(new java.awt.Color(255, 255, 204));
        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Author");
        panelmain.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, 90, 30));

        jLabel5.setBackground(new java.awt.Color(255, 255, 204));
        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Eddition");
        panelmain.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 110, 20));

        jLabel7.setBackground(new java.awt.Color(255, 255, 204));
        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Quantity");
        panelmain.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 110, 30));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelmain.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 30, 150, 5));

        txtbookid.setBackground(new java.awt.Color(255, 255, 204));
        txtbookid.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtbookid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookidActionPerformed(evt);
            }
        });
        panelmain.add(txtbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 60, 60, -1));

        txtbookname.setBackground(new java.awt.Color(255, 255, 204));
        txtbookname.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        panelmain.add(txtbookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, 210, -1));

        txtauthor.setBackground(new java.awt.Color(255, 255, 204));
        txtauthor.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        panelmain.add(txtauthor, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 180, 210, -1));

        cmbedition.setBackground(new java.awt.Color(255, 255, 204));
        cmbedition.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        cmbedition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "1st", "2nd", "3rd", "4th", "5th", "6th" }));
        cmbedition.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cmbedition.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbeditionActionPerformed(evt);
            }
        });
        panelmain.add(cmbedition, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 250, 210, -1));

        txtstudenterror.setBackground(new java.awt.Color(255, 255, 204));
        txtstudenterror.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtstudenterror.setForeground(new java.awt.Color(204, 0, 51));
        txtstudenterror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtstudenterrorActionPerformed(evt);
            }
        });
        panelmain.add(txtstudenterror, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 380, 210, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(153, 153, 153));
        jLabel9.setText("Issue Book");
        panelmain.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 190, -1));

        lblid.setBackground(new java.awt.Color(255, 255, 204));
        lblid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblid.setForeground(new java.awt.Color(255, 255, 255));
        lblid.setText("Student Id");
        panelmain.add(lblid, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 70, 100, 40));

        lblname.setBackground(new java.awt.Color(255, 255, 204));
        lblname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Student Name");
        panelmain.add(lblname, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 150, 120, 40));

        lblbranch.setBackground(new java.awt.Color(255, 255, 204));
        lblbranch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblbranch.setForeground(new java.awt.Color(255, 255, 255));
        lblbranch.setText("Student Branch");
        panelmain.add(lblbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 130, 40));

        lblsection.setBackground(new java.awt.Color(255, 255, 204));
        lblsection.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        lblsection.setForeground(new java.awt.Color(255, 255, 255));
        lblsection.setText("Student Section");
        panelmain.add(lblsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 130, 40));

        txtid.setBackground(new java.awt.Color(255, 255, 204));
        txtid.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        txtid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtidActionPerformed(evt);
            }
        });
        panelmain.add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 80, 100, 30));

        txtname.setBackground(new java.awt.Color(255, 255, 204));
        txtname.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        panelmain.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 150, 240, 30));

        cmbbranch.setBackground(new java.awt.Color(255, 255, 153));
        cmbbranch.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmbbranch.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Electrical Engineering", "Computer Science", "IT Engineering", "Mechanical Engineering", " " }));
        panelmain.add(cmbbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 240, 240, 30));

        cmbsection.setBackground(new java.awt.Color(255, 255, 153));
        cmbsection.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        cmbsection.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-Select-", "Section A", "Section B", "Section C", "Section D", " " }));
        cmbsection.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbsectionActionPerformed(evt);
            }
        });
        panelmain.add(cmbsection, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 320, 240, 30));

        jLabel6.setBackground(new java.awt.Color(255, 255, 204));
        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Book Id");
        panelmain.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 100, 110, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(153, 153, 153));
        jLabel10.setText("Book Details");
        panelmain.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 0, 170, -1));

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
        panelmain.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 0, 80, 20));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(153, 153, 153));
        jLabel11.setText("Student Details");
        panelmain.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 10, 190, -1));

        txtbookid1.setBackground(new java.awt.Color(255, 255, 204));
        txtbookid1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtbookid1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtbookid1FocusLost(evt);
            }
        });
        txtbookid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbookid1ActionPerformed(evt);
            }
        });
        panelmain.add(txtbookid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 100, 270, -1));

        jLabel12.setBackground(new java.awt.Color(255, 255, 204));
        jLabel12.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Student Id");
        panelmain.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 160, 110, 30));

        txtdue.setBackground(new java.awt.Color(255, 255, 204));
        txtdue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        panelmain.add(txtdue, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 280, 270, -1));

        jLabel14.setBackground(new java.awt.Color(255, 255, 204));
        jLabel14.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Due Date");
        panelmain.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 280, -1, -1));

        btnissuebook.setBackground(new java.awt.Color(255, 255, 204));
        btnissuebook.setIcon(new javax.swing.ImageIcon("D:\\image\\Icon 1\\issue book.png")); // NOI18N
        btnissuebook.setText("Issue Book");
        btnissuebook.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnissuebook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnissuebookActionPerformed(evt);
            }
        });
        panelmain.add(btnissuebook, new org.netbeans.lib.awtextra.AbsoluteConstraints(853, 360, 120, -1));

        btnreset.setBackground(new java.awt.Color(255, 255, 204));
        btnreset.setIcon(new javax.swing.ImageIcon("D:\\image\\Icon 1\\updateicon1.jpg")); // NOI18N
        btnreset.setText("Reset");
        btnreset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });
        panelmain.add(btnreset, new org.netbeans.lib.awtextra.AbsoluteConstraints(1065, 360, 110, -1));

        txtbookerror1.setBackground(new java.awt.Color(255, 255, 204));
        txtbookerror1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        txtbookerror1.setForeground(new java.awt.Color(204, 0, 51));
        panelmain.add(txtbookerror1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, 210, -1));

        txtstudentid1.setBackground(new java.awt.Color(255, 255, 204));
        txtstudentid1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtstudentid1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtstudentid1FocusLost(evt);
            }
        });
        panelmain.add(txtstudentid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 160, 270, -1));

        txtissue.setBackground(new java.awt.Color(255, 255, 204));
        txtissue.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtissue.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtissueFocusGained(evt);
            }
        });
        panelmain.add(txtissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 220, 270, -1));

        txtquantity1.setBackground(new java.awt.Color(255, 255, 204));
        txtquantity1.setFont(new java.awt.Font("Trebuchet MS", 1, 18)); // NOI18N
        panelmain.add(txtquantity1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 320, 210, -1));

        jLabel13.setBackground(new java.awt.Color(255, 255, 204));
        jLabel13.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Issue Date");
        panelmain.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 220, 110, 30));

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));
        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelmain.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 30, 5, 380));

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelmain.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 20, 5, 380));

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelmain.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 40, 150, 5));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        panelmain.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 40, 190, 5));

        jLabel1.setIcon(new javax.swing.ImageIcon("D:\\image\\issue book panel.jpg")); // NOI18N
        jLabel1.setText("jLabel1");
        panelmain.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 0, 1300, 450));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelmain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void txtbookidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbookidActionPerformed

    private void cmbeditionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbeditionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbeditionActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void cmbsectionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbsectionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbsectionActionPerformed

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel4MouseClicked

    private void txtbookid1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtbookid1FocusLost
        if(!txtbookid1.getText().equals("")){
        getBookDetails();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbookid1FocusLost

    private void txtstudentid1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtstudentid1FocusLost
        if(!txtstudentid1.getText().equals("")){
        getStudentDetails();
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudentid1FocusLost

    private void txtissueFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtissueFocusGained
    
        try{
            Calendar calendar=Calendar.getInstance();
            System.out.println("The current date is"+calendar.getTime());
            DateFormat formatter=new SimpleDateFormat("yyyy-MM-dd");
            String dob=formatter.format(calendar.getTime());
            txtissue.setText(dob);
            txtissue.setEnabled(false);
            calendar.add(Calendar.DATE,+15);
            String dob2=formatter.format(calendar.getTime());
            txtdue.setText(dob2);
            txtdue.setEnabled(false);
            Date d1=null,d2=null;
            d1=(Date)formatter.parse(dob);
            d2=(Date)formatter.parse(dob2);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, ""+e.getMessage());
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_txtissueFocusGained

    private void btnissuebookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnissuebookActionPerformed
       if((txtbookid1.getText().equals(""))||txtstudentid1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please fill above complete details!!!");
            }
            else
            {
        try{ 
    Class.forName("com.mysql.jdbc.Driver");
    Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
    String sql1="select count(*)from issuebook where id='"+txtid.getText()+"'";
    PreparedStatement pst1=con.prepareStatement(sql1);
    ResultSet rs=pst1.executeQuery();
    int count1=0;
   
    while(rs.next()){
        count1=rs.getInt(1);
    }
    String sql2="select count(*)from issuebook where id='"+txtid.getText()+"'and bookid='"+txtbookid.getText()+"'and status='1'";
    PreparedStatement pst2=con.prepareStatement(sql2);
    ResultSet rs2=pst2.executeQuery();
    int count2=0;
    while(rs2.next()){
        count2=rs2.getInt(1);
    }
    String sql3="select quantity from add_book1 where bookid='"+txtbookid.getText()+"'";
    PreparedStatement pst3=con.prepareStatement(sql3);
    ResultSet rs3=pst3.executeQuery();
    int stock=0;
    while(rs3.next()){
        stock=rs3.getInt(1);
        if(count1<=4 && count2<1 && stock>0 ){
            String sql4="insert into issuebook (id,bookid,bookname,name,issuedate,duedate,status)values('"+txtid.getText()+"','"+txtbookid.getText()+"','"+txtbookname.getText()+"','"+txtname.getText()+"','"+txtissue.getText()+"','"+txtdue.getText()+"','1')";
            PreparedStatement pst4=con.prepareStatement(sql4);
            int i=pst4.executeUpdate();
            if(i>0){
            String sql="update add_book1 set quantity=quantity-1 where bookid='"+txtbookid.getText()+"'";
            PreparedStatement pst=con.prepareStatement(sql);
            int j=pst.executeUpdate();
            if(j>0){
                JOptionPane.showMessageDialog(null, "Book issue sucessfully");  
            }
            }
        }
        else if(count1>4){
            JOptionPane.showMessageDialog(null, "You have already issued 4 books");
           // System.out.println("You hve already issued 4 books");
        }
        else if(count2>0){
            //System.out.println("You have already issued");
            JOptionPane.showMessageDialog(null, "You have already issued ");
        }
        else
           // System.out.println("out of stock");
            JOptionPane.showMessageDialog(null, "Out of stock");
    }
     
}catch(Exception ex){
    JOptionPane.showMessageDialog(null, ""+ex.getMessage());
}
        clear();}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnissuebookActionPerformed

    private void txtstudenterrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtstudenterrorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtstudenterrorActionPerformed

    private void txtbookid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbookid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbookid1ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
    if((txtbookid1.getText().equals(""))||txtstudentid1.getText().equals(""))
            {
                JOptionPane.showMessageDialog(null,"Please fill above complete details!!!");
            }
            else
            {
        int i = JOptionPane.showConfirmDialog(null, "Are you sure to Delete Record??");
                if(i==JOptionPane.YES_OPTION)
                {
                try{
                 Class.forName("com.mysql.jdbc.Driver");
                 Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/library_management","root","");
                 String sql= "delete from issuebook where id='"+txtid.getText()+"' and bookid='"+txtbookid.getText()+"'";
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
              clear();}
        // TODO add your handling code here:
    }//GEN-LAST:event_btnresetActionPerformed
    public void clear(){
        txtauthor.setText("");txtbookerror1.setText("");txtbookid.setText("");txtbookid1.setText("");
        txtbookname.setText("");txtid.setText("");
        txtname.setText("");txtquantity1.setText("");txtstudenterror.setText("");txtstudentid1.setText("");
        cmbbranch.setSelectedItem(null);cmbedition.setSelectedItem(null);cmbsection.setSelectedItem(null);
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
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IssueBook.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IssueBook().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnissuebook;
    private javax.swing.JButton btnreset;
    private javax.swing.JComboBox<String> cmbbranch;
    private javax.swing.JComboBox<String> cmbedition;
    private javax.swing.JComboBox<String> cmbsection;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel lblbranch;
    private javax.swing.JLabel lblid;
    private javax.swing.JLabel lblname;
    private javax.swing.JLabel lblsection;
    private javax.swing.JPanel panelmain;
    private javax.swing.JTextField txtauthor;
    private javax.swing.JTextField txtbookerror1;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtbookid1;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtdue;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtissue;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtquantity1;
    private javax.swing.JTextField txtstudenterror;
    private javax.swing.JTextField txtstudentid1;
    // End of variables declaration//GEN-END:variables
}
