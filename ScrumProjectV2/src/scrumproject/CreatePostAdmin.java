/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumproject;

import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Date;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

/**
 *
 * @author donniegebrail
 */
public class CreatePostAdmin extends javax.swing.JFrame {
     
    private static String user;
     private static InfDB idb;
    private long currentmilliseconds;
    /**
     * Creates new form CreatePost
     */
    public CreatePostAdmin() {
        initComponents();
        try{
        //Connects to database with an absolute path
            Path path = Paths.get("ScrumProject.FDB").toRealPath(LinkOption.NOFOLLOW_LINKS);
            idb = new InfDB(path.toString());
        }catch(InfException | IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
         
    }
    
    public void sendmail(){
    int index = cbChooseCategory.getSelectedIndex();
          String Category = cbChooseCategory.getItemAt(index);
        final String username = "testmailenscrum@gmail.com";
        final String password = "ScrumProjekt1";

        Properties props = new Properties();
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
          new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
          });

        try {
            
            
            String Catid = "select CategoryID from CATEGORY where Category = '" + Category + "'";
            String Cat = idb.fetchSingle(Catid);
            String Mail = "Select Mail from FollowCategory where CatID = " + Cat +"";
            String to = idb.fetchSingle(Mail);
            

            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("testmailenscrum@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                InternetAddress.parse(to));
            message.setSubject("En ny kategori har lagts till!");
            message.setText("Hejsan Det har nu lagts till ett inlagg i kategorin '"+ Cat +"' du följer");
      

            Transport.send(message);

            

        } catch (InfException | MessagingException e) {
            throw new RuntimeException(e);
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

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel3 = new javax.swing.JPanel();
        jButton5 = new javax.swing.JButton();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton6 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtPost = new javax.swing.JTextArea();
        btnCreatePost = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        cbChooseCategory = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtheader = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtAddCategory = new javax.swing.JTextField();
        btnAddCate = new javax.swing.JButton();
        cbChooseSite = new javax.swing.JComboBox<>();
        btnReturnStartPage = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton5.setText("Radera Inlägg");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton6.setText("Radera Kategori");

        jLabel3.setText("Välj en kategori att ta bort:");

        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel6.setText("Välj ett inlägg att ta bort:");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(jButton5))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton6)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addContainerGap(236, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Radera ", jPanel3);

        txtPost.setColumns(20);
        txtPost.setRows(5);
        txtPost.setBorder(javax.swing.BorderFactory.createTitledBorder("Skapa ett inlägg\n"));
        jScrollPane1.setViewportView(txtPost);

        btnCreatePost.setText("Skapa inlägg");
        btnCreatePost.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreatePostMouseClicked(evt);
            }
        });

        jButton2.setText("Infoga fil");

        cbChooseCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj kategori" }));
        cbChooseCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbChooseCategoryMouseClicked(evt);
            }
        });

        jLabel4.setText("Skriv rubrik:");

        jLabel5.setText("Lägg till kategori:");

        btnAddCate.setText("Lägg till");
        btnAddCate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCateMouseClicked(evt);
            }
        });

        cbChooseSite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Startsida", "Utbildningssida", "Forskninssida", "Blogg" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(txtheader, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(117, 117, 117)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAddCategory)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                                .addComponent(btnAddCate))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 404, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbChooseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton2)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbChooseSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 253, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreatePost)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(5, 5, 5)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbChooseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(cbChooseSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCreatePost)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Skapa ett inlägg", jPanel1);

        btnReturnStartPage.setText("Tillbaka");
        btnReturnStartPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReturnStartPageActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jTabbedPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnReturnStartPage)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addGap(20, 20, 20)
                .addComponent(btnReturnStartPage)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnReturnStartPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReturnStartPageActionPerformed
        StartPage startPage = new StartPage(); 
        this.setVisible(false); 
        startPage.setVisible(true);
    }//GEN-LAST:event_btnReturnStartPageActionPerformed

    private void cbChooseCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbChooseCategoryMouseClicked
        Validation val = new Validation();
        val.getCategoryComboBox(cbChooseCategory);
    }//GEN-LAST:event_cbChooseCategoryMouseClicked

    private void btnCreatePostMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreatePostMouseClicked
        String post = txtPost.getText();
        String header = txtheader.getText();
        int index = cbChooseSite.getSelectedIndex();
        String site = cbChooseSite.getItemAt(index);
        int indexcat = cbChooseCategory.getSelectedIndex();
        String Category = cbChooseCategory.getItemAt(indexcat);
        Validation val = new Validation();
        
        long yourmilliseconds = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");    
        Date resultdate = new Date(yourmilliseconds);
        System.out.println(sdf.format(resultdate));
          
          
        String Login = "Select EmployeeID from EMPLOYEE where EMAIL = '" + Validation.getLoggedInUser() + "'";
        
        String CateID = "Select CategoryID from Category where Category = '" + Category + "'";
        
        
        try {
            if(val.checkIfTxtIsEmpty(post) == true || val.checkIfTxtIsEmpty(header) == true){
                JOptionPane.showMessageDialog(null, "Du måste fylla i alla fält!");
            }else{
            String SqlLoggedIn = idb.fetchSingle(Login);
            String SqlCateID = idb.fetchSingle(CateID);
            String sql = "Insert into POST(PostID, Employee, DATETIME, Text, Header, Sites, CateID)\n"
        + "Values(" + idb.getAutoIncrement("Post","PostID") + ", " + SqlLoggedIn + ", '" + resultdate + "', '" + post +  "', '" + header + "', '" + site + "', " + SqlCateID + ")";
        idb.insert(sql);
        sendmail();
        JOptionPane.showMessageDialog(null, "Du har nu lagt till ett inlägg nu");
        
//        Validation val = new Validation();
//        if(val.checkIfEmail() == true)
//        {
//        sendmail();
//        }
            }
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Fel i databasen");
        }
    }//GEN-LAST:event_btnCreatePostMouseClicked

    private void btnAddCateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCateMouseClicked
        // TODO add your handling code here:
        Validation val = new Validation();
        String addCate = txtAddCategory.getText();
    
        
        if(val.checkIfTxtIsEmpty(addCate) == false){
            try{
       //int id = 
              
        String sqlInsert = "Insert into Category (CategoryID, Category)\n"
                + "Values(" + idb.getAutoIncrement("Category","CategoryID") + ", '" + addCate + "')";
        idb.insert(sqlInsert);
        JOptionPane.showMessageDialog(null, "Du har lagt till en ny kategory!");
        }
            catch(Exception e)
        {
        JOptionPane.showMessageDialog(null, "Fel i databasen");
        }
            
        }
        
    }//GEN-LAST:event_btnAddCateMouseClicked

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
            java.util.logging.Logger.getLogger(CreatePostAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePostAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePostAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePostAdmin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePostAdmin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCate;
    private javax.swing.JButton btnCreatePost;
    private javax.swing.JButton btnReturnStartPage;
    private javax.swing.JComboBox<String> cbChooseCategory;
    private javax.swing.JComboBox<String> cbChooseSite;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField txtAddCategory;
    private javax.swing.JTextArea txtPost;
    private javax.swing.JTextField txtheader;
    // End of variables declaration//GEN-END:variables
}