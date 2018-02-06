/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tel;

import java.awt.Event;
import java.awt.Menu;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.print.DocFlavor;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class setting extends javax.swing.JFrame {

    DefaultTableModel Tel_Model;
    DefaultTableCellRenderer renderer, centerCellRenderer;

    public setting() {
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("telephone.png")));
        Tel_Model = (DefaultTableModel) Tel_jTable.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Tel_jTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        btnNew = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Set_Telephone = new javax.swing.JTextField();
        Set_Name = new javax.swing.JTextField();
        Set_Department = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Set_Number = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();

        setTitle("จัดการเบอรโทร");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Tel_jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Tel_jTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        Tel_jTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Tel_jTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Tel_jTable);

        jPanel1.setLayout(new java.awt.GridLayout(1, 0));

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });
        jPanel1.add(btnNew);

        btnEdit.setText("Edit");
        btnEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditActionPerformed(evt);
            }
        });
        jPanel1.add(btnEdit);

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btnDelete);

        btnSave.setText("Save");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        jPanel1.add(btnSave);

        jButton5.setText("Exit");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel4.setText("Telephone :");

        jLabel1.setText("Number :");

        Set_Telephone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        Set_Telephone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Set_TelephoneKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                Set_TelephoneKeyTyped(evt);
            }
        });

        Set_Name.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        Set_Name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                Set_NameKeyPressed(evt);
            }
        });

        Set_Department.setEditable(false);
        Set_Department.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                Set_DepartmentMousePressed(evt);
            }
        });
        Set_Department.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Set_DepartmentActionPerformed(evt);
            }
        });

        jLabel3.setText("Name :");

        jLabel2.setText("Department :");

        Set_Number.setEditable(false);
        Set_Number.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        Set_Number.setEnabled(false);

        jButton6.setText("...");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Set_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(Set_Number, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
                        .addComponent(Set_Telephone, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Set_Department, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton6)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(Set_Number, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Set_Telephone)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Set_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(13, 13, 13)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(jButton6)
                    .addComponent(Set_Department, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 21, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 368, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-515)/2, (screenSize.height-650)/2, 515, 650);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton5ActionPerformed
    protected void clearTable() {
        String[] colname = {"Number", "Department", "Name", "Tel."};
        Tel_Model = new DefaultTableModel(colname, 0);
        Tel_jTable.setModel(Tel_Model);
        setTable();
    }

    protected void setTable() {
        renderer = (DefaultTableCellRenderer) Tel_jTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        centerCellRenderer = new DefaultTableCellRenderer();
        centerCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
        Tel_jTable.getColumnModel().getColumn(0).setCellRenderer(centerCellRenderer);
//        Tel_jTable.getColumnModel().getColumn(1).setCellRenderer(centerCellRenderer);
//        Tel_jTable.getColumnModel().getColumn(2).setCellRenderer(centerCellRenderer);
        Tel_jTable.getColumnModel().getColumn(3).setCellRenderer(centerCellRenderer);

        Tel_jTable.getColumnModel().getColumn(0).setPreferredWidth(70);
        Tel_jTable.getColumnModel().getColumn(1).setPreferredWidth(170);
        Tel_jTable.getColumnModel().getColumn(2).setPreferredWidth(160);
        Tel_jTable.getColumnModel().getColumn(3).setPreferredWidth(42);


    }

    protected void clearText() {
        Set_Number.setText("");
        Set_Name.setText("");
        Set_Department.setText("");
        Set_Telephone.setText("");

    }
    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        // TODO add your handling code here:
        btnSave.setEnabled(true);
        btnDelete.setEnabled(false);
        btnEdit.setEnabled(false);

        clearText();
    }//GEN-LAST:event_btnNewActionPerformed
    protected void refresh() {
        try {
            String[] colname = {"Number", "Department", "Name", "Tel."};
            Tel_Model = new DefaultTableModel(colname, 0);
            Connection conn = db.getConnection();
            String sql = "select * from tbtel ORDER BY Department ASC,tel asc";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String a1 = rs.getString("Number");
                String a2 = rs.getString("Department");
                String a3 = rs.getString("Name");
                String a4 = rs.getString("tel");
                String[] row = {a1, a2, a3, a4};
                Tel_Model.addRow(row);
                Tel_jTable.setModel(Tel_Model);
                setTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void btnEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditActionPerformed
        // TODO add your handling code here:
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnNew.setEnabled(true);
        try {
            Connection conn = db.getConnection();
            String sql = "update tbtel "
                    + " set Department='" + Set_Department.getText() + "' "
                    + ",Name='" + Set_Name.getText() + "' "
                    + ",tel='" + Set_Telephone.getText() + "' "
                    + " where Number = " + Set_Number.getText();
            PreparedStatement pre = conn.prepareStatement(sql);
            if (pre.executeUpdate() != -1) {
                JOptionPane.showMessageDialog(this, "Update success", "Update", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        int index = Tel_jTable.getSelectedRow();
        Tel_Model.setValueAt(Set_Number.getText().trim(), index, 0);
        Tel_Model.setValueAt(Set_Department.getText().trim(), index, 1);
        Tel_Model.setValueAt(Set_Name.getText().trim(), index, 2);
        Tel_Model.setValueAt(Set_Telephone.getText().trim(), index, 3);
        clearText();
    }//GEN-LAST:event_btnEditActionPerformed

    private void Set_DepartmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Set_DepartmentActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Set_DepartmentActionPerformed

    private void Set_DepartmentMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Set_DepartmentMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_Set_DepartmentMousePressed

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        // TODO add your handling code here:
        if (evt.getModifiers() == InputEvent.BUTTON1_MASK) {
            System.out.println("button1");
        }
        if (evt.getModifiers() == InputEvent.BUTTON2_MASK) {
            System.out.println("button2");
        }
        if (evt.getModifiers() == InputEvent.BUTTON3_MASK) {
            System.out.println("button3");
            MngDeparment g = new MngDeparment();
            g.setVisible(true);


        }
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        NewJDialog g = new NewJDialog(this, true);
        g.setVisible(true);
        Set_Department.setText(g.Temp);

    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        btnSave.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        clearTable();
        refresh();

    }//GEN-LAST:event_formWindowOpened

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
        btnNew.setEnabled(true);

        try {
            int[] rowselect = Tel_jTable.getSelectedRows();
            int rowlength = rowselect.length;
            for (int i = rowlength - 1; i >= 0; i--) {
                Tel_Model.removeRow(rowselect[i]);
                Connection conn = db.getConnection();
                String sql = "delete from tbtel where Number=" + Set_Number.getText().trim();
                PreparedStatement pre = conn.prepareStatement(sql);
                conn.createStatement().executeUpdate(sql);
                if (pre.executeUpdate() != -1) {
                    JOptionPane.showMessageDialog(this, "Delete Success", "Delete", JOptionPane.OK_OPTION);
                    clearText();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:

        if (Set_Department.getText().length()<1 ||Set_Name.getText().length()<1 ||Set_Telephone.getText().length()<1) {
            JOptionPane.showMessageDialog(this, "Save Fail","Error",JOptionPane.ERROR_MESSAGE);
            btnSave.setEnabled(false);
            clearText();
            
        } else {
            try {
                Connection conn = db.getConnection();
                String sql = "insert into tbtel(Department,Name,tel) values(?,?,?)";
                PreparedStatement pre = conn.prepareStatement(sql);
                pre.setString(1, Set_Department.getText().trim());
                pre.setString(2, Set_Name.getText().trim());
                pre.setString(3, Set_Telephone.getText().trim());
                if (pre.executeUpdate() != -1) {
                    JOptionPane.showMessageDialog(this, "Save Success", "Save", JOptionPane.INFORMATION_MESSAGE);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                String Number1;
                Connection conn = db.getConnection();
                String sql = "SELECT * FROM tbtel ORDER BY Number DESC LIMIT 1";
                ResultSet rs = conn.createStatement().executeQuery(sql);
                while (rs.next()) {
                    Number1 = rs.getString("Number");
                    Tel_Model.insertRow(Tel_Model.getRowCount(), new Object[]{
                                Number1,
                                Set_Department.getText().trim(),
                                Set_Name.getText().trim(),
                                Set_Telephone.getText().trim(),});
                }
            } catch (Exception e) {
                e.printStackTrace();
            }        
            btnSave.setEnabled(false);
            clearText();
            refresh();
        }
    }//GEN-LAST:event_btnSaveActionPerformed

    private void Tel_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Tel_jTableMouseClicked
        // TODO add your handling code here:

        btnSave.setEnabled(false);
        btnNew.setEnabled(true);
        btnEdit.setEnabled(true);
        btnDelete.setEnabled(true);
        int index = Tel_jTable.getSelectedRow();
        Set_Number.setText(Tel_Model.getValueAt(index, 0).toString());
        Set_Department.setText(Tel_Model.getValueAt(index, 1).toString());
        Set_Name.setText(Tel_Model.getValueAt(index, 2).toString());
        Set_Telephone.setText(Tel_Model.getValueAt(index, 3).toString());
    }//GEN-LAST:event_Tel_jTableMouseClicked

    private void Set_TelephoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Set_TelephoneKeyTyped
        // TODO add your handling code here:

        if (!(Character.isDigit(evt.getKeyChar()))) {
            evt.consume();
        }
    }//GEN-LAST:event_Set_TelephoneKeyTyped

    private void Set_TelephoneKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Set_TelephoneKeyPressed
        // TODO add your handling code here:
            if (Set_Number.getText().trim().equals("") && (!(btnSave.isEnabled()))) {
            btnSave.setEnabled(true);
        }
    }//GEN-LAST:event_Set_TelephoneKeyPressed

    private void Set_NameKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Set_NameKeyPressed
        // TODO add your handling code here:
          if (Set_Number.getText().trim().equals("") && (!(btnSave.isEnabled()))) {
            btnSave.setEnabled(true);
        }
    }//GEN-LAST:event_Set_NameKeyPressed

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
            java.util.logging.Logger.getLogger(setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(setting.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new setting().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Set_Department;
    private javax.swing.JTextField Set_Name;
    private javax.swing.JTextField Set_Number;
    private javax.swing.JTextField Set_Telephone;
    private javax.swing.JTable Tel_jTable;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
