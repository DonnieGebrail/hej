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
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;


/**
 *
 * @author donniegebrail
 */
public class CreatePost extends javax.swing.JFrame {
      private static String user;
      private static InfDB idb;
    /**
     * Creates new form CreatePost
     */
    public CreatePost() {
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
            message.setText("Hejsan Det har nu lagts till ett inlagg i en kategori du foljer");
      

            Transport.send(message);

            JOptionPane.showMessageDialog(null, "Nu har ett mail skickats till " + to + "");

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

        jScrollPane1 = new javax.swing.JScrollPane();
        txtPost = new javax.swing.JTextArea();
        btnConfirm = new javax.swing.JButton();
        btnAddFile = new javax.swing.JButton();
        cbChooseCategory = new javax.swing.JComboBox<>();
        btnAddCategory = new javax.swing.JButton();
        txtAddCate = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtheader = new javax.swing.JTextField();
        cbChooseSite = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtPost.setColumns(20);
        txtPost.setRows(5);
        txtPost.setBorder(javax.swing.BorderFactory.createTitledBorder("Skapa ett inlägg\n"));
        jScrollPane1.setViewportView(txtPost);

        btnConfirm.setText("Bekräfta");
        btnConfirm.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConfirmMouseClicked(evt);
            }
        });

        btnAddFile.setText("Infoga fil");

        cbChooseCategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Välj kategori" }));
        cbChooseCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbChooseCategoryMouseClicked(evt);
            }
        });

        btnAddCategory.setText("Lägg till");
        btnAddCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCategoryMouseClicked(evt);
            }
        });

        jLabel1.setText("Lägg till en ny kategori:");

        jButton4.setText("Tillbaka");

        jLabel2.setText("Skriv in rubrik:");

        cbChooseSite.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Startsida", "Utbildning", "Forskning", "Blogg" }));

        jLabel3.setText("Välj sida:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(173, 173, 173))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtheader, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(105, 105, 105)
                                .addComponent(txtAddCate, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnAddCategory))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbChooseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(26, 26, 26)
                                .addComponent(btnAddFile))
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(60, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel3))
                            .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbChooseSite, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtheader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAddCate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAddCategory))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAddFile)
                    .addComponent(cbChooseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbChooseSite, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfirm)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton4)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCategoryMouseClicked
        // TODO add your handling code here:
        Validation val = new Validation();
        String addCate = txtAddCate.getText();
    
        
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
        
    }//GEN-LAST:event_btnAddCategoryMouseClicked

    private void cbChooseCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbChooseCategoryMouseClicked
        Validation Val = new Validation();
        Val.getCategoryComboBox(cbChooseCategory);
    }//GEN-LAST:event_cbChooseCategoryMouseClicked

    private void btnConfirmMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfirmMouseClicked
        String post = txtPost.getText();
        String header = txtheader.getText();
        int index = cbChooseSite.getSelectedIndex();
        String site = cbChooseSite.getItemAt(index);
        int indexcat = cbChooseCategory.getSelectedIndex();
        String Category = cbChooseCategory.getItemAt(indexcat);
        
        long yourmilliseconds = System.currentTimeMillis();
        SimpleDateFormat sdf = new SimpleDateFormat("dd.MM.yyyy");    
        Date resultdate = new Date(yourmilliseconds);
        System.out.println(sdf.format(resultdate));
        
        String Login = "Select EmployeeID from EMPLOYEE where EMAIL = '" + Validation.getLoggedInUser() + "'";
        
        String CateID = "Select CategoryID from Category where Category = '" + Category + "'";
        
        
        try {
            String SqlLoggedIn = idb.fetchSingle(Login);
            String SqlCateID = idb.fetchSingle(CateID);
            String sql = "Insert into POST(PostID, Employee, DATETIME, Text, Header, Sites, CateID)\n"
        + "Values(" + idb.getAutoIncrement("Post","PostID") + ", " + SqlLoggedIn + ", '" + resultdate + "', '" + post +  "', '" + header + "', '" + site + "', " + SqlCateID + ")";
        idb.insert(sql);
        sendmail();
        JOptionPane.showMessageDialog(null, "Det gick din idiot");
        }catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, "Fel i databasen");
        }
    }//GEN-LAST:event_btnConfirmMouseClicked

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
            java.util.logging.Logger.getLogger(CreatePost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePost.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePost().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCategory;
    private javax.swing.JButton btnAddFile;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbChooseCategory;
    private javax.swing.JComboBox<String> cbChooseSite;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAddCate;
    private javax.swing.JTextArea txtPost;
    private javax.swing.JTextField txtheader;
    // End of variables declaration//GEN-END:variables
}
