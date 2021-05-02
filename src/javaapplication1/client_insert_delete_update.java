/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import static javaapplication1.JavaApplication1.conn;


/**
 *
 * @author Prince Hossain
 */
public class client_insert_delete_update extends javax.swing.JFrame {

  

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_DisplayClient = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        address = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        phone = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        score = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton_Update = new javax.swing.JButton();
        jButton_Delete = new javax.swing.JButton();
        jButton_Insert = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable_DisplayClient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Gender", "Email", "Address", "Phone Num", "Age", "Score"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_DisplayClient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_DisplayClientMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jTable_DisplayClientMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_DisplayClient);

        jLabel1.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        jLabel1.setText("Client Info Page");

        jLabel2.setText("Name");

        jLabel3.setText("Gender");

        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });

        jLabel4.setText("Address");

        jLabel5.setText("Phone Number");

        jLabel6.setText("Email");

        jLabel7.setText("Age");

        id.setEditable(false);
        id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                idActionPerformed(evt);
            }
        });

        jLabel8.setText("ID");

        jLabel9.setText("Score");

        jButton_Update.setText("Update");
        jButton_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_UpdateActionPerformed(evt);
            }
        });

        jButton_Delete.setText("Delete");
        jButton_Delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_DeleteActionPerformed(evt);
            }
        });

        jButton_Insert.setText("Insert");
        jButton_Insert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_InsertActionPerformed(evt);
            }
        });

        jButton1.setText("Go Back");
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(id, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(name, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gender, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap(13, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(phone, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(address, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(email, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(age, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(score, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(26, 26, 26)
                                .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 596, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(285, 285, 285)
                        .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(282, 282, 282)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(421, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(gender, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(address, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(score, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 467, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Delete, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Update, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_Insert, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_DisplayClientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DisplayClientMouseClicked
        // TODO add your handling code here:
        // TODO add your handling code here:
        // Get The Index Of The Slected Row 
       //System.out.println("in mouse event");
        
    }//GEN-LAST:event_jTable_DisplayClientMouseClicked

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_idActionPerformed

    private void jButton_InsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_InsertActionPerformed
        // TODO add your handling code here:
        
         String query = "INSERT INTO `Client_`( `client_name`, `client_gender`,`client_address`,`client_phone_number`,`client_email`,`Client_age`,`credit_score`) VALUES ('"+name.getText()+"','"+gender.getText()+"','"+address.getText()+"','"+phone.getText()+"','"+email.getText()+"',"+age.getText()+","+score.getText()+")";
        System.out.println(query);
         executeSQlQuery(query, "Inserted",0);
    }//GEN-LAST:event_jButton_InsertActionPerformed

    private void jButton_UpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_UpdateActionPerformed
        // TODO add your handling code here:
        
         String query = "UPDATE `Client_` SET `client_name`='"+name.getText()+"',`client_gender`='"+gender.getText()+"',`client_address`='"+address.getText()+"',`client_phone_number`='"+phone.getText()+"',`Client_age`="+age.getText()+",`client_phone_number`='"+phone.getText()+"',`client_email`='"+email.getText()+"',`credit_score`="+score.getText()+" WHERE `client_id` = "+id.getText();
        System.out.println(query);
        executeSQlQuery(query, "Updated",1);
    }//GEN-LAST:event_jButton_UpdateActionPerformed

    private void jButton_DeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_DeleteActionPerformed
        // TODO add your handling code here:
        
        String query = "DELETE FROM `Client_` WHERE client_id = "+id.getText();
         executeSQlQuery(query, "Deleted",1);
        
    }//GEN-LAST:event_jButton_DeleteActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTable_DisplayClientMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_DisplayClientMousePressed
        // TODO add your handling code here:
        int i = jTable_DisplayClient.getSelectedRow();

        TableModel model = jTable_DisplayClient.getModel();
        
         // Display Slected Row In JTexteFields
        id.setText(model.getValueAt(i,0).toString());

        name.setText(model.getValueAt(i,1).toString());

        gender.setText(model.getValueAt(i,2).toString());

        address.setText(model.getValueAt(i,4).toString());
        
        phone.setText(model.getValueAt(i,5).toString());
        
        email.setText(model.getValueAt(i,3).toString());
        
        age.setText(model.getValueAt(i,6).toString());
        
        score.setText(model.getValueAt(i,7).toString());
    }//GEN-LAST:event_jTable_DisplayClientMousePressed

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
            java.util.logging.Logger.getLogger(client_insert_delete_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(client_insert_delete_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(client_insert_delete_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(client_insert_delete_update.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new client_insert_delete_update().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address;
    private javax.swing.JTextField age;
    private javax.swing.JTextField email;
    private javax.swing.JTextField gender;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton_Delete;
    private javax.swing.JButton jButton_Insert;
    private javax.swing.JButton jButton_Update;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_DisplayClient;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    private javax.swing.JTextField score;
    // End of variables declaration//GEN-END:variables
  /**
     * Creates new form Java_Insert_Update_Delete_Display
     */
    public client_insert_delete_update() {
        initComponents();
        Show_Users_In_JTable();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            Logger.getLogger(client_insert_delete_update.class.getName()).log(Level.SEVERE, null, ex);
        }

       this.setVisible(true);
    }
    public ArrayList<Client> getUsersList()
   {
       ArrayList<Client> clientList = new ArrayList<Client>();
       Connection connection = conn;
       String query = "SELECT * FROM  `Client_`";
       Statement st;
       ResultSet rs;
       
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);
           Client client;
           while(rs.next()) {
               //System.out.println("in loop");

               Client clientVariable = new Client(rs.getInt("client_id"),rs.getString("client_name"),rs.getString("client_gender"),rs.getString("client_address"),rs.getString("client_phone_number"),rs.getString("client_email"),rs.getInt("Client_age"),rs.getInt("credit_score"));
               clientList.add(clientVariable);
               //System.out.println(rs.getString("age"));
           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return clientList;
   }
    
    public void Show_Users_In_JTable()
   {
       ArrayList<Client> list = getUsersList();
       DefaultTableModel model = (DefaultTableModel) jTable_DisplayClient.getModel();
       Object[] row = new Object[8];
       for(int i = 0; i < list.size(); i++)
       {
           //System.out.println(list.get(i).getId());
           row[0] = list.get(i).getClient_id();
           row[1] = list.get(i).getClient_name();
           row[2] = list.get(i).getClient_gender();
           row[3] = list.get(i).getClient_email();
           row[4] = list.get(i).getClient_address();
           row[5] = list.get(i).getClient_phone_number();
           row[6] = list.get(i).getClient_age();
           row[7] = list.get(i).getCredit_score();
           
           model.addRow(row);
       }
    }
    
    public void executeSQlQuery(String query, String message, int messageFlag)
   {
       Connection con = conn;
       Statement st;
       try{
           st = con.createStatement();
           if((st.executeUpdate(query)) == 1)
           {
               // refresh jtable data
               DefaultTableModel model = (DefaultTableModel)jTable_DisplayClient.getModel();
               model.setRowCount(0);
               Show_Users_In_JTable();
               if(messageFlag == 1) {
                   JOptionPane.showMessageDialog(null, "Data "+message+" Succefully");
               }
           }else{
               JOptionPane.showMessageDialog(null, "Data Not "+message);
           }
       }catch(Exception ex){
           ex.printStackTrace();
       }
   }   
                
   

    private void jTextField_volunteer_idActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       

    private void jTextField_availability_hoursActionPerformed(java.awt.event.ActionEvent evt) {                                                              
        // TODO add your handling code here:
    }                                                             

    private void jTextField_v_last_nameActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void jTextField_v_first_nameActionPerformed(java.awt.event.ActionEvent evt) {                                                        
        // TODO add your handling code here:
    }                                                       
    
    public int getInsertedID(String query)
   {       
       Connection connection = conn;
       Statement st;
       ResultSet rs;
       int id =0;
       try {
           st = connection.createStatement();
           rs = st.executeQuery(query);
           if(rs.next()) {
                id = rs.getInt("client_id");

           }
       } catch (Exception e) {
           e.printStackTrace();
       }
       return id;
   }
                                        

    private void jTextField_starting_timeActionPerformed(java.awt.event.ActionEvent evt) {                                                         
        // TODO add your handling code here:
    }                                                        

    private void jTextField_v_phone_numberActionPerformed(java.awt.event.ActionEvent evt) {                                                          
        // TODO add your handling code here:
    }                                                         

  
        /* Set the Nimbus look and feel */
      
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
     

   
    // End of variables declaration                   
}