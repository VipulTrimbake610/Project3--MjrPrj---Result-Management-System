/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package resultmanagementsystem;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author vipul
 */
public class studentIndex extends javax.swing.JFrame {

    /**
     * Creates new form studentIndex
     */
    public studentIndex() {
        initComponents();
    }  
    public studentIndex(String rollno) {
        initComponents();
        jTextField4.setText(rollno);
        
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
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jLabel26 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBounds(new java.awt.Rectangle(150, 35, 0, 0));
        setMinimumSize(new java.awt.Dimension(1000, 650));
        setResizable(false);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel7.setText("Computer Science");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, 140, 35));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("100");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 140, 35));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel9.setText("Physics");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 140, 35));

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel10.setText("Chemistry");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, 140, 35));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel11.setText("Maths");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 190, 140, 35));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel12.setText("Operating System");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 250, 140, 35));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setText("Total");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 370, 140, 35));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("100");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 190, 140, 35));

        jLabel16.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("100");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 250, 140, 35));

        jLabel17.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("100");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 310, 140, 35));

        jLabel19.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("30");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 130, 140, 35));

        jLabel18.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("Total Marks");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 10, 140, 40));

        jLabel20.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("100");
        jPanel1.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 70, 140, 35));

        jLabel21.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("30");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 140, 35));

        jLabel22.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setText("30");
        jPanel1.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 250, 140, 35));

        jLabel23.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("30");
        jPanel1.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 310, 140, 35));

        jLabel24.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("30");
        jPanel1.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 70, 140, 35));

        jLabel25.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("Passing Marks");
        jPanel1.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 10, 140, 40));

        jTextField7.setEditable(false);
        jTextField7.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField7, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 130, 140, 35));

        jTextField8.setEditable(false);
        jTextField8.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 190, 140, 35));

        jTextField9.setEditable(false);
        jTextField9.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 250, 140, 35));

        jTextField10.setEditable(false);
        jTextField10.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField10, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 370, 100, 35));

        jTextField11.setEditable(false);
        jTextField11.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 70, 140, 35));

        jLabel26.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("Marks Obtained");
        jPanel1.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 10, 140, 40));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 310, 140, 35));

        jTextField13.setEditable(false);
        jTextField13.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jPanel1.add(jTextField13, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 370, 140, 35));

        jButton2.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pImages/back.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.setIconTextGap(10);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, 160, 45));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 210, 1000, 440));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel1.setText("Course Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 160, 35));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel2.setText("Branch Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 160, 35));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel3.setText("Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 160, 35));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel4.setText("Roll No");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 20, 160, 35));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel5.setText("Father Name");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 80, 160, 35));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jLabel6.setText("Gender");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 140, 160, 35));

        jTextField1.setEditable(false);
        jTextField1.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 160, 35));

        jTextField2.setEditable(false);
        jTextField2.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 160, 35));

        jTextField3.setEditable(false);
        jTextField3.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 160, 35));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 20, 160, 35));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, 160, 35));

        jTextField6.setEditable(false);
        jTextField6.setFont(new java.awt.Font("Segoe UI", 3, 16)); // NOI18N
        jTextField6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 140, 160, 35));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField11ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        String rollno = jTextField4.getText();
        System.out.println(rollno);
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/srms","root","root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from student inner join result where student.rollno = '"+rollno+"' and result.rollno = '"+rollno+"'");
            if(rs.next()){
//                JOptionPane.showMessageDialog(this, "Hellllloo");
                String course = rs.getString(2);
                String branch = rs.getString(3);
                String name = rs.getString(4);
                String gender = rs.getString(5);
                String fn = rs.getString(6);
                
                String phy = rs.getString(8);
                String chem = rs.getString(9);
                String math = rs.getString(10);
                String os = rs.getString(11);
                String cs = rs.getString(12);
                
                jTextField1.setText(course);
                jTextField2.setText(branch);
                jTextField3.setText(name);
                jTextField5.setText(fn);
                jTextField6.setText(gender);
                
                
                jTextField11.setText(phy);
                jTextField7.setText(chem);
                jTextField8.setText(math);
                jTextField9.setText(os);
                jTextField12.setText(cs);

                int sum = Integer.parseInt(phy) + Integer.parseInt(chem) + Integer.parseInt(math) + Integer.parseInt(os) + Integer.parseInt(cs);
                int per = sum * 100 / 500;
                jTextField13.setText(String.valueOf(sum));
                jTextField10.setText(""+per+"%");
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(this, e.toString());
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        setVisible(false);
        new studentAdmin().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(studentIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studentIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studentIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studentIndex.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new studentIndex().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
