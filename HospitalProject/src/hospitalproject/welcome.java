
package hospitalproject;
import hospitalproject.DOCTORS;
import hospitalproject.*;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
public class welcome extends javax.swing.JFrame {
    public welcome() {
        initComponents();
       
        
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        DoctorRecordInterface = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        PatientRecordInterface = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        ApoinmentRecord = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jSeparator1 = new javax.swing.JPopupMenu.Separator();
        logout = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        About = new javax.swing.JMenuItem();

        jMenuItem3.setText("jMenuItem3");

        jMenuItem2.setText("jMenuItem2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        Color myColor = Color.decode("#05066D");
        jLabel1.setForeground(myColor);
        jLabel1.setText("Welcome to AL-Kharj Hospital");

        jLabel2.setIcon(new ImageIcon(getClass().getResource("f4-1.png")));

        jLabel3.setIcon(new ImageIcon(getClass().getResource("f2.png")));

        jMenu1.setText("Doctors");

        DoctorRecordInterface.setText("Doctor's records");
        DoctorRecordInterface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DoctorRecordInterfaceActionPerformed(evt);
            }
        });
        jMenu1.add(DoctorRecordInterface);

        jMenuBar1.add(jMenu1);

        jMenu3.setText("Patient");

        PatientRecordInterface.setText("Patient's records");
        PatientRecordInterface.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PatientRecordInterfaceActionPerformed(evt);
            }
        });
        jMenu3.add(PatientRecordInterface);

        jMenuBar1.add(jMenu3);

        jMenu4.setText("Appointment");

        ApoinmentRecord.setText(" Appinment record");
        ApoinmentRecord.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ApoinmentRecordActionPerformed(evt);
            }
        });
        jMenu4.add(ApoinmentRecord);

        jMenuBar1.add(jMenu4);

        jMenu2.setText("admin");

        jMenuItem1.setText("admin record");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);
        jMenu2.add(jSeparator1);

        logout.setText("Logout");
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        jMenu2.add(logout);

        jMenuBar1.add(jMenu2);

        jMenu5.setText("About");

        About.setText("Contact us");
        About.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutActionPerformed(evt);
            }
        });
        jMenu5.add(About);

        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DoctorRecordInterfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DoctorRecordInterfaceActionPerformed
        // TODO add your handling code here:
        DOCTORS doctor = new DOCTORS();
        doctor.setLocationRelativeTo(null);
        doctor.setVisible(true);
        dispose();
    }//GEN-LAST:event_DoctorRecordInterfaceActionPerformed

    private void PatientRecordInterfaceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PatientRecordInterfaceActionPerformed
        // TODO add your handling code here:
        PATIENT patient = new PATIENT();
        patient.setLocationRelativeTo(null);
        patient.setVisible(true);
        dispose();
    }//GEN-LAST:event_PatientRecordInterfaceActionPerformed

    private void ApoinmentRecordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ApoinmentRecordActionPerformed
        // TODO add your handling code here:
        appoinment app = new appoinment();
        app.setLocationRelativeTo(null);
        app.setVisible(true);
        dispose();
    }//GEN-LAST:event_ApoinmentRecordActionPerformed

    private void AboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutActionPerformed
        // TODO add your handling code here:
        about a = new about();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_AboutActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        admin a = new admin();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        logout a= new logout();
        a.setLocationRelativeTo(null);
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutActionPerformed

  
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
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(welcome.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new welcome().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem About;
    private javax.swing.JMenuItem ApoinmentRecord;
    private javax.swing.JMenuItem DoctorRecordInterface;
    private javax.swing.JMenuItem PatientRecordInterface;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPopupMenu.Separator jSeparator1;
    private javax.swing.JMenuItem logout;
    // End of variables declaration//GEN-END:variables
}
