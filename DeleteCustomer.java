package view;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class DeleteCustomer extends javax.swing.JInternalFrame {

    private Scanner x;

    public DeleteCustomer() {
        initComponents();
    }

//     * This method is called from within the constructor to initialize the form.
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        id = new javax.swing.JTextField();

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(159, 159, 159)
                .addComponent(jButton1)
                .addContainerGap(162, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(62, 62, 62)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(109, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String removeReadoer = id.getText();
        String path = "dataBase\\.txt";

        int value = JOptionPane.showConfirmDialog(null, "Are you Sure to Cancel Ticket?", "Cancel Ticket", JOptionPane.YES_NO_OPTION);
        if (value == 0) {

            removeRedoer(path, removeReadoer);
        }


    }//GEN-LAST:event_jButton1ActionPerformed

    public void removeRedoer(String path, String remove) {
        String temp = "dataBase\\temp.txt";
        File oldFile = new File(path);
        File nefile = new File(temp);
        String ticketId1 = "";
        String SeatNo1 = "";
        String customerID1 = "";
        String flightId1 = "";
        try {
            FileWriter fw = new FileWriter(temp, true);
            BufferedWriter bf = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bf);
            x = new Scanner(new File(path));
            x.useDelimiter("[#\n]");

            while (x.hasNext()) {
                ticketId1 = x.next();
                SeatNo1 = x.next();
                customerID1 = x.next();
                flightId1 = x.next();
                if (!(ticketId1.equals(remove))) {

                    pw.print(ticketId1 + "#" + SeatNo1 + "#" + customerID1 + "#" + flightId1 + "\n");
                }
            }
            x.close();
            pw.flush();
            pw.close();
            oldFile.delete();
            File dump = new File(path);
            nefile.renameTo(dump);
        } catch (Exception e) {
            e.fillInStackTrace();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    // End of variables declaration//GEN-END:variables
}
