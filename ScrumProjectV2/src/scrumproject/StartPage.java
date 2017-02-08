/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package scrumproject;

import java.awt.event.ItemEvent;
import java.io.IOException;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;

/**
 *
 * @author donniegebrail
 */
public class StartPage extends javax.swing.JFrame {
     private static InfDB idb;
     
   
      
    /**
     * Creates new form StartPage
     */
    public StartPage() {
        
        initComponents();
        
        try{
        //Connects to database with an absolute path
            Path con = Paths.get("ScrumProject.FDB").toRealPath(LinkOption.NOFOLLOW_LINKS);
            idb = new InfDB(con.toString());
        }catch(InfException | IOException e){
            JOptionPane.showMessageDialog(null, e);
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
        listHeader = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPosts = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtComments = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        brnAddComment = new javax.swing.JButton();
        btnCreatePost = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnMeetings = new javax.swing.JButton();
        btnBlogg = new javax.swing.JButton();
        btnEducation = new javax.swing.JButton();
        btnResearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnEmployee = new javax.swing.JButton();
        btnStartPage = new javax.swing.JButton();
        btnLoggOut = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbChooseCategory = new javax.swing.JComboBox<>();
        cbChooseEmployee = new javax.swing.JComboBox<>();
        txtWriteComment = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listHeader.setBorder(javax.swing.BorderFactory.createTitledBorder("Välj ett inlägg"));
        listHeader.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listHeaderValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listHeader);

        txtPosts.setEditable(false);
        txtPosts.setColumns(20);
        txtPosts.setRows(5);
        txtPosts.setBorder(javax.swing.BorderFactory.createTitledBorder("Inlägg"));
        jScrollPane2.setViewportView(txtPosts);

        txtComments.setEditable(false);
        txtComments.setColumns(20);
        txtComments.setRows(5);
        txtComments.setBorder(javax.swing.BorderFactory.createTitledBorder("Kommentarer\n"));
        jScrollPane3.setViewportView(txtComments);

        jButton1.setText("Ladda ner fil");

        brnAddComment.setText("Lägg till kommentar");
        brnAddComment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                brnAddCommentMouseClicked(evt);
            }
        });

        btnCreatePost.setText("Lägg till inlägg");
        btnCreatePost.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePostActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 36)); // NOI18N
        jLabel1.setText("Startsida");

        btnMeetings.setText("Möten");
        btnMeetings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeetingsActionPerformed(evt);
            }
        });

        btnBlogg.setText("Blogg");
        btnBlogg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloggActionPerformed(evt);
            }
        });

        btnEducation.setText("Utbildning");
        btnEducation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEducationActionPerformed(evt);
            }
        });

        btnResearch.setText("Forskning");
        btnResearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResearchActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Meny");

        btnEmployee.setText("Anställda");
        btnEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeeActionPerformed(evt);
            }
        });

        btnStartPage.setText("Startsida");
        btnStartPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartPageActionPerformed(evt);
            }
        });

        btnLoggOut.setText("Logga ut");
        btnLoggOut.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLoggOutMouseClicked(evt);
            }
        });

        jLabel3.setText("Välkommen till vårt nyhetsflöde");

        cbChooseCategory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbChooseCategoryItemStateChanged(evt);
            }
        });
        cbChooseCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbChooseCategoryMouseClicked(evt);
            }
        });

        cbChooseEmployee.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbChooseEmployeeItemStateChanged(evt);
            }
        });
        cbChooseEmployee.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbChooseEmployeeMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(348, 348, 348)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel2)
                                .addGap(243, 243, 243)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnLoggOut))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnStartPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBlogg, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnResearch, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEducation, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMeetings, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtWriteComment, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(brnAddComment))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCreatePost, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 281, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(cbChooseEmployee, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbChooseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(cbChooseCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cbChooseEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel3))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStartPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBlogg)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEducation)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResearch)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMeetings)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmployee)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCreatePost, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtWriteComment, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(brnAddComment))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLoggOut)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartPageActionPerformed
        StartPage startPage = new StartPage(); 
        this.setVisible(false); 
        startPage.setVisible(true);
    }//GEN-LAST:event_btnStartPageActionPerformed

    private void btnBloggActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloggActionPerformed
        Blogg blogg = new Blogg();
        this.setVisible(false);
        blogg.setVisible(true);
    }//GEN-LAST:event_btnBloggActionPerformed

    private void btnEducationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEducationActionPerformed
        EducationPage educationPage = new EducationPage(); 
        this.setVisible(false); 
        educationPage.setVisible(true);
    }//GEN-LAST:event_btnEducationActionPerformed

    private void btnResearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResearchActionPerformed
        ResearchPage researchPage = new ResearchPage(); 
        this.setVisible(false); 
        researchPage.setVisible(true);
    }//GEN-LAST:event_btnResearchActionPerformed

    private void btnMeetingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeetingsActionPerformed
        MeetingPage meetingPage = new MeetingPage(); 
        this.setVisible(false); 
        meetingPage.setVisible(true);
    }//GEN-LAST:event_btnMeetingsActionPerformed

    private void btnEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeeActionPerformed
       
        
        EmployeePageAdmin employeeAdminPage = new EmployeePageAdmin(); 
        this.setVisible(false); 
        employeeAdminPage.setVisible(true);
    }//GEN-LAST:event_btnEmployeeActionPerformed

    private void btnCreatePostActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePostActionPerformed
        CreatePostAdmin createPostPage = new CreatePostAdmin(); 
        this.setVisible(false); 
        createPostPage.setVisible(true);
    }//GEN-LAST:event_btnCreatePostActionPerformed

    private void btnLoggOutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLoggOutMouseClicked
        // TODO add your handling code here:
        LoginPage loginPage = new LoginPage();
        this.setVisible(false);
        loginPage.setVisible(true);
    }//GEN-LAST:event_btnLoggOutMouseClicked

    private void cbChooseCategoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbChooseCategoryItemStateChanged
        Object item = evt.getItem(); //skapar lokal variabel av valt item i combo boxen
        listHeader.removeAll();
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Hämtar ut endast det användaren valt
            //Sql som hämtar projektledarens ID
            
            int index = cbChooseCategory.getSelectedIndex();
            String Cat = cbChooseCategory.getItemAt(index);
            String sqlHeader = "select Header from Post join Category on Post.CateID = Category.CategoryID where Category = '" + Cat +  "' and sites = 'Startsida'";
            
            ArrayList<HashMap<String, String>> eduHeader = new ArrayList<>();
           DefaultListModel m = new DefaultListModel();
            listHeader.setModel(m);
            
            
            try{
               
                eduHeader = idb.fetchRows(sqlHeader);
             
             for(int i = 0; i < eduHeader.size(); i++)
             {
                  String Header = eduHeader.get(i).get("HEADER");
                  m.addElement(Header);
             }
                
            }
            
           
            
            catch(InfException ex) {
               JOptionPane.showMessageDialog(null, "Fel i databasen");
            }
            
        }
    }//GEN-LAST:event_cbChooseCategoryItemStateChanged

    private void cbChooseCategoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbChooseCategoryMouseClicked
