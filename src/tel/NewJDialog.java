
package tel;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;

public class NewJDialog extends javax.swing.JDialog {

    DefaultTableModel Dep_Model;
    DefaultTableCellRenderer renderer, centerCellRenderer;
    static String Temp;

    public NewJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("telephone.png")));
        Dep_Model = (DefaultTableModel) Dep_jTable.getModel();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Dep_jTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        Dep_Search = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();

        jButton1.setText("jButton1");

        setTitle("Department");
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

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        jLabel2.setText("Department  :");

        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Dep_Search, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(jButton2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel2)
                    .addComponent(Dep_Search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 441, Short.MAX_VALUE)
                .addContainerGap())
        );

        java.awt.Dimension screenSize = java.awt.Toolkit.getDefaultToolkit().getScreenSize();
        setBounds((screenSize.width-431)/2, (screenSize.height-587)/2, 431, 587);
    }// </editor-fold>//GEN-END:initComponents

    private void Dep_jTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Dep_jTableMouseClicked
        // TODO add your handling code here:
        int index = Dep_jTable.getSelectedRow();
        if (evt.getClickCount() == 1) {
            Temp = Dep_Model.getValueAt(index, 0).toString();
            this.hide();
        }

    }//GEN-LAST:event_Dep_jTableMouseClicked
    protected void refresh() {
        try {
            String[] colname = {"Department"};
            Dep_Model = new DefaultTableModel(colname, 0);
            Connection conn = db.getConnection();
            String sql = "select * from department ORDER BY Department ASC";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String a2 = rs.getString("Department");
                String[] row = {a2};
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
//        Dep_jTable.getColumnModel().getColumn(0).setCellRenderer(centerCellRenderer);
//        Dep_jTable.getColumnModel().getColumn(1).setCellRenderer(centerCellRenderer);

        Dep_jTable.getColumnModel().getColumn(0).setPreferredWidth(389);

    }
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        refresh();
    }//GEN-LAST:event_formWindowOpened

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            String[] colname = {"Department"};
            Dep_Model = new DefaultTableModel(colname, 0);
            Connection conn = db.getConnection();
            String sql = "select * from department where department like '%"+Dep_Search.getText().trim()+"%' ORDER BY Department ASC";
            ResultSet rs = conn.createStatement().executeQuery(sql);
            while (rs.next()) {
                String a2 = rs.getString("Department");
                String[] row = {a2};
                Dep_Model.addRow(row);
                Dep_jTable.setModel(Dep_Model);
                setTable();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
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
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                NewJDialog dialog = new NewJDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField Dep_Search;
    private javax.swing.JTable Dep_jTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
