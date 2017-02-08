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
import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import oru.inf.InfDB;
import oru.inf.InfException;
import java.io.*;
import java.sql.*;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.time.LocalDate;
import javax.swing.JList;

public class Validation {
    
    private static String user;
    private static boolean isAdmin = false;
    private static InfDB idb;
    
    public Validation(){
    try{
        //Connects to database with an absolute path
            Path con = Paths.get("ScrumProject.FDB").toRealPath(LinkOption.NOFOLLOW_LINKS);
            idb = new InfDB(con.toString());
        }catch(InfException | IOException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    //Sets true if admin logs in
    public static boolean getAdmin()
    {
        
        return isAdmin;
    }
    public static void setLoggedInUser(String loggedIn){
        user = loggedIn;
    }
    public static String getLoggedInUser(){
        return user;
    }
    public java.sql.Date convertJavaDateToSqlDate(java.util.Date date) {
    return new java.sql.Date(date.getTime());
    }
    
    //Checks if a textfield is empty
    public boolean checkIfTxtIsEmpty(String textfalt){      
        boolean isEmpty = false;
        
        if(textfalt.isEmpty() || textfalt == ""){
            isEmpty = true;
        }
        return isEmpty;
    }
    
    public boolean checkLogin(String user, String password){
        boolean loginMatch = false;
        //SQL koden som hämtar ut raden som stämmer överrens med vad användaren matat in. 
        String sql = "select email, pW from EMPLOYEE where Employee.EMAIL = '"+ user +"' and Employee.PW = '"+ password +"'";
        
        try{
            HashMap<String, String> loggin = idb.fetchRow(sql);
            //Kollar om inloggningsuppgifterna stämmer överrens med databasen. Om det gör det sätts boolean loginMatch till true.
            //Matchar inloggningsuppgifterna med databasen kommer användaren få tillgång till administratör sidorna inom systemet.
            if(user.equals(loggin.get("EMAIL")) && password.equals(loggin.get("PW"))){
                loginMatch = true;
            }
        }catch(Exception e){
            
        }
        return loginMatch;
    }
    public void getCategoryComboBox(JComboBox combo){
        DefaultComboBoxModel model = (DefaultComboBoxModel) combo.getModel();
        //Sätt rowcount till 0 för att nolla/tömma comboboxens modell.
        model.removeAllElements();
 
        String sqlCategory = "select CATEGORY, CategoryID from CATEGORY";
 
        try {
            ArrayList<HashMap<String, String>> Category = idb.fetchRows(sqlCategory); //Skapar en Arraylist
            combo.addItem("Välj kategori");
 
            for (int i = 0; i < Category.size(); i++) { //Loopar igenom Arraylistan
                combo.addItem(Category.get(i).get("CATEGORY"));
            }
 
        } catch (InfException e) {
 
            JOptionPane.showMessageDialog(null, "Kunde inte hämta projektledare från databasen.");
        }
    }
     public void getEmployeeComboBox(JComboBox combo){
        DefaultComboBoxModel model = (DefaultComboBoxModel) combo.getModel();
        //Sätt rowcount till 0 för att nolla/tömma comboboxens modell.
        model.removeAllElements();
 
        String sqlEmployee = "select EMAIL, EmployeeID from EMPLOYEE";
 
        try {
            ArrayList<HashMap<String, String>> Employee = idb.fetchRows(sqlEmployee); //Skapar en Arraylist
            combo.addItem("Välj Anställd");
 
            for (int i = 0; i < Employee.size(); i++) { //Loopar igenom Arraylistan
                combo.addItem(Employee.get(i).get("EMAIL"));
            }
 
        } catch (InfException e) {
 
            JOptionPane.showMessageDialog(null, "Kunde inte hämta projektledare från databasen.");
        }
    }
     public void getCate(JComboBox combo)
     {
         
        combo.removeAllItems();
        String sqlCategory = "select CATEGORY.Category from CATEGORY";
        try{
            ArrayList<HashMap<String, String>> fillCB = idb.fetchRows(sqlCategory);
            
            for(int i = 0; i < fillCB.size(); i++)
            {
               combo.addItem(fillCB.get(i).get("CATEGORY"));
               
            }
        
        }catch(Exception e){}
    }
     public void getCateEducationpage(JComboBox combo)
     {
         
        combo.removeAllItems();
        String sqlCategory = "select Category from CATEGORY where CATEGORY.CATEGORYID in(select CateID from POST where Sites = 'Utbildningssida')";
        try{
            ArrayList<HashMap<String, String>> fillCB = idb.fetchRows(sqlCategory);
            
            for(int i = 0; i < fillCB.size(); i++)
            {
               combo.addItem(fillCB.get(i).get("CATEGORY"));
               
            }
        
        }catch(Exception e){}
    }
     public void getCateStartsite(JComboBox combo)
     {
         
        combo.removeAllItems();
        String sqlCategory = "select Category from CATEGORY where CATEGORY.CATEGORYID in(select CateID from POST where Sites = 'Startsida')";
        try{
            ArrayList<HashMap<String, String>> fillCB = idb.fetchRows(sqlCategory);
            
            for(int i = 0; i < fillCB.size(); i++)
            {
               combo.addItem(fillCB.get(i).get("CATEGORY"));
               
            }
        
        }catch(Exception e){}
    }
     public void getCateReaserchSite(JComboBox combo)
     {
         
        combo.removeAllItems();
        String sqlCategory = "select Category from CATEGORY where CATEGORY.CATEGORYID in(select CateID from POST where Sites = 'Forskninssida')";
        try{
            ArrayList<HashMap<String, String>> fillCB = idb.fetchRows(sqlCategory);
            
            for(int i = 0; i < fillCB.size(); i++)
            {
               combo.addItem(fillCB.get(i).get("CATEGORY"));
               
            }
        
        }catch(Exception e){}
    }
          public void getCateBloggSite(JComboBox combo)
     {
         
        combo.removeAllItems();
        String sqlCategory = "select Category from CATEGORY where CATEGORY.CATEGORYID in(select CateID from POST where Sites = 'Blogg')";
        try{
            ArrayList<HashMap<String, String>> fillCB = idb.fetchRows(sqlCategory);
            
            for(int i = 0; i < fillCB.size(); i++)
            {
               combo.addItem(fillCB.get(i).get("CATEGORY"));
               
            }
        
        }catch(Exception e){}
    }
     
     public void getEmployee(JComboBox combo)
     {
         
        combo.removeAllItems();
        String sqlEmployee = "select Email from Employee";
        try{
            ArrayList<HashMap<String, String>> fillCBa = idb.fetchRows(sqlEmployee);
            
            for(int i = 0; i < fillCBa.size(); i++)
            {
               combo.addItem(fillCBa.get(i).get("EMAIL"));
               
            }
        
        }catch(Exception e){}
    }
     public void getEmployeeStartPage(JComboBox combo)
     {
         
        combo.removeAllItems();
        String sqlEmployee = "select Employee.Email from Employee where EmployeeID in(select post.Employee from POST where Sites = 'Startsida')";
        try{
            ArrayList<HashMap<String, String>> fillCBa = idb.fetchRows(sqlEmployee);
            
            for(int i = 0; i < fillCBa.size(); i++)
            {
               combo.addItem(fillCBa.get(i).get("EMAIL"));
               
            }
        
        }catch(Exception e){}
    }
     public void getEmployeeBloggPage(JComboBox combo)
     {
         
        combo.removeAllItems();
        String sqlEmployee = "select Employee.Email from Employee where EmployeeID in(select post.Employee from POST where Sites = 'Blogg')";
        try{
            ArrayList<HashMap<String, String>> fillCBa = idb.fetchRows(sqlEmployee);
            
            for(int i = 0; i < fillCBa.size(); i++)
            {
               combo.addItem(fillCBa.get(i).get("EMAIL"));
               
            }
        
        }catch(Exception e){}
    }
     public void getEmployeeResearchPage(JComboBox combo)
     {
         
        combo.removeAllItems();
        String sqlEmployee = "select Employee.Email from Employee where EmployeeID in(select post.Employee from POST where Sites = 'Forskninssida')";
        try{
            ArrayList<HashMap<String, String>> fillCBa = idb.fetchRows(sqlEmployee);
            
            for(int i = 0; i < fillCBa.size(); i++)
            {
               combo.addItem(fillCBa.get(i).get("EMAIL"));
               
            }
        
        }catch(Exception e){}
    }
     public void getEmployeeEducationPage(JComboBox combo)
     {
         
        combo.removeAllItems();
        String sqlEmployee = "select Employee.Email from Employee where EmployeeID in(select post.Employee from POST where Sites = 'Utbildningssida')";
        try{
            ArrayList<HashMap<String, String>> fillCBa = idb.fetchRows(sqlEmployee);
            
            for(int i = 0; i < fillCBa.size(); i++)
            {
               combo.addItem(fillCBa.get(i).get("EMAIL"));
               
            }
        
        }catch(Exception e){}
    }
//     public boolean checkIfEmail(){
//     boolean isEmpty = true;
//     try{
//     String sql = "select * from CATEGORY where CATEGORY.CATEGORYID in(select CatID from FOLLOWCATEGORY)";
//     String check = idb.fetchSingle(sql);
//     
//        
//        if(check.isEmpty() || check == ""){
//            isEmpty = false;
//        }
//        
//     
//     }catch(Exception e){
//     JOptionPane.showMessageDialog(null, "Fel i databasen");
//     }
//     return isEmpty;
//    }

//     public boolean checkIfCateegoryEmpty(String email){
//     boolean isEmpty = true;
//     try{
//     String sql = "select CategoryID from Category where CATEGORY.CATEGORYID not in(select POST.CATEID from POST where sites = 'Forskninssida')";
//     String check = idb.fetchSingle(sql);
//     
//        
//        if(check.isEmpty() || check == ""){
//            isEmpty = false;
//        }
//        
//     
//     }catch(Exception e){
//     JOptionPane.showMessageDialog(null, "Fel i databasen");
//     }
//     return isEmpty;
//    }
     
}
