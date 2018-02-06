package tel;

import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class main extends javax.swing.JFrame {

    DefaultTableModel Tel_Model;
    DefaultTableCellRenderer renderer, centerCellRenderer;

    public main() {
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
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tel_Cbo_Column = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("เบอร์โทรภายใน");
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
        jScrollPane1.setViewportView(Tel_jTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("ค้นหา"));

        jButton1.setText("ค้นหา");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        tel_Cbo_Column.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "แผนก", "ชื่อ", "เบอร์โทร" }));
        tel_Cbo_Column.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tel_Cbo_ColumnActionPerformed(evt);
            }
        });

        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(tel_Cbo_Column, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextField1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField1)
                    .addComponent(tel_Cbo_Column)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-456)/2, (screenSize.height-577)/2, 456, 577);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        // TODO add your handling code here:
        if (evt.getModifiers() == InputEvent.BUTTON3_MASK) {
            setting a = new setting();
            a.setVisible(true);
        }
    }//GEN-LAST:event_jLabel1MouseClicked
    protected void search(String column, String searchkey) {
        try {
            String[] colname = {"Department", "Name", "Tel."};
            Tel_Model = new DefaultTableModel(colname, 0);
            Connection conn = db.getConnection();
            String sql = "select * from tbtel where " + column + " like '%" + searchkey + "%'  ORDER BY " + column + " ASC";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String a1 = rs.getString("Department");
                String a2 = rs.getString("Name");
                String a3 = rs.getString("Tel");
                String[] row = {a1, a2, a3};
                Tel_Model.addRow(row);
                Tel_jTable.setModel(Tel_Model);
                setTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if (tel_Cbo_Column.getSelectedIndex() == 0) {
            search("Department", jTextField1.getText().trim());
        } else if (tel_Cbo_Column.getSelectedIndex() == 1) {
            search("Name", jTextField1.getText().trim());
        } else if (tel_Cbo_Column.getSelectedIndex() == 2) {
            search("Tel", jTextField1.getText().trim());
        }
    }//GEN-LAST:event_jButton1ActionPerformed
    protected void clearTable() {
        String[] colname = {"Department", "Name", "Tel."};
        Tel_Model = new DefaultTableModel(colname, 0);
        Tel_jTable.setModel(Tel_Model);
        setTable();
    }

    protected void setTable() {
        renderer = (DefaultTableCellRenderer) Tel_jTable.getTableHeader().getDefaultRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

        centerCellRenderer = new DefaultTableCellRenderer();
        centerCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
//        Tel_jTable.getColumnModel().getColumn(0).setCellRenderer(centerCellRenderer);
//        Tel_jTable.getColumnModel().getColumn(1).setCellRenderer(centerCellRenderer);
        Tel_jTable.getColumnModel().getColumn(2).setCellRenderer(centerCellRenderer);


        Tel_jTable.getColumnModel().getColumn(0).setPreferredWidth(170);
        Tel_jTable.getColumnModel().getColumn(1).setPreferredWidth(150);
        Tel_jTable.getColumnModel().getColumn(2).setPreferredWidth(80);



    }

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        clearTable();
    }//GEN-LAST:event_formWindowOpened

    private void tel_Cbo_ColumnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tel_Cbo_ColumnActionPerformed
        // TODO add your handling code here:
        jTextField1.setText("");
    }//GEN-LAST:event_tel_Cbo_ColumnActionPerformed

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
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new main().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Tel_jTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox tel_Cbo_Column;
    // End of variables declaration//GEN-END:variables
}
