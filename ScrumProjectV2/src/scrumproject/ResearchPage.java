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
public class ResearchPage extends javax.swing.JFrame {
    private static InfDB idb;
    /**
     * Creates new form ResearchPage
     */
    public ResearchPage() {
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

        jLabel1 = new javax.swing.JLabel();
        btnMeetingPage = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listHeader = new javax.swing.JList<>();
        btnBloggSite = new javax.swing.JButton();
        btnEducationPage = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtPosts = new javax.swing.JTextArea();
        btnResearchPage = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        btnEmployeePage = new javax.swing.JButton();
        btnStartPage = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        btnCreatePostPage = new javax.swing.JButton();
        cbChooseCatagory = new javax.swing.JComboBox<>();
        cbChooseEmp = new javax.swing.JComboBox<>();
        txtWriteCommentsa = new javax.swing.JTextField();
        btnAddCommentsa = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 2, 36)); // NOI18N
        jLabel1.setText("Forskning");

        btnMeetingPage.setText("Möten");
        btnMeetingPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMeetingPageActionPerformed(evt);
            }
        });

        listHeader.setBorder(javax.swing.BorderFactory.createTitledBorder("Välj ett inlägg"));
        listHeader.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                listHeaderValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(listHeader);

        btnBloggSite.setText("Blogg");
        btnBloggSite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBloggSiteActionPerformed(evt);
            }
        });

        btnEducationPage.setText("Utbildning");
        btnEducationPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEducationPageActionPerformed(evt);
            }
        });

        txtPosts.setEditable(false);
        txtPosts.setColumns(20);
        txtPosts.setRows(5);
        txtPosts.setBorder(javax.swing.BorderFactory.createTitledBorder("Inlägg"));
        jScrollPane2.setViewportView(txtPosts);

        btnResearchPage.setText("Forskning");
        btnResearchPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResearchPageActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 1, 18)); // NOI18N
        jLabel2.setText("Meny");

        jTextArea2.setEditable(false);
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(javax.swing.BorderFactory.createTitledBorder("Kommentarer\n"));
        jScrollPane3.setViewportView(jTextArea2);

        btnEmployeePage.setText("Anställda");
        btnEmployeePage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmployeePageActionPerformed(evt);
            }
        });

        btnStartPage.setText("Startsida");
        btnStartPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStartPageActionPerformed(evt);
            }
        });

        jButton1.setText("Ladda ner fil");

        jButton10.setText("Logga ut");

        jLabel3.setText("Välkommen till vårt nyhetsflöde");

        btnCreatePostPage.setText("Lägg till inlägg");
        btnCreatePostPage.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreatePostPageActionPerformed(evt);
            }
        });

        cbChooseCatagory.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbChooseCatagoryItemStateChanged(evt);
            }
        });
        cbChooseCatagory.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbChooseCatagoryMouseClicked(evt);
            }
        });

        cbChooseEmp.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbChooseEmpItemStateChanged(evt);
            }
        });
        cbChooseEmp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbChooseEmpMouseClicked(evt);
            }
        });

        btnAddCommentsa.setText("Lägg till kommentar");
        btnAddCommentsa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddCommentsaMouseClicked(evt);
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
                                .addGap(254, 254, 254)
                                .addComponent(jLabel3)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(btnStartPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnBloggSite, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnResearchPage, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnEducationPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnMeetingPage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnEmployeePage, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtWriteCommentsa, javax.swing.GroupLayout.PREFERRED_SIZE, 348, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnAddCommentsa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 173, Short.MAX_VALUE)
                                .addComponent(jButton10))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 537, Short.MAX_VALUE)
                                    .addComponent(jButton1)
                                    .addComponent(jScrollPane3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cbChooseEmp, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbChooseCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(btnCreatePostPage, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jScrollPane1))))))
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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbChooseCatagory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbChooseEmp, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnStartPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBloggSite)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEducationPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnResearchPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMeetingPage)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnEmployeePage)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(btnCreatePostPage, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton10)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtWriteCommentsa, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddCommentsa))
                        .addContainerGap(11, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnStartPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStartPageActionPerformed
       StartPage startPage = new StartPage(); 
        this.setVisible(false); 
        startPage.setVisible(true);
    }//GEN-LAST:event_btnStartPageActionPerformed

    private void btnEducationPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEducationPageActionPerformed
        EducationPage educationPage = new EducationPage(); 
        this.setVisible(false); 
        educationPage.setVisible(true);
    }//GEN-LAST:event_btnEducationPageActionPerformed

    private void btnResearchPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResearchPageActionPerformed
        ResearchPage researchPage = new ResearchPage(); 
        this.setVisible(false); 
        researchPage.setVisible(true);
    }//GEN-LAST:event_btnResearchPageActionPerformed

    private void btnMeetingPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMeetingPageActionPerformed
        MeetingPage meetingPage = new MeetingPage(); 
        this.setVisible(false); 
        meetingPage.setVisible(true);
    }//GEN-LAST:event_btnMeetingPageActionPerformed

    private void btnEmployeePageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmployeePageActionPerformed
        EmployeePageAdmin employeeAdminPage = new EmployeePageAdmin(); 
        this.setVisible(false); 
        employeeAdminPage.setVisible(true);
    }//GEN-LAST:event_btnEmployeePageActionPerformed

    private void btnCreatePostPageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreatePostPageActionPerformed
        CreatePostAdmin createPostPage = new CreatePostAdmin(); 
        this.setVisible(false); 
        createPostPage.setVisible(true);
    }//GEN-LAST:event_btnCreatePostPageActionPerformed

    private void listHeaderValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_listHeaderValueChanged
        String selected = listHeader.getSelectedValue();
        
        String sqlName = "Select Name from Post join Employee on EmployeeId = Post.Employee where Header = '" + selected +"'";
        String sqlpost = "select Text from Post where Header = '" + selected + "'";
        String sqlDate = "select Datetime from Post where Header = '" + selected +"'";
        
        try{
        txtPosts.setText("");
        String txtName = idb.fetchSingle(sqlName);
        String txtPost = idb.fetchSingle(sqlpost);
        String txtDate = idb.fetchSingle(sqlDate);
        txtPosts.append("Namn: " + txtName + "\n \n" + txtPost + "\n \nDatum: " + txtDate);
        
        
        
    
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Fel i databasen");
        }
    }//GEN-LAST:event_listHeaderValueChanged

    private void cbChooseCatagoryMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbChooseCatagoryMouseClicked
        cbChooseEmp.removeAllItems();
        Validation vali = new Validation();
        vali.getCateReaserchSite(cbChooseCatagory);
    }//GEN-LAST:event_cbChooseCatagoryMouseClicked

    private void cbChooseCatagoryItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbChooseCatagoryItemStateChanged
        Object item = evt.getItem(); //skapar lokal variabel av valt item i combo boxen
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Hämtar ut endast det användaren valt
            //Sql som hämtar projektledarens ID
            int index = cbChooseCatagory.getSelectedIndex();
            String Catag = cbChooseCatagory.getItemAt(index);
            String sqlHeader = "select Header from Post join Category on Post.CateID = Category.CategoryID where Category = '" + Catag +  "' and sites = 'Forskninssida'";
           
            ArrayList<HashMap<String, String>> eduHeadersa = new ArrayList<>();
           DefaultListModel c = new DefaultListModel();
            listHeader.setModel(c);
            try{
             eduHeadersa = idb.fetchRows(sqlHeader);
             
             for(int i = 0; i < eduHeadersa.size(); i++)
             {
                  String Headersa = eduHeadersa.get(i).get("HEADER");
                  c.addElement(Headersa);
             }
             
            }
            
            catch(InfException ex) {
               JOptionPane.showMessageDialog(null, "Fel i databasen");
            }
            
        }
    }//GEN-LAST:event_cbChooseCatagoryItemStateChanged

    private void cbChooseEmpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbChooseEmpMouseClicked
        cbChooseCatagory.removeAllItems();
        Validation vali = new Validation();
        vali.getEmployeeResearchPage(cbChooseEmp);
    }//GEN-LAST:event_cbChooseEmpMouseClicked

    private void cbChooseEmpItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbChooseEmpItemStateChanged
        Object item = evt.getItem(); //skapar lokal variabel av valt item i combo boxen
        if (evt.getStateChange() == ItemEvent.SELECTED) { //Hämtar ut endast det användaren valt
            //Sql som hämtar projektledarens ID
            int index = cbChooseEmp.getSelectedIndex();
            String mail = cbChooseEmp.getItemAt(index);
            String sqlHeader = "select Header from Post join Category on Post.CateID = Category.CategoryID join Employee on Post.Employee = Employee.EmployeeID where Email  = '" + mail +  "' and Sites = 'Forskninssida'";
            
            ArrayList<HashMap<String, String>> eduHeadersa = new ArrayList<>();
           DefaultListModel b = new DefaultListModel();
            listHeader.setModel(b);
            try{
              eduHeadersa = idb.fetchRows(sqlHeader);
             
             for(int i = 0; i < eduHeadersa.size(); i++)
             {
                  String Headersa = eduHeadersa.get(i).get("HEADER");
                  b.addElement(Headersa);
             }
             
            }
            
            catch(InfException ex) {
               JOptionPane.showMessageDialog(null, "Fel i databasen");
            }
            
        }
    }//GEN-LAST:event_cbChooseEmpItemStateChanged

    private void btnBloggSiteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBloggSiteActionPerformed
        Blogg blogg = new Blogg();
        this.setVisible(false);
        blogg.setVisible(true);
    }//GEN-LAST:event_btnBloggSiteActionPerformed

    private void btnAddCommentsaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddCommentsaMouseClicked
        txtWriteCommentsa.setText("");
        Validation val = new Validation();
        String txtComment = txtWriteCommentsa.getText();
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
            }
        }
        catch(InfException e){
            JOptionPane.showMessageDialog(null, "Fel i databasen");
        }
    }//GEN-LAST:event_btnAddCommentsaMouseClicked

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
            java.util.logging.Logger.getLogger(ResearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ResearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ResearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ResearchPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ResearchPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddCommentsa;
    private javax.swing.JButton btnBloggSite;
    private javax.swing.JButton btnCreatePostPage;
    private javax.swing.JButton btnEducationPage;
    private javax.swing.JButton btnEmployeePage;
    private javax.swing.JButton btnMeetingPage;
    private javax.swing.JButton btnResearchPage;
    private javax.swing.JButton btnStartPage;
    public javax.swing.JComboBox<String> cbChooseCatagory;
    private javax.swing.JComboBox<String> cbChooseEmp;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JList<String> listHeader;
    private javax.swing.JTextArea txtPosts;
    private javax.swing.JTextField txtWriteCommentsa;
    // End of variables declaration//GEN-END:variables
}