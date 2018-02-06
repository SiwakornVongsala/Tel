/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tel;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class MngDeparment extends javax.swing.JFrame {

    DefaultTableModel Dep_Model;
    DefaultTableCellRenderer renderer, centerCellRenderer;

    public MngDeparment() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("telephone.png")));
        Dep_Model = (DefaultTableModel) Dep_jTable.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Dep_jTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btn_new = new javax.swing.JButton();
        btn_edit = new javax.swing.JButton();
        btn_delete = new javax.swing.JButton();
        btn_save = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Dep = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        Number = new javax.swing.JTextField();

        setTitle("MngDepartment");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Dep_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Dep_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Dep_jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Dep_jTable);

        jPanel1.setLayout(new java.awt.GridLayout());

        btn_new.setText("New");
        btn_new.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_newActionPerformed(evt);
            }
        });
        jPanel1.add(btn_new);

        btn_edit.setText("Edit");
        btn_edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_editActionPerformed(evt);
            }
        });
        jPanel1.add(btn_edit);

        btn_delete.setText("Delete");
        btn_delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_deleteActionPerformed(evt);
            }
        });
        jPanel1.add(btn_delete);

        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        jPanel1.add(btn_save);

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("Department :");

        jLabel1.setText("No.  :");

        Number.setEditable(false);
        Number.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Number.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        Number.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 77, Short.MAX_VALUE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Dep, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(119, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(Dep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 374, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 487, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(621, Short.MAX_VALUE)))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-412)/2, (screenSize.height-704)/2, 412, 704);
    }// </editor-fold>//GEN-END:initComponents

    protected void cleartext() {
        Number.setText("");
        Dep.setText("");
    }
    private void btn_newActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_newActionPerformed
        // TODO add your handling code here:
        btn_save.setEnabled(true);
        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);

        cleartext();
    }//GEN-LAST:event_btn_newActionPerformed

    private void btn_editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_editActionPerformed
        // TODO add your handling code here:
        if (Dep.getText().length() <= 0) {
            JOptionPane.showMessageDialog(null, "Edit Fail", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Connection conn = db.getConnection();
                String sql = "update department "
                        + " set department='" + Dep.getText() + "' "
                        + " where Number = " + Number.getText();
                PreparedStatement pre = conn.prepareStatement(sql);
                if (pre.executeUpdate() != -1) {
                    JOptionPane.showMessageDialog(this, "Update success", "Update", JOptionPane.INFORMATION_MESSAGE);
                    cleartext();
                    refresh();
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            btn_edit.setEnabled(false);
            btn_delete.setEnabled(false);
        }
    }//GEN-LAST:event_btn_editActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    protected void refresh() {
        try {
            String[] colname = {"No.", "Department"};
            Dep_Model = new DefaultTableModel(colname, 0);
            Connection conn = db.getConnection();
            String sql = "select * from department ORDER BY Department ASC";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String a1 = rs.getString("Number");
                String a2 = rs.getString("Department");
                String[] row = {a1, a2};
                Dep_Model.addRow(row);
                Dep_jTable.setModel(Dep_Model);
                setTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void setTable() {
        renderer = (DefaultTableCellRenderer) Dep_jTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        centerCellRenderer = new DefaultTableCellRenderer();
        centerCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        Dep_jTable.getColumnModel().getColumn(0).setCellRenderer(centerCellRenderer);
//        Dep_jTable.getColumnModel().getColumn(1).setCellRenderer(centerCellRenderer);

        Dep_jTable.getColumnModel().getColumn(0).setPreferredWidth(40);
        Dep_jTable.getColumnModel().getColumn(1).setPreferredWidth(330);
    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        btn_new.setEnabled(true);
        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);
        btn_save.setEnabled(false);
        refresh();
    }//GEN-LAST:event_formWindowOpened

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        if (Dep.getText().length() <= 0) {
            JOptionPane.showMessageDialog(this, "Save Fail", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            try {
                Connection conn = db.getConnection();
                String sql = "insert into department(department) "
                        + " values(?)";
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, Dep.getText().trim());
                if (pre.executeUpdate() != -1) {
                    JOptionPane.showMessageDialog(this, "Save Success ", "Save", JOptionPane.INFORMATION_MESSAGE);
                }

            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                String Number1;
                Connection conn = db.getConnection();
                String sql = "SELECT * FROM department ORDER BY Number DESC LIMIT 1";
                ResultSet rs = conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    Number1 = rs.getString("Number");
                    Dep_Model.insertRow(Dep_Model.getRowCount(), new Object[]{
                                Number1,
                                Dep.getText().trim()});
                    cleartext();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            btn_save.setEnabled(false);
            refresh();
        }
    }//GEN-LAST:event_btn_saveActionPerformed

    private void btn_deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_deleteActionPerformed
        // TODO add your handling code here:

        try {
            int[] rowselect = Dep_jTable.getSelectedRows();
            int rowlength = rowselect.length;
            for (int i = rowlength - 1; i >= 0; i--) {
                Dep_Model.removeRow(rowselect[i]);
                Connection conn = db.getConnection();
                String sql = "delete from department "
                        + "where Number=" + Number.getText().trim();
                PreparedStatement pre = conn.prepareStatement(sql);
                conn.createStatement().executeUpdate(sql);
                if (pre.executeUpdate() != -1) {
                    JOptionPane.showMessageDialog(this, "Delete Success", "Delete", JOptionPane.OK_OPTION);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        btn_edit.setEnabled(false);
        btn_delete.setEnabled(false);
        cleartext();
        refresh();
    }//GEN-LAST:event_btn_deleteActionPerformed

    private void Dep_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dep_jTableMouseClicked
        // TODO add your handling code here:
        btn_edit.setEnabled(true);
        btn_delete.setEnabled(true);
        btn_save.setEnabled(false);
        int index = Dep_jTable.getSelectedRow();
        Number.setText(Dep_Model.getValueAt(index, 0).toString());
        Dep.setText(Dep_Model.getValueAt(index, 1).toString());
    }//GEN-LAST:event_Dep_jTableMouseClicked

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
            java.util.logging.Logger.getLogger(MngDeparment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MngDeparment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MngDeparment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MngDeparment.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MngDeparment().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Dep;
    private javax.swing.JTable Dep_jTable;
    private javax.swing.JTextField Number;
    private javax.swing.JButton btn_delete;
    private javax.swing.JButton btn_edit;
    private javax.swing.JButton btn_new;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
