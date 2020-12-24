
/*Project name : AirLine Ticket Reservation System
        KUlvinder Singh
        your roll no. 275-BSCS-2019 (Section E1)

        Description: This class is used to cancel the ticket
        used classes : ticket and FileHandler classes is used in this class*/
package view;
//Importing Classes

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;

//Ticket Canccelation Clas
public class CanncelTicket extends javax.swing.JInternalFrame {

    private Scanner x;
//    Cunstructor

    public CanncelTicket() {
        initComponents();
    }

//      This method is called from within the constructor to initialize the form.

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        canncel = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        back = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Canncel Ticket");

        id.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        id.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        canncel.setText("Canncel");
        canncel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                canncelActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Enter Ticket ID");

        back.setText("Back");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(140, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(canncel, javax.swing.GroupLayout.DEFAULT_SIZE, 129, Short.MAX_VALUE)
                    .addComponent(id)
                    .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(125, 125, 125))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(canncel, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(back)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    Canncel Button method
    private void canncelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_canncelActionPerformed
        String removeReadoer = id.getText();
        String path = "dataBase\\ticket.txt";
        int value = JOptionPane.showConfirmDialog(null, "Are you Sure to Cancel Ticket?", "Cancel Ticket", JOptionPane.YES_NO_OPTION);
        if (value == 0) {
            removeRedoer(path, removeReadoer);
        }
    }//GEN-LAST:event_canncelActionPerformed

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dispose();
    }//GEN-LAST:event_backActionPerformed

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
                    pw.print(ticketId1+"#"+SeatNo1+"#"+customerID1+"#"+flightId1+ "\n");
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
    private javax.swing.JButton back;
    private javax.swing.JButton canncel;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