listHeader.removeAll();
cbChooseEmployee.removeAllItems();
Validation val = new Validation();
val.getCateStartsite(cbChooseCategory);
             
    }//GEN-LAST:event_cbChooseCategoryMouseClicked

    private void listHeaderValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listHeaderValueChanged
        // TODO add your handling code here:
        String selected = listHeader.getSelectedValue();
        
        
        String sqlName = "Select Name from Post join Employee on EmployeeId = Post.Employee where Header = '" + selected +"'";
        String sqlpost = "select Text from Post where Header = '" + selected + "'";
        String sqlDate = "select Datetime from Post where Header = '" + selected +"'";
        String sqlPostid = "select postid from post where Header = '" +selected + "'";
        
        
        try{
        txtComments.setText("");    
        txtPosts.setText("");
        String txtName = idb.fetchSingle(sqlName);
        String txtPost = idb.fetchSingle(sqlpost);
        String txtDate = idb.fetchSingle(sqlDate);
        String txtPostid = idb.fetchSingle(sqlPostid);
        txtPosts.append("Namn: " + txtName + "\n \n" + txtPost + "\n \nDatum: " + txtDate);
        
        String sqlCommentName = "select Employee.Email from employee \n" +
        "join comments on employee.EMPLOYEEID = comments.COMMENTEMPLOYEEID\n" +
        "join Post on Comments.COMMENTFORPOSTID = post.POSTID\n" +
        "where post.postid = " + txtPostid + "";
        String txtCommentName = idb.fetchSingle(sqlCommentName);
        
        String sqlCommentText = "select commenttext from comments join Employee on Comments.COMMENTEMPLOYEEID = Employee.EMPLOYEEID\n" +
        "Join post on comments.COMMENTFORPOSTID = post.POSTID\n" +
        "where Email = '"+ txtCommentName +"'\n" +
        "and post.postid = " + txtPostid + "";
        String txtCommentText = idb.fetchSingle(sqlCommentText);
        txtComments.append("Namn : " +txtCommentName + "\n \nKommentar : " + txtCommentText);
        
        
        
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fel i databasen");
        }
    }//GEN-LAST:event_listHeaderValueChanged

    private void cbChooseEmployeeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbChooseEmployeeMouseClicked
        listHeader.removeAll();
        cbChooseCategory.removeAllItems();
        Validation vali = new Validation();
        vali.getEmployeeStartPage(cbChooseEmployee);
    }//GEN-LAST:event_cbChooseEmployeeMouseClicked

    private void cbChooseEmployeeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbChooseEmployeeItemStateChanged
        Object item = evt.getItem(); //skapar lokal variabel av valt item i combo boxen
        listHeader.removeAll();
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Hämtar ut endast det användaren valt
            //Sql som hämtar projektledarens ID
            int index = cbChooseEmployee.getSelectedIndex();
            String mail = cbChooseEmployee.getItemAt(index);
            String sqlHeader = "select Header from Post join Category on Post.CateID = Category.CategoryID join Employee on Post.Employee = Employee.EmployeeID where Email  = '" + mail +  "' and Sites = 'Startsida'";
            
            ArrayList<HashMap<String, String>> eduHeaders = new ArrayList<>();
           DefaultListModel b = new DefaultListModel();
            listHeader.setModel(b);
            try{
              eduHeaders = idb.fetchRows(sqlHeader);
             
             for(int i = 0; i < eduHeaders.size(); i++)
             {
                  String Headers = eduHeaders.get(i).get("HEADER");
                  b.addElement(Headers);
             }
             
            }
            
            catch(InfException ex) {
               JOptionPane.showMessageDialog(null, "Fel i databasen");
            }
            
        }
    }//GEN-LAST:event_cbChooseEmployeeItemStateChanged

    private void brnAddCommentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_brnAddCommentMouseClicked
        
        Validation val = new Validation();
        String txtComment = txtWriteComment.getText();
        String selected = listHeader.getSelectedValue();
        String sqlAddPostid = "select postid from post where Header = '" + selected + "'";
        String sqlLogin = "Select EmployeeID from EMPLOYEE where EMAIL = '" + Validation.getLoggedInUser() + "'";
        
                                                           
        try{ 
            if(val.checkIfTxtIsEmpty(txtComment) == true){
                JOptionPane.showMessageDialog(null, "Du måste fylla i alla fält!");
            }else{
                String fetchAddPostid = idb.fetchSingle(sqlAddPostid);
                String fetchsqlLogin = idb.fetchSingle(sqlLogin);
                String sql = "Insert into Comments Values(" + idb.getAutoIncrement("Comments","CommentID") + ", '" + txtComment + "', " + fetchAddPostid + ", " + fetchsqlLogin + ")";
            idb.insert(sql); 
            
            JOptionPane.showMessageDialog(null, "Du har nu lagt till en kommentar");
            StartPage startPage = new StartPage(); 
            this.setVisible(false); 
            startPage.setVisible(true);
            
            }
        }
        catch(InfException e){
        JOptionPane.showMessageDialog(null, "Fel i databasen");
        }
    }//GEN-LAST:event_brnAddCommentMouseClicked

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
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StartPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new StartPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton brnAddComment;
    private javax.swing.JButton btnBlogg;
    private javax.swing.JButton btnCreatePost;
    private javax.swing.JButton btnEducation;
    private javax.swing.JButton btnEmployee;
    private javax.swing.JButton btnLoggOut;
    private javax.swing.JButton btnMeetings;
    private javax.swing.JButton btnResearch;
    private javax.swing.JButton btnStartPage;
    public javax.swing.JComboBox<String> cbChooseCategory;
    private javax.swing.JComboBox<String> cbChooseEmployee;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JList<String> listHeader;
    private javax.swing.JTextArea txtComments;
    private javax.swing.JTextArea txtPosts;
    private javax.swing.JTextField txtWriteComment;
    // End of variables declaration//GEN-END:variables
}